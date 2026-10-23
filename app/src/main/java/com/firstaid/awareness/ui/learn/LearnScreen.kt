package com.firstaid.awareness.ui.learn

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showSystemUi = true)
fun LearnScreen() {
    var selectedTopic by remember { mutableStateOf<FirstAidTopic?>(null) }

    if (selectedTopic != null) {
        LearnTopicDetailScreen(
            topic = selectedTopic!!,
            onBackClick = { selectedTopic = null }
        )
    } else {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 24.dp)
        ) {
            LearnHeaderCard()
            LearnTopicsList(onTopicClick = { topic ->
                selectedTopic = topic
            })
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}
