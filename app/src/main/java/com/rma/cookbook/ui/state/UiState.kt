package com.rma.cookbook.ui.state

/**
 * Zajednicki model stanja za ekrane koji dohvacaju ili salju podatke.
 * Sluzi da svi ViewModeli koriste isti obrazac: Idle -> Loading -> Success ili Error,
 * umjesto da svaki ekran ima svoju verziju istog state managementa.
 */
sealed interface UiState<out T> {
    data object Idle : UiState<Nothing>
    data object Loading : UiState<Nothing>
    data class Success<T>(val data: T) : UiState<T>
    data class Error(val message: String) : UiState<Nothing>
}