package com.imzhiqiang.lithodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;

public class DemoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Demos.initialize(this);

        setContentView(LithoView.create(this,
                DemoListComponent.create(new ComponentContext(this)).build()));
    }
}
