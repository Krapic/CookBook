package com.rma.cookbook.domain.repository

import com.rma.cookbook.domain.model.User
import com.rma.cookbook.util.Resource

interface AuthRepository {
    suspend fun login(email: String, password: String): Resource<User>
    suspend fun register(email: String, password: String, displayName: String): Resource<User>
    fun logout()
    fun getCurrentUser(): User?
}
