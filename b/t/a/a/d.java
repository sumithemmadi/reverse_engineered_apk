package b.t.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import b.n.a.a.a;
import b.n.a.a.b;
import b.n.a.a.c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
  private static Interpolator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser) {
    g g;
    int i = paramXmlPullParser.getDepth();
    paramResources = null;
    while (true) {
      int j = paramXmlPullParser.next();
      if ((j != 3 || paramXmlPullParser.getDepth() > i) && j != 1) {
        LinearInterpolator linearInterpolator;
        AccelerateInterpolator accelerateInterpolator;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
        CycleInterpolator cycleInterpolator;
        AnticipateInterpolator anticipateInterpolator;
        OvershootInterpolator overshootInterpolator;
        BounceInterpolator bounceInterpolator;
        if (j != 2)
          continue; 
        AttributeSet attributeSet = Xml.asAttributeSet(paramXmlPullParser);
        String str = paramXmlPullParser.getName();
        if (str.equals("linearInterpolator")) {
          linearInterpolator = new LinearInterpolator();
          continue;
        } 
        if (str.equals("accelerateInterpolator")) {
          accelerateInterpolator = new AccelerateInterpolator(paramContext, (AttributeSet)linearInterpolator);
          continue;
        } 
        if (str.equals("decelerateInterpolator")) {
          DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(paramContext, (AttributeSet)accelerateInterpolator);
          continue;
        } 
        if (str.equals("accelerateDecelerateInterpolator")) {
          accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
          continue;
        } 
        if (str.equals("cycleInterpolator")) {
          cycleInterpolator = new CycleInterpolator(paramContext, (AttributeSet)accelerateDecelerateInterpolator);
          continue;
        } 
        if (str.equals("anticipateInterpolator")) {
          anticipateInterpolator = new AnticipateInterpolator(paramContext, (AttributeSet)cycleInterpolator);
          continue;
        } 
        if (str.equals("overshootInterpolator")) {
          overshootInterpolator = new OvershootInterpolator(paramContext, (AttributeSet)anticipateInterpolator);
          continue;
        } 
        if (str.equals("anticipateOvershootInterpolator")) {
          AnticipateOvershootInterpolator anticipateOvershootInterpolator = new AnticipateOvershootInterpolator(paramContext, (AttributeSet)overshootInterpolator);
          continue;
        } 
        if (str.equals("bounceInterpolator")) {
          bounceInterpolator = new BounceInterpolator();
          continue;
        } 
        if (str.equals("pathInterpolator")) {
          g = new g(paramContext, (AttributeSet)bounceInterpolator, paramXmlPullParser);
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown interpolator name: ");
        stringBuilder.append(paramXmlPullParser.getName());
        throw new RuntimeException(stringBuilder.toString());
      } 
      break;
    } 
    return g;
  }
  
  public static Interpolator b(Context paramContext, int paramInt) {
    if (Build.VERSION.SDK_INT >= 21)
      return AnimationUtils.loadInterpolator(paramContext, paramInt); 
    XmlResourceParser xmlResourceParser1 = null;
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    if (paramInt == 17563663) {
      try {
        return (Interpolator)new a();
      } catch (XmlPullParserException xmlPullParserException) {
      
      } catch (IOException iOException) {
      
      } finally {}
    } else {
      if (paramInt == 17563661)
        return (Interpolator)new b(); 
      if (paramInt == 17563662)
        return (Interpolator)new c(); 
      xmlResourceParser4 = paramContext.getResources().getAnimation(paramInt);
      xmlResourceParser3 = xmlResourceParser4;
      xmlResourceParser1 = xmlResourceParser4;
      xmlResourceParser2 = xmlResourceParser4;
      Interpolator interpolator = a(paramContext, paramContext.getResources(), paramContext.getTheme(), (XmlPullParser)xmlResourceParser4);
      if (xmlResourceParser4 != null)
        xmlResourceParser4.close(); 
      return interpolator;
    } 
    xmlResourceParser3 = xmlResourceParser1;
    Resources.NotFoundException notFoundException = new Resources.NotFoundException();
    xmlResourceParser3 = xmlResourceParser1;
    StringBuilder stringBuilder = new StringBuilder();
    xmlResourceParser3 = xmlResourceParser1;
    this();
    XmlResourceParser xmlResourceParser4;
    xmlResourceParser3 = xmlResourceParser1;
    stringBuilder.append("Can't load animation resource ID #0x");
    xmlResourceParser3 = xmlResourceParser1;
    stringBuilder.append(Integer.toHexString(paramInt));
    xmlResourceParser3 = xmlResourceParser1;
    this(stringBuilder.toString());
    xmlResourceParser3 = xmlResourceParser1;
    notFoundException.initCause((Throwable)xmlResourceParser4);
    xmlResourceParser3 = xmlResourceParser1;
    throw notFoundException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */