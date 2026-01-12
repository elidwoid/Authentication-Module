package com.example.authmodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat
import com.example.authmodule.ui.theme.AuthModuleTheme
import com.example.authmodule.ui.theme.gray
import com.example.authmodule.util.Navigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        window.statusBarColor = gray.toArgb()
        window.navigationBarColor = gray.toArgb()
        setContent {
            AuthModuleTheme {
                Navigation()
            }
        }
    }
}