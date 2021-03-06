package ru.bulat.mukhutdinov.sample.user.model

import ru.bulat.mukhutdinov.sample.user.db.UserEntity

object UserConverter {

    fun toDatabase(source: User) =
        UserEntity(
            id = source.id,
            description = source.description,
            icon = source.icon,
            iconThumbnail = source.iconThumbnail,
            name = source.name
        )

    fun fromDatabase(source: UserEntity) =
        User(
            id = source.id,
            description = source.description,
            icon = source.icon,
            iconThumbnail = source.iconThumbnail,
            name = source.name
        )
}