package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class n extends l<InputStream> {
  private static final UriMatcher e;
  
  static {
    UriMatcher uriMatcher = new UriMatcher(-1);
    e = uriMatcher;
    uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
    uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
    uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
    uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
  }
  
  public n(ContentResolver paramContentResolver, Uri paramUri) {
    super(paramContentResolver, paramUri);
  }
  
  private InputStream i(Uri paramUri, ContentResolver paramContentResolver) {
    int i = e.match(paramUri);
    if (i != 1)
      if (i != 3) {
        if (i != 5)
          return paramContentResolver.openInputStream(paramUri); 
      } else {
        return j(paramContentResolver, paramUri);
      }  
    paramUri = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
    if (paramUri != null)
      return j(paramContentResolver, paramUri); 
    throw new FileNotFoundException("Contact cannot be found");
  }
  
  private InputStream j(ContentResolver paramContentResolver, Uri paramUri) {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
  
  public Class<InputStream> a() {
    return InputStream.class;
  }
  
  protected void g(InputStream paramInputStream) {
    paramInputStream.close();
  }
  
  protected InputStream h(Uri paramUri, ContentResolver paramContentResolver) {
    InputStream inputStream = i(paramUri, paramContentResolver);
    if (inputStream != null)
      return inputStream; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("InputStream is null for ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */