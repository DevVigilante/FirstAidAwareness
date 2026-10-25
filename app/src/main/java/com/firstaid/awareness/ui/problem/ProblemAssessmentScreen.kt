package com.firstaid.awareness.ui.problem

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
import com.firstaid.awareness.ui.icons.arrow_back

@Composable
fun ProblemAssessmentScreen() {
    var selectedTopic by remember { mutableStateOf<ProblemTopic?>(null) }
    val answers = remember { mutableStateMapOf<Int, Int>() }
    var showResult by remember { mutableStateOf(false) }

    if (selectedTopic == null) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 24.dp)
        ) {
            ProblemTopicSelector(onTopicSelected = { topic ->
                selectedTopic = topic
                answers.clear()
                showResult = false
            })
        }
    } else {
        val topic = selectedTopic!!
        if (showResult) {
            val isHighDamage = answers[0] == 0 || answers[1] == 0
            ProblemResultScreen(
                topic = topic,
                isHighDamage = isHighDamage,
                onRetakeAssessment = {
                    selectedTopic = null
                    answers.clear()
                    showResult = false
                }
            )
        } else {
            val scrollState = rememberScrollState()
            val answeredCount = answers.size
            val allAnswered = answeredCount == topic.questions.size

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(bottom = 24.dp)
            ) {
                // Top Header with Back button
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { selectedTopic = null }) {
                        Icon(
                            imageVector = arrow_back,
                            contentDescription = "Back to problems"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = topic.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )
                }

                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
                    Text(
                        text = "Answer the 2 questions based on what you observe. The result is an awareness pathway, not a diagnosis.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                    )
                }

                topic.questions.forEachIndexed { index, question ->
                    ProblemQuestionCard(
                        questionNumber = index + 1,
                        totalQuestions = topic.questions.size,
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
                        text = "Answer all questions to see the guidance ($answeredCount of ${topic.questions.size} answered).",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Button(
                        onClick = { showResult = true },
                        enabled = allAnswered,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Show awareness guidance", fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}
