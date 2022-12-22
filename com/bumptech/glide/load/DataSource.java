package com.bumptech.glide.load;

public enum DataSource {
  b, c, d, e, f;
  
  static {
    DataSource dataSource1 = new DataSource("LOCAL", 0);
    b = dataSource1;
    DataSource dataSource2 = new DataSource("REMOTE", 1);
    c = dataSource2;
    DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
    d = dataSource3;
    DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
    e = dataSource4;
    DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
    f = dataSource5;
    g = new DataSource[] { dataSource1, dataSource2, dataSource3, dataSource4, dataSource5 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/DataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */