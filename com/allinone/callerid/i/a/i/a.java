package com.allinone.callerid.i.a.i;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.bean.CommentContent;
import com.allinone.callerid.f.d;
import com.allinone.callerid.f.e;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import java.util.List;

public class a {
  public static void a(String paramString, b paramb) {
    try {
      a a1 = new a();
      this(paramString, paramb);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(CommentContent paramCommentContent, c paramc) {
    try {
      b b = new b();
      this(paramCommentContent, paramc);
      b.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, List<CommentContent>> {
    private b a;
    
    private String b;
    
    a(String param1String, b param1b) {
      this.a = param1b;
      this.b = param1String;
    }
    
    protected List<CommentContent> a(String... param1VarArgs) {
      List<CommentContent> list = d.a().b(this.b);
      if (list != null && list.size() > 0)
        for (byte b1 = 0; b1 < list.size(); b1++) {
          CommentContent commentContent = list.get(b1);
          commentContent.setType_label(i1.D((Context)EZCallApplication.c(), commentContent.getType_label()));
          commentContent.setAuthor(EZCallApplication.c().getResources().getString(2131755871));
        }  
      return list;
    }
    
    protected void b(List<CommentContent> param1List) {
      super.onPostExecute(param1List);
      this.a.a(param1List);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private c a;
    
    private CommentContent b;
    
    b(CommentContent param1CommentContent, c param1c) {
      this.a = param1c;
      this.b = param1CommentContent;
    }
    
    protected String a(String... param1VarArgs) {
      CommentContent commentContent = this.b;
      if (commentContent != null)
        if (commentContent.getType_label() != null && !"".equals(this.b.getType_label())) {
          d.a().c(this.b);
        } else if (this.b.getContent() != null && !"".equals(this.b.getContent())) {
          d.a().c(this.b);
        }  
      e.d().k(this.b.getTel_number());
      return "ok";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */