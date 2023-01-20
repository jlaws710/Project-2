package org.project2.repository

import org.project2.model.User
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CassandraRepository<User, String> {

    fun findByEmail(email: String): User?

    fun deleteByUsername(username: String?)

    fun findByUsername(userName: String): Optional<User>
}