package com.rma.cookbook.ui.navigation

<<<<<<< Updated upstream
=======
sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Register : Screen("register")
    data object Home : Screen("home")
    data object AddRecipe : Screen("add_recipe")
    data object RecipeDetail : Screen("recipe_detail")
    data object Profile : Screen("profile")
    data object AiImport : Screen("ai_import")
}
>>>>>>> Stashed changes
