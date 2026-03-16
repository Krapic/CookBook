package com.rma.cookbook

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Glavna Application klasa aplikacije.
 * Hilt ovdje pokrece svoj dependency graph za cijelu aplikaciju.
 * Zato ova klasa mora postojati prije nego sto mozemo koristiti
 * @AndroidEntryPoint i @HiltViewModel u ostatku projekta.
 */
@HiltAndroidApp
class CookBookApp : Application()
