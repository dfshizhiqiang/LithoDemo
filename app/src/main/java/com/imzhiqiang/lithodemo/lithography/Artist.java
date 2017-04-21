package com.imzhiqiang.lithodemo.lithography;

import android.support.v7.widget.OrientationHelper;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;

public class Artist implements Datum {
    public final String name;
    public final String biography;
    public final String[] images;
    public final int year;

    public Artist(String name, String biography, int year, String... images) {
        this.name = name;
        this.biography = biography;
        this.images = images;
        this.year = year;
    }

    @Override
    public Component createComponent(ComponentContext c) {
        final RecyclerBinder imageBinder = new RecyclerBinder(c, 4.0f,
                new LinearLayoutInfo(c, OrientationHelper.HORIZONTAL, false));

        for (String image : images) {
            ComponentInfo.Builder cib = ComponentInfo.create();
            cib.component(SingleImageComponent.create(c).image(image).aspectRatio(2.0f).build());
            imageBinder.insertItemAt(imageBinder.getItemCount(), cib.build());
        }

        return FeedItemCard.create(c).artist(this).binder(imageBinder).build();
    }
}
