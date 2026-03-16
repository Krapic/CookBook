package com.rma.cookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rma.cookbook.ui.navigation.AppNavHost
import com.rma.cookbook.ui.theme.CookBookTheme
import dagger.hilt.android.AndroidEntryPoint

/** Glavni ulaz u Compose aplikaciju.
Oznacena je s @AndroidEntryPoint kako bi Hilt mogao ubrizgavati dependency-je
u Activity i sve Hilt-kompatibilne Compose/ViewModel dijelove ispod nje. */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /** App theme i navigation pokrecemo iz jednog centralnog mjesta. */
            CookBookTheme {
                AppNavHost()
            }
        }
    }
}
