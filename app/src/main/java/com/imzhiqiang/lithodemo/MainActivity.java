package com.imzhiqiang.lithodemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.OrientationHelper;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext cc = new ComponentContext(this);

        final RecyclerBinder recyclerBinder = new RecyclerBinder(cc,
                new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));

        final Component component = Recycler.create(cc).binder(recyclerBinder).build();

        final LithoView lithoView = LithoView.create(this, component);

        setContentView(lithoView);

        addContent(recyclerBinder, cc);
    }

    private static void addContent(RecyclerBinder binder, ComponentContext cc) {
        for (int i = 0; i < 32; i++) {
            binder.insertItemAt(i, ComponentInfo.create()
                    .component(ListItem.create(cc)
                            .color(i % 2 == 0 ? Color.WHITE : Color.LTGRAY)
                            .title("Hello world")
                            .subtitle("Litho tutorial")
                            .build())
                    .build());
        }
    }
}
