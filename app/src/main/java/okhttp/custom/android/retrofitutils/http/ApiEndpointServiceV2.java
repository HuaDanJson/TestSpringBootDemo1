package okhttp.custom.android.retrofitutils.http;


import java.util.List;

import okhttp.custom.android.retrofitutils.bean.Userinfo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpointServiceV2 {

    //    @POST("v1.0/auth/accountkit")
//    Call<HttpResponse<AccountkitBean>> getAccountkit(@Body GetAccountkitRequest body, @Header("device") String deviceype);
//
//    @GET("v1.0/users/me")
//    Call<HttpResponse<CurrentUserInfo>> getCurrentUser(@Header("Authorization") String authorization);
//
//    @GET("v1.0/friendships")
//    Call<HttpResponse<List<FriendShips>>> getFriendships(@Header("Authorization") String authorization);
//
//    @GET("v1.0/users/{userId}")
//    Call<HttpResponse<CurrentUserInfo>> getUserInfo(@Path("userId") String userId, @Header("Authorization") String authorization);
//
//    @PATCH("v1.0/users/{userId}")
//    Call<HttpResponse<UpdateUserInfoResponse>> updateUserInfo(@Path("userId") String userId, @Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @GET("v1.0/users")
//    Call<HttpResponse<FriendsUserInfo>> getFriendsUserInfoList(@Query("ids") String userIdList, @Header("Authorization") String authorization);
//
//    @GET("v1.3/me/options")
//    Call<HttpResponse<CurrentOptionsResponse>> getCurrentOptions(@Header("Authorization") String authorization);
//
//    //match
//    @POST("v1.3/match_request")
//    Call<HttpResponse<BaseResponse>> matchRequest(@Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @POST("v1.3/match_cancel")
//    Call<MatchResponse<Integer>> matchCancel(@Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @POST("v1.3/fcm")
//    Call<HttpResponse<BaseResponse>> updateFcmToken(@Body UpdateFcmTokenRequest updateFcmTokenRequest, @Header("Authorization") String authorization);
//
//    @PATCH("v1.3/match_request/{chat_id}")
//    Call<UpdateChatInfo> updateChatInfo(@Path("chat_id") String chatId, @Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @POST("v1.2/reports")
//    Call<HttpResponse<MatchReport>> matchReports(@Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @POST("v1.3/screenshot")
//    Call<HttpResponse<MatchReport>> screenshot(@Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @POST("v1.0/blocks")
//    Call<HttpResponse<BaseResponse>> blocksFriends(@Body RequestBody requestBody, @Header("Authorization") String authorization);
//
//    @DELETE("v1.0/friendships/{friendship_id}")
//    Call<HttpResponse<BaseResponse>> deleteFriends(@Path("friendship_id") String friendshipId, @Header("Authorization") String authorization);
//
//    @GET("v1.0/experiments/{experiment_id}")
//    Call<HttpResponse<ExperimentsBean>> getExperiments(@Path("experiment_id") String experimentId, @Header("Authorization") String authorization);
//
    @GET("user/getAllUser")
    Call<List<Userinfo>> getAllUser();
}
