package com.rma.cookbook.domain.repository

<<<<<<< Updated upstream
=======
import com.rma.cookbook.domain.model.Recipe
import com.rma.cookbook.util.Resource

interface RecipeRepository {
    suspend fun getRecipes(): Resource<List<Recipe>>
    suspend fun getRecipeById(id: String): Resource<Recipe>
    suspend fun createRecipe(recipe: Recipe): Resource<String>
    suspend fun updateRecipe(recipe: Recipe): Resource<Unit>
    suspend fun deleteRecipe(id: String): Resource<Unit>
}
>>>>>>> Stashed changes
