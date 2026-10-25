package com.firstaid.awareness.ui.learn

data class FirstAidTopic(
    val id: String,
    val title: String,
    val category: String,
    val summary: String,
    val detailedDescription: String,
    val keySteps: List<String>,
    val dos: List<String>,
    val donts: List<String>
)
