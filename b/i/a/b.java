package b.i.a;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {
  a a;
  
  b(a parama) {
    this.a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject) {
    return this.a.c((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence) {
    Cursor cursor = this.a.d(paramCharSequence);
    Filter.FilterResults filterResults = new Filter.FilterResults();
    if (cursor != null) {
      filterResults.count = cursor.getCount();
      filterResults.values = cursor;
    } else {
      filterResults.count = 0;
      filterResults.values = null;
    } 
    return filterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults) {
    Cursor cursor = this.a.b();
    Object object = paramFilterResults.values;
    if (object != null && object != cursor)
      this.a.a((Cursor)object); 
  }
  
  static interface a {
    void a(Cursor param1Cursor);
    
    Cursor b();
    
    CharSequence c(Cursor param1Cursor);
    
    Cursor d(CharSequence param1CharSequence);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/i/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */