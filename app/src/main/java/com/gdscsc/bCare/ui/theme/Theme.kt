package com.gdscsc.bCare.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// General composable theme for the whole app
@Composable
fun BCareTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    // Override the MaterialTheme properties with app-defined above4
    MaterialTheme(
        colors = colors,
        typography = BCTypography,
        shapes = BCareShapes,
        content = content
    )
}

@Composable
fun ThemeTest() {
    BCareTheme {
        Column {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "BCareButton")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ThemePreview() {
    ThemeTest()
}