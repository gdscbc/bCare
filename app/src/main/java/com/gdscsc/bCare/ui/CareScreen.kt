package com.gdscsc.bCare.ui

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.gdscsc.bCare.ui.theme.BCareTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CareScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {}) {
        BottomNavGraph(navController = navController)
    }
}

@Preview
@Composable
fun BottomAppBarPrev() {
    BCareTheme {
        CareScreen()
    }
}

@Composable
fun BottomAppBar(navController: NavHostController) {
    val items = listOf(
        BottomBarScreen.Appointment,
        BottomBarScreen.Medication,
        BottomBarScreen.Note,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
}