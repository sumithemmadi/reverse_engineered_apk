package com.android.billingclient.api;

import android.os.Bundle;
import c.c.a.a.b.d.a;
import java.util.ArrayList;

final class a0 {
  static g a(Bundle paramBundle, String paramString1, String paramString2) {
    g g1 = y.l;
    if (paramBundle == null) {
      a.b("BillingClient", String.format("%s got null owned items list", new Object[] { paramString2 }));
      return g1;
    } 
    int i = a.d(paramBundle, "BillingClient");
    String str = a.e(paramBundle, "BillingClient");
    g.a a = g.c();
    a.c(i);
    a.b(str);
    g g2 = a.a();
    if (i != 0) {
      a.b("BillingClient", String.format("%s failed. Response code: %s", new Object[] { paramString2, Integer.valueOf(i) }));
      return g2;
    } 
    if (!paramBundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !paramBundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !paramBundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
      a.b("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[] { paramString2 }));
      return g1;
    } 
    ArrayList arrayList2 = paramBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
    ArrayList arrayList3 = paramBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
    ArrayList arrayList1 = paramBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
    if (arrayList2 == null) {
      a.b("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[] { paramString2 }));
      return g1;
    } 
    if (arrayList3 == null) {
      a.b("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[] { paramString2 }));
      return g1;
    } 
    if (arrayList1 == null) {
      a.b("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[] { paramString2 }));
      return g1;
    } 
    return y.p;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */