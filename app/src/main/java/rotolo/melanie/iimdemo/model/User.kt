package rotolo.melanie.iimdemo.model

import java.io.Serializable

data class User(
    var id: Int,
    var name: String,
    var username: String,
    var email: String
): Serializable