package com.firstaid.awareness.ui.sources

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.firstaid.awareness.data.SourcesList

@Composable
fun SourcesScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(bottom = 24.dp)
    ) {
        SourcesHeaderCard()
        SourcesList()
        Spacer(modifier = Modifier.height(32.dp))
    }
}
