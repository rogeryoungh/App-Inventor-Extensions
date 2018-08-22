package cn.roger.shape;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.view.View;

import cn.roger.ViewUtil.IDUtil;


@DesignerComponent(version = ShapeUtil.VERSION,
    description = "by Roger Young",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = true)

public class ShapeUtil extends IDUtil {
    public static final int VERSION = 1;
    private static final String LOG_TAG = "ShapeUtil";
	
    public ShapeUtil(ComponentContainer container) {
        super(container.$form());
    }
	
    @SimpleFunction(description = "newGradientDrawable")
    public void NEW() {
        findViewById(id).setBackground(new GradientDrawable());
    }
	
    @SimpleFunction(description = "setCornerRadius")
    public void setCornerRadius(float radius) {
        ((GradientDrawable)findViewById(id).getBackground()).setCornerRadius(radius);
    }
    @SimpleFunction(description = "setStroke")
    public void setStroke(int width,String color) {
        ((GradientDrawable)findViewById(id).getBackground()).setStroke(width,Color.parseColor(color));
    }
    @SimpleFunction(description = "setColor")
    public void setColor(String color) {
        ((GradientDrawable)findViewById(id).getBackground()).setColor(Color.parseColor(color));
    }
}
