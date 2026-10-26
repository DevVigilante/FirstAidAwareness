package com.firstaid.awareness.ui.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.firstaid.awareness.data.firstAidQuizQuestions
import com.firstaid.awareness.models.QuizQuestion

@Composable
fun QuizScreen() {
    var isConfigured by remember { mutableStateOf(false) }
    var activeQuestions by remember { mutableStateOf<List<QuizQuestion>>(emptyList()) }
    val answers = remember { mutableStateMapOf<Int, Int>() }
    var showResult by remember { mutableStateOf(false) }

    if (!isConfigured) {
        QuizSetupScreen(
            onStartQuiz = { category, maxCount ->
                val filtered = if (category == "All Topics") {
                    firstAidQuizQuestions
                } else {
                    firstAidQuizQuestions.filter { it.category == category }
                }
                activeQuestions = filtered.shuffled().take(maxCount)
                answers.clear()
                showResult = false
                isConfigured = true
            }
        )
    } else if (showResult) {
        QuizResultScreen(
            questions = activeQuestions,
            userAnswers = answers,
            onRetakeQuiz = {
                answers.clear()
                showResult = false
                isConfigured = false
            }
        )
    } else {
        val scrollState = rememberScrollState()
        val questions = activeQuestions
        val answeredCount = answers.size
        val allAnswered = answeredCount == questions.size

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 24.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "First Aid Knowledge Quiz",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Answering ${questions.size} questions",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                    )
                }
                TextButton(onClick = { isConfigured = false }) {
                    Text(text = "Change Settings", fontWeight = FontWeight.Bold)
                }
            }

            questions.forEachIndexed { index, question ->
                QuizQuestionCard(
                    questionNumber = index + 1,
                    totalQuestions = questions.size,
                    question = question,
                    selectedOptionIndex = answers[index],
                    onOptionSelected = { optionIndex ->
                        answers[index] = optionIndex
                    }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Answer all questions to submit ($answeredCount of ${questions.size} answered).",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                )
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    onClick = { showResult = true },
                    enabled = allAnswered,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Submit Quiz", fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}
