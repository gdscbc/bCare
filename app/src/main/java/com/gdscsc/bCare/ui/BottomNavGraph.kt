package com.gdscsc.bCare.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Medication.route
    ) {
        composable(route = BottomBarScreen.Medication.route) {
            MedicationContent()
        }
        composable(route = BottomBarScreen.Note.route) {
            NoteContent()
        }
        composable(route = BottomBarScreen.Appointment.route) {
            AppointmentContent()
        }
    }
}