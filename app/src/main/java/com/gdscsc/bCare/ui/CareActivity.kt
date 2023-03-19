package com.gdscsc.bCare.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gdscsc.bCare.ui.theme.BCareTheme

class CareActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BCareTheme {
                CareScreen()
            }
        }
    }
}