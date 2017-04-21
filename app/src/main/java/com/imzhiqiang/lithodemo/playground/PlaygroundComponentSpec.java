package com.imzhiqiang.lithodemo.playground;

import android.graphics.Color;
import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;

@LayoutSpec
public class PlaygroundComponentSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c) {
        return Column.create(c)
                .flexShrink(0)
                .alignContent(YogaAlign.FLEX_START)
                .backgroundColor(Color.WHITE)
                .child(Text.create(c).textSizeSp(20).text("Playground sample"))
                .build();
    }
}
