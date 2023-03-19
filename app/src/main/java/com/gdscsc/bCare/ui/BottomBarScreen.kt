package com.gdscsc.bCare.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gdscsc.bCare.R

sealed class BottomBarScreen(
    val route: String, @StringRes val titleResourceId: Int, @DrawableRes val iconResourceId: Int
) {
    object Appointment : BottomBarScreen(
        route = "appointment",
        titleResourceId = R.string.profile,
        iconResourceId = R.drawable.ic_dashboard_black_24dp
    )

    object Medication : BottomBarScreen(
        route = "medication",
        titleResourceId = R.string.medication_screen,
        iconResourceId = R.drawable.medication_48px
    )

    object Note : BottomBarScreen(
        route = "notes",
        titleResourceId = R.string.notes,
        iconResourceId = R.drawable.baseline_notes_24
    )
}