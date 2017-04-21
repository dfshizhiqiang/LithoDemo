package com.imzhiqiang.lithodemo;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.litho.LithoWebKitInspector;
import com.facebook.soloader.SoLoader;
import com.facebook.stetho.Stetho;

public class LithoSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        SoLoader.init(this, false);
        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableWebKitInspector(new LithoWebKitInspector(this))
                .build());
    }
}
