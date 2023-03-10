package com.gdscsc.bCare.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val BCarePink10 = Color(0xfffffbfa)
val BCarePink50 = Color(0xfffeeae6)
val BCarePink100 = Color(0xfffedbd0)
val BCarePink300 = Color(0xfffff0ea)
val BCarePink500 = Color(0xfffbb8ac)
val BCarePink900 = Color(0xff442c2e)

// Define the primary, primaryVariant and secondary for DarkTheme
internal val DarkColorPalette = darkColors(
    primary = BCarePink100,
    primaryVariant = BCarePink500,
    secondary = BCarePink50
)
// Define full color palette for light theme
internal val LightColorPalette = lightColors(
    primary = BCarePink100,
    primaryVariant = BCarePink500,
    secondary = BCarePink50,
    background = BCarePink100,
    surface = BCarePink10,
    error = Color(0xffc5032b),
    onPrimary = BCarePink900,
    onSecondary = BCarePink900,
    onBackground = BCarePink900,
    onSurface = BCarePink900,
    onError = BCarePink10
)