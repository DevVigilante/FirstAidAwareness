package com.firstaid.awareness.ui.kit

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.firstaid.awareness.R

@Composable
fun EquipmentIllustration(itemName: String, modifier: Modifier = Modifier) {
    val drawableRes = when {
        itemName.contains("Bandage", ignoreCase = true) -> R.drawable.ic_kit_bandage
        itemName.contains("Gauze", ignoreCase = true) -> R.drawable.ic_kit_gauze
        itemName.contains("Antiseptic", ignoreCase = true) -> R.drawable.ic_kit_antiseptic
        itemName.contains("Gloves", ignoreCase = true) -> R.drawable.ic_kit_gloves
        itemName.contains("Crepe", ignoreCase = true) -> R.drawable.ic_kit_bandage_roll
        itemName.contains("Scissors", ignoreCase = true) || itemName.contains("Tweezers", ignoreCase = true) -> R.drawable.ic_kit_scissors
        itemName.contains("Thermometer", ignoreCase = true) -> R.drawable.ic_kit_thermometer
        itemName.contains("Cold Pack", ignoreCase = true) -> R.drawable.ic_kit_coldpack
        itemName.contains("CPR", ignoreCase = true) -> R.drawable.ic_kit_cprmask
        itemName.contains("Pain", ignoreCase = true) -> R.drawable.ic_kit_pills
        else -> R.drawable.ic_kit_bandage
    }

    val containerColor = when {
        itemName.contains("Bandage", ignoreCase = true) -> MaterialTheme.colorScheme.primaryContainer
        itemName.contains("Gauze", ignoreCase = true) -> MaterialTheme.colorScheme.secondaryContainer
        itemName.contains("Antiseptic", ignoreCase = true) -> MaterialTheme.colorScheme.tertiaryContainer
        itemName.contains("Gloves", ignoreCase = true) -> MaterialTheme.colorScheme.primaryContainer
        itemName.contains("Crepe", ignoreCase = true) -> MaterialTheme.colorScheme.secondaryContainer
        itemName.contains("Scissors", ignoreCase = true) || itemName.contains("Tweezers", ignoreCase = true) -> MaterialTheme.colorScheme.tertiaryContainer
        itemName.contains("Thermometer", ignoreCase = true) -> MaterialTheme.colorScheme.primaryContainer
        itemName.contains("Cold Pack", ignoreCase = true) -> MaterialTheme.colorScheme.secondaryContainer
        itemName.contains("CPR", ignoreCase = true) -> MaterialTheme.colorScheme.tertiaryContainer
        itemName.contains("Pain", ignoreCase = true) -> MaterialTheme.colorScheme.primaryContainer
        else -> MaterialTheme.colorScheme.primaryContainer
    }

    Surface(
        shape = MaterialTheme.shapes.medium,
        color = containerColor,
        modifier = modifier.size(120.dp)
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = itemName,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
    }
}
