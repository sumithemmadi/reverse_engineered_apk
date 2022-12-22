package com.allinone.callerid.i.a.j;

import android.content.Context;
import android.os.AsyncTask;

public class c {
  public static void a(Context paramContext, String paramString, b paramb) {
    try {
      a a = new a();
      this(paramContext, paramString, paramb);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private b a;
    
    private String b;
    
    private Context c;
    
    private String d;
    
    a(Context param1Context, String param1String, b param1b) {
      this.a = param1b;
      this.b = param1String;
      this.c = param1Context;
    }
    
    protected Boolean a(String... param1VarArgs) {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Landroid/content/Context;
      //   4: ldc 'android.permission.READ_CALL_LOG'
      //   6: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
      //   9: istore_2
      //   10: iconst_0
      //   11: istore_3
      //   12: iconst_0
      //   13: istore #4
      //   15: iload_2
      //   16: ifne -> 279
      //   19: aload_0
      //   20: getfield c : Landroid/content/Context;
      //   23: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   26: astore #5
      //   28: getstatic android/provider/CallLog$Calls.CONTENT_URI : Landroid/net/Uri;
      //   31: astore_1
      //   32: aload_0
      //   33: getfield b : Ljava/lang/String;
      //   36: astore #6
      //   38: aload #5
      //   40: aload_1
      //   41: iconst_3
      //   42: anewarray java/lang/String
      //   45: dup
      //   46: iconst_0
      //   47: ldc 'number'
      //   49: aastore
      //   50: dup
      //   51: iconst_1
      //   52: ldc 'type'
      //   54: aastore
      //   55: dup
      //   56: iconst_2
      //   57: ldc 'duration'
      //   59: aastore
      //   60: ldc 'number=?'
      //   62: iconst_1
      //   63: anewarray java/lang/String
      //   66: dup
      //   67: iconst_0
      //   68: aload #6
      //   70: aastore
      //   71: ldc 'date DESC'
      //   73: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   76: astore_1
      //   77: iload #4
      //   79: istore #7
      //   81: aload_1
      //   82: ifnull -> 190
      //   85: iload #4
      //   87: istore #7
      //   89: aload_1
      //   90: invokeinterface getCount : ()I
      //   95: ifle -> 190
      //   98: aload_1
      //   99: invokeinterface moveToFirst : ()Z
      //   104: pop
      //   105: aload_1
      //   106: iconst_0
      //   107: invokeinterface moveToPosition : (I)Z
      //   112: pop
      //   113: aload_1
      //   114: aload_1
      //   115: ldc 'type'
      //   117: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   122: invokeinterface getInt : (I)I
      //   127: istore_2
      //   128: aload_1
      //   129: aload_1
      //   130: ldc 'duration'
      //   132: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   137: invokeinterface getString : (I)Ljava/lang/String;
      //   142: astore #6
      //   144: iload_2
      //   145: iconst_5
      //   146: if_icmpne -> 155
      //   149: iconst_1
      //   150: istore #7
      //   152: goto -> 190
      //   155: iload #4
      //   157: istore #7
      //   159: iload_2
      //   160: iconst_1
      //   161: if_icmpne -> 190
      //   164: iload #4
      //   166: istore #7
      //   168: aload #6
      //   170: ifnull -> 190
      //   173: iload #4
      //   175: istore #7
      //   177: ldc '0'
      //   179: aload #6
      //   181: invokevirtual equals : (Ljava/lang/Object;)Z
      //   184: ifeq -> 190
      //   187: goto -> 149
      //   190: aload_1
      //   191: ifnull -> 200
      //   194: aload_1
      //   195: invokeinterface close : ()V
      //   200: aload_0
      //   201: getfield b : Ljava/lang/String;
      //   204: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   207: astore_1
      //   208: aload_0
      //   209: aload_1
      //   210: putfield d : Ljava/lang/String;
      //   213: aload_1
      //   214: ifnull -> 229
      //   217: iload #7
      //   219: istore_3
      //   220: ldc ''
      //   222: aload_1
      //   223: invokevirtual equals : (Ljava/lang/Object;)Z
      //   226: ifeq -> 279
      //   229: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   232: aload_0
      //   233: getfield b : Ljava/lang/String;
      //   236: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   239: astore_1
      //   240: iload #7
      //   242: istore_3
      //   243: aload_1
      //   244: ifnull -> 279
      //   247: aload_1
      //   248: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
      //   251: astore_1
      //   252: iload #7
      //   254: istore_3
      //   255: aload_1
      //   256: ifnull -> 279
      //   259: iload #7
      //   261: istore_3
      //   262: ldc ''
      //   264: aload_1
      //   265: invokevirtual equals : (Ljava/lang/Object;)Z
      //   268: ifne -> 279
      //   271: aload_0
      //   272: aload_1
      //   273: putfield d : Ljava/lang/String;
      //   276: iload #7
      //   278: istore_3
      //   279: iload_3
      //   280: invokestatic valueOf : (Z)Ljava/lang/Boolean;
      //   283: areturn
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue(), this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */