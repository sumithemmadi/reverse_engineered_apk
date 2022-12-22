package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public final class UdpDataSource extends g {
  private final int f;
  
  private final byte[] g;
  
  private final DatagramPacket h;
  
  private Uri i;
  
  private DatagramSocket j;
  
  private MulticastSocket k;
  
  private InetAddress l;
  
  private InetSocketAddress m;
  
  private boolean n;
  
  private int o;
  
  public UdpDataSource() {
    this(2000);
  }
  
  public UdpDataSource(int paramInt) {
    this(paramInt, 8000);
  }
  
  public UdpDataSource(int paramInt1, int paramInt2) {
    super(true);
    this.f = paramInt2;
    byte[] arrayOfByte = new byte[paramInt1];
    this.g = arrayOfByte;
    this.h = new DatagramPacket(arrayOfByte, 0, paramInt1);
  }
  
  public void close() {
    this.i = null;
    MulticastSocket multicastSocket = this.k;
    if (multicastSocket != null) {
      try {
        multicastSocket.leaveGroup(this.l);
      } catch (IOException iOException) {}
      this.k = null;
    } 
    DatagramSocket datagramSocket = this.j;
    if (datagramSocket != null) {
      datagramSocket.close();
      this.j = null;
    } 
    this.l = null;
    this.m = null;
    this.o = 0;
    if (this.n) {
      this.n = false;
      b();
    } 
  }
  
  public Uri e0() {
    return this.i;
  }
  
  public long g0(l paraml) {
    Uri uri = paraml.a;
    this.i = uri;
    String str = uri.getHost();
    int i = this.i.getPort();
    c(paraml);
    try {
      this.l = InetAddress.getByName(str);
      InetSocketAddress inetSocketAddress = new InetSocketAddress();
      this(this.l, i);
      this.m = inetSocketAddress;
      if (this.l.isMulticastAddress()) {
        MulticastSocket multicastSocket = new MulticastSocket();
        this(this.m);
        this.k = multicastSocket;
        multicastSocket.joinGroup(this.l);
        this.j = this.k;
      } else {
        DatagramSocket datagramSocket = new DatagramSocket();
        this(this.m);
        this.j = datagramSocket;
      } 
      try {
        this.j.setSoTimeout(this.f);
        this.n = true;
        d(paraml);
        return -1L;
      } catch (SocketException socketException) {
        throw new UdpDataSourceException(socketException);
      } 
    } catch (IOException iOException) {
      throw new UdpDataSourceException(iOException);
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return 0; 
    if (this.o == 0)
      try {
        this.j.receive(this.h);
        int k = this.h.getLength();
        this.o = k;
        a(k);
      } catch (IOException iOException) {
        throw new UdpDataSourceException(iOException);
      }  
    int j = this.h.getLength();
    int i = this.o;
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(this.g, j - i, iOException, paramInt1, paramInt2);
    this.o -= paramInt2;
    return paramInt2;
  }
  
  public static final class UdpDataSourceException extends IOException {
    public UdpDataSourceException(IOException param1IOException) {
      super(param1IOException);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/UdpDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */