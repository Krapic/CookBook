package com.rma.cookbook.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Bazna klasa za sve ViewModel-e u projektu.
 * Ovdje drzimo zajednicke stvari koje ce trebati vise screenova, poput loading state-a i prikaza greske.
 * Tako izbjegavamo dupliciranje iste logike u svakom ViewModel-u.
 */
open class BaseViewModel : ViewModel() {
    // Zajednicki loading flag koji screenovi mogu promatrati
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    // Zajednicko mjesto za poruku greske prema UI-u
    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()

    protected fun setLoading(value: Boolean) {
        _isLoading.value = value
    }

    protected fun setError(message: String?) {
        _errorMessage.value = message
    }
}
