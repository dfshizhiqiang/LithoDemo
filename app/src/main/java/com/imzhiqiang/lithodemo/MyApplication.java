package com.imzhiqiang.lithodemo;

import android.app.Application;
import com.facebook.soloader.SoLoader;

/**
 * Created by zech on 2017/4/20.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, false);
    }
}
