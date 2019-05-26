package rotolo.melanie.iimdemo

import retrofit2.Call
import retrofit2.http.GET
import rotolo.melanie.iimdemo.model.Comments
import rotolo.melanie.iimdemo.model.Post
import rotolo.melanie.iimdemo.model.User

interface API {

    @GET("/posts")
    fun getPosts(): Call<List<Post>>

    @GET("/users")
    fun getUsers(): Call<List<User>>

    @GET("/comments")
    fun getComments(): Call<List<Comments>>

}