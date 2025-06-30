package com.himanshu.guardiangpt.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.himanshu.guardiangpt.chatbot.ChatbotScreen
import com.himanshu.guardiangpt.ui.theme.GuardianGPTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GuardianGPTTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ChatbotScreen()
                }
            }
        }
    }
}

