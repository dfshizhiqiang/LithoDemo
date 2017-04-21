package com.imzhiqiang.lithodemo;

import android.content.Context;
import android.support.v7.widget.OrientationHelper;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;
import com.imzhiqiang.lithodemo.lithography.DataModel;
import com.imzhiqiang.lithodemo.lithography.LithographyRootComponent;
import com.imzhiqiang.lithodemo.playground.PlaygroundComponent;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Demos {

    private static Map<String, Component<?>> demoModels;

    private Demos() {
    }

    public static void initialize(Context context) {
        final ComponentContext c = new ComponentContext(context);
        final RecyclerBinder recyclerBinder = new RecyclerBinder(c, 4.0f,
                new LinearLayoutInfo(c, OrientationHelper.VERTICAL, false));
        DataModel.populateBinderWithSampleData(recyclerBinder, c);

        demoModels = new LinkedHashMap<>();
        demoModels.put("Lithography",
                LithographyRootComponent.create(c).recyclerBinder(recyclerBinder).build());
        demoModels.put("Playground", PlaygroundComponent.create(c).build());
    }

    public static Component<?> getComponent(String name) {
        return demoModels.get(name);
    }

    public static void addAllToBinder(RecyclerBinder binder, ComponentContext c) {
        for (String name : demoModels.keySet()) {
            ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();
            componentInfoBuilder.component(DemoListItemComponent.create(c).name(name).build());
            binder.insertItemAt(binder.getItemCount(), componentInfoBuilder.build());
        }
    }
}
