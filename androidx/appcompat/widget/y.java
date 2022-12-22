package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.f;
import b.i.a.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class y extends c implements View.OnClickListener {
  private final SearchView m;
  
  private final SearchableInfo n;
  
  private final Context o;
  
  private final WeakHashMap<String, Drawable.ConstantState> p;
  
  private final int q;
  
  private boolean r = false;
  
  private int s = 1;
  
  private ColorStateList t;
  
  private int u = -1;
  
  private int v = -1;
  
  private int w = -1;
  
  private int x = -1;
  
  private int y = -1;
  
  private int z = -1;
  
  public y(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap) {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    this.m = paramSearchView;
    this.n = paramSearchableInfo;
    this.q = paramSearchView.getSuggestionCommitIconResId();
    this.o = paramContext;
    this.p = paramWeakHashMap;
  }
  
  private void A(String paramString, Drawable paramDrawable) {
    if (paramDrawable != null)
      this.p.put(paramString, paramDrawable.getConstantState()); 
  }
  
  private void B(Cursor paramCursor) {
    if (paramCursor != null) {
      Bundle bundle = paramCursor.getExtras();
    } else {
      paramCursor = null;
    } 
    if (paramCursor == null || paramCursor.getBoolean("in_progress"));
  }
  
  private Drawable k(String paramString) {
    Drawable.ConstantState constantState = this.p.get(paramString);
    return (constantState == null) ? null : constantState.newDrawable();
  }
  
  private CharSequence l(CharSequence paramCharSequence) {
    if (this.t == null) {
      TypedValue typedValue = new TypedValue();
      this.o.getTheme().resolveAttribute(b.a.a.textColorSearchUrl, typedValue, true);
      this.t = this.o.getResources().getColorStateList(typedValue.resourceId);
    } 
    SpannableString spannableString = new SpannableString(paramCharSequence);
    spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.t, null), 0, paramCharSequence.length(), 33);
    return (CharSequence)spannableString;
  }
  
  private Drawable m(ComponentName paramComponentName) {
    PackageManager packageManager = this.o.getPackageManager();
    try {
      StringBuilder stringBuilder;
      ActivityInfo activityInfo = packageManager.getActivityInfo(paramComponentName, 128);
      int i = activityInfo.getIconResource();
      if (i == 0)
        return null; 
      Drawable drawable = packageManager.getDrawable(paramComponentName.getPackageName(), i, activityInfo.applicationInfo);
      if (drawable == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid icon resource ");
        stringBuilder.append(i);
        stringBuilder.append(" for ");
        stringBuilder.append(paramComponentName.flattenToShortString());
        Log.w("SuggestionsAdapter", stringBuilder.toString());
        return null;
      } 
      return (Drawable)stringBuilder;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      Log.w("SuggestionsAdapter", nameNotFoundException.toString());
      return null;
    } 
  }
  
  private Drawable n(ComponentName paramComponentName) {
    Drawable drawable1;
    Drawable.ConstantState constantState1;
    String str = paramComponentName.flattenToShortString();
    boolean bool = this.p.containsKey(str);
    Drawable drawable2 = null;
    Drawable.ConstantState constantState2 = null;
    if (bool) {
      constantState1 = this.p.get(str);
      if (constantState1 == null) {
        constantState1 = constantState2;
      } else {
        drawable1 = constantState1.newDrawable(this.o.getResources());
      } 
      return drawable1;
    } 
    Drawable drawable3 = m((ComponentName)drawable1);
    if (drawable3 == null) {
      drawable1 = drawable2;
    } else {
      constantState1 = drawable3.getConstantState();
    } 
    this.p.put(str, constantState1);
    return drawable3;
  }
  
  public static String o(Cursor paramCursor, String paramString) {
    return w(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  private Drawable p() {
    Drawable drawable = n(this.n.getSearchActivity());
    return (drawable != null) ? drawable : this.o.getPackageManager().getDefaultActivityIcon();
  }
  
  private Drawable q(Uri paramUri) {
    try {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try {
          return r(paramUri);
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          FileNotFoundException fileNotFoundException1 = new FileNotFoundException();
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Resource does not exist: ");
          stringBuilder1.append(paramUri);
          this(stringBuilder1.toString());
          throw fileNotFoundException1;
        }  
      InputStream inputStream = this.o.getContentResolver().openInputStream(paramUri);
      if (inputStream != null)
        try {
          return Drawable.createFromStream(inputStream, null);
        } finally {
          try {
            iOException.close();
          } catch (IOException iOException1) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Error closing icon stream for ");
            stringBuilder1.append(paramUri);
            Log.e("SuggestionsAdapter", stringBuilder1.toString(), iOException1);
          } 
        }  
      FileNotFoundException fileNotFoundException = new FileNotFoundException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Failed to open ");
      stringBuilder.append(paramUri);
      this(stringBuilder.toString());
      throw fileNotFoundException;
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Icon not found: ");
      stringBuilder.append(paramUri);
      stringBuilder.append(", ");
      stringBuilder.append(fileNotFoundException.getMessage());
      Log.w("SuggestionsAdapter", stringBuilder.toString());
      return null;
    } 
  }
  
  private Drawable s(String paramString) {
    StringBuilder stringBuilder1 = null;
    StringBuilder stringBuilder2 = stringBuilder1;
    if (paramString != null) {
      stringBuilder2 = stringBuilder1;
      if (!paramString.isEmpty())
        if ("0".equals(paramString)) {
          stringBuilder2 = stringBuilder1;
        } else {
          try {
            int i = Integer.parseInt(paramString);
            stringBuilder2 = new StringBuilder();
            this();
            stringBuilder2.append("android.resource://");
            stringBuilder2.append(this.o.getPackageName());
            stringBuilder2.append("/");
            stringBuilder2.append(i);
            String str = stringBuilder2.toString();
            Drawable drawable = k(str);
            if (drawable != null)
              return drawable; 
            drawable = androidx.core.content.a.f(this.o, i);
            A(str, drawable);
            return drawable;
          } catch (NumberFormatException numberFormatException) {
            Drawable drawable = k(paramString);
            if (drawable != null)
              return drawable; 
            drawable = q(Uri.parse(paramString));
            A(paramString, drawable);
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Icon resource not found: ");
            stringBuilder2.append(paramString);
            Log.w("SuggestionsAdapter", stringBuilder2.toString());
            return null;
          } 
        }  
    } 
    return (Drawable)stringBuilder2;
  }
  
  private Drawable t(Cursor paramCursor) {
    int i = this.x;
    if (i == -1)
      return null; 
    Drawable drawable = s(paramCursor.getString(i));
    return (drawable != null) ? drawable : p();
  }
  
  private Drawable u(Cursor paramCursor) {
    int i = this.y;
    return (i == -1) ? null : s(paramCursor.getString(i));
  }
  
  private static String w(Cursor paramCursor, int paramInt) {
    if (paramInt == -1)
      return null; 
    try {
      return paramCursor.getString(paramInt);
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
      return null;
    } 
  }
  
  private void y(ImageView paramImageView, Drawable paramDrawable, int paramInt) {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
    } else {
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      paramDrawable.setVisible(true, false);
    } 
  }
  
  private void z(TextView paramTextView, CharSequence paramCharSequence) {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      paramTextView.setVisibility(8);
    } else {
      paramTextView.setVisibility(0);
    } 
  }
  
  public void a(Cursor paramCursor) {
    if (this.r) {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close(); 
      return;
    } 
    try {
      super.a(paramCursor);
      if (paramCursor != null) {
        this.u = paramCursor.getColumnIndex("suggest_text_1");
        this.v = paramCursor.getColumnIndex("suggest_text_2");
        this.w = paramCursor.getColumnIndex("suggest_text_2_url");
        this.x = paramCursor.getColumnIndex("suggest_icon_1");
        this.y = paramCursor.getColumnIndex("suggest_icon_2");
        this.z = paramCursor.getColumnIndex("suggest_flags");
      } 
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception);
    } 
  }
  
  public CharSequence c(Cursor paramCursor) {
    if (paramCursor == null)
      return null; 
    String str = o(paramCursor, "suggest_intent_query");
    if (str != null)
      return str; 
    if (this.n.shouldRewriteQueryFromData()) {
      str = o(paramCursor, "suggest_intent_data");
      if (str != null)
        return str; 
    } 
    if (this.n.shouldRewriteQueryFromText()) {
      String str1 = o(paramCursor, "suggest_text_1");
      if (str1 != null)
        return str1; 
    } 
    return null;
  }
  
  public Cursor d(CharSequence paramCharSequence) {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    } 
    if (this.m.getVisibility() == 0 && this.m.getWindowVisibility() == 0)
      try {
        Cursor cursor = v(this.n, (String)paramCharSequence, 50);
        if (cursor != null) {
          cursor.getCount();
          return cursor;
        } 
      } catch (RuntimeException runtimeException) {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeException);
      }  
    return null;
  }
  
  public void e(View paramView, Context paramContext, Cursor paramCursor) {
    a a = (a)paramView.getTag();
    int i = this.z;
    if (i != -1) {
      i = paramCursor.getInt(i);
    } else {
      i = 0;
    } 
    if (a.a != null) {
      String str = w(paramCursor, this.u);
      z(a.a, str);
    } 
    if (a.b != null) {
      String str = w(paramCursor, this.w);
      if (str != null) {
        CharSequence charSequence = l(str);
      } else {
        str = w(paramCursor, this.v);
      } 
      if (TextUtils.isEmpty(str)) {
        TextView textView = a.a;
        if (textView != null) {
          textView.setSingleLine(false);
          a.a.setMaxLines(2);
        } 
      } else {
        TextView textView = a.a;
        if (textView != null) {
          textView.setSingleLine(true);
          a.a.setMaxLines(1);
        } 
      } 
      z(a.b, str);
    } 
    ImageView imageView = a.c;
    if (imageView != null)
      y(imageView, t(paramCursor), 4); 
    imageView = a.d;
    if (imageView != null)
      y(imageView, u(paramCursor), 8); 
    int j = this.s;
    if (j == 2 || (j == 1 && (i & 0x1) != 0)) {
      a.e.setVisibility(0);
      a.e.setTag(a.a.getText());
      a.e.setOnClickListener(this);
      return;
    } 
    a.e.setVisibility(8);
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getDropDownView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = g(this.o, b(), paramViewGroup);
      if (view != null)
        ((a)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = h(this.o, b(), paramViewGroup);
      if (view != null)
        ((a)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public View h(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    View view = super.h(paramContext, paramCursor, paramViewGroup);
    view.setTag(new a(view));
    ((ImageView)view.findViewById(f.edit_query)).setImageResource(this.q);
    return view;
  }
  
  public boolean hasStableIds() {
    return false;
  }
  
  public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    B(b());
  }
  
  public void notifyDataSetInvalidated() {
    super.notifyDataSetInvalidated();
    B(b());
  }
  
  public void onClick(View paramView) {
    Object object = paramView.getTag();
    if (object instanceof CharSequence)
      this.m.U((CharSequence)object); 
  }
  
  Drawable r(Uri paramUri) {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str))
      try {
        Resources resources = this.o.getPackageManager().getResourcesForApplication(str);
        List<String> list = paramUri.getPathSegments();
        if (list != null) {
          int i = list.size();
          if (i == 1) {
            try {
              i = Integer.parseInt(list.get(0));
            } catch (NumberFormatException numberFormatException) {
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Single path segment is not a resource ID: ");
              stringBuilder2.append(paramUri);
              throw new FileNotFoundException(stringBuilder2.toString());
            } 
          } else if (i == 2) {
            i = resources.getIdentifier(list.get(1), list.get(0), (String)stringBuilder2);
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("More than two path segments: ");
            stringBuilder2.append(paramUri);
            throw new FileNotFoundException(stringBuilder2.toString());
          } 
          if (i != 0)
            return resources.getDrawable(i); 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("No resource found for: ");
          stringBuilder2.append(paramUri);
          throw new FileNotFoundException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No path: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No package found for authority: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No authority: ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
  
  Cursor v(SearchableInfo paramSearchableInfo, String paramString, int paramInt) {
    SearchableInfo searchableInfo = null;
    if (paramSearchableInfo == null)
      return null; 
    String str1 = paramSearchableInfo.getSuggestAuthority();
    if (str1 == null)
      return null; 
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority(str1).query("").fragment("");
    String str2 = paramSearchableInfo.getSuggestPath();
    if (str2 != null)
      builder.appendEncodedPath(str2); 
    builder.appendPath("search_suggest_query");
    str2 = paramSearchableInfo.getSuggestSelection();
    if (str2 != null) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramString;
    } else {
      builder.appendPath(paramString);
      paramSearchableInfo = searchableInfo;
    } 
    if (paramInt > 0)
      builder.appendQueryParameter("limit", String.valueOf(paramInt)); 
    Uri uri = builder.build();
    return this.o.getContentResolver().query(uri, null, str2, (String[])paramSearchableInfo, null);
  }
  
  public void x(int paramInt) {
    this.s = paramInt;
  }
  
  private static final class a {
    public final TextView a;
    
    public final TextView b;
    
    public final ImageView c;
    
    public final ImageView d;
    
    public final ImageView e;
    
    public a(View param1View) {
      this.a = (TextView)param1View.findViewById(16908308);
      this.b = (TextView)param1View.findViewById(16908309);
      this.c = (ImageView)param1View.findViewById(16908295);
      this.d = (ImageView)param1View.findViewById(16908296);
      this.e = (ImageView)param1View.findViewById(f.edit_query);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */