package b.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {
  protected boolean b;
  
  protected boolean c;
  
  protected Cursor d;
  
  protected Context e;
  
  protected int f;
  
  protected a g;
  
  protected DataSetObserver h;
  
  protected b i;
  
  public a(Context paramContext, Cursor paramCursor, boolean paramBoolean) {
    byte b1;
    if (paramBoolean) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    f(paramContext, paramCursor, b1);
  }
  
  public void a(Cursor paramCursor) {
    paramCursor = j(paramCursor);
    if (paramCursor != null)
      paramCursor.close(); 
  }
  
  public Cursor b() {
    return this.d;
  }
  
  public abstract CharSequence c(Cursor paramCursor);
  
  public abstract void e(View paramView, Context paramContext, Cursor paramCursor);
  
  void f(Context paramContext, Cursor paramCursor, int paramInt) {
    byte b1;
    boolean bool = false;
    if ((paramInt & 0x1) == 1) {
      paramInt |= 0x2;
      this.c = true;
    } else {
      this.c = false;
    } 
    if (paramCursor != null)
      bool = true; 
    this.d = paramCursor;
    this.b = bool;
    this.e = paramContext;
    if (bool) {
      b1 = paramCursor.getColumnIndexOrThrow("_id");
    } else {
      b1 = -1;
    } 
    this.f = b1;
    if ((paramInt & 0x2) == 2) {
      this.g = new a(this);
      this.h = new b(this);
    } else {
      this.g = null;
      this.h = null;
    } 
    if (bool) {
      a a1 = this.g;
      if (a1 != null)
        paramCursor.registerContentObserver(a1); 
      DataSetObserver dataSetObserver = this.h;
      if (dataSetObserver != null)
        paramCursor.registerDataSetObserver(dataSetObserver); 
    } 
  }
  
  public abstract View g(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public int getCount() {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null)
        return cursor.getCount(); 
    } 
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      this.d.moveToPosition(paramInt);
      View view = paramView;
      if (paramView == null)
        view = g(this.e, this.d, paramViewGroup); 
      e(view, this.e, this.d);
      return view;
    } 
    return null;
  }
  
  public Filter getFilter() {
    if (this.i == null)
      this.i = new b(this); 
    return this.i;
  }
  
  public Object getItem(int paramInt) {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null) {
        cursor.moveToPosition(paramInt);
        return this.d;
      } 
    } 
    return null;
  }
  
  public long getItemId(int paramInt) {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null && cursor.moveToPosition(paramInt))
        return this.d.getLong(this.f); 
    } 
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      if (this.d.moveToPosition(paramInt)) {
        View view = paramView;
        if (paramView == null)
          view = h(this.e, this.d, paramViewGroup); 
        e(view, this.e, this.d);
        return view;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("couldn't move cursor to position ");
      stringBuilder.append(paramInt);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    throw new IllegalStateException("this should only be called when the cursor is valid");
  }
  
  public abstract View h(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  protected void i() {
    if (this.c) {
      Cursor cursor = this.d;
      if (cursor != null && !cursor.isClosed())
        this.b = this.d.requery(); 
    } 
  }
  
  public Cursor j(Cursor paramCursor) {
    Cursor cursor = this.d;
    if (paramCursor == cursor)
      return null; 
    if (cursor != null) {
      a a1 = this.g;
      if (a1 != null)
        cursor.unregisterContentObserver(a1); 
      DataSetObserver dataSetObserver = this.h;
      if (dataSetObserver != null)
        cursor.unregisterDataSetObserver(dataSetObserver); 
    } 
    this.d = paramCursor;
    if (paramCursor != null) {
      a a1 = this.g;
      if (a1 != null)
        paramCursor.registerContentObserver(a1); 
      DataSetObserver dataSetObserver = this.h;
      if (dataSetObserver != null)
        paramCursor.registerDataSetObserver(dataSetObserver); 
      this.f = paramCursor.getColumnIndexOrThrow("_id");
      this.b = true;
      notifyDataSetChanged();
    } else {
      this.f = -1;
      this.b = false;
      notifyDataSetInvalidated();
    } 
    return cursor;
  }
  
  private class a extends ContentObserver {
    a(a this$0) {
      super(new Handler());
    }
    
    public boolean deliverSelfNotifications() {
      return true;
    }
    
    public void onChange(boolean param1Boolean) {
      this.a.i();
    }
  }
  
  private class b extends DataSetObserver {
    b(a this$0) {}
    
    public void onChanged() {
      a a1 = this.a;
      a1.b = true;
      a1.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
      a a1 = this.a;
      a1.b = false;
      a1.notifyDataSetInvalidated();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/i/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */