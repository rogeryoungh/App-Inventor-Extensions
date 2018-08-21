package cn.roger.animation;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import android.view.ViewPropertyAnimator;
import android.animation.ValueAnimator;
import android.view.View;

@DesignerComponent(version = AnimationUtil.VERSION,
    description = "由Roger young创作，可以执行动画",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = true)

public class AnimationUtil extends AndroidNonvisibleComponent {
    public static final int VERSION = 1;
    private static final String LOG_TAG = "AnimationUtil";
	
    public AnimationUtil(ComponentContainer container) {
        super(container.$form());
    }
    @SimpleFunction(description = "start")
    public void start(Object vpa,long duration,long startDelay) {
		((ViewPropertyAnimator)vpa).setDuration(duration);
        ((ViewPropertyAnimator)vpa).setStartDelay(startDelay);
        ((ViewPropertyAnimator)vpa).start();
    }
    
    @SimpleFunction(description = "getAnimator")
    public Object getAnimator(Object view) {
        return ((View)view).animate();
    }
	
    @SimpleFunction(description = "scaleX")
    public Object scaleX(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).scaleXBy(f);
		else
			return ((ViewPropertyAnimator)vpa).scaleX(f);
    }
    @SimpleFunction(description = "scaleY")
    public Object scaleY(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).scaleYBy(f);
		else
			return ((ViewPropertyAnimator)vpa).scaleY(f);
    }
	
    @SimpleFunction(description = "alpha")
    public Object alpha(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).alphaBy(f);
		else
			return ((ViewPropertyAnimator)vpa).alpha(f);
    }
	
    @SimpleFunction(description = "translationX")
    public Object translationX(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).translationXBy(f);
		else
			return ((ViewPropertyAnimator)vpa).translationX(f);
    }
    @SimpleFunction(description = "translationY")
    public Object translationY(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).translationYBy(f);
		else
			return ((ViewPropertyAnimator)vpa).translationY(f);
    }
    @SimpleFunction(description = "translationZ")
    public Object translationZ(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).translationZBy(f);
		else
			return ((ViewPropertyAnimator)vpa).translationZ(f);
    }
	
    @SimpleFunction(description = "cancel")
    public void cancel(Object vpa) {
        ((ViewPropertyAnimator)vpa).cancel();
    }
	
    @SimpleFunction(description = "rotation")
    public Object rotation(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).rotationBy(f);
		else
			return ((ViewPropertyAnimator)vpa).rotation(f);
    }
    @SimpleFunction(description = "rotationX")
    public Object rotationX(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).rotationXBy(f);
		else
			return ((ViewPropertyAnimator)vpa).rotationX(f);
    }
    @SimpleFunction(description = "rotationY")
    public Object rotationY(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).rotationYBy(f);
		else
			return ((ViewPropertyAnimator)vpa).rotationY(f);
    }
	
    @SimpleFunction(description = "withLayer")
    public Object withLayer(Object vpa) {
        return ((ViewPropertyAnimator)vpa).withLayer();
    }
	
    @SimpleFunction(description = "x")
    public Object x(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).xBy(f);
		else
			return ((ViewPropertyAnimator)vpa).x(f);
    }
    @SimpleFunction(description = "y")
    public Object y(Object vpa,float f,boolean b) {
		if(b)
			return ((ViewPropertyAnimator)vpa).yBy(f);
		else
			return ((ViewPropertyAnimator)vpa).y(f);
    }
    @SimpleFunction(description = "z")
    public Object z(Object vpa,float f,boolean b) {
        if(b)
            return ((ViewPropertyAnimator)vpa).zBy(f);
        else
            return ((ViewPropertyAnimator)vpa).z(f);
    }
	
}
