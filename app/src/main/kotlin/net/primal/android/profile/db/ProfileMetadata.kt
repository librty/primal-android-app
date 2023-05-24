package net.primal.android.profile.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfileMetadata(
    @PrimaryKey
    val ownerId: String,
    val eventId: String,
    val createdAt: Long,
    val raw: String,
    val name: String? = null,
    val internetIdentifier: String? = null,
    val about: String? = null,
    val picture: String? = null,
    val banner: String? = null,
    val displayName: String? = null,
    val website: String? = null,
)