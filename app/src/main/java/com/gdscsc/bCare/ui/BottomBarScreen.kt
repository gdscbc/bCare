package com.gdscsc.bCare.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gdscsc.bCare.R

sealed class Screen(val route: String, @StringRes val resourceId: Int, @DrawableRes val iconResource: Int) {
    object Appointment : Screen("appointment", R.string.profile, R.drawable.ic_dashboard_black_24dp)
    object Medication : Screen("medication", R.string.medication_screen, R.drawable.medication_48px)
    object Note: Screen("notes", R.string.notes, R.drawable.baseline_notes_24)
}