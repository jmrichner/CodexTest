package com.example.simpleweeklytasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleWeeklyTasksApp()
        }
    }
}

@Composable
fun SimpleWeeklyTasksApp() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp)
            ) {
                Text(
                    text = "Simple Weekly Tasks",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                TaskSection(
                    title = "Priority tasks",
                    tasks = listOf(
                        "Review this week's work",
                        "Choose the next app feature"
                    )
                )

                TaskSection(
                    title = "Hour tasks",
                    tasks = listOf(
                        "posts at sheep barn",
                        "splice barbed wire",
                        "move cows",
                        "fix fence behind pond",
                        "weed eat under electric fence",
                        "fallen limbs by middle pond",
                        "fix corral West gate"
                    )
                )

                TaskSection(
                    title = "Day tasks",
                    tasks = listOf(
                        "Monday: Evaluation on KK",
                        "Tuesday: Jacob Septic",
                        "Wednesday: Cass county evaluation",
                        "Thursday: cemetery"
                    )
                )

                TaskSection(
                    title = "Calls and errands",
                    tasks = listOf(
                        "call guy from Cass County"
                    )
                )
            }
        }
    }
}

@Composable
fun TaskSection(title: String, tasks: List<String>) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold
    )

    Spacer(modifier = Modifier.height(8.dp))

    tasks.forEach { task ->
        Text(
            text = "• $task",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 4.dp)
        )
    }

    Spacer(modifier = Modifier.height(20.dp))
}
