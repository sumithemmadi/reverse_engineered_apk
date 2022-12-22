package com.allinone.callerid.c.b;

import android.content.Context;
import android.os.Environment;
import com.allinone.callerid.util.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.util.List;

public class b {
  public static List<Object> a(Context paramContext, String paramString) {
    if (Environment.getExternalStorageState().equals("mounted")) {
      File file = new File(paramContext.getExternalFilesDir(""), paramString);
      try {
        FileInputStream fileInputStream = new FileInputStream();
        this(file);
        ObjectInputStream objectInputStream = new ObjectInputStream();
        this(fileInputStream);
        List<Object> list = (List)objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        return list;
      } catch (StreamCorruptedException streamCorruptedException) {
        streamCorruptedException.printStackTrace();
      } catch (OptionalDataException optionalDataException) {
        optionalDataException.printStackTrace();
        return null;
      } catch (FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
        return null;
      } catch (IOException iOException) {
        iOException.printStackTrace();
        return null;
      } catch (ClassNotFoundException classNotFoundException) {
        classNotFoundException.printStackTrace();
        return null;
      } 
    } 
    return null;
  }
  
  public static boolean b(Context paramContext, String paramString, Object paramObject) {
    if (Environment.getExternalStorageState().equals("mounted")) {
      File file = new File(paramContext.getExternalFilesDir(""), paramString);
      try {
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream();
        this(fileOutputStream);
        objectOutputStream.writeObject(paramObject);
        fileOutputStream.close();
        objectOutputStream.close();
        if (d0.a)
          d0.a("backup", "write ok"); 
        return true;
      } catch (FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        return false;
      } 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/c/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */