package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import b.a.o.c;
import b.h.k.w;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements c {
  static final n q;
  
  private o A;
  
  private Rect B = new Rect();
  
  private Rect C = new Rect();
  
  private int[] D = new int[2];
  
  private int[] E = new int[2];
  
  private final ImageView F;
  
  private final Drawable G;
  
  private final int H;
  
  private final int I;
  
  private final Intent J;
  
  private final Intent K;
  
  private final CharSequence L;
  
  private l M;
  
  private k N;
  
  View.OnFocusChangeListener O;
  
  private m P;
  
  private View.OnClickListener Q;
  
  private boolean R;
  
  private boolean S;
  
  b.i.a.a T;
  
  private boolean U;
  
  private CharSequence V;
  
  private boolean W;
  
  private boolean a0;
  
  private int b0;
  
  private boolean c0;
  
  private CharSequence d0;
  
  private CharSequence e0;
  
  private boolean f0;
  
  private int g0;
  
  SearchableInfo h0;
  
  private Bundle i0;
  
  private final Runnable j0 = new b(this);
  
  private Runnable k0 = new c(this);
  
  private final WeakHashMap<String, Drawable.ConstantState> l0 = new WeakHashMap<String, Drawable.ConstantState>();
  
  private final View.OnClickListener m0;
  
  View.OnKeyListener n0;
  
  private final TextView.OnEditorActionListener o0;
  
  private final AdapterView.OnItemClickListener p0;
  
  private final AdapterView.OnItemSelectedListener q0;
  
  final SearchAutoComplete r;
  
  private TextWatcher r0;
  
  private final View s;
  
  private final View t;
  
  private final View u;
  
  final ImageView v;
  
  final ImageView w;
  
  final ImageView x;
  
  final ImageView y;
  
  private final View z;
  
  static {
    n n1;
    if (Build.VERSION.SDK_INT < 29) {
      n1 = new n();
    } else {
      n1 = null;
    } 
    q = n1;
  }
  
  public SearchView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    f f = new f(this);
    this.m0 = f;
    this.n0 = new g(this);
    h h = new h(this);
    this.o0 = h;
    i i = new i(this);
    this.p0 = i;
    j j = new j(this);
    this.q0 = j;
    this.r0 = new a(this);
    e0 e0 = e0.v(paramContext, paramAttributeSet, b.a.j.SearchView, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(e0.n(b.a.j.SearchView_layout, b.a.g.abc_search_view), this, true);
    SearchAutoComplete searchAutoComplete = (SearchAutoComplete)findViewById(b.a.f.search_src_text);
    this.r = searchAutoComplete;
    searchAutoComplete.setSearchView(this);
    this.s = findViewById(b.a.f.search_edit_frame);
    View view2 = findViewById(b.a.f.search_plate);
    this.t = view2;
    View view3 = findViewById(b.a.f.submit_area);
    this.u = view3;
    ImageView imageView1 = (ImageView)findViewById(b.a.f.search_button);
    this.v = imageView1;
    ImageView imageView2 = (ImageView)findViewById(b.a.f.search_go_btn);
    this.w = imageView2;
    ImageView imageView3 = (ImageView)findViewById(b.a.f.search_close_btn);
    this.x = imageView3;
    ImageView imageView4 = (ImageView)findViewById(b.a.f.search_voice_btn);
    this.y = imageView4;
    ImageView imageView5 = (ImageView)findViewById(b.a.f.search_mag_icon);
    this.F = imageView5;
    w.u0(view2, e0.g(b.a.j.SearchView_queryBackground));
    w.u0(view3, e0.g(b.a.j.SearchView_submitBackground));
    paramInt = b.a.j.SearchView_searchIcon;
    imageView1.setImageDrawable(e0.g(paramInt));
    imageView2.setImageDrawable(e0.g(b.a.j.SearchView_goIcon));
    imageView3.setImageDrawable(e0.g(b.a.j.SearchView_closeIcon));
    imageView4.setImageDrawable(e0.g(b.a.j.SearchView_voiceIcon));
    imageView5.setImageDrawable(e0.g(paramInt));
    this.G = e0.g(b.a.j.SearchView_searchHintIcon);
    g0.a((View)imageView1, getResources().getString(b.a.h.abc_searchview_description_search));
    this.H = e0.n(b.a.j.SearchView_suggestionRowLayout, b.a.g.abc_search_dropdown_item_icons_2line);
    this.I = e0.n(b.a.j.SearchView_commitIcon, 0);
    imageView1.setOnClickListener(f);
    imageView3.setOnClickListener(f);
    imageView2.setOnClickListener(f);
    imageView4.setOnClickListener(f);
    searchAutoComplete.setOnClickListener(f);
    searchAutoComplete.addTextChangedListener(this.r0);
    searchAutoComplete.setOnEditorActionListener(h);
    searchAutoComplete.setOnItemClickListener(i);
    searchAutoComplete.setOnItemSelectedListener(j);
    searchAutoComplete.setOnKeyListener(this.n0);
    searchAutoComplete.setOnFocusChangeListener(new d(this));
    setIconifiedByDefault(e0.a(b.a.j.SearchView_iconifiedByDefault, true));
    paramInt = e0.f(b.a.j.SearchView_android_maxWidth, -1);
    if (paramInt != -1)
      setMaxWidth(paramInt); 
    this.L = e0.p(b.a.j.SearchView_defaultQueryHint);
    this.V = e0.p(b.a.j.SearchView_queryHint);
    paramInt = e0.k(b.a.j.SearchView_android_imeOptions, -1);
    if (paramInt != -1)
      setImeOptions(paramInt); 
    paramInt = e0.k(b.a.j.SearchView_android_inputType, -1);
    if (paramInt != -1)
      setInputType(paramInt); 
    setFocusable(e0.a(b.a.j.SearchView_android_focusable, true));
    e0.w();
    Intent intent = new Intent("android.speech.action.WEB_SEARCH");
    this.J = intent;
    intent.addFlags(268435456);
    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.K = intent;
    intent.addFlags(268435456);
    View view1 = findViewById(searchAutoComplete.getDropDownAnchor());
    this.z = view1;
    if (view1 != null)
      view1.addOnLayoutChangeListener(new e(this)); 
    j0(this.R);
    f0();
  }
  
  private Intent C(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.e0);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra("intent_extra_data_key", paramString2); 
    Bundle bundle = this.i0;
    if (bundle != null)
      intent.putExtra("app_data", bundle); 
    if (paramInt != 0) {
      intent.putExtra("action_key", paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    intent.setComponent(this.h0.getSearchActivity());
    return intent;
  }
  
  private Intent D(Cursor paramCursor, int paramInt, String paramString) {
    try {
      Uri uri;
      String str1 = y.o(paramCursor, "suggest_intent_action");
      String str2 = str1;
      if (str1 == null)
        str2 = this.h0.getSuggestIntentAction(); 
      str1 = str2;
      if (str2 == null)
        str1 = "android.intent.action.SEARCH"; 
      String str3 = y.o(paramCursor, "suggest_intent_data");
      str2 = str3;
      if (str3 == null)
        str2 = this.h0.getSuggestIntentData(); 
      str3 = str2;
      if (str2 != null) {
        String str = y.o(paramCursor, "suggest_intent_data_id");
        str3 = str2;
        if (str != null) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(str2);
          stringBuilder.append("/");
          stringBuilder.append(Uri.encode(str));
          str3 = stringBuilder.toString();
        } 
      } 
      if (str3 == null) {
        str2 = null;
      } else {
        uri = Uri.parse(str3);
      } 
      str3 = y.o(paramCursor, "suggest_intent_query");
      return C(str1, uri, y.o(paramCursor, "suggest_intent_extra_data"), str3, paramInt, paramString);
    } catch (RuntimeException runtimeException) {
      try {
        paramInt = paramCursor.getPosition();
      } catch (RuntimeException runtimeException1) {
        paramInt = -1;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Search suggestions cursor at row ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" returned exception.");
      Log.w("SearchView", stringBuilder.toString(), runtimeException);
      return null;
    } 
  }
  
  private Intent E(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str1;
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    Intent intent1 = new Intent("android.intent.action.SEARCH");
    intent1.setComponent(componentName);
    PendingIntent pendingIntent = PendingIntent.getActivity(getContext(), 0, intent1, 1073741824);
    Bundle bundle2 = new Bundle();
    Bundle bundle1 = this.i0;
    if (bundle1 != null)
      bundle2.putParcelable("app_data", (Parcelable)bundle1); 
    Intent intent2 = new Intent(paramIntent);
    int i = 1;
    Resources resources = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      str1 = resources.getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      str1 = "free_form";
    } 
    int j = paramSearchableInfo.getVoicePromptTextId();
    String str2 = null;
    if (j != 0) {
      String str = resources.getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      bundle1 = null;
    } 
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      String str = resources.getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      resources = null;
    } 
    if (paramSearchableInfo.getVoiceMaxResults() != 0)
      i = paramSearchableInfo.getVoiceMaxResults(); 
    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", str1);
    intent2.putExtra("android.speech.extra.PROMPT", (String)bundle1);
    intent2.putExtra("android.speech.extra.LANGUAGE", (String)resources);
    intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (componentName == null) {
      str1 = str2;
    } else {
      str1 = componentName.flattenToShortString();
    } 
    intent2.putExtra("calling_package", str1);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pendingIntent);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle2);
    return intent2;
  }
  
  private Intent F(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str;
    Intent intent = new Intent(paramIntent);
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    if (componentName == null) {
      componentName = null;
    } else {
      str = componentName.flattenToShortString();
    } 
    intent.putExtra("calling_package", str);
    return intent;
  }
  
  private void G() {
    this.r.dismissDropDown();
  }
  
  private void I(View paramView, Rect paramRect) {
    paramView.getLocationInWindow(this.D);
    getLocationInWindow(this.E);
    int[] arrayOfInt1 = this.D;
    int i = arrayOfInt1[1];
    int[] arrayOfInt2 = this.E;
    i -= arrayOfInt2[1];
    int j = arrayOfInt1[0] - arrayOfInt2[0];
    paramRect.set(j, i, paramView.getWidth() + j, paramView.getHeight() + i);
  }
  
  private CharSequence J(CharSequence paramCharSequence) {
    if (!this.R || this.G == null)
      return paramCharSequence; 
    double d = this.r.getTextSize();
    Double.isNaN(d);
    int i = (int)(d * 1.25D);
    this.G.setBounds(0, 0, i, i);
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
    spannableStringBuilder.setSpan(new ImageSpan(this.G), 1, 2, 33);
    spannableStringBuilder.append(paramCharSequence);
    return (CharSequence)spannableStringBuilder;
  }
  
  private boolean K() {
    SearchableInfo searchableInfo = this.h0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (searchableInfo != null) {
      bool2 = bool1;
      if (searchableInfo.getVoiceSearchEnabled()) {
        Intent intent;
        searchableInfo = null;
        if (this.h0.getVoiceSearchLaunchWebSearch()) {
          intent = this.J;
        } else if (this.h0.getVoiceSearchLaunchRecognizer()) {
          intent = this.K;
        } 
        bool2 = bool1;
        if (intent != null) {
          bool2 = bool1;
          if (getContext().getPackageManager().resolveActivity(intent, 65536) != null)
            bool2 = true; 
        } 
      } 
    } 
    return bool2;
  }
  
  static boolean M(Context paramContext) {
    boolean bool;
    if ((paramContext.getResources().getConfiguration()).orientation == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean N() {
    boolean bool;
    if ((this.U || this.c0) && !L()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void O(Intent paramIntent) {
    if (paramIntent == null)
      return; 
    try {
      getContext().startActivity(paramIntent);
    } catch (RuntimeException runtimeException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed launch activity: ");
      stringBuilder.append(paramIntent);
      Log.e("SearchView", stringBuilder.toString(), runtimeException);
    } 
  }
  
  private boolean Q(int paramInt1, int paramInt2, String paramString) {
    Cursor cursor = this.T.b();
    if (cursor != null && cursor.moveToPosition(paramInt1)) {
      O(D(cursor, paramInt2, paramString));
      return true;
    } 
    return false;
  }
  
  private void b0() {
    post(this.j0);
  }
  
  private void c0(int paramInt) {
    Editable editable = this.r.getText();
    Cursor cursor = this.T.b();
    if (cursor == null)
      return; 
    if (cursor.moveToPosition(paramInt)) {
      CharSequence charSequence = this.T.c(cursor);
      if (charSequence != null) {
        setQuery(charSequence);
      } else {
        setQuery((CharSequence)editable);
      } 
    } else {
      setQuery((CharSequence)editable);
    } 
  }
  
  private void d0() {
    boolean bool = TextUtils.isEmpty((CharSequence)this.r.getText());
    byte b1 = 1;
    int i = bool ^ true;
    byte b2 = 0;
    byte b3 = b1;
    if (i == 0)
      if (this.R && !this.f0) {
        b3 = b1;
      } else {
        b3 = 0;
      }  
    ImageView imageView = this.x;
    if (b3) {
      b3 = b2;
    } else {
      b3 = 8;
    } 
    imageView.setVisibility(b3);
    Drawable drawable = this.x.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (i != 0) {
        arrayOfInt = ViewGroup.ENABLED_STATE_SET;
      } else {
        arrayOfInt = ViewGroup.EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  private void f0() {
    CharSequence charSequence1 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.r;
    CharSequence charSequence2 = charSequence1;
    if (charSequence1 == null)
      charSequence2 = ""; 
    searchAutoComplete.setHint(J(charSequence2));
  }
  
  private void g0() {
    this.r.setThreshold(this.h0.getSuggestThreshold());
    this.r.setImeOptions(this.h0.getImeOptions());
    int i = this.h0.getInputType();
    boolean bool = true;
    int j = i;
    if ((i & 0xF) == 1) {
      i &= 0xFFFEFFFF;
      j = i;
      if (this.h0.getSuggestAuthority() != null)
        j = i | 0x10000 | 0x80000; 
    } 
    this.r.setInputType(j);
    b.i.a.a a1 = this.T;
    if (a1 != null)
      a1.a(null); 
    if (this.h0.getSuggestAuthority() != null) {
      y y = new y(getContext(), this, this.h0, this.l0);
      this.T = (b.i.a.a)y;
      this.r.setAdapter((ListAdapter)y);
      y = (y)this.T;
      j = bool;
      if (this.W)
        j = 2; 
      y.x(j);
    } 
  }
  
  private int getPreferredHeight() {
    return getContext().getResources().getDimensionPixelSize(b.a.d.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth() {
    return getContext().getResources().getDimensionPixelSize(b.a.d.abc_search_view_preferred_width);
  }
  
  private void h0() {
    byte b;
    if (N() && (this.w.getVisibility() == 0 || this.y.getVisibility() == 0)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.u.setVisibility(b);
  }
  
  private void i0(boolean paramBoolean) {
    byte b;
    if (this.U && N() && hasFocus() && (paramBoolean || !this.c0)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.w.setVisibility(b);
  }
  
  private void j0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield S : Z
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_1
    //   8: ifeq -> 16
    //   11: iconst_0
    //   12: istore_3
    //   13: goto -> 19
    //   16: bipush #8
    //   18: istore_3
    //   19: aload_0
    //   20: getfield r : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   23: invokevirtual getText : ()Landroid/text/Editable;
    //   26: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   29: iconst_1
    //   30: ixor
    //   31: istore #4
    //   33: aload_0
    //   34: getfield v : Landroid/widget/ImageView;
    //   37: iload_3
    //   38: invokevirtual setVisibility : (I)V
    //   41: aload_0
    //   42: iload #4
    //   44: invokespecial i0 : (Z)V
    //   47: aload_0
    //   48: getfield s : Landroid/view/View;
    //   51: astore #5
    //   53: iload_1
    //   54: ifeq -> 63
    //   57: bipush #8
    //   59: istore_3
    //   60: goto -> 65
    //   63: iconst_0
    //   64: istore_3
    //   65: aload #5
    //   67: iload_3
    //   68: invokevirtual setVisibility : (I)V
    //   71: aload_0
    //   72: getfield F : Landroid/widget/ImageView;
    //   75: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   78: ifnull -> 90
    //   81: iload_2
    //   82: istore_3
    //   83: aload_0
    //   84: getfield R : Z
    //   87: ifeq -> 93
    //   90: bipush #8
    //   92: istore_3
    //   93: aload_0
    //   94: getfield F : Landroid/widget/ImageView;
    //   97: iload_3
    //   98: invokevirtual setVisibility : (I)V
    //   101: aload_0
    //   102: invokespecial d0 : ()V
    //   105: aload_0
    //   106: iload #4
    //   108: iconst_1
    //   109: ixor
    //   110: invokespecial k0 : (Z)V
    //   113: aload_0
    //   114: invokespecial h0 : ()V
    //   117: return
  }
  
  private void k0(boolean paramBoolean) {
    boolean bool = this.c0;
    byte b1 = 8;
    byte b2 = b1;
    if (bool) {
      b2 = b1;
      if (!L()) {
        b2 = b1;
        if (paramBoolean) {
          this.w.setVisibility(8);
          b2 = 0;
        } 
      } 
    } 
    this.y.setVisibility(b2);
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i;
    this.r.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.r;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i);
  }
  
  void B() {
    if (this.z.getWidth() > 1) {
      byte b;
      Resources resources = getContext().getResources();
      int i = this.t.getPaddingLeft();
      Rect rect = new Rect();
      boolean bool = k0.b((View)this);
      if (this.R) {
        b = resources.getDimensionPixelSize(b.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(b.a.d.abc_dropdownitem_text_padding_left);
      } else {
        b = 0;
      } 
      this.r.getDropDownBackground().getPadding(rect);
      if (bool) {
        j = -rect.left;
      } else {
        j = i - rect.left + b;
      } 
      this.r.setDropDownHorizontalOffset(j);
      int i1 = this.z.getWidth();
      int i2 = rect.left;
      int j = rect.right;
      this.r.setDropDownWidth(i1 + i2 + j + b - i);
    } 
  }
  
  void H() {
    if (Build.VERSION.SDK_INT >= 29) {
      this.r.refreshAutoCompleteResults();
    } else {
      n n1 = q;
      n1.b(this.r);
      n1.a(this.r);
    } 
  }
  
  public boolean L() {
    return this.S;
  }
  
  void P(int paramInt, String paramString1, String paramString2) {
    Intent intent = C("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(intent);
  }
  
  void R() {
    if (TextUtils.isEmpty((CharSequence)this.r.getText())) {
      if (this.R) {
        k k1 = this.N;
        if (k1 == null || !k1.a()) {
          clearFocus();
          j0(true);
        } 
      } 
    } else {
      this.r.setText("");
      this.r.requestFocus();
      this.r.setImeVisibility(true);
    } 
  }
  
  boolean S(int paramInt1, int paramInt2, String paramString) {
    m m1 = this.P;
    if (m1 == null || !m1.b(paramInt1)) {
      Q(paramInt1, 0, null);
      this.r.setImeVisibility(false);
      G();
      return true;
    } 
    return false;
  }
  
  boolean T(int paramInt) {
    m m1 = this.P;
    if (m1 == null || !m1.a(paramInt)) {
      c0(paramInt);
      return true;
    } 
    return false;
  }
  
  void U(CharSequence paramCharSequence) {
    setQuery(paramCharSequence);
  }
  
  void V() {
    j0(false);
    this.r.requestFocus();
    this.r.setImeVisibility(true);
    View.OnClickListener onClickListener = this.Q;
    if (onClickListener != null)
      onClickListener.onClick((View)this); 
  }
  
  void W() {
    Editable editable = this.r.getText();
    if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
      l l1 = this.M;
      if (l1 == null || !l1.b(editable.toString())) {
        if (this.h0 != null)
          P(0, null, editable.toString()); 
        this.r.setImeVisibility(false);
        G();
      } 
    } 
  }
  
  boolean X(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (this.h0 == null)
      return false; 
    if (this.T == null)
      return false; 
    if (paramKeyEvent.getAction() == 0 && paramKeyEvent.hasNoModifiers()) {
      if (paramInt == 66 || paramInt == 84 || paramInt == 61)
        return S(this.r.getListSelection(), 0, null); 
      if (paramInt == 21 || paramInt == 22) {
        if (paramInt == 21) {
          paramInt = 0;
        } else {
          paramInt = this.r.length();
        } 
        this.r.setSelection(paramInt);
        this.r.setListSelection(0);
        this.r.clearListSelection();
        this.r.a();
        return true;
      } 
      if (paramInt == 19 && this.r.getListSelection() == 0)
        return false; 
    } 
    return false;
  }
  
  void Y(CharSequence paramCharSequence) {
    Editable editable = this.r.getText();
    this.e0 = (CharSequence)editable;
    int i = TextUtils.isEmpty((CharSequence)editable) ^ true;
    i0(i);
    k0(i ^ 0x1);
    d0();
    h0();
    if (this.M != null && !TextUtils.equals(paramCharSequence, this.d0))
      this.M.a(paramCharSequence.toString()); 
    this.d0 = paramCharSequence.toString();
  }
  
  void Z() {
    j0(L());
    b0();
    if (this.r.hasFocus())
      H(); 
  }
  
  void a0() {
    SearchableInfo searchableInfo = this.h0;
    if (searchableInfo == null)
      return; 
    try {
      Intent intent;
      if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
        intent = F(this.J, searchableInfo);
        getContext().startActivity(intent);
      } else if (intent.getVoiceSearchLaunchRecognizer()) {
        intent = E(this.K, (SearchableInfo)intent);
        getContext().startActivity(intent);
      } 
    } catch (ActivityNotFoundException activityNotFoundException) {
      Log.w("SearchView", "Could not find voice search activity");
    } 
  }
  
  public void c() {
    if (this.f0)
      return; 
    this.f0 = true;
    int i = this.r.getImeOptions();
    this.g0 = i;
    this.r.setImeOptions(i | 0x2000000);
    this.r.setText("");
    setIconified(false);
  }
  
  public void clearFocus() {
    this.a0 = true;
    super.clearFocus();
    this.r.clearFocus();
    this.r.setImeVisibility(false);
    this.a0 = false;
  }
  
  void e0() {
    int[] arrayOfInt;
    if (this.r.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    } 
    Drawable drawable = this.t.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    drawable = this.u.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    invalidate();
  }
  
  public void f() {
    setQuery("", false);
    clearFocus();
    j0(true);
    this.r.setImeOptions(this.g0);
    this.f0 = false;
  }
  
  public int getImeOptions() {
    return this.r.getImeOptions();
  }
  
  public int getInputType() {
    return this.r.getInputType();
  }
  
  public int getMaxWidth() {
    return this.b0;
  }
  
  public CharSequence getQuery() {
    return (CharSequence)this.r.getText();
  }
  
  public CharSequence getQueryHint() {
    CharSequence charSequence = this.V;
    if (charSequence == null) {
      SearchableInfo searchableInfo = this.h0;
      if (searchableInfo != null && searchableInfo.getHintId() != 0) {
        CharSequence charSequence1 = getContext().getText(this.h0.getHintId());
      } else {
        charSequence = this.L;
      } 
    } 
    return charSequence;
  }
  
  int getSuggestionCommitIconResId() {
    return this.I;
  }
  
  int getSuggestionRowLayout() {
    return this.H;
  }
  
  public b.i.a.a getSuggestionsAdapter() {
    return this.T;
  }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.j0);
    post(this.k0);
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      I((View)this.r, this.B);
      Rect rect1 = this.C;
      Rect rect2 = this.B;
      rect1.set(rect2.left, 0, rect2.right, paramInt4 - paramInt2);
      o o1 = this.A;
      if (o1 == null) {
        o1 = new o(this.C, this.B, (View)this.r);
        this.A = o1;
        setTouchDelegate(o1);
      } else {
        o1.a(this.C, this.B);
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (L()) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE) {
      if (i != 0) {
        if (i != 1073741824) {
          paramInt1 = j;
        } else {
          i = this.b0;
          paramInt1 = j;
          if (i > 0)
            paramInt1 = Math.min(i, j); 
        } 
      } else {
        paramInt1 = this.b0;
        if (paramInt1 <= 0)
          paramInt1 = getPreferredWidth(); 
      } 
    } else {
      paramInt1 = this.b0;
      if (paramInt1 > 0) {
        paramInt1 = Math.min(paramInt1, j);
      } else {
        paramInt1 = Math.min(getPreferredWidth(), j);
      } 
    } 
    j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (j != Integer.MIN_VALUE) {
      if (j == 0)
        paramInt2 = getPreferredHeight(); 
    } else {
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
    } 
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    j0(savedState.d);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.d = L();
    return (Parcelable)savedState;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    b0();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (this.a0)
      return false; 
    if (!isFocusable())
      return false; 
    if (!L()) {
      boolean bool = this.r.requestFocus(paramInt, paramRect);
      if (bool)
        j0(false); 
      return bool;
    } 
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle) {
    this.i0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      R();
    } else {
      V();
    } 
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.R == paramBoolean)
      return; 
    this.R = paramBoolean;
    j0(paramBoolean);
    f0();
  }
  
  public void setImeOptions(int paramInt) {
    this.r.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt) {
    this.r.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt) {
    this.b0 = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(k paramk) {
    this.N = paramk;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) {
    this.O = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(l paraml) {
    this.M = paraml;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) {
    this.Q = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(m paramm) {
    this.P = paramm;
  }
  
  public void setQuery(CharSequence paramCharSequence, boolean paramBoolean) {
    this.r.setText(paramCharSequence);
    if (paramCharSequence != null) {
      SearchAutoComplete searchAutoComplete = this.r;
      searchAutoComplete.setSelection(searchAutoComplete.length());
      this.e0 = paramCharSequence;
    } 
    if (paramBoolean && !TextUtils.isEmpty(paramCharSequence))
      W(); 
  }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.V = paramCharSequence;
    f0();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.W = paramBoolean;
    b.i.a.a a1 = this.T;
    if (a1 instanceof y) {
      boolean bool;
      y y = (y)a1;
      if (paramBoolean) {
        bool = true;
      } else {
        bool = true;
      } 
      y.x(bool);
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    this.h0 = paramSearchableInfo;
    if (paramSearchableInfo != null) {
      g0();
      f0();
    } 
    boolean bool = K();
    this.c0 = bool;
    if (bool)
      this.r.setPrivateImeOptions("nm"); 
    j0(L());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.U = paramBoolean;
    j0(L());
  }
  
  public void setSuggestionsAdapter(b.i.a.a parama) {
    this.T = parama;
    this.r.setAdapter((ListAdapter)parama);
  }
  
  static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    boolean d;
    
    public SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.d = ((Boolean)param1Parcel.readValue(null)).booleanValue();
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SearchView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" isIconified=");
      stringBuilder.append(this.d);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeValue(Boolean.valueOf(this.d));
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public SearchView.SavedState a(Parcel param2Parcel) {
        return new SearchView.SavedState(param2Parcel, null);
      }
      
      public SearchView.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new SearchView.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public SearchView.SavedState[] c(int param2Int) {
        return new SearchView.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public SearchView.SavedState a(Parcel param1Parcel) {
      return new SearchView.SavedState(param1Parcel, null);
    }
    
    public SearchView.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new SearchView.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public SearchView.SavedState[] c(int param1Int) {
      return new SearchView.SavedState[param1Int];
    }
  }
  
  public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
    private int e = getThreshold();
    
    private SearchView f;
    
    private boolean g;
    
    final Runnable h = new a(this);
    
    public SearchAutoComplete(Context param1Context) {
      this(param1Context, null);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) {
      this(param1Context, param1AttributeSet, b.a.a.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
    }
    
    private int getSearchViewTextMinWidthDp() {
      Configuration configuration = getResources().getConfiguration();
      int i = configuration.screenWidthDp;
      int j = configuration.screenHeightDp;
      return (i >= 960 && j >= 720 && configuration.orientation == 2) ? 256 : ((i >= 600 || (i >= 640 && j >= 480)) ? 192 : 160);
    }
    
    void a() {
      if (Build.VERSION.SDK_INT >= 29) {
        setInputMethodMode(1);
        if (enoughToFilter())
          showDropDown(); 
      } else {
        SearchView.q.c(this);
      } 
    }
    
    boolean b() {
      boolean bool;
      if (TextUtils.getTrimmedLength((CharSequence)getText()) == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    void c() {
      if (this.g) {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
        this.g = false;
      } 
    }
    
    public boolean enoughToFilter() {
      return (this.e <= 0 || super.enoughToFilter());
    }
    
    public InputConnection onCreateInputConnection(EditorInfo param1EditorInfo) {
      InputConnection inputConnection = super.onCreateInputConnection(param1EditorInfo);
      if (this.g) {
        removeCallbacks(this.h);
        post(this.h);
      } 
      return inputConnection;
    }
    
    protected void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displayMetrics));
    }
    
    protected void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      this.f.Z();
    }
    
    public boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.f.clearFocus();
            setImeVisibility(false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.f.hasFocus() && getVisibility() == 0) {
        this.g = true;
        if (SearchView.M(getContext()))
          a(); 
      } 
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence param1CharSequence) {}
    
    void setImeVisibility(boolean param1Boolean) {
      InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!param1Boolean) {
        this.g = false;
        removeCallbacks(this.h);
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      } 
      if (inputMethodManager.isActive((View)this)) {
        this.g = false;
        removeCallbacks(this.h);
        inputMethodManager.showSoftInput((View)this, 0);
        return;
      } 
      this.g = true;
    }
    
    void setSearchView(SearchView param1SearchView) {
      this.f = param1SearchView;
    }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.e = param1Int;
    }
    
    class a implements Runnable {
      a(SearchView.SearchAutoComplete this$0) {}
      
      public void run() {
        this.b.c();
      }
    }
  }
  
  class a implements Runnable {
    a(SearchView this$0) {}
    
    public void run() {
      this.b.c();
    }
  }
  
  class a implements TextWatcher {
    a(SearchView this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      this.b.Y(param1CharSequence);
    }
  }
  
  class b implements Runnable {
    b(SearchView this$0) {}
    
    public void run() {
      this.b.e0();
    }
  }
  
  class c implements Runnable {
    c(SearchView this$0) {}
    
    public void run() {
      b.i.a.a a = this.b.T;
      if (a instanceof y)
        a.a(null); 
    }
  }
  
  class d implements View.OnFocusChangeListener {
    d(SearchView this$0) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      SearchView searchView = this.b;
      View.OnFocusChangeListener onFocusChangeListener = searchView.O;
      if (onFocusChangeListener != null)
        onFocusChangeListener.onFocusChange((View)searchView, param1Boolean); 
    }
  }
  
  class e implements View.OnLayoutChangeListener {
    e(SearchView this$0) {}
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      this.b.B();
    }
  }
  
  class f implements View.OnClickListener {
    f(SearchView this$0) {}
    
    public void onClick(View param1View) {
      SearchView searchView = this.b;
      if (param1View == searchView.v) {
        searchView.V();
      } else if (param1View == searchView.x) {
        searchView.R();
      } else if (param1View == searchView.w) {
        searchView.W();
      } else if (param1View == searchView.y) {
        searchView.a0();
      } else if (param1View == searchView.r) {
        searchView.H();
      } 
    }
  }
  
  class g implements View.OnKeyListener {
    g(SearchView this$0) {}
    
    public boolean onKey(View param1View, int param1Int, KeyEvent param1KeyEvent) {
      SearchView searchView = this.b;
      if (searchView.h0 == null)
        return false; 
      if (searchView.r.isPopupShowing() && this.b.r.getListSelection() != -1)
        return this.b.X(param1View, param1Int, param1KeyEvent); 
      if (!this.b.r.b() && param1KeyEvent.hasNoModifiers() && param1KeyEvent.getAction() == 1 && param1Int == 66) {
        param1View.cancelLongPress();
        SearchView searchView1 = this.b;
        searchView1.P(0, null, searchView1.r.getText().toString());
        return true;
      } 
      return false;
    }
  }
  
  class h implements TextView.OnEditorActionListener {
    h(SearchView this$0) {}
    
    public boolean onEditorAction(TextView param1TextView, int param1Int, KeyEvent param1KeyEvent) {
      this.a.W();
      return true;
    }
  }
  
  class i implements AdapterView.OnItemClickListener {
    i(SearchView this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.S(param1Int, 0, null);
    }
  }
  
  class j implements AdapterView.OnItemSelectedListener {
    j(SearchView this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.T(param1Int);
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  public static interface k {
    boolean a();
  }
  
  public static interface l {
    boolean a(String param1String);
    
    boolean b(String param1String);
  }
  
  public static interface m {
    boolean a(int param1Int);
    
    boolean b(int param1Int);
  }
  
  private static class n {
    private Method a = null;
    
    private Method b = null;
    
    private Method c = null;
    
    @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
    n() {
      d();
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
        this.c = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
    }
    
    private static void d() {
      if (Build.VERSION.SDK_INT < 29)
        return; 
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView) {
      d();
      Method method = this.b;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[0]);
        } catch (Exception exception) {} 
    }
    
    void b(AutoCompleteTextView param1AutoCompleteTextView) {
      d();
      Method method = this.a;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[0]);
        } catch (Exception exception) {} 
    }
    
    void c(AutoCompleteTextView param1AutoCompleteTextView) {
      d();
      Method method = this.c;
      if (method != null)
        try {
          method.invoke(param1AutoCompleteTextView, new Object[] { Boolean.TRUE });
        } catch (Exception exception) {} 
    }
  }
  
  private static class o extends TouchDelegate {
    private final View a;
    
    private final Rect b;
    
    private final Rect c;
    
    private final Rect d;
    
    private final int e;
    
    private boolean f;
    
    public o(Rect param1Rect1, Rect param1Rect2, View param1View) {
      super(param1Rect1, param1View);
      this.e = ViewConfiguration.get(param1View.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      a(param1Rect1, param1Rect2);
      this.a = param1View;
    }
    
    public void a(Rect param1Rect1, Rect param1Rect2) {
      this.b.set(param1Rect1);
      this.d.set(param1Rect1);
      param1Rect1 = this.d;
      int i = this.e;
      param1Rect1.inset(-i, -i);
      this.c.set(param1Rect2);
    }
    
    public boolean onTouchEvent(MotionEvent param1MotionEvent) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual getX : ()F
      //   4: f2i
      //   5: istore_2
      //   6: aload_1
      //   7: invokevirtual getY : ()F
      //   10: f2i
      //   11: istore_3
      //   12: aload_1
      //   13: invokevirtual getAction : ()I
      //   16: istore #4
      //   18: iconst_1
      //   19: istore #5
      //   21: iconst_0
      //   22: istore #6
      //   24: iload #4
      //   26: ifeq -> 111
      //   29: iload #4
      //   31: iconst_1
      //   32: if_icmpeq -> 64
      //   35: iload #4
      //   37: iconst_2
      //   38: if_icmpeq -> 64
      //   41: iload #4
      //   43: iconst_3
      //   44: if_icmpeq -> 50
      //   47: goto -> 131
      //   50: aload_0
      //   51: getfield f : Z
      //   54: istore #5
      //   56: aload_0
      //   57: iconst_0
      //   58: putfield f : Z
      //   61: goto -> 105
      //   64: aload_0
      //   65: getfield f : Z
      //   68: istore #7
      //   70: iload #7
      //   72: istore #5
      //   74: iload #7
      //   76: ifeq -> 105
      //   79: iload #7
      //   81: istore #5
      //   83: aload_0
      //   84: getfield d : Landroid/graphics/Rect;
      //   87: iload_2
      //   88: iload_3
      //   89: invokevirtual contains : (II)Z
      //   92: ifne -> 105
      //   95: iload #7
      //   97: istore #5
      //   99: iconst_0
      //   100: istore #4
      //   102: goto -> 137
      //   105: iconst_1
      //   106: istore #4
      //   108: goto -> 137
      //   111: aload_0
      //   112: getfield b : Landroid/graphics/Rect;
      //   115: iload_2
      //   116: iload_3
      //   117: invokevirtual contains : (II)Z
      //   120: ifeq -> 131
      //   123: aload_0
      //   124: iconst_1
      //   125: putfield f : Z
      //   128: goto -> 105
      //   131: iconst_1
      //   132: istore #4
      //   134: iconst_0
      //   135: istore #5
      //   137: iload #6
      //   139: istore #7
      //   141: iload #5
      //   143: ifeq -> 226
      //   146: iload #4
      //   148: ifeq -> 190
      //   151: aload_0
      //   152: getfield c : Landroid/graphics/Rect;
      //   155: iload_2
      //   156: iload_3
      //   157: invokevirtual contains : (II)Z
      //   160: ifne -> 190
      //   163: aload_1
      //   164: aload_0
      //   165: getfield a : Landroid/view/View;
      //   168: invokevirtual getWidth : ()I
      //   171: iconst_2
      //   172: idiv
      //   173: i2f
      //   174: aload_0
      //   175: getfield a : Landroid/view/View;
      //   178: invokevirtual getHeight : ()I
      //   181: iconst_2
      //   182: idiv
      //   183: i2f
      //   184: invokevirtual setLocation : (FF)V
      //   187: goto -> 216
      //   190: aload_0
      //   191: getfield c : Landroid/graphics/Rect;
      //   194: astore #8
      //   196: aload_1
      //   197: iload_2
      //   198: aload #8
      //   200: getfield left : I
      //   203: isub
      //   204: i2f
      //   205: iload_3
      //   206: aload #8
      //   208: getfield top : I
      //   211: isub
      //   212: i2f
      //   213: invokevirtual setLocation : (FF)V
      //   216: aload_0
      //   217: getfield a : Landroid/view/View;
      //   220: aload_1
      //   221: invokevirtual dispatchTouchEvent : (Landroid/view/MotionEvent;)Z
      //   224: istore #7
      //   226: iload #7
      //   228: ireturn
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */