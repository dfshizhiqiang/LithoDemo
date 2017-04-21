package com.imzhiqiang.lithodemo;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.ResType;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * Created by zech on 2017/4/20.
 */
@LayoutSpec
class ListItemSpec {
    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c,
            @Prop(optional = true, resType = ResType.COLOR) int color, @Prop String title,
            @Prop String subtitle) {
        return Column.create(c)
                .paddingDip(YogaEdge.ALL, 16)
                .backgroundColor(color)
                .child(Text.create(c).text(title).textSizeDip(40))
                .child(Text.create(c).text(subtitle).textSizeDip(20))
                .build();
    }
}
