package com.rma.cookbook.ui.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher

/** ViewModel za auth ekran.
Trenutno je minimalan jer jos nemamo stvarnu auth logiku,
ali je namjerno povezan s Hilt-om da postavimo obrazac
koji ce koristiti i ostali ViewModel-i u projektu. */
@HiltViewModel
class AuthViewModel @Inject constructor(
    /** Dependency dobivamo preko Hilt-a umjesto da ga sami kreiramo u UI sloju. */
    private val ioDispatcher: CoroutineDispatcher
) : BaseViewModel()