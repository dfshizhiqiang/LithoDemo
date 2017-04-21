package com.imzhiqiang.lithodemo.lithography;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.ResType;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;

@LayoutSpec
public class FooterComponentSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c,
            @Prop(resType = ResType.STRING) String text) {
        return Column.create(c)
                .flexShrink(0)
                .alignContent(YogaAlign.FLEX_START)
                .paddingDip(YogaEdge.ALL, 8)
                .child(Text.create(c)
                        .text(text)
                        .textSizeDip(14)
                        .textColor(Color.GRAY)
                        .textStyle(Typeface.ITALIC))
                .build();
    }
}
