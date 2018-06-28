package okhttp.custom.android.retrofitutils.http;

public interface BaseGetObjectCallback<T> {

    void onFetched(T t);

    void onError(String reason);

    class SimpleCallback<T> implements BaseGetObjectCallback<T> {

        private static final String TAG = "SimpleCallback.class";

        @Override
        public void onFetched(T t) {
        }

        @Override
        public void onError(String reason) {

        }

    }
}
