package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Prathamesh More on 05-Feb-17.
 */

public class CO_JJMPOLY extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
