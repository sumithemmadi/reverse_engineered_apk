package com.getkeepsafe.relinker.f;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class i implements Closeable {
  private final int b = 1179403647;
  
  private final FileChannel c;
  
  public i(File paramFile) {
    if (paramFile != null && paramFile.exists()) {
      this.c = (new FileInputStream(paramFile)).getChannel();
      return;
    } 
    throw new IllegalArgumentException("File is null or does not exist");
  }
  
  private long b(d paramd, long paramLong1, long paramLong2) {
    long l;
    for (l = 0L; l < paramLong1; l++) {
      e e = paramd.b(l);
      if (e.a == 1L) {
        long l1 = e.c;
        if (l1 <= paramLong2 && paramLong2 <= e.d + l1)
          return paramLong2 - l1 + e.b; 
      } 
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Could not map vma to file offset!");
    throw illegalStateException;
  }
  
  public d c() {
    this.c.position(0L);
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    if (o(byteBuffer, 0L) == 1179403647L) {
      boolean bool;
      short s = g(byteBuffer, 4L);
      if (g(byteBuffer, 5L) == 2) {
        bool = true;
      } else {
        bool = false;
      } 
      if (s == 1)
        return new g(bool, this); 
      if (s == 2)
        return new h(bool, this); 
      throw new IllegalStateException("Invalid class type!");
    } 
    throw new IllegalArgumentException("Invalid ELF Magic!");
  }
  
  public void close() {
    this.c.close();
  }
  
  public List<String> d() {
    ByteOrder byteOrder;
    this.c.position(0L);
    ArrayList<? extends String> arrayList = new ArrayList();
    d d = c();
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    if (d.a) {
      byteOrder = ByteOrder.BIG_ENDIAN;
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    byteBuffer.order(byteOrder);
    long l1 = d.f;
    byte b = 0;
    long l2 = l1;
    if (l1 == 65535L)
      l2 = (d.c(0)).a; 
    l1 = 0L;
    while (true) {
      if (l1 < l2) {
        e e = d.b(l1);
        if (e.a == 2L) {
          l1 = e.b;
          break;
        } 
        l1++;
        continue;
      } 
      l1 = 0L;
      break;
    } 
    if (l1 == 0L)
      return Collections.unmodifiableList(arrayList); 
    ArrayList<Long> arrayList1 = new ArrayList();
    long l3 = 0L;
    while (true) {
      c c = d.a(l1, b);
      long l = c.a;
      if (l == 1L) {
        arrayList1.add(Long.valueOf(c.b));
      } else if (l == 5L) {
        l3 = c.b;
      } 
      b++;
      if (c.a == 0L) {
        if (l3 != 0L) {
          l1 = b(d, l2, l3);
          Iterator<Long> iterator = arrayList1.iterator();
          while (iterator.hasNext())
            arrayList.add(l(byteBuffer, ((Long)iterator.next()).longValue() + l1)); 
          return (List)arrayList;
        } 
        throw new IllegalStateException("String table offset not found!");
      } 
    } 
  }
  
  protected void e(ByteBuffer paramByteBuffer, long paramLong, int paramInt) {
    paramByteBuffer.position(0);
    paramByteBuffer.limit(paramInt);
    long l = 0L;
    while (l < paramInt) {
      int j = this.c.read(paramByteBuffer, paramLong + l);
      if (j != -1) {
        l += j;
        continue;
      } 
      throw new EOFException();
    } 
    paramByteBuffer.position(0);
  }
  
  protected short g(ByteBuffer paramByteBuffer, long paramLong) {
    e(paramByteBuffer, paramLong, 1);
    return (short)(paramByteBuffer.get() & 0xFF);
  }
  
  protected int h(ByteBuffer paramByteBuffer, long paramLong) {
    e(paramByteBuffer, paramLong, 2);
    return paramByteBuffer.getShort() & 0xFFFF;
  }
  
  protected long j(ByteBuffer paramByteBuffer, long paramLong) {
    e(paramByteBuffer, paramLong, 8);
    return paramByteBuffer.getLong();
  }
  
  protected String l(ByteBuffer paramByteBuffer, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      short s = g(paramByteBuffer, paramLong);
      if (s != 0) {
        stringBuilder.append((char)s);
        paramLong = 1L + paramLong;
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
  
  protected long o(ByteBuffer paramByteBuffer, long paramLong) {
    e(paramByteBuffer, paramLong, 4);
    return paramByteBuffer.getInt() & 0xFFFFFFFFL;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */