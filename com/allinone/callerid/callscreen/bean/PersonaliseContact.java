package com.allinone.callerid.callscreen.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.allinone.callerid.customview.SortToken;
import java.io.Serializable;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "personnalcontact")
public class PersonaliseContact implements Serializable, Parcelable {
  public static final Parcelable.Creator<PersonaliseContact> CREATOR = new Parcelable.Creator<PersonaliseContact>() {
      public PersonaliseContact createFromParcel(Parcel param1Parcel) {
        return new PersonaliseContact(param1Parcel);
      }
      
      public PersonaliseContact[] newArray(int param1Int) {
        return new PersonaliseContact[param1Int];
      }
    };
  
  private int contacts_counts;
  
  @Column(name = "contacts_id")
  private int contacts_id;
  
  @Column(name = "data_id")
  private String dataId;
  
  private String default_themtname;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "isUseVideoAudioRing")
  private boolean isUseVideoAudioRing;
  
  private boolean is_default;
  
  @Column(name = "isdiy")
  private boolean isdiy;
  
  public boolean isselect;
  
  private String multiple_number;
  
  @Column(name = "contactname")
  private String name;
  
  @Column(name = "num")
  private String number;
  
  @Column(name = "path")
  private String path;
  
  @Column(name = "ringtone")
  private String ringtone;
  
  public String sortKey;
  
  @Column(name = "sortLetters")
  private String sortLetters;
  
  public SortToken sortToken;
  
  @Column(name = "themtname")
  private String themtname;
  
  public PersonaliseContact() {
    this.isselect = false;
    this.contacts_counts = 1;
    this.sortToken = new SortToken();
  }
  
  protected PersonaliseContact(Parcel paramParcel) {
    boolean bool1 = false;
    this.isselect = false;
    this.contacts_counts = 1;
    this.sortToken = new SortToken();
    this.id = paramParcel.readInt();
    this.number = paramParcel.readString();
    this.name = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.isselect = bool2;
    this.themtname = paramParcel.readString();
    this.path = paramParcel.readString();
    this.sortLetters = paramParcel.readString();
    this.ringtone = paramParcel.readString();
    this.contacts_id = paramParcel.readInt();
    this.dataId = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.isdiy = bool2;
    this.default_themtname = paramParcel.readString();
    boolean bool2 = bool1;
    if (paramParcel.readByte() != 0)
      bool2 = true; 
    this.is_default = bool2;
    this.contacts_counts = paramParcel.readInt();
    this.sortKey = paramParcel.readString();
    this.sortToken = (SortToken)paramParcel.readParcelable(SortToken.class.getClassLoader());
    this.multiple_number = paramParcel.readString();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public int getContacts_counts() {
    return this.contacts_counts;
  }
  
  public int getContacts_id() {
    return this.contacts_id;
  }
  
  public String getDataId() {
    return this.dataId;
  }
  
  public String getDefault_themtname() {
    return this.default_themtname;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getMultiple_number() {
    return this.multiple_number;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getRingtone() {
    return this.ringtone;
  }
  
  public String getSortKey() {
    return this.sortKey;
  }
  
  public String getSortLetters() {
    return this.sortLetters;
  }
  
  public SortToken getSortToken() {
    return this.sortToken;
  }
  
  public String getThemtname() {
    return this.themtname;
  }
  
  public boolean isIs_default() {
    return this.is_default;
  }
  
  public boolean isIsdiy() {
    return this.isdiy;
  }
  
  public boolean isIsselect() {
    return this.isselect;
  }
  
  public boolean isUseVideoAudioRing() {
    return this.isUseVideoAudioRing;
  }
  
  public void setContacts_counts(int paramInt) {
    this.contacts_counts = paramInt;
  }
  
  public void setContacts_id(int paramInt) {
    this.contacts_id = paramInt;
  }
  
  public void setDataId(String paramString) {
    this.dataId = paramString;
  }
  
  public void setDefault_themtname(String paramString) {
    this.default_themtname = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setIs_default(boolean paramBoolean) {
    this.is_default = paramBoolean;
  }
  
  public void setIsdiy(boolean paramBoolean) {
    this.isdiy = paramBoolean;
  }
  
  public void setIsselect(boolean paramBoolean) {
    this.isselect = paramBoolean;
  }
  
  public void setMultiple_number(String paramString) {
    this.multiple_number = paramString;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public void setRingtone(String paramString) {
    this.ringtone = paramString;
  }
  
  public void setSortKey(String paramString) {
    this.sortKey = paramString;
  }
  
  public void setSortLetters(String paramString) {
    this.sortLetters = paramString;
  }
  
  public void setSortToken(SortToken paramSortToken) {
    this.sortToken = paramSortToken;
  }
  
  public void setThemtname(String paramString) {
    this.themtname = paramString;
  }
  
  public void setUseVideoAudioRing(boolean paramBoolean) {
    this.isUseVideoAudioRing = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersonaliseContact{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", isselect=");
    stringBuilder.append(this.isselect);
    stringBuilder.append(", themtname='");
    stringBuilder.append(this.themtname);
    stringBuilder.append('\'');
    stringBuilder.append(", path='");
    stringBuilder.append(this.path);
    stringBuilder.append('\'');
    stringBuilder.append(", sortLetters='");
    stringBuilder.append(this.sortLetters);
    stringBuilder.append('\'');
    stringBuilder.append(", ringtone='");
    stringBuilder.append(this.ringtone);
    stringBuilder.append('\'');
    stringBuilder.append(", contacts_id=");
    stringBuilder.append(this.contacts_id);
    stringBuilder.append(", dataId='");
    stringBuilder.append(this.dataId);
    stringBuilder.append('\'');
    stringBuilder.append(", isdiy=");
    stringBuilder.append(this.isdiy);
    stringBuilder.append(", default_themtname='");
    stringBuilder.append(this.default_themtname);
    stringBuilder.append('\'');
    stringBuilder.append(", is_default=");
    stringBuilder.append(this.is_default);
    stringBuilder.append(", contacts_counts=");
    stringBuilder.append(this.contacts_counts);
    stringBuilder.append(", sortKey='");
    stringBuilder.append(this.sortKey);
    stringBuilder.append('\'');
    stringBuilder.append(", sortToken=");
    stringBuilder.append(this.sortToken);
    stringBuilder.append(", multiple_number='");
    stringBuilder.append(this.multiple_number);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.number);
    paramParcel.writeString(this.name);
    paramParcel.writeByte(this.isselect);
    paramParcel.writeString(this.themtname);
    paramParcel.writeString(this.path);
    paramParcel.writeString(this.sortLetters);
    paramParcel.writeString(this.ringtone);
    paramParcel.writeInt(this.contacts_id);
    paramParcel.writeString(this.dataId);
    paramParcel.writeByte(this.isdiy);
    paramParcel.writeString(this.default_themtname);
    paramParcel.writeByte(this.is_default);
    paramParcel.writeInt(this.contacts_counts);
    paramParcel.writeString(this.sortKey);
    paramParcel.writeParcelable((Parcelable)this.sortToken, paramInt);
    paramParcel.writeString(this.multiple_number);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/bean/PersonaliseContact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */