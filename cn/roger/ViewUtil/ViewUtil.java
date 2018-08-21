package cn.roger.ViewUtil;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;


@DesignerComponent(version = ViewUtil.VERSION,
    description = "由Roger young创作，可以做工具",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = false)

public abstract class ViewUtil extends AndroidNonvisibleComponent{
    public static final int VERSION = 1;
    private static final String LOG_TAG = "ViewUtil";
    private ComponentContainer container;
    private Context context;

    public static final int VISIBLE = 0x00000000;
    public static final int INVISIBLE = 0x00000004;
    public static final int GONE = 0x00000008;
	
    public ViewUtil(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        context = (Context) container.$context();
    }
    public abstract void NEW(int id,int parent,int width,int height);
    public View findViewById(int id) {
        return container.$form().findViewById(id);
    }
    @SimpleFunction(description = "start")
    public void bringToFront(int id) {
        findViewById(id).bringToFront();
    }
    @SimpleFunction(description = "start")
    public void clearAnimation(int id) {
        findViewById(id).clearAnimation();
    }
    @SimpleFunction(description = "start")
    public int getId(int id) {
        return findViewById(id).getId();
    }
    @SimpleFunction(description = "start")
    public int getVisibility(int id) {
        return findViewById(id).getVisibility();
    }
    @SimpleFunction(description = "start")
    public void invalidate(int id) {
        findViewById(id).invalidate();
    }
    @SimpleFunction(description = "start")
    public void setBackgroundColor(int id,int color) {
        findViewById(id).setBackgroundColor(color);
    }
    @SimpleFunction(description = "start")
    public void setBackgroundDrawable(int id,Object drawable) {
        findViewById(id).setBackgroundDrawable((Drawable)drawable);
    }
    @SimpleFunction(description = "start")
    public void setElevation(int id,float elevation) {
        findViewById(id).setElevation(elevation);
    }
    @SimpleFunction(description = "start")
    public void setId(Object view,int id) {
        ((View)view).setId(id);
    }
    @SimpleFunction(description = "start")
    public void setKeepScreenOn(int id,boolean keepScreenOn) {
        findViewById(id).setKeepScreenOn(keepScreenOn);
    }
    @SimpleFunction(description = "start")
    public void setMargins(int id,int left, int top, int right, int bottom) {
        ((ViewGroup.MarginLayoutParams)findViewById(id).getLayoutParams()).setMargins(left,top,right,bottom);
    }
    @SimpleFunction(description = "start")
    public void setPadding(int id,int left, int top, int right, int bottom) {
        findViewById(id).setPadding(left,top,right,bottom);
    }
    @SimpleFunction(description = "start")
    public void setRotation(int id,float rotation) {
        findViewById(id).setRotation(rotation);
    }
    @SimpleFunction(description = "start")
    public void setRotationX(int id,float rotationX) {
        findViewById(id).setRotationX(rotationX);
    }
    @SimpleFunction(description = "start")
    public void setRotationY(int id,float rotationY) {
        findViewById(id).setRotationY(rotationY);
    }
    @SimpleFunction(description = "start")
    public void setTag(int id,Object tag) {
        findViewById(id).setTag(tag);
    }
    @SimpleFunction(description = "start")
    public void setTextAlignment(int id,int textAlignment) {
        findViewById(id).setTextAlignment(textAlignment);
    }
    @SimpleFunction(description = "start")
    public void setVisibility(int id,int visibility) {
        findViewById(id).setVisibility(visibility);
    }
    @SimpleFunction(description = "start")
    public void setX(int id,float x) {
        findViewById(id).setX(x);
    }
    @SimpleFunction(description = "start")
    public void setY(int id,float y) {
        findViewById(id).setY(y);
    }
    @SimpleFunction(description = "start")
    public void setZ(int id,float z) {
        findViewById(id).setZ(z);
    }
}
