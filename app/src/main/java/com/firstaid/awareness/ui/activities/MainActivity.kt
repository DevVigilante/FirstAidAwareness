package com.firstaid.awareness.ui.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
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
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.firstaid.awareness.ui.emergency.EmergencyScreen
import com.firstaid.awareness.ui.icons.arrow_back
import com.firstaid.awareness.ui.icons.educate_icon
import com.firstaid.awareness.ui.icons.emergency_icon
import com.firstaid.awareness.ui.icons.problem
import com.firstaid.awareness.ui.icons.question_mark
import com.firstaid.awareness.ui.icons.quiz_icon
import com.firstaid.awareness.ui.icons.sources_icon
import com.firstaid.awareness.ui.learn.LearnScreen
import com.firstaid.awareness.ui.problem.ProblemAssessmentScreen
import com.firstaid.awareness.ui.quiz.QuizScreen
import com.firstaid.awareness.ui.sources.SourcesScreen
import com.firstaid.awareness.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.setNavigationBarContrastEnforced(false)
        }
        setContent {
            Screen()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Preview(showSystemUi = true)
    fun Screen() {
        AppTheme(dynamicColor = true) {
            val scrollBehavior =
                TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
            var selectedItem by remember { mutableIntStateOf(0) }

            val items = listOf(
                BottomNavItem("Learn", educate_icon),
                BottomNavItem("Problem", problem),
                BottomNavItem("Quiz", question_mark),
                BottomNavItem("Sources", sources_icon),
                BottomNavItem("Emergency", emergency_icon)
            )

            val isEmergencySelected = selectedItem == 4
            Scaffold(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                topBar = {
                    Toolbar(scrollBehavior)
                },
                bottomBar = {
                    NavigationBar(
                        containerColor = if (isEmergencySelected) {
                            MaterialTheme.colorScheme.errorContainer
                        } else {
                            NavigationBarDefaults.containerColor
                        }
                    ) {
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
                                },
                                colors = NavigationBarItemDefaults.colors(
                                    selectedIconColor = if (isEmergencySelected) MaterialTheme.colorScheme.onError else MaterialTheme.colorScheme.onSurface,
                                    selectedTextColor = if (isEmergencySelected) MaterialTheme.colorScheme.onErrorContainer else MaterialTheme.colorScheme.onSurface,
                                    indicatorColor = if (isEmergencySelected) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.secondaryContainer
                                )
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
                        1 -> ProblemAssessmentScreen()
                        2 -> QuizScreen()
                        3 -> SourcesScreen()
                        4 -> EmergencyScreen()
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
            actions = {
                Button(
                    onClick = {
                        val phoneNumber = "tel:112"
                        val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                            data = phoneNumber.toUri()
                        }
                        startActivity(dialIntent)
                    },
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.error,
                        contentColor = MaterialTheme.colorScheme.onError
                    ),
                ) {
                    Icon(emergency_icon, contentDescription = "Emergency")
                    Spacer(Modifier.width(8.dp))
                    Text("Emergency")
                }
            },
            scrollBehavior = scrollBehavior
        )
    }
}
