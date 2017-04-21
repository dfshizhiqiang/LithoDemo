package com.imzhiqiang.lithodemo.lithography;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;

@LayoutSpec
public class ActionsComponentSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c) {
        return Row.create(c)
                .backgroundColor(0xDDFFFFFF)
                .positionType(YogaPositionType.ABSOLUTE)
                .positionDip(YogaEdge.RIGHT, 4)
                .positionDip(YogaEdge.TOP, 4)
                .paddingDip(YogaEdge.ALL, 2)
                .child(FavouriteButton.create(c))
                .build();
    }
}
