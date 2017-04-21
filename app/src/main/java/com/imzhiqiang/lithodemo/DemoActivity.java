package com.imzhiqiang.lithodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.litho.LithoView;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Demos.initialize(this);

        final String demoName = (String) getIntent().getSerializableExtra("demoName");

        setContentView(
                LithoView.create(
                        this,
                        Demos.getComponent(demoName)));
    }
}
