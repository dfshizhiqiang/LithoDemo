package com.imzhiqiang.lithodemo.lithography;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.PropDefault;
import com.facebook.litho.fresco.FrescoImage;

@LayoutSpec
public class SingleImageComponentSpec {

    @PropDefault
    protected static final float aspectRatio = 1.0f;

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext c, @Prop String image,
            @Prop(optional = true) float aspectRatio) {
        final DraweeController controller =
                Fresco.newDraweeControllerBuilder().setUri(image).build();
        return FrescoImage.create(c)
                .controller(controller)
                .aspectRatio(aspectRatio)
                .buildWithLayout();
    }
}
