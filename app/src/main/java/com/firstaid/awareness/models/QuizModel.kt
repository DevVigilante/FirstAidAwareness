package com.firstaid.awareness.ui.quiz

data class QuizQuestion(
    val id: Int,
    val questionText: String,
    val options: List<String>
)

data class AssessmentGuidance(
    val title: String,
    val description: String,
    val actions: List<String>
)

data class AssessmentTopic(
    val id: String,
    val title: String,
    val category: String,
    val summary: String,
    val questions: List<QuizQuestion>,
    val highDamageGuidance: AssessmentGuidance,
    val lowDamageGuidance: AssessmentGuidance
)
