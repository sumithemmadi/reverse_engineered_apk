package com.github.jdsjlzx.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.b.a.b;
import c.b.a.c;
import c.b.a.d;
import c.b.a.g.a;
import com.github.jdsjlzx.progressindicator.AVLoadingIndicatorView;

public class LoadingFooter extends RelativeLayout implements a {
  protected State b = State.b;
  
  private View c;
  
  private View d;
  
  private View e;
  
  private SimpleViewSwitcher f;
  
  private TextView g;
  
  private TextView h;
  
  private TextView i;
  
  private String j;
  
  private String k;
  
  private String l;
  
  private int m;
  
  private int n;
  
  private int o = c.b.a.a.colorAccent;
  
  public LoadingFooter(Context paramContext) {
    super(paramContext);
    e(paramContext);
  }
  
  public LoadingFooter(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    e(paramContext);
  }
  
  public LoadingFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e(paramContext);
  }
  
  private View f(int paramInt) {
    if (paramInt == -1)
      return (View)new ProgressBar(getContext(), null, 16842871); 
    AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView)LayoutInflater.from(getContext()).inflate(c.layout_indicator_view, null);
    aVLoadingIndicatorView.setIndicatorId(paramInt);
    aVLoadingIndicatorView.setIndicatorColor(this.n);
    return (View)aVLoadingIndicatorView;
  }
  
  public void a() {
    setState(State.b);
  }
  
  public void b() {
    setState(State.c);
  }
  
  public void c() {
    setState(State.d);
  }
  
  public void d() {
    a();
  }
  
  public void e(Context paramContext) {
    RelativeLayout.inflate(paramContext, c.layout_recyclerview_list_footer, (ViewGroup)this);
    setOnClickListener(null);
    d();
    this.n = androidx.core.content.a.d(getContext(), c.b.a.a.colorAccent);
    this.m = 0;
  }
  
  public View getFootView() {
    return (View)this;
  }
  
  public State getState() {
    return this.b;
  }
  
  public void setHintTextColor(int paramInt) {
    this.o = paramInt;
  }
  
  public void setIndicatorColor(int paramInt) {
    this.n = paramInt;
  }
  
  public void setLoadingHint(String paramString) {
    this.j = paramString;
  }
  
  public void setNoMoreHint(String paramString) {
    this.k = paramString;
  }
  
  public void setNoNetWorkHint(String paramString) {
    this.l = paramString;
  }
  
  public void setProgressStyle(int paramInt) {
    this.m = paramInt;
  }
  
  public void setState(State paramState) {
    setState(paramState, true);
  }
  
  public void setState(State paramState, boolean paramBoolean) {
    if (this.b == paramState)
      return; 
    this.b = paramState;
    int i = a.a[paramState.ordinal()];
    byte b = 8;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4) {
            String str;
            View view = this.c;
            if (view != null)
              view.setVisibility(8); 
            view = this.e;
            if (view != null)
              view.setVisibility(8); 
            view = this.d;
            if (view == null) {
              view = ((ViewStub)findViewById(b.network_error_viewstub)).inflate();
              this.d = view;
              this.i = (TextView)view.findViewById(b.network_error_text);
            } else {
              view.setVisibility(0);
            } 
            view = this.d;
            if (paramBoolean)
              b = 0; 
            view.setVisibility(b);
            TextView textView = this.i;
            if (TextUtils.isEmpty(this.l)) {
              str = getResources().getString(d.list_footer_network_error);
            } else {
              str = this.l;
            } 
            textView.setText(str);
            this.i.setTextColor(androidx.core.content.a.d(getContext(), this.o));
          } 
        } else {
          String str;
          setOnClickListener(null);
          View view = this.c;
          if (view != null)
            view.setVisibility(8); 
          view = this.d;
          if (view != null)
            view.setVisibility(8); 
          view = this.e;
          if (view == null) {
            view = ((ViewStub)findViewById(b.end_viewstub)).inflate();
            this.e = view;
            this.h = (TextView)view.findViewById(b.loading_end_text);
          } else {
            view.setVisibility(0);
          } 
          view = this.e;
          if (paramBoolean)
            b = 0; 
          view.setVisibility(b);
          TextView textView = this.h;
          if (TextUtils.isEmpty(this.k)) {
            str = getResources().getString(d.list_footer_end);
          } else {
            str = this.k;
          } 
          textView.setText(str);
          this.h.setTextColor(androidx.core.content.a.d(getContext(), this.o));
        } 
      } else {
        String str;
        setOnClickListener(null);
        View view = this.e;
        if (view != null)
          view.setVisibility(8); 
        view = this.d;
        if (view != null)
          view.setVisibility(8); 
        if (this.c == null) {
          view = ((ViewStub)findViewById(b.loading_viewstub)).inflate();
          this.c = view;
          this.f = (SimpleViewSwitcher)view.findViewById(b.loading_progressbar);
          this.g = (TextView)this.c.findViewById(b.loading_text);
        } 
        view = this.c;
        if (paramBoolean)
          b = 0; 
        view.setVisibility(b);
        this.f.setVisibility(0);
        this.f.removeAllViews();
        this.f.addView(f(this.m));
        TextView textView = this.g;
        if (TextUtils.isEmpty(this.j)) {
          str = getResources().getString(d.list_footer_loading);
        } else {
          str = this.j;
        } 
        textView.setText(str);
        this.g.setTextColor(androidx.core.content.a.d(getContext(), this.o));
      } 
    } else {
      setOnClickListener(null);
      View view = this.c;
      if (view != null)
        view.setVisibility(8); 
      view = this.e;
      if (view != null)
        view.setVisibility(8); 
      view = this.d;
      if (view != null)
        view.setVisibility(8); 
    } 
  }
  
  public void setViewBackgroundColor(int paramInt) {
    setBackgroundColor(androidx.core.content.a.d(getContext(), paramInt));
  }
  
  public enum State {
    b, c, d, e;
    
    static {
      State state1 = new State("Normal", 0);
      b = state1;
      State state2 = new State("NoMore", 1);
      c = state2;
      State state3 = new State("Loading", 2);
      d = state3;
      State state4 = new State("NetWorkError", 3);
      e = state4;
      f = new State[] { state1, state2, state3, state4 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/view/LoadingFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */