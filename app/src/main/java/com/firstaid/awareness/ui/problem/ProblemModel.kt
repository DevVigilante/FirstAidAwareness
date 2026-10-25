package com.firstaid.awareness.ui.problem

data class ProblemQuestion(
    val id: Int,
    val questionText: String,
    val options: List<String>
)

data class ProblemGuidance(
    val title: String,
    val description: String,
    val actions: List<String>
)

data class ProblemTopic(
    val id: String,
    val title: String,
    val category: String,
    val summary: String,
    val questions: List<ProblemQuestion>,
    val highDamageGuidance: ProblemGuidance,
    val lowDamageGuidance: ProblemGuidance
)
