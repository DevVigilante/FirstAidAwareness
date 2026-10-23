package com.firstaid.awareness.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.firstaid.awareness.ui.emergency.EmergencyScreen
import com.firstaid.awareness.ui.icons.arrow_back
import com.firstaid.awareness.ui.icons.educate_icon
import com.firstaid.awareness.ui.icons.emergency_icon
import com.firstaid.awareness.ui.icons.sources_icon
import com.firstaid.awareness.ui.learn.LearnScreen
import com.firstaid.awareness.ui.sources.SourcesScreen
import com.firstaid.awareness.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Screen()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Preview(showSystemUi = true)
    fun Screen() {
        AppTheme {
            val scrollBehavior =
                TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
            var selectedItem by remember { mutableIntStateOf(0) }

            val items = listOf(
                BottomNavItem("Learn", educate_icon),
                BottomNavItem("Emergency", emergency_icon),
                BottomNavItem("Sources", sources_icon)
            )

            Scaffold(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                topBar = {
                    Toolbar(scrollBehavior)
                },
                bottomBar = {
                    NavigationBar {
                        items.forEachIndexed { index, item ->
                            NavigationBarItem(
                                selected = selectedItem == index,
                                onClick = {
                                    selectedItem = index
                                },
                                icon = {
                                    Icon(
                                        imageVector = item.icon,
                                        contentDescription = item.title
                                    )
                                },
                                label = {
                                    Text(item.title)
                                }
                            )
                        }
                    }
                },
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    when (selectedItem) {
                        0 -> LearnScreen()
                        1 -> EmergencyScreen()
                        2 -> SourcesScreen()
                    }
                }
            }
        }
    }

    data class BottomNavItem(
        val title: String,
        val icon: ImageVector
    )

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Toolbar(scrollBehavior: TopAppBarScrollBehavior) {
        LargeTopAppBar(
            title = {
                Text("First Aid Health Awareness")
            },
            navigationIcon = {
                IconButton(onClick = {
                    finishActivity(1)
                }) {
                    Icon(
                        imageVector = arrow_back,
                        contentDescription = "Back"
                    )
                }
            },
            scrollBehavior = scrollBehavior
        )
    }
}
