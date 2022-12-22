package com.allinone.callerid.i.a.a0;

import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.i.a.z.c;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;

public class b {
  public static void a(String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramString, parama);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, c paramc) {
    try {
      b b1 = new b();
      this(paramString1, paramString2, paramString3, paramc);
      b1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, EZSearchContacts> {
    private a a;
    
    private EZSearchContacts b;
    
    private String c;
    
    a(String param1String, a param1a) {
      this.a = param1a;
      this.c = param1String;
    }
    
    protected EZSearchContacts a(String... param1VarArgs) {
      try {
        EZSearchContacts eZSearchContacts = f.b().d(this.c);
        this.b = eZSearchContacts;
        if (eZSearchContacts != null && d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("contacts:");
          stringBuilder.append(this.b.toString());
          d0.a("searchNumber", stringBuilder.toString());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.b;
    }
    
    protected void b(EZSearchContacts param1EZSearchContacts) {
      super.onPostExecute(param1EZSearchContacts);
      this.a.a(param1EZSearchContacts);
    }
  }
  
  private static class b extends AsyncTask<String, Void, Void> {
    private EZSearchContacts a;
    
    private c b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    b(String param1String1, String param1String2, String param1String3, c param1c) {
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.b = param1c;
    }
    
    protected Void a(String... param1VarArgs) {
      // Byte code:
      //   0: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   3: aload_0
      //   4: getfield c : Ljava/lang/String;
      //   7: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   10: astore_1
      //   11: aload_0
      //   12: aload_1
      //   13: putfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   16: aload_1
      //   17: ifnull -> 249
      //   20: getstatic com/allinone/callerid/util/d0.a : Z
      //   23: ifeq -> 62
      //   26: new java/lang/StringBuilder
      //   29: astore_1
      //   30: aload_1
      //   31: invokespecial <init> : ()V
      //   34: aload_1
      //   35: ldc 'contacts:'
      //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   40: pop
      //   41: aload_1
      //   42: aload_0
      //   43: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   46: invokevirtual toString : ()Ljava/lang/String;
      //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   52: pop
      //   53: ldc 'comment'
      //   55: aload_1
      //   56: invokevirtual toString : ()Ljava/lang/String;
      //   59: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   62: aload_0
      //   63: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   66: aload_0
      //   67: getfield e : Ljava/lang/String;
      //   70: invokevirtual setType_label : (Ljava/lang/String;)V
      //   73: aload_0
      //   74: getfield e : Ljava/lang/String;
      //   77: astore_1
      //   78: aload_1
      //   79: ifnull -> 91
      //   82: ldc ''
      //   84: aload_1
      //   85: invokevirtual equals : (Ljava/lang/Object;)Z
      //   88: ifeq -> 109
      //   91: aload_0
      //   92: getfield d : Ljava/lang/String;
      //   95: astore_1
      //   96: aload_1
      //   97: ifnull -> 217
      //   100: ldc ''
      //   102: aload_1
      //   103: invokevirtual equals : (Ljava/lang/Object;)Z
      //   106: ifne -> 217
      //   109: aload_0
      //   110: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   113: invokevirtual getComment_count : ()Ljava/lang/String;
      //   116: astore_1
      //   117: aload_1
      //   118: ifnull -> 154
      //   121: ldc ''
      //   123: aload_1
      //   124: invokevirtual equals : (Ljava/lang/Object;)Z
      //   127: ifne -> 154
      //   130: aload_1
      //   131: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
      //   134: invokevirtual intValue : ()I
      //   137: istore_2
      //   138: aload_0
      //   139: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   142: iload_2
      //   143: iconst_1
      //   144: iadd
      //   145: invokestatic valueOf : (I)Ljava/lang/String;
      //   148: invokevirtual setComment_count : (Ljava/lang/String;)V
      //   151: goto -> 163
      //   154: aload_0
      //   155: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   158: ldc '1'
      //   160: invokevirtual setComment_count : (Ljava/lang/String;)V
      //   163: aload_0
      //   164: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   167: invokevirtual getReport_count : ()Ljava/lang/String;
      //   170: astore_1
      //   171: aload_1
      //   172: ifnull -> 208
      //   175: ldc ''
      //   177: aload_1
      //   178: invokevirtual equals : (Ljava/lang/Object;)Z
      //   181: ifne -> 208
      //   184: aload_1
      //   185: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
      //   188: invokevirtual intValue : ()I
      //   191: istore_2
      //   192: aload_0
      //   193: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   196: iload_2
      //   197: iconst_1
      //   198: iadd
      //   199: invokestatic valueOf : (I)Ljava/lang/String;
      //   202: invokevirtual setReport_count : (Ljava/lang/String;)V
      //   205: goto -> 217
      //   208: aload_0
      //   209: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   212: ldc '1'
      //   214: invokevirtual setReport_count : (Ljava/lang/String;)V
      //   217: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   220: aload_0
      //   221: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   224: iconst_3
      //   225: anewarray java/lang/String
      //   228: dup
      //   229: iconst_0
      //   230: ldc 'type_label'
      //   232: aastore
      //   233: dup
      //   234: iconst_1
      //   235: ldc 'comment_count'
      //   237: aastore
      //   238: dup
      //   239: iconst_2
      //   240: ldc 'report_count'
      //   242: aastore
      //   243: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   246: goto -> 308
      //   249: new com/allinone/callerid/model/EZSearchContacts
      //   252: astore_1
      //   253: aload_1
      //   254: invokespecial <init> : ()V
      //   257: aload_0
      //   258: aload_1
      //   259: putfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   262: aload_1
      //   263: aload_0
      //   264: getfield c : Ljava/lang/String;
      //   267: invokevirtual setOld_tel_number : (Ljava/lang/String;)V
      //   270: aload_0
      //   271: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   274: aload_0
      //   275: getfield e : Ljava/lang/String;
      //   278: invokevirtual setType_label : (Ljava/lang/String;)V
      //   281: aload_0
      //   282: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   285: ldc '1'
      //   287: invokevirtual setComment_count : (Ljava/lang/String;)V
      //   290: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   293: aload_0
      //   294: getfield a : Lcom/allinone/callerid/model/EZSearchContacts;
      //   297: invokevirtual c : (Lcom/allinone/callerid/model/EZSearchContacts;)V
      //   300: goto -> 308
      //   303: astore_1
      //   304: aload_1
      //   305: invokevirtual printStackTrace : ()V
      //   308: aconst_null
      //   309: areturn
      // Exception table:
      //   from	to	target	type
      //   0	16	303	java/lang/Exception
      //   20	62	303	java/lang/Exception
      //   62	78	303	java/lang/Exception
      //   82	91	303	java/lang/Exception
      //   91	96	303	java/lang/Exception
      //   100	109	303	java/lang/Exception
      //   109	117	303	java/lang/Exception
      //   121	151	303	java/lang/Exception
      //   154	163	303	java/lang/Exception
      //   163	171	303	java/lang/Exception
      //   175	205	303	java/lang/Exception
      //   208	217	303	java/lang/Exception
      //   217	246	303	java/lang/Exception
      //   249	300	303	java/lang/Exception
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.b.a("ok");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */