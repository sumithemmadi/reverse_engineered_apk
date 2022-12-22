package com.android.internal.telephony;

import android.os.IInterface;

public interface ITelephony extends IInterface {
  void answerRingingCall();
  
  boolean endCall();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/internal/telephony/ITelephony.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */