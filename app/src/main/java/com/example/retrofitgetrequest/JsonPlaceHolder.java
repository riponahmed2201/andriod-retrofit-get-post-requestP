package com.example.retrofitgetrequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolder {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/1/comments")
    Call<List<Comment>> getComments();
}
