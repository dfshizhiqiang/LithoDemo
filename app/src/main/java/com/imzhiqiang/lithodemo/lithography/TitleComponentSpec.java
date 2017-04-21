package com.imzhiqiang.lithodemo.lithography;

import android.graphics.Typeface;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.ResType;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;

@LayoutSpec
public class TitleComponentSpec {
    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c,
            @Prop(resType = ResType.STRING) String title) {
        return Text.create(c)
                .text(title)
                .textStyle(Typeface.BOLD)
                .textSizeDip(24)
                .withLayout()
                .flexShrink(0)
                .backgroundColor(0xDDFFFFFF)
                .positionType(YogaPositionType.ABSOLUTE)
                .positionDip(YogaEdge.BOTTOM, 4)
                .positionDip(YogaEdge.LEFT, 4)
                .paddingDip(YogaEdge.HORIZONTAL, 6)
                .build();
    }
}
