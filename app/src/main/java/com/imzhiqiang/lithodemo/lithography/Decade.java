package com.imzhiqiang.lithodemo.lithography;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;

public class Decade implements Datum {

    public int year;

    public Decade(int year) {
        this.year = year;
    }

    @Override
    public Component createComponent(ComponentContext c) {
        return DecadeSeparator.create(c).decade(this).build();
    }
}
