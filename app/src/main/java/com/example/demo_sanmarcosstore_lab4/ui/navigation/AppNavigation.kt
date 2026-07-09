package com.example.demo_sanmarcosstore_lab3.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.demo_sanmarcosstore_lab3.ui.screens.ProfileScreen
import com.example.demo_sanmarcosstore_lab3.ui.screens.TiendaScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    Scaffold(

        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = currentRoute == "home",
                    onClick = {
                        navController.navigate("home")
                    },
                    icon = {
                        Icon(Icons.Default.Home, null)
                    },
                    label = {
                        Text("Tienda")
                    }
                )

                NavigationBarItem(
                    selected = currentRoute == "profile",
                    onClick = {
                        navController.navigate("profile")
                    },
                    icon = {
                        Icon(Icons.Default.Person, null)
                    },
                    label = {
                        Text("Perfil")
                    }
                )

            }

        }

    ) { padding ->

        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {

            composable("home") {
                TiendaScreen(navController)
            }

            composable("profile") {
                ProfileScreen(navController)
            }

        }

    }

}