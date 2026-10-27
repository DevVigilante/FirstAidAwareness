package com.firstaid.awareness.ui.kit

data class KitItem(
    val name: String,
    val category: String,
    val purpose: String,
    val usageTip: String,
    val detailedDescription: String,
    val howToUse: List<String>,
    val dos: List<String>,
    val donts: List<String>
)
