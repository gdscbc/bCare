package com.gdscsc.bCare.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue // This mf provides getters for other mfs
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.gdscsc.bCare.ui.theme.BCareTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CareScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomAppBar(navController) }) {
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
    val screens = listOf(
        BottomBarScreen.Appointment,
        BottomBarScreen.Medication,
        BottomBarScreen.Note,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen, currentDestination: NavDestination?, navController: NavHostController
) {
    BottomNavigationItem(selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        label = { Text(text = stringResource(id = screen.titleResourceId)) },
        icon = { painterResource(id = screen.iconResourceId) },
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled)
    )
}