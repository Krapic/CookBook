package com.rma.cookbook.ui.navigation

<<<<<<< Updated upstream
=======
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rma.cookbook.ui.screens.auth.LoginScreen
import com.rma.cookbook.ui.screens.auth.RegisterScreen
import com.rma.cookbook.ui.screens.home.HomeScreen
import com.rma.cookbook.ui.screens.recipe.AddRecipeScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) {
            LoginScreen()
        }
        composable(Screen.Register.route) {
            RegisterScreen()
        }
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.AddRecipe.route) {
            AddRecipeScreen()
        }
    }
}
>>>>>>> Stashed changes
