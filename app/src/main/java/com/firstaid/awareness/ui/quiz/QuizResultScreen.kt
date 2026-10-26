package com.firstaid.awareness.ui.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.firstaid.awareness.models.QuizQuestion

@Composable
fun QuizResultScreen(questions: List<QuizQuestion>, userAnswers: Map<Int, Int>, onRetakeQuiz: () -> Unit) {
    val scrollState = rememberScrollState()
    val totalQuestions = questions.size
    val correctCount = questions.count { q ->
        val index = questions.indexOf(q)
        userAnswers[index] == q.correctAnswerIndex
    }
    val scorePercentage = if (totalQuestions > 0) (correctCount * 100) / totalQuestions else 0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(modifier = Modifier.padding(vertical = 8.dp)) {
            Text(
                text = "Quiz Results",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "You scored $correctCount out of $totalQuestions ($scorePercentage%)",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface
            )
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = if (scorePercentage >= 75) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.errorContainer,
                contentColor = if (scorePercentage >= 75) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onErrorContainer
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = if (scorePercentage >= 75) "Great job! Excellent First Aid Awareness" else "Room for improvement",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = if (scorePercentage >= 75)
                        "You have a solid understanding of key first aid concepts and emergency responses."
                    else
                        "Review the learn sections and try again to master essential first aid skills.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        // Review answers breakdown
        questions.forEachIndexed { index, question ->
            val userAnswer = userAnswers[index]
            val isCorrect = userAnswer == question.correctAnswerIndex

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainerLow
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Q${index + 1}: ${question.question}",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    val userChoiceText = if (userAnswer != null) question.options[userAnswer] else "Not answered"
                    val correctChoiceText = question.options[question.correctAnswerIndex]

                    Text(
                        text = "Your answer: $userChoiceText",
                        style = MaterialTheme.typography.bodySmall,
                        color = if (isCorrect) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                        fontWeight = FontWeight.SemiBold
                    )
                    if (!isCorrect) {
                        Text(
                            text = "Correct answer: $correctChoiceText",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = question.explanation,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                    )
                }
            }
        }

        Button(
            onClick = onRetakeQuiz,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Retake / Change Quiz Settings", fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}
