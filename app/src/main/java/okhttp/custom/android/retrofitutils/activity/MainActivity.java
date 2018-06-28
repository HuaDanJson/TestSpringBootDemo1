package okhttp.custom.android.retrofitutils.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blankj.utilcode.util.LogUtils;

import java.util.List;

import okhttp.custom.android.retrofitutils.R;
import okhttp.custom.android.retrofitutils.bean.Userinfo;
import okhttp.custom.android.retrofitutils.http.ApiEndpointClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiEndpointClient.getEndpointV2().getAllUser()
                .enqueue(new Callback<List<Userinfo>>() {
                    @Override
                    public void onResponse(Call<List<Userinfo>> call, Response<List<Userinfo>> response) {
                        if (response != null && response.code() == 200) {
                            LogUtils.d("MainActivity getAllUser success response = " + response.body());
                        } else {
                            LogUtils.d("MainActivity getAllUser failed 0000");
                        }

                    }

                    @Override
                    public void onFailure(Call<List<Userinfo>> call, Throwable t) {
                        LogUtils.d("MainActivity getAllUser failed 1111  t = " + t);
                    }
                });
    }
}
