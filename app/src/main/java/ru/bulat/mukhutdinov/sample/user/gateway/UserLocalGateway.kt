package ru.bulat.mukhutdinov.sample.user.gateway

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single
import ru.bulat.mukhutdinov.sample.user.model.User

interface UserLocalGateway {

    fun getAll(): Single<List<User>>

    fun findById(id: Int): Maybe<User>

    fun update(user: User): Completable
}