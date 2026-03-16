package com.rma.cookbook.ui.screens.auth

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.rma.cookbook.ui.viewmodel.AuthViewModel

@Composable
fun LoginScreen(
    /** ViewModel dohvaćamo preko Hilt-a kako bi Compose screen ostao bez rucnog kreiranja dependency-ja i bez znanja kako se ViewModel sastavlja. */
    viewModel: AuthViewModel = hiltViewModel()
) {
    /** Placeholder dok ne dodamo pravi UI i povezemo state iz ViewModel-a. */
    Text("Login Screen")
}
