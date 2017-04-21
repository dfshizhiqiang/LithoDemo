package com.imzhiqiang.lithodemo.lithography;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;

/**
 * This is a interface for a piece of data that defines a component to be rendered in the feed.
 * Typically the datum would hold some intrinsic data (Strings or others) and use them to create
 * the component.
 */

public interface Datum {

    Component createComponent(ComponentContext c);
}
