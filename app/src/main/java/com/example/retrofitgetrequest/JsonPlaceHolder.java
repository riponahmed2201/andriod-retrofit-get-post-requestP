package com.example.retrofitgetrequest;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolder {

    @GET("posts")
//    Call<List<Post>> getPosts();

//    Call<List<Post>> getPosts(@Query("userId") int userId);

//    Call<List<Post>> getPosts(
////            @Query("userId") int userId,
//            @Query("userId") Integer[] userId,
//            @Query("_sort") String sort,
//            @Query("_order") String order
//    );

    Call<List<Post>> getPosts(@QueryMap Map<String, String> parameters);

   // @GET("posts/{id}/comments")
//    Call<List<Comment>> getComments(@Path("id") int postID);


    @GET
    Call<List<Comment>> getComments(@Url String url);
}
