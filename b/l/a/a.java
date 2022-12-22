package b.l.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
  private static SimpleDateFormat A;
  
  static final String[] B;
  
  static final int[] C;
  
  static final byte[] D;
  
  private static final d[] E;
  
  private static final d[] F;
  
  private static final d[] G;
  
  private static final d[] H;
  
  private static final d[] I;
  
  private static final d J;
  
  private static final d[] K;
  
  private static final d[] L;
  
  private static final d[] M;
  
  private static final d[] N;
  
  static final d[][] O;
  
  private static final d[] P;
  
  private static final d Q;
  
  private static final d R;
  
  private static final HashMap<Integer, d>[] S;
  
  private static final HashMap<String, d>[] T;
  
  private static final HashSet<String> U;
  
  private static final HashMap<Integer, Integer> V;
  
  static final Charset W;
  
  static final byte[] X;
  
  private static final byte[] Y;
  
  private static final Pattern Z;
  
  private static final boolean a = Log.isLoggable("ExifInterface", 3);
  
  private static final Pattern a0;
  
  private static final List<Integer> b;
  
  private static final List<Integer> c;
  
  public static final int[] d = new int[] { 8, 8, 8 };
  
  public static final int[] e = new int[] { 4 };
  
  public static final int[] f = new int[] { 8 };
  
  static final byte[] g = new byte[] { -1, -40, -1 };
  
  private static final byte[] h = new byte[] { 102, 116, 121, 112 };
  
  private static final byte[] i = new byte[] { 109, 105, 102, 49 };
  
  private static final byte[] j = new byte[] { 104, 101, 105, 99 };
  
  private static final byte[] k = new byte[] { 79, 76, 89, 77, 80, 0 };
  
  private static final byte[] l = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
  
  private static final byte[] m = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  private static final byte[] n = new byte[] { 101, 88, 73, 102 };
  
  private static final byte[] o = new byte[] { 73, 72, 68, 82 };
  
  private static final byte[] p = new byte[] { 73, 69, 78, 68 };
  
  private static final byte[] q = new byte[] { 82, 73, 70, 70 };
  
  private static final byte[] r = new byte[] { 87, 69, 66, 80 };
  
  private static final byte[] s = new byte[] { 69, 88, 73, 70 };
  
  private static final byte[] t = new byte[] { -99, 1, 42 };
  
  private static final byte[] u = "VP8X".getBytes(Charset.defaultCharset());
  
  private static final byte[] v = "VP8L".getBytes(Charset.defaultCharset());
  
  private static final byte[] w = "VP8 ".getBytes(Charset.defaultCharset());
  
  private static final byte[] x = "ANIM".getBytes(Charset.defaultCharset());
  
  private static final byte[] y = "ANMF".getBytes(Charset.defaultCharset());
  
  private static final byte[] z = "XMP ".getBytes(Charset.defaultCharset());
  
  private String b0;
  
  private FileDescriptor c0;
  
  private AssetManager.AssetInputStream d0;
  
  private int e0;
  
  private boolean f0;
  
  private final HashMap<String, c>[] g0;
  
  private Set<Integer> h0;
  
  private ByteOrder i0;
  
  private boolean j0;
  
  private boolean k0;
  
  private boolean l0;
  
  private int m0;
  
  private int n0;
  
  private byte[] o0;
  
  private int p0;
  
  private int q0;
  
  private int r0;
  
  private int s0;
  
  private int t0;
  
  private int u0;
  
  private boolean v0;
  
  private boolean w0;
  
  static {
    B = new String[] { 
        "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", 
        "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
    C = new int[] { 
        0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
        8, 4, 8, 1 };
    D = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
    d[] arrayOfD1 = new d[42];
    arrayOfD1[0] = new d("NewSubfileType", 254, 4);
    arrayOfD1[1] = new d("SubfileType", 255, 4);
    arrayOfD1[2] = new d("ImageWidth", 256, 3, 4);
    arrayOfD1[3] = new d("ImageLength", 257, 3, 4);
    arrayOfD1[4] = new d("BitsPerSample", 258, 3);
    arrayOfD1[5] = new d("Compression", 259, 3);
    arrayOfD1[6] = new d("PhotometricInterpretation", 262, 3);
    arrayOfD1[7] = new d("ImageDescription", 270, 2);
    arrayOfD1[8] = new d("Make", 271, 2);
    arrayOfD1[9] = new d("Model", 272, 2);
    arrayOfD1[10] = new d("StripOffsets", 273, 3, 4);
    arrayOfD1[11] = new d("Orientation", 274, 3);
    arrayOfD1[12] = new d("SamplesPerPixel", 277, 3);
    arrayOfD1[13] = new d("RowsPerStrip", 278, 3, 4);
    arrayOfD1[14] = new d("StripByteCounts", 279, 3, 4);
    arrayOfD1[15] = new d("XResolution", 282, 5);
    arrayOfD1[16] = new d("YResolution", 283, 5);
    arrayOfD1[17] = new d("PlanarConfiguration", 284, 3);
    arrayOfD1[18] = new d("ResolutionUnit", 296, 3);
    arrayOfD1[19] = new d("TransferFunction", 301, 3);
    arrayOfD1[20] = new d("Software", 305, 2);
    arrayOfD1[21] = new d("DateTime", 306, 2);
    arrayOfD1[22] = new d("Artist", 315, 2);
    arrayOfD1[23] = new d("WhitePoint", 318, 5);
    arrayOfD1[24] = new d("PrimaryChromaticities", 319, 5);
    arrayOfD1[25] = new d("SubIFDPointer", 330, 4);
    arrayOfD1[26] = new d("JPEGInterchangeFormat", 513, 4);
    arrayOfD1[27] = new d("JPEGInterchangeFormatLength", 514, 4);
    arrayOfD1[28] = new d("YCbCrCoefficients", 529, 5);
    arrayOfD1[29] = new d("YCbCrSubSampling", 530, 3);
    arrayOfD1[30] = new d("YCbCrPositioning", 531, 3);
    arrayOfD1[31] = new d("ReferenceBlackWhite", 532, 5);
    arrayOfD1[32] = new d("Copyright", 33432, 2);
    arrayOfD1[33] = new d("ExifIFDPointer", 34665, 4);
    arrayOfD1[34] = new d("GPSInfoIFDPointer", 34853, 4);
    arrayOfD1[35] = new d("SensorTopBorder", 4, 4);
    arrayOfD1[36] = new d("SensorLeftBorder", 5, 4);
    arrayOfD1[37] = new d("SensorBottomBorder", 6, 4);
    arrayOfD1[38] = new d("SensorRightBorder", 7, 4);
    arrayOfD1[39] = new d("ISO", 23, 3);
    arrayOfD1[40] = new d("JpgFromRaw", 46, 7);
    arrayOfD1[41] = new d("Xmp", 700, 1);
    E = arrayOfD1;
    d[] arrayOfD2 = new d[74];
    arrayOfD2[0] = new d("ExposureTime", 33434, 5);
    arrayOfD2[1] = new d("FNumber", 33437, 5);
    arrayOfD2[2] = new d("ExposureProgram", 34850, 3);
    arrayOfD2[3] = new d("SpectralSensitivity", 34852, 2);
    arrayOfD2[4] = new d("PhotographicSensitivity", 34855, 3);
    arrayOfD2[5] = new d("OECF", 34856, 7);
    arrayOfD2[6] = new d("SensitivityType", 34864, 3);
    arrayOfD2[7] = new d("StandardOutputSensitivity", 34865, 4);
    arrayOfD2[8] = new d("RecommendedExposureIndex", 34866, 4);
    arrayOfD2[9] = new d("ISOSpeed", 34867, 4);
    arrayOfD2[10] = new d("ISOSpeedLatitudeyyy", 34868, 4);
    arrayOfD2[11] = new d("ISOSpeedLatitudezzz", 34869, 4);
    arrayOfD2[12] = new d("ExifVersion", 36864, 2);
    arrayOfD2[13] = new d("DateTimeOriginal", 36867, 2);
    arrayOfD2[14] = new d("DateTimeDigitized", 36868, 2);
    arrayOfD2[15] = new d("OffsetTime", 36880, 2);
    arrayOfD2[16] = new d("OffsetTimeOriginal", 36881, 2);
    arrayOfD2[17] = new d("OffsetTimeDigitized", 36882, 2);
    arrayOfD2[18] = new d("ComponentsConfiguration", 37121, 7);
    arrayOfD2[19] = new d("CompressedBitsPerPixel", 37122, 5);
    arrayOfD2[20] = new d("ShutterSpeedValue", 37377, 10);
    arrayOfD2[21] = new d("ApertureValue", 37378, 5);
    arrayOfD2[22] = new d("BrightnessValue", 37379, 10);
    arrayOfD2[23] = new d("ExposureBiasValue", 37380, 10);
    arrayOfD2[24] = new d("MaxApertureValue", 37381, 5);
    arrayOfD2[25] = new d("SubjectDistance", 37382, 5);
    arrayOfD2[26] = new d("MeteringMode", 37383, 3);
    arrayOfD2[27] = new d("LightSource", 37384, 3);
    arrayOfD2[28] = new d("Flash", 37385, 3);
    arrayOfD2[29] = new d("FocalLength", 37386, 5);
    arrayOfD2[30] = new d("SubjectArea", 37396, 3);
    arrayOfD2[31] = new d("MakerNote", 37500, 7);
    arrayOfD2[32] = new d("UserComment", 37510, 7);
    arrayOfD2[33] = new d("SubSecTime", 37520, 2);
    arrayOfD2[34] = new d("SubSecTimeOriginal", 37521, 2);
    arrayOfD2[35] = new d("SubSecTimeDigitized", 37522, 2);
    arrayOfD2[36] = new d("FlashpixVersion", 40960, 7);
    arrayOfD2[37] = new d("ColorSpace", 40961, 3);
    arrayOfD2[38] = new d("PixelXDimension", 40962, 3, 4);
    arrayOfD2[39] = new d("PixelYDimension", 40963, 3, 4);
    arrayOfD2[40] = new d("RelatedSoundFile", 40964, 2);
    arrayOfD2[41] = new d("InteroperabilityIFDPointer", 40965, 4);
    arrayOfD2[42] = new d("FlashEnergy", 41483, 5);
    arrayOfD2[43] = new d("SpatialFrequencyResponse", 41484, 7);
    arrayOfD2[44] = new d("FocalPlaneXResolution", 41486, 5);
    arrayOfD2[45] = new d("FocalPlaneYResolution", 41487, 5);
    arrayOfD2[46] = new d("FocalPlaneResolutionUnit", 41488, 3);
    arrayOfD2[47] = new d("SubjectLocation", 41492, 3);
    arrayOfD2[48] = new d("ExposureIndex", 41493, 5);
    arrayOfD2[49] = new d("SensingMethod", 41495, 3);
    arrayOfD2[50] = new d("FileSource", 41728, 7);
    arrayOfD2[51] = new d("SceneType", 41729, 7);
    arrayOfD2[52] = new d("CFAPattern", 41730, 7);
    arrayOfD2[53] = new d("CustomRendered", 41985, 3);
    arrayOfD2[54] = new d("ExposureMode", 41986, 3);
    arrayOfD2[55] = new d("WhiteBalance", 41987, 3);
    arrayOfD2[56] = new d("DigitalZoomRatio", 41988, 5);
    arrayOfD2[57] = new d("FocalLengthIn35mmFilm", 41989, 3);
    arrayOfD2[58] = new d("SceneCaptureType", 41990, 3);
    arrayOfD2[59] = new d("GainControl", 41991, 3);
    arrayOfD2[60] = new d("Contrast", 41992, 3);
    arrayOfD2[61] = new d("Saturation", 41993, 3);
    arrayOfD2[62] = new d("Sharpness", 41994, 3);
    arrayOfD2[63] = new d("DeviceSettingDescription", 41995, 7);
    arrayOfD2[64] = new d("SubjectDistanceRange", 41996, 3);
    arrayOfD2[65] = new d("ImageUniqueID", 42016, 2);
    arrayOfD2[66] = new d("CameraOwnerName", 42032, 2);
    arrayOfD2[67] = new d("BodySerialNumber", 42033, 2);
    arrayOfD2[68] = new d("LensSpecification", 42034, 5);
    arrayOfD2[69] = new d("LensMake", 42035, 2);
    arrayOfD2[70] = new d("LensModel", 42036, 2);
    arrayOfD2[71] = new d("Gamma", 42240, 5);
    arrayOfD2[72] = new d("DNGVersion", 50706, 1);
    arrayOfD2[73] = new d("DefaultCropSize", 50720, 3, 4);
    F = arrayOfD2;
    d[] arrayOfD3 = new d[32];
    arrayOfD3[0] = new d("GPSVersionID", 0, 1);
    arrayOfD3[1] = new d("GPSLatitudeRef", 1, 2);
    arrayOfD3[2] = new d("GPSLatitude", 2, 5);
    arrayOfD3[3] = new d("GPSLongitudeRef", 3, 2);
    arrayOfD3[4] = new d("GPSLongitude", 4, 5);
    arrayOfD3[5] = new d("GPSAltitudeRef", 5, 1);
    arrayOfD3[6] = new d("GPSAltitude", 6, 5);
    arrayOfD3[7] = new d("GPSTimeStamp", 7, 5);
    arrayOfD3[8] = new d("GPSSatellites", 8, 2);
    arrayOfD3[9] = new d("GPSStatus", 9, 2);
    arrayOfD3[10] = new d("GPSMeasureMode", 10, 2);
    arrayOfD3[11] = new d("GPSDOP", 11, 5);
    arrayOfD3[12] = new d("GPSSpeedRef", 12, 2);
    arrayOfD3[13] = new d("GPSSpeed", 13, 5);
    arrayOfD3[14] = new d("GPSTrackRef", 14, 2);
    arrayOfD3[15] = new d("GPSTrack", 15, 5);
    arrayOfD3[16] = new d("GPSImgDirectionRef", 16, 2);
    arrayOfD3[17] = new d("GPSImgDirection", 17, 5);
    arrayOfD3[18] = new d("GPSMapDatum", 18, 2);
    arrayOfD3[19] = new d("GPSDestLatitudeRef", 19, 2);
    arrayOfD3[20] = new d("GPSDestLatitude", 20, 5);
    arrayOfD3[21] = new d("GPSDestLongitudeRef", 21, 2);
    arrayOfD3[22] = new d("GPSDestLongitude", 22, 5);
    arrayOfD3[23] = new d("GPSDestBearingRef", 23, 2);
    arrayOfD3[24] = new d("GPSDestBearing", 24, 5);
    arrayOfD3[25] = new d("GPSDestDistanceRef", 25, 2);
    arrayOfD3[26] = new d("GPSDestDistance", 26, 5);
    arrayOfD3[27] = new d("GPSProcessingMethod", 27, 7);
    arrayOfD3[28] = new d("GPSAreaInformation", 28, 7);
    arrayOfD3[29] = new d("GPSDateStamp", 29, 2);
    arrayOfD3[30] = new d("GPSDifferential", 30, 3);
    arrayOfD3[31] = new d("GPSHPositioningError", 31, 5);
    G = arrayOfD3;
    d[] arrayOfD4 = new d[1];
    arrayOfD4[0] = new d("InteroperabilityIndex", 1, 2);
    H = arrayOfD4;
    d[] arrayOfD5 = new d[37];
    arrayOfD5[0] = new d("NewSubfileType", 254, 4);
    arrayOfD5[1] = new d("SubfileType", 255, 4);
    arrayOfD5[2] = new d("ThumbnailImageWidth", 256, 3, 4);
    arrayOfD5[3] = new d("ThumbnailImageLength", 257, 3, 4);
    arrayOfD5[4] = new d("BitsPerSample", 258, 3);
    arrayOfD5[5] = new d("Compression", 259, 3);
    arrayOfD5[6] = new d("PhotometricInterpretation", 262, 3);
    arrayOfD5[7] = new d("ImageDescription", 270, 2);
    arrayOfD5[8] = new d("Make", 271, 2);
    arrayOfD5[9] = new d("Model", 272, 2);
    arrayOfD5[10] = new d("StripOffsets", 273, 3, 4);
    arrayOfD5[11] = new d("ThumbnailOrientation", 274, 3);
    arrayOfD5[12] = new d("SamplesPerPixel", 277, 3);
    arrayOfD5[13] = new d("RowsPerStrip", 278, 3, 4);
    arrayOfD5[14] = new d("StripByteCounts", 279, 3, 4);
    arrayOfD5[15] = new d("XResolution", 282, 5);
    arrayOfD5[16] = new d("YResolution", 283, 5);
    arrayOfD5[17] = new d("PlanarConfiguration", 284, 3);
    arrayOfD5[18] = new d("ResolutionUnit", 296, 3);
    arrayOfD5[19] = new d("TransferFunction", 301, 3);
    arrayOfD5[20] = new d("Software", 305, 2);
    arrayOfD5[21] = new d("DateTime", 306, 2);
    arrayOfD5[22] = new d("Artist", 315, 2);
    arrayOfD5[23] = new d("WhitePoint", 318, 5);
    arrayOfD5[24] = new d("PrimaryChromaticities", 319, 5);
    arrayOfD5[25] = new d("SubIFDPointer", 330, 4);
    arrayOfD5[26] = new d("JPEGInterchangeFormat", 513, 4);
    arrayOfD5[27] = new d("JPEGInterchangeFormatLength", 514, 4);
    arrayOfD5[28] = new d("YCbCrCoefficients", 529, 5);
    arrayOfD5[29] = new d("YCbCrSubSampling", 530, 3);
    arrayOfD5[30] = new d("YCbCrPositioning", 531, 3);
    arrayOfD5[31] = new d("ReferenceBlackWhite", 532, 5);
    arrayOfD5[32] = new d("Copyright", 33432, 2);
    arrayOfD5[33] = new d("ExifIFDPointer", 34665, 4);
    arrayOfD5[34] = new d("GPSInfoIFDPointer", 34853, 4);
    arrayOfD5[35] = new d("DNGVersion", 50706, 1);
    arrayOfD5[36] = new d("DefaultCropSize", 50720, 3, 4);
    I = arrayOfD5;
    J = new d("StripOffsets", 273, 3);
    d[] arrayOfD6 = new d[3];
    arrayOfD6[0] = new d("ThumbnailImage", 256, 7);
    arrayOfD6[1] = new d("CameraSettingsIFDPointer", 8224, 4);
    arrayOfD6[2] = new d("ImageProcessingIFDPointer", 8256, 4);
    K = arrayOfD6;
    d[] arrayOfD7 = new d[2];
    arrayOfD7[0] = new d("PreviewImageStart", 257, 4);
    arrayOfD7[1] = new d("PreviewImageLength", 258, 4);
    L = arrayOfD7;
    d[] arrayOfD8 = new d[1];
    arrayOfD8[0] = new d("AspectFrame", 4371, 3);
    M = arrayOfD8;
    d[] arrayOfD9 = new d[1];
    arrayOfD9[0] = new d("ColorSpace", 55, 3);
    N = arrayOfD9;
    d[][] arrayOfD = new d[10][];
    arrayOfD[0] = arrayOfD1;
    arrayOfD[1] = arrayOfD2;
    arrayOfD[2] = arrayOfD3;
    arrayOfD[3] = arrayOfD4;
    arrayOfD[4] = arrayOfD5;
    arrayOfD[5] = arrayOfD1;
    arrayOfD[6] = arrayOfD6;
    arrayOfD[7] = arrayOfD7;
    arrayOfD[8] = arrayOfD8;
    arrayOfD[9] = arrayOfD9;
    O = arrayOfD;
    P = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
    Q = new d("JPEGInterchangeFormat", 513, 4);
    R = new d("JPEGInterchangeFormatLength", 514, 4);
    S = (HashMap<Integer, d>[])new HashMap[arrayOfD.length];
    T = (HashMap<String, d>[])new HashMap[arrayOfD.length];
    U = new HashSet<String>(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    V = new HashMap<Integer, Integer>();
    Charset charset = Charset.forName("US-ASCII");
    W = charset;
    X = "Exif\000\000".getBytes(charset);
    Y = "http://ns.adobe.com/xap/1.0/\000".getBytes(charset);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    A = simpleDateFormat;
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    byte b = 0;
    while (true) {
      d[][] arrayOfD10 = O;
      if (b < arrayOfD10.length) {
        S[b] = new HashMap<Integer, d>();
        T[b] = new HashMap<String, d>();
        for (d d1 : arrayOfD10[b]) {
          S[b].put(Integer.valueOf(d1.a), d1);
          T[b].put(d1.b, d1);
        } 
        b++;
        continue;
      } 
      HashMap<Integer, Integer> hashMap = V;
      arrayOfD2 = P;
      hashMap.put(Integer.valueOf((arrayOfD2[0]).a), integer6);
      hashMap.put(Integer.valueOf((arrayOfD2[1]).a), integer2);
      hashMap.put(Integer.valueOf((arrayOfD2[2]).a), integer3);
      hashMap.put(Integer.valueOf((arrayOfD2[3]).a), integer1);
      hashMap.put(Integer.valueOf((arrayOfD2[4]).a), integer5);
      hashMap.put(Integer.valueOf((arrayOfD2[5]).a), integer4);
      Z = Pattern.compile(".*[1-9].*");
      a0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
      return;
    } 
  }
  
  public a(InputStream paramInputStream) {
    this(paramInputStream, false);
  }
  
  private a(InputStream paramInputStream, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: getstatic b/l/a/a.O : [[Lb/l/a/a$d;
    //   7: astore_3
    //   8: aload_0
    //   9: aload_3
    //   10: arraylength
    //   11: anewarray java/util/HashMap
    //   14: putfield g0 : [Ljava/util/HashMap;
    //   17: aload_0
    //   18: new java/util/HashSet
    //   21: dup
    //   22: aload_3
    //   23: arraylength
    //   24: invokespecial <init> : (I)V
    //   27: putfield h0 : Ljava/util/Set;
    //   30: aload_0
    //   31: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   34: putfield i0 : Ljava/nio/ByteOrder;
    //   37: aload_1
    //   38: ifnull -> 174
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield b0 : Ljava/lang/String;
    //   46: iload_2
    //   47: ifeq -> 97
    //   50: new java/io/BufferedInputStream
    //   53: dup
    //   54: aload_1
    //   55: sipush #5000
    //   58: invokespecial <init> : (Ljava/io/InputStream;I)V
    //   61: astore_1
    //   62: aload_1
    //   63: invokestatic s : (Ljava/io/BufferedInputStream;)Z
    //   66: ifne -> 79
    //   69: ldc 'ExifInterface'
    //   71: ldc_w 'Given data does not follow the structure of an Exif-only data.'
    //   74: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   77: pop
    //   78: return
    //   79: aload_0
    //   80: iconst_1
    //   81: putfield f0 : Z
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield d0 : Landroid/content/res/AssetManager$AssetInputStream;
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield c0 : Ljava/io/FileDescriptor;
    //   94: goto -> 168
    //   97: aload_1
    //   98: instanceof android/content/res/AssetManager$AssetInputStream
    //   101: ifeq -> 120
    //   104: aload_0
    //   105: aload_1
    //   106: checkcast android/content/res/AssetManager$AssetInputStream
    //   109: putfield d0 : Landroid/content/res/AssetManager$AssetInputStream;
    //   112: aload_0
    //   113: aconst_null
    //   114: putfield c0 : Ljava/io/FileDescriptor;
    //   117: goto -> 168
    //   120: aload_1
    //   121: instanceof java/io/FileInputStream
    //   124: ifeq -> 158
    //   127: aload_1
    //   128: checkcast java/io/FileInputStream
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   136: invokestatic z : (Ljava/io/FileDescriptor;)Z
    //   139: ifeq -> 158
    //   142: aload_0
    //   143: aconst_null
    //   144: putfield d0 : Landroid/content/res/AssetManager$AssetInputStream;
    //   147: aload_0
    //   148: aload_3
    //   149: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   152: putfield c0 : Ljava/io/FileDescriptor;
    //   155: goto -> 168
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield d0 : Landroid/content/res/AssetManager$AssetInputStream;
    //   163: aload_0
    //   164: aconst_null
    //   165: putfield c0 : Ljava/io/FileDescriptor;
    //   168: aload_0
    //   169: aload_1
    //   170: invokespecial D : (Ljava/io/InputStream;)V
    //   173: return
    //   174: new java/lang/NullPointerException
    //   177: dup
    //   178: ldc_w 'inputStream cannot be null'
    //   181: invokespecial <init> : (Ljava/lang/String;)V
    //   184: athrow
  }
  
  private boolean A(HashMap paramHashMap) {
    c c = (c)paramHashMap.get("BitsPerSample");
    if (c != null) {
      int[] arrayOfInt2 = (int[])c.k(this.i0);
      int[] arrayOfInt1 = d;
      if (Arrays.equals(arrayOfInt1, arrayOfInt2))
        return true; 
      if (this.e0 == 3) {
        c c1 = (c)paramHashMap.get("PhotometricInterpretation");
        if (c1 != null) {
          int i = c1.i(this.i0);
          if ((i == 1 && Arrays.equals(arrayOfInt2, f)) || (i == 6 && Arrays.equals(arrayOfInt2, arrayOfInt1)))
            return true; 
        } 
      } 
    } 
    if (a)
      Log.d("ExifInterface", "Unsupported data type value"); 
    return false;
  }
  
  private boolean B(HashMap paramHashMap) {
    c c2 = (c)paramHashMap.get("ImageLength");
    c c1 = (c)paramHashMap.get("ImageWidth");
    if (c2 != null && c1 != null) {
      int i = c2.i(this.i0);
      int j = c1.i(this.i0);
      if (i <= 512 && j <= 512)
        return true; 
    } 
    return false;
  }
  
  private boolean C(byte[] paramArrayOfbyte) {
    byte b = 0;
    while (true) {
      byte[] arrayOfByte = q;
      if (b < arrayOfByte.length) {
        if (paramArrayOfbyte[b] != arrayOfByte[b])
          return false; 
        b++;
        continue;
      } 
      b = 0;
      while (true) {
        arrayOfByte = r;
        if (b < arrayOfByte.length) {
          if (paramArrayOfbyte[q.length + b + 4] != arrayOfByte[b])
            return false; 
          b++;
          continue;
        } 
        return true;
      } 
      break;
    } 
  }
  
  private void D(InputStream paramInputStream) {
    if (paramInputStream != null) {
      byte b = 0;
      try {
        while (b < O.length) {
          this.g0[b] = new HashMap<String, c>();
          b++;
        } 
        InputStream inputStream = paramInputStream;
        if (!this.f0) {
          inputStream = new BufferedInputStream();
          super(paramInputStream, 5000);
          this.e0 = i((BufferedInputStream)inputStream);
        } 
        paramInputStream = new b();
        super(inputStream);
        if (!this.f0) {
          switch (this.e0) {
            case 14:
              p((b)paramInputStream);
              break;
            case 13:
              k((b)paramInputStream);
              break;
            case 12:
              g((b)paramInputStream);
              break;
            case 10:
              n((b)paramInputStream);
              break;
            case 9:
              l((b)paramInputStream);
              break;
            case 7:
              j((b)paramInputStream);
              break;
            case 4:
              h((b)paramInputStream, 0, 0);
              break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
              m((b)paramInputStream);
              break;
          } 
        } else {
          o((b)paramInputStream);
        } 
        K((b)paramInputStream);
        this.v0 = true;
        a();
        if (a) {
          F();
          return;
        } 
      } catch (IOException iOException) {
        this.v0 = false;
        boolean bool = a;
        if (bool)
          Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", iOException); 
        a();
        if (bool) {
          F();
          return;
        } 
      } finally {}
      return;
    } 
    NullPointerException nullPointerException = new NullPointerException("inputstream shouldn't be null");
    throw nullPointerException;
  }
  
  private void E(b paramb, int paramInt) {
    ByteOrder byteOrder = G(paramb);
    this.i0 = byteOrder;
    paramb.g(byteOrder);
    int i = paramb.readUnsignedShort();
    int j = this.e0;
    if (j == 7 || j == 10 || i == 42) {
      i = paramb.readInt();
      if (i >= 8 && i < paramInt) {
        paramInt = i - 8;
        if (paramInt <= 0 || paramb.skipBytes(paramInt) == paramInt)
          return; 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Couldn't jump to first Ifd: ");
        stringBuilder2.append(paramInt);
        throw new IOException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid first Ifd offset: ");
      stringBuilder1.append(i);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid start code: ");
    stringBuilder.append(Integer.toHexString(i));
    throw new IOException(stringBuilder.toString());
  }
  
  private void F() {
    for (byte b = 0; b < this.g0.length; b++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("The size of tag group[");
      stringBuilder.append(b);
      stringBuilder.append("]: ");
      stringBuilder.append(this.g0[b].size());
      Log.d("ExifInterface", stringBuilder.toString());
      for (Map.Entry<String, c> entry : this.g0[b].entrySet()) {
        c c = (c)entry.getValue();
        stringBuilder = new StringBuilder();
        stringBuilder.append("tagName: ");
        stringBuilder.append((String)entry.getKey());
        stringBuilder.append(", tagType: ");
        stringBuilder.append(c.toString());
        stringBuilder.append(", tagValue: '");
        stringBuilder.append(c.j(this.i0));
        stringBuilder.append("'");
        Log.d("ExifInterface", stringBuilder.toString());
      } 
    } 
  }
  
  private ByteOrder G(b paramb) {
    short s = paramb.readShort();
    if (s != 18761) {
      if (s == 19789) {
        if (a)
          Log.d("ExifInterface", "readExifSegment: Byte Align MM"); 
        return ByteOrder.BIG_ENDIAN;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid byte order: ");
      stringBuilder.append(Integer.toHexString(s));
      throw new IOException(stringBuilder.toString());
    } 
    if (a)
      Log.d("ExifInterface", "readExifSegment: Byte Align II"); 
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  private void H(byte[] paramArrayOfbyte, int paramInt) {
    b b = new b(paramArrayOfbyte);
    E(b, paramArrayOfbyte.length);
    I(b, paramInt);
  }
  
  private void I(b paramb, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h0 : Ljava/util/Set;
    //   4: aload_1
    //   5: getfield g : I
    //   8: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11: invokeinterface add : (Ljava/lang/Object;)Z
    //   16: pop
    //   17: aload_1
    //   18: getfield g : I
    //   21: iconst_2
    //   22: iadd
    //   23: aload_1
    //   24: getfield f : I
    //   27: if_icmple -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual readShort : ()S
    //   35: istore_3
    //   36: getstatic b/l/a/a.a : Z
    //   39: istore #4
    //   41: ldc 'ExifInterface'
    //   43: astore #5
    //   45: iload #4
    //   47: ifeq -> 86
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore #6
    //   59: aload #6
    //   61: ldc_w 'numberOfDirectoryEntry: '
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload #6
    //   70: iload_3
    //   71: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: ldc 'ExifInterface'
    //   77: aload #6
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: aload_1
    //   87: getfield g : I
    //   90: iload_3
    //   91: bipush #12
    //   93: imul
    //   94: iadd
    //   95: aload_1
    //   96: getfield f : I
    //   99: if_icmpgt -> 1691
    //   102: iload_3
    //   103: ifgt -> 109
    //   106: goto -> 1691
    //   109: iconst_0
    //   110: istore #7
    //   112: iload_2
    //   113: istore #8
    //   115: iload #7
    //   117: iload_3
    //   118: if_icmpge -> 1480
    //   121: aload_1
    //   122: invokevirtual readUnsignedShort : ()I
    //   125: istore #9
    //   127: aload_1
    //   128: invokevirtual readUnsignedShort : ()I
    //   131: istore #10
    //   133: aload_1
    //   134: invokevirtual readInt : ()I
    //   137: istore #11
    //   139: aload_1
    //   140: invokevirtual c : ()I
    //   143: i2l
    //   144: ldc2_w 4
    //   147: ladd
    //   148: lstore #12
    //   150: getstatic b/l/a/a.S : [Ljava/util/HashMap;
    //   153: iload #8
    //   155: aaload
    //   156: iload #9
    //   158: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   161: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   164: checkcast b/l/a/a$d
    //   167: astore #14
    //   169: getstatic b/l/a/a.a : Z
    //   172: istore #4
    //   174: iload #4
    //   176: ifeq -> 249
    //   179: aload #14
    //   181: ifnull -> 194
    //   184: aload #14
    //   186: getfield b : Ljava/lang/String;
    //   189: astore #6
    //   191: goto -> 197
    //   194: aconst_null
    //   195: astore #6
    //   197: aload #5
    //   199: ldc_w 'ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d'
    //   202: iconst_5
    //   203: anewarray java/lang/Object
    //   206: dup
    //   207: iconst_0
    //   208: iload_2
    //   209: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   212: aastore
    //   213: dup
    //   214: iconst_1
    //   215: iload #9
    //   217: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   220: aastore
    //   221: dup
    //   222: iconst_2
    //   223: aload #6
    //   225: aastore
    //   226: dup
    //   227: iconst_3
    //   228: iload #10
    //   230: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   233: aastore
    //   234: dup
    //   235: iconst_4
    //   236: iload #11
    //   238: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   241: aastore
    //   242: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   245: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   248: pop
    //   249: aload #14
    //   251: ifnonnull -> 299
    //   254: iload #4
    //   256: ifeq -> 296
    //   259: new java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial <init> : ()V
    //   266: astore #6
    //   268: aload #6
    //   270: ldc_w 'Skip the tag entry since tag number is not defined: '
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload #6
    //   279: iload #9
    //   281: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload #5
    //   287: aload #6
    //   289: invokevirtual toString : ()Ljava/lang/String;
    //   292: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   295: pop
    //   296: goto -> 561
    //   299: iload #10
    //   301: ifle -> 519
    //   304: getstatic b/l/a/a.C : [I
    //   307: astore #6
    //   309: iload #10
    //   311: aload #6
    //   313: arraylength
    //   314: if_icmplt -> 320
    //   317: goto -> 519
    //   320: aload #14
    //   322: iload #10
    //   324: invokevirtual a : (I)Z
    //   327: ifne -> 399
    //   330: iload #4
    //   332: ifeq -> 296
    //   335: new java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: astore #6
    //   344: aload #6
    //   346: ldc_w 'Skip the tag entry since data format ('
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: aload #6
    //   355: getstatic b/l/a/a.B : [Ljava/lang/String;
    //   358: iload #10
    //   360: aaload
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload #6
    //   367: ldc_w ') is unexpected for tag: '
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload #6
    //   376: aload #14
    //   378: getfield b : Ljava/lang/String;
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload #5
    //   387: aload #6
    //   389: invokevirtual toString : ()Ljava/lang/String;
    //   392: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   395: pop
    //   396: goto -> 296
    //   399: iload #10
    //   401: istore #15
    //   403: iload #10
    //   405: bipush #7
    //   407: if_icmpne -> 417
    //   410: aload #14
    //   412: getfield c : I
    //   415: istore #15
    //   417: iload #11
    //   419: i2l
    //   420: aload #6
    //   422: iload #15
    //   424: iaload
    //   425: i2l
    //   426: lmul
    //   427: lstore #16
    //   429: lload #16
    //   431: lconst_0
    //   432: lcmp
    //   433: iflt -> 458
    //   436: lload #16
    //   438: ldc2_w 2147483647
    //   441: lcmp
    //   442: ifle -> 448
    //   445: goto -> 458
    //   448: iconst_1
    //   449: istore #10
    //   451: lload #16
    //   453: lstore #18
    //   455: goto -> 575
    //   458: lload #16
    //   460: lstore #18
    //   462: iload #15
    //   464: istore #10
    //   466: iload #4
    //   468: ifeq -> 564
    //   471: new java/lang/StringBuilder
    //   474: dup
    //   475: invokespecial <init> : ()V
    //   478: astore #6
    //   480: aload #6
    //   482: ldc_w 'Skip the tag entry since the number of components is invalid: '
    //   485: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: pop
    //   489: aload #6
    //   491: iload #11
    //   493: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   496: pop
    //   497: aload #5
    //   499: aload #6
    //   501: invokevirtual toString : ()Ljava/lang/String;
    //   504: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   507: pop
    //   508: lload #16
    //   510: lstore #18
    //   512: iload #15
    //   514: istore #10
    //   516: goto -> 564
    //   519: iload #4
    //   521: ifeq -> 561
    //   524: new java/lang/StringBuilder
    //   527: dup
    //   528: invokespecial <init> : ()V
    //   531: astore #6
    //   533: aload #6
    //   535: ldc_w 'Skip the tag entry since data format is invalid: '
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: pop
    //   542: aload #6
    //   544: iload #10
    //   546: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   549: pop
    //   550: aload #5
    //   552: aload #6
    //   554: invokevirtual toString : ()Ljava/lang/String;
    //   557: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   560: pop
    //   561: lconst_0
    //   562: lstore #18
    //   564: iconst_0
    //   565: istore #20
    //   567: iload #10
    //   569: istore #15
    //   571: iload #20
    //   573: istore #10
    //   575: iload #10
    //   577: ifne -> 589
    //   580: aload_1
    //   581: lload #12
    //   583: invokevirtual e : (J)V
    //   586: goto -> 1470
    //   589: lload #18
    //   591: ldc2_w 4
    //   594: lcmp
    //   595: ifle -> 914
    //   598: aload_1
    //   599: invokevirtual readInt : ()I
    //   602: istore #20
    //   604: iload #4
    //   606: ifeq -> 649
    //   609: new java/lang/StringBuilder
    //   612: dup
    //   613: invokespecial <init> : ()V
    //   616: astore #6
    //   618: aload #6
    //   620: ldc_w 'seek to data offset: '
    //   623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   626: pop
    //   627: aload #6
    //   629: iload #20
    //   631: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   634: pop
    //   635: aload #5
    //   637: aload #6
    //   639: invokevirtual toString : ()Ljava/lang/String;
    //   642: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   645: pop
    //   646: goto -> 649
    //   649: aload_0
    //   650: getfield e0 : I
    //   653: istore #10
    //   655: iload #10
    //   657: bipush #7
    //   659: if_icmpne -> 808
    //   662: ldc_w 'MakerNote'
    //   665: aload #14
    //   667: getfield b : Ljava/lang/String;
    //   670: invokevirtual equals : (Ljava/lang/Object;)Z
    //   673: ifeq -> 685
    //   676: aload_0
    //   677: iload #20
    //   679: putfield r0 : I
    //   682: goto -> 805
    //   685: iload #8
    //   687: bipush #6
    //   689: if_icmpne -> 805
    //   692: ldc_w 'ThumbnailImage'
    //   695: aload #14
    //   697: getfield b : Ljava/lang/String;
    //   700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   703: ifeq -> 805
    //   706: aload_0
    //   707: iload #20
    //   709: putfield s0 : I
    //   712: aload_0
    //   713: iload #11
    //   715: putfield t0 : I
    //   718: bipush #6
    //   720: aload_0
    //   721: getfield i0 : Ljava/nio/ByteOrder;
    //   724: invokestatic f : (ILjava/nio/ByteOrder;)Lb/l/a/a$c;
    //   727: astore #21
    //   729: aload_0
    //   730: getfield s0 : I
    //   733: i2l
    //   734: aload_0
    //   735: getfield i0 : Ljava/nio/ByteOrder;
    //   738: invokestatic b : (JLjava/nio/ByteOrder;)Lb/l/a/a$c;
    //   741: astore #22
    //   743: aload_0
    //   744: getfield t0 : I
    //   747: i2l
    //   748: aload_0
    //   749: getfield i0 : Ljava/nio/ByteOrder;
    //   752: invokestatic b : (JLjava/nio/ByteOrder;)Lb/l/a/a$c;
    //   755: astore #6
    //   757: aload_0
    //   758: getfield g0 : [Ljava/util/HashMap;
    //   761: iconst_4
    //   762: aaload
    //   763: ldc_w 'Compression'
    //   766: aload #21
    //   768: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   771: pop
    //   772: aload_0
    //   773: getfield g0 : [Ljava/util/HashMap;
    //   776: iconst_4
    //   777: aaload
    //   778: ldc_w 'JPEGInterchangeFormat'
    //   781: aload #22
    //   783: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   786: pop
    //   787: aload_0
    //   788: getfield g0 : [Ljava/util/HashMap;
    //   791: iconst_4
    //   792: aaload
    //   793: ldc_w 'JPEGInterchangeFormatLength'
    //   796: aload #6
    //   798: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   801: pop
    //   802: goto -> 835
    //   805: goto -> 835
    //   808: iload #10
    //   810: bipush #10
    //   812: if_icmpne -> 835
    //   815: ldc_w 'JpgFromRaw'
    //   818: aload #14
    //   820: getfield b : Ljava/lang/String;
    //   823: invokevirtual equals : (Ljava/lang/Object;)Z
    //   826: ifeq -> 835
    //   829: aload_0
    //   830: iload #20
    //   832: putfield u0 : I
    //   835: iload #20
    //   837: i2l
    //   838: lstore #16
    //   840: lload #16
    //   842: lload #18
    //   844: ladd
    //   845: aload_1
    //   846: getfield f : I
    //   849: i2l
    //   850: lcmp
    //   851: ifgt -> 863
    //   854: aload_1
    //   855: lload #16
    //   857: invokevirtual e : (J)V
    //   860: goto -> 914
    //   863: iload #4
    //   865: ifeq -> 905
    //   868: new java/lang/StringBuilder
    //   871: dup
    //   872: invokespecial <init> : ()V
    //   875: astore #6
    //   877: aload #6
    //   879: ldc_w 'Skip the tag entry since data offset is invalid: '
    //   882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   885: pop
    //   886: aload #6
    //   888: iload #20
    //   890: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   893: pop
    //   894: aload #5
    //   896: aload #6
    //   898: invokevirtual toString : ()Ljava/lang/String;
    //   901: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   904: pop
    //   905: aload_1
    //   906: lload #12
    //   908: invokevirtual e : (J)V
    //   911: goto -> 586
    //   914: getstatic b/l/a/a.V : Ljava/util/HashMap;
    //   917: iload #9
    //   919: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   922: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   925: checkcast java/lang/Integer
    //   928: astore #6
    //   930: iload #4
    //   932: ifeq -> 992
    //   935: new java/lang/StringBuilder
    //   938: dup
    //   939: invokespecial <init> : ()V
    //   942: astore #22
    //   944: aload #22
    //   946: ldc_w 'nextIfdType: '
    //   949: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: pop
    //   953: aload #22
    //   955: aload #6
    //   957: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   960: pop
    //   961: aload #22
    //   963: ldc_w ' byteCount: '
    //   966: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: pop
    //   970: aload #22
    //   972: lload #18
    //   974: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   977: pop
    //   978: aload #5
    //   980: aload #22
    //   982: invokevirtual toString : ()Ljava/lang/String;
    //   985: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   988: pop
    //   989: goto -> 992
    //   992: aload #6
    //   994: ifnull -> 1290
    //   997: ldc2_w -1
    //   1000: lstore #18
    //   1002: iload #15
    //   1004: iconst_3
    //   1005: if_icmpeq -> 1065
    //   1008: iload #15
    //   1010: iconst_4
    //   1011: if_icmpeq -> 1056
    //   1014: iload #15
    //   1016: bipush #8
    //   1018: if_icmpeq -> 1047
    //   1021: iload #15
    //   1023: bipush #9
    //   1025: if_icmpeq -> 1038
    //   1028: iload #15
    //   1030: bipush #13
    //   1032: if_icmpeq -> 1038
    //   1035: goto -> 1076
    //   1038: aload_1
    //   1039: invokevirtual readInt : ()I
    //   1042: istore #15
    //   1044: goto -> 1071
    //   1047: aload_1
    //   1048: invokevirtual readShort : ()S
    //   1051: istore #15
    //   1053: goto -> 1071
    //   1056: aload_1
    //   1057: invokevirtual d : ()J
    //   1060: lstore #18
    //   1062: goto -> 1076
    //   1065: aload_1
    //   1066: invokevirtual readUnsignedShort : ()I
    //   1069: istore #15
    //   1071: iload #15
    //   1073: i2l
    //   1074: lstore #18
    //   1076: iload #4
    //   1078: ifeq -> 1113
    //   1081: aload #5
    //   1083: ldc_w 'Offset: %d, tagName: %s'
    //   1086: iconst_2
    //   1087: anewarray java/lang/Object
    //   1090: dup
    //   1091: iconst_0
    //   1092: lload #18
    //   1094: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1097: aastore
    //   1098: dup
    //   1099: iconst_1
    //   1100: aload #14
    //   1102: getfield b : Ljava/lang/String;
    //   1105: aastore
    //   1106: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1109: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1112: pop
    //   1113: lload #18
    //   1115: lconst_0
    //   1116: lcmp
    //   1117: ifle -> 1239
    //   1120: lload #18
    //   1122: aload_1
    //   1123: getfield f : I
    //   1126: i2l
    //   1127: lcmp
    //   1128: ifge -> 1239
    //   1131: aload_0
    //   1132: getfield h0 : Ljava/util/Set;
    //   1135: lload #18
    //   1137: l2i
    //   1138: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1141: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1146: ifne -> 1168
    //   1149: aload_1
    //   1150: lload #18
    //   1152: invokevirtual e : (J)V
    //   1155: aload_0
    //   1156: aload_1
    //   1157: aload #6
    //   1159: invokevirtual intValue : ()I
    //   1162: invokespecial I : (Lb/l/a/a$b;I)V
    //   1165: goto -> 1281
    //   1168: iload #4
    //   1170: ifeq -> 1281
    //   1173: new java/lang/StringBuilder
    //   1176: dup
    //   1177: invokespecial <init> : ()V
    //   1180: astore #14
    //   1182: aload #14
    //   1184: ldc_w 'Skip jump into the IFD since it has already been read: IfdType '
    //   1187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1190: pop
    //   1191: aload #14
    //   1193: aload #6
    //   1195: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1198: pop
    //   1199: aload #14
    //   1201: ldc_w ' (at '
    //   1204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1207: pop
    //   1208: aload #14
    //   1210: lload #18
    //   1212: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1215: pop
    //   1216: aload #14
    //   1218: ldc_w ')'
    //   1221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1224: pop
    //   1225: aload #5
    //   1227: aload #14
    //   1229: invokevirtual toString : ()Ljava/lang/String;
    //   1232: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1235: pop
    //   1236: goto -> 1281
    //   1239: iload #4
    //   1241: ifeq -> 1281
    //   1244: new java/lang/StringBuilder
    //   1247: dup
    //   1248: invokespecial <init> : ()V
    //   1251: astore #6
    //   1253: aload #6
    //   1255: ldc_w 'Skip jump into the IFD since its offset is invalid: '
    //   1258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1261: pop
    //   1262: aload #6
    //   1264: lload #18
    //   1266: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1269: pop
    //   1270: aload #5
    //   1272: aload #6
    //   1274: invokevirtual toString : ()Ljava/lang/String;
    //   1277: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1280: pop
    //   1281: aload_1
    //   1282: lload #12
    //   1284: invokevirtual e : (J)V
    //   1287: goto -> 1470
    //   1290: aload_1
    //   1291: invokevirtual c : ()I
    //   1294: istore #10
    //   1296: aload_0
    //   1297: getfield q0 : I
    //   1300: istore #8
    //   1302: lload #18
    //   1304: l2i
    //   1305: newarray byte
    //   1307: astore #6
    //   1309: aload_1
    //   1310: aload #6
    //   1312: invokevirtual readFully : ([B)V
    //   1315: new b/l/a/a$c
    //   1318: dup
    //   1319: iload #15
    //   1321: iload #11
    //   1323: iload #10
    //   1325: iload #8
    //   1327: iadd
    //   1328: i2l
    //   1329: aload #6
    //   1331: invokespecial <init> : (IIJ[B)V
    //   1334: astore #6
    //   1336: aload_0
    //   1337: getfield g0 : [Ljava/util/HashMap;
    //   1340: iload_2
    //   1341: aaload
    //   1342: aload #14
    //   1344: getfield b : Ljava/lang/String;
    //   1347: aload #6
    //   1349: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1352: pop
    //   1353: ldc_w 'DNGVersion'
    //   1356: aload #14
    //   1358: getfield b : Ljava/lang/String;
    //   1361: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1364: ifeq -> 1372
    //   1367: aload_0
    //   1368: iconst_3
    //   1369: putfield e0 : I
    //   1372: ldc_w 'Make'
    //   1375: aload #14
    //   1377: getfield b : Ljava/lang/String;
    //   1380: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1383: ifne -> 1400
    //   1386: ldc_w 'Model'
    //   1389: aload #14
    //   1391: getfield b : Ljava/lang/String;
    //   1394: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1397: ifeq -> 1418
    //   1400: aload #6
    //   1402: aload_0
    //   1403: getfield i0 : Ljava/nio/ByteOrder;
    //   1406: invokevirtual j : (Ljava/nio/ByteOrder;)Ljava/lang/String;
    //   1409: ldc_w 'PENTAX'
    //   1412: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1415: ifne -> 1447
    //   1418: ldc_w 'Compression'
    //   1421: aload #14
    //   1423: getfield b : Ljava/lang/String;
    //   1426: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1429: ifeq -> 1453
    //   1432: aload #6
    //   1434: aload_0
    //   1435: getfield i0 : Ljava/nio/ByteOrder;
    //   1438: invokevirtual i : (Ljava/nio/ByteOrder;)I
    //   1441: ldc_w 65535
    //   1444: if_icmpne -> 1453
    //   1447: aload_0
    //   1448: bipush #8
    //   1450: putfield e0 : I
    //   1453: aload_1
    //   1454: invokevirtual c : ()I
    //   1457: i2l
    //   1458: lload #12
    //   1460: lcmp
    //   1461: ifeq -> 1470
    //   1464: aload_1
    //   1465: lload #12
    //   1467: invokevirtual e : (J)V
    //   1470: iload #7
    //   1472: iconst_1
    //   1473: iadd
    //   1474: i2s
    //   1475: istore #7
    //   1477: goto -> 112
    //   1480: aload_1
    //   1481: invokevirtual c : ()I
    //   1484: iconst_4
    //   1485: iadd
    //   1486: aload_1
    //   1487: getfield f : I
    //   1490: if_icmpgt -> 1691
    //   1493: aload_1
    //   1494: invokevirtual readInt : ()I
    //   1497: istore_2
    //   1498: getstatic b/l/a/a.a : Z
    //   1501: istore #4
    //   1503: iload #4
    //   1505: ifeq -> 1531
    //   1508: aload #5
    //   1510: ldc_w 'nextIfdOffset: %d'
    //   1513: iconst_1
    //   1514: anewarray java/lang/Object
    //   1517: dup
    //   1518: iconst_0
    //   1519: iload_2
    //   1520: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1523: aastore
    //   1524: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1527: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1530: pop
    //   1531: iload_2
    //   1532: i2l
    //   1533: lstore #18
    //   1535: lload #18
    //   1537: lconst_0
    //   1538: lcmp
    //   1539: ifle -> 1654
    //   1542: iload_2
    //   1543: aload_1
    //   1544: getfield f : I
    //   1547: if_icmpge -> 1654
    //   1550: aload_0
    //   1551: getfield h0 : Ljava/util/Set;
    //   1554: iload_2
    //   1555: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1558: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1563: ifne -> 1614
    //   1566: aload_1
    //   1567: lload #18
    //   1569: invokevirtual e : (J)V
    //   1572: aload_0
    //   1573: getfield g0 : [Ljava/util/HashMap;
    //   1576: iconst_4
    //   1577: aaload
    //   1578: invokevirtual isEmpty : ()Z
    //   1581: ifeq -> 1593
    //   1584: aload_0
    //   1585: aload_1
    //   1586: iconst_4
    //   1587: invokespecial I : (Lb/l/a/a$b;I)V
    //   1590: goto -> 1691
    //   1593: aload_0
    //   1594: getfield g0 : [Ljava/util/HashMap;
    //   1597: iconst_5
    //   1598: aaload
    //   1599: invokevirtual isEmpty : ()Z
    //   1602: ifeq -> 1691
    //   1605: aload_0
    //   1606: aload_1
    //   1607: iconst_5
    //   1608: invokespecial I : (Lb/l/a/a$b;I)V
    //   1611: goto -> 1691
    //   1614: iload #4
    //   1616: ifeq -> 1691
    //   1619: new java/lang/StringBuilder
    //   1622: dup
    //   1623: invokespecial <init> : ()V
    //   1626: astore_1
    //   1627: aload_1
    //   1628: ldc_w 'Stop reading file since re-reading an IFD may cause an infinite loop: '
    //   1631: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1634: pop
    //   1635: aload_1
    //   1636: iload_2
    //   1637: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1640: pop
    //   1641: aload #5
    //   1643: aload_1
    //   1644: invokevirtual toString : ()Ljava/lang/String;
    //   1647: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1650: pop
    //   1651: goto -> 1691
    //   1654: iload #4
    //   1656: ifeq -> 1691
    //   1659: new java/lang/StringBuilder
    //   1662: dup
    //   1663: invokespecial <init> : ()V
    //   1666: astore_1
    //   1667: aload_1
    //   1668: ldc_w 'Stop reading file since a wrong offset may cause an infinite loop: '
    //   1671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1674: pop
    //   1675: aload_1
    //   1676: iload_2
    //   1677: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1680: pop
    //   1681: aload #5
    //   1683: aload_1
    //   1684: invokevirtual toString : ()Ljava/lang/String;
    //   1687: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1690: pop
    //   1691: return
  }
  
  private void J(b paramb, int paramInt) {
    c c1 = this.g0[paramInt].get("ImageLength");
    c c2 = this.g0[paramInt].get("ImageWidth");
    if (c1 == null || c2 == null) {
      c2 = this.g0[paramInt].get("JPEGInterchangeFormat");
      if (c2 != null)
        h(paramb, c2.i(this.i0), paramInt); 
    } 
  }
  
  private void K(b paramb) {
    HashMap<String, c> hashMap = this.g0[4];
    c c = hashMap.get("Compression");
    if (c != null) {
      int i = c.i(this.i0);
      this.p0 = i;
      if (i != 1)
        if (i != 6) {
          if (i != 7)
            return; 
        } else {
          q(paramb, hashMap);
          return;
        }  
      if (A(hashMap))
        r(paramb, hashMap); 
    } else {
      this.p0 = 6;
      q(paramb, hashMap);
    } 
  }
  
  private static boolean L(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null)
      return false; 
    if (paramArrayOfbyte1.length < paramArrayOfbyte2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfbyte2.length; b++) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
    } 
    return true;
  }
  
  private void M(int paramInt1, int paramInt2) {
    if (this.g0[paramInt1].isEmpty() || this.g0[paramInt2].isEmpty()) {
      if (a)
        Log.d("ExifInterface", "Cannot perform swap since only one image data exists"); 
      return;
    } 
    c c1 = this.g0[paramInt1].get("ImageLength");
    c c2 = this.g0[paramInt1].get("ImageWidth");
    c c3 = this.g0[paramInt2].get("ImageLength");
    c c4 = this.g0[paramInt2].get("ImageWidth");
    if (c1 == null || c2 == null) {
      if (a)
        Log.d("ExifInterface", "First image does not contain valid size information"); 
      return;
    } 
    if (c3 == null || c4 == null) {
      if (a)
        Log.d("ExifInterface", "Second image does not contain valid size information"); 
      return;
    } 
    int i = c1.i(this.i0);
    int j = c2.i(this.i0);
    int k = c3.i(this.i0);
    int m = c4.i(this.i0);
    if (i < k && j < m) {
      HashMap<String, c>[] arrayOfHashMap = this.g0;
      HashMap<String, c> hashMap = arrayOfHashMap[paramInt1];
      arrayOfHashMap[paramInt1] = arrayOfHashMap[paramInt2];
      arrayOfHashMap[paramInt2] = hashMap;
    } 
  }
  
  private void N(b paramb, int paramInt) {
    c c1 = this.g0[paramInt].get("DefaultCropSize");
    c c2 = this.g0[paramInt].get("SensorTopBorder");
    c c3 = this.g0[paramInt].get("SensorLeftBorder");
    c c4 = this.g0[paramInt].get("SensorBottomBorder");
    c c5 = this.g0[paramInt].get("SensorRightBorder");
    if (c1 != null) {
      c c;
      if (c1.a == 5) {
        e[] arrayOfE = (e[])c1.k(this.i0);
        if (arrayOfE == null || arrayOfE.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString((Object[])arrayOfE));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        c = c.d(arrayOfE[0], this.i0);
        c4 = c.d(arrayOfE[1], this.i0);
      } else {
        int[] arrayOfInt = (int[])c1.k(this.i0);
        if (arrayOfInt == null || arrayOfInt.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString(arrayOfInt));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        c = c.f(arrayOfInt[0], this.i0);
        c4 = c.f(arrayOfInt[1], this.i0);
      } 
      this.g0[paramInt].put("ImageWidth", c);
      this.g0[paramInt].put("ImageLength", c4);
    } else {
      c c;
      if (c2 != null && c3 != null && c4 != null && c5 != null) {
        int i = c2.i(this.i0);
        int j = c4.i(this.i0);
        int k = c5.i(this.i0);
        int m = c3.i(this.i0);
        if (j > i && k > m) {
          c = c.f(j - i, this.i0);
          c4 = c.f(k - m, this.i0);
          this.g0[paramInt].put("ImageLength", c);
          this.g0[paramInt].put("ImageWidth", c4);
        } 
      } else {
        J((b)c, paramInt);
      } 
    } 
  }
  
  private void O() {
    M(0, 5);
    M(0, 4);
    M(5, 4);
    c c1 = this.g0[1].get("PixelXDimension");
    c c2 = this.g0[1].get("PixelYDimension");
    if (c1 != null && c2 != null) {
      this.g0[0].put("ImageWidth", c1);
      this.g0[0].put("ImageLength", c2);
    } 
    if (this.g0[4].isEmpty() && B(this.g0[5])) {
      HashMap<String, c>[] arrayOfHashMap = this.g0;
      arrayOfHashMap[4] = arrayOfHashMap[5];
      arrayOfHashMap[5] = new HashMap<String, c>();
    } 
    if (!B(this.g0[4]))
      Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image."); 
  }
  
  private void a() {
    String str = d("DateTimeOriginal");
    if (str != null && d("DateTime") == null)
      this.g0[0].put("DateTime", c.a(str)); 
    if (d("ImageWidth") == null)
      this.g0[0].put("ImageWidth", c.b(0L, this.i0)); 
    if (d("ImageLength") == null)
      this.g0[0].put("ImageLength", c.b(0L, this.i0)); 
    if (d("Orientation") == null)
      this.g0[0].put("Orientation", c.b(0L, this.i0)); 
    if (d("LightSource") == null)
      this.g0[1].put("LightSource", c.b(0L, this.i0)); 
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      stringBuilder.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfbyte[b]) }));
    } 
    return stringBuilder.toString();
  }
  
  private static long[] c(Object paramObject) {
    if (paramObject instanceof int[]) {
      paramObject = paramObject;
      long[] arrayOfLong = new long[paramObject.length];
      for (byte b = 0; b < paramObject.length; b++)
        arrayOfLong[b] = paramObject[b]; 
      return arrayOfLong;
    } 
    return (paramObject instanceof long[]) ? (long[])paramObject : null;
  }
  
  private c f(String paramString) {
    if (paramString != null) {
      String str = paramString;
      if ("ISOSpeedRatings".equals(paramString)) {
        if (a)
          Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."); 
        str = "PhotographicSensitivity";
      } 
      for (byte b = 0; b < O.length; b++) {
        c c = this.g0[b].get(str);
        if (c != null)
          return c; 
      } 
      return null;
    } 
    NullPointerException nullPointerException = new NullPointerException("tag shouldn't be null");
    throw nullPointerException;
  }
  
  private void g(b paramb) {
    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        a a1 = new a();
        this(this, paramb);
        mediaMetadataRetriever.setDataSource(a1);
      } else {
        FileDescriptor fileDescriptor = this.c0;
        if (fileDescriptor != null) {
          mediaMetadataRetriever.setDataSource(fileDescriptor);
        } else {
          String str = this.b0;
          if (str != null) {
            mediaMetadataRetriever.setDataSource(str);
          } else {
            return;
          } 
        } 
      } 
      String str2 = mediaMetadataRetriever.extractMetadata(33);
      String str3 = mediaMetadataRetriever.extractMetadata(34);
      String str4 = mediaMetadataRetriever.extractMetadata(26);
      String str1 = mediaMetadataRetriever.extractMetadata(17);
      boolean bool = "yes".equals(str4);
      String str5 = null;
      if (bool) {
        str5 = mediaMetadataRetriever.extractMetadata(29);
        str1 = mediaMetadataRetriever.extractMetadata(30);
        str4 = mediaMetadataRetriever.extractMetadata(31);
      } else if ("yes".equals(str1)) {
        str5 = mediaMetadataRetriever.extractMetadata(18);
        str1 = mediaMetadataRetriever.extractMetadata(19);
        str4 = mediaMetadataRetriever.extractMetadata(24);
      } else {
        str1 = null;
        str4 = str1;
      } 
      if (str5 != null)
        this.g0[0].put("ImageWidth", c.f(Integer.parseInt(str5), this.i0)); 
      if (str1 != null)
        this.g0[0].put("ImageLength", c.f(Integer.parseInt(str1), this.i0)); 
      if (str4 != null) {
        byte b1 = 1;
        int i = Integer.parseInt(str4);
        if (i != 90) {
          if (i != 180) {
            if (i == 270)
              b1 = 8; 
          } else {
            b1 = 3;
          } 
        } else {
          b1 = 6;
        } 
        this.g0[0].put("Orientation", c.f(b1, this.i0));
      } 
      if (str2 != null && str3 != null) {
        int i = Integer.parseInt(str2);
        int j = Integer.parseInt(str3);
        if (j > 6) {
          paramb.e(i);
          byte[] arrayOfByte = new byte[6];
          if (paramb.read(arrayOfByte) == 6) {
            j -= 6;
            if (Arrays.equals(arrayOfByte, X)) {
              arrayOfByte = new byte[j];
              if (paramb.read(arrayOfByte) == j) {
                this.q0 = i + 6;
                H(arrayOfByte, 0);
              } else {
                IOException iOException = new IOException();
                this("Can't read exif");
                throw iOException;
              } 
            } else {
              IOException iOException = new IOException();
              this("Invalid identifier");
              throw iOException;
            } 
          } else {
            IOException iOException = new IOException();
            this("Can't read identifier");
            throw iOException;
          } 
        } else {
          IOException iOException = new IOException();
          this("Invalid exif length");
          throw iOException;
        } 
      } 
      if (a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Heif meta: ");
        stringBuilder.append(str5);
        stringBuilder.append("x");
        stringBuilder.append(str1);
        stringBuilder.append(", rotation ");
        stringBuilder.append(str4);
        Log.d("ExifInterface", stringBuilder.toString());
      } 
      return;
    } finally {
      mediaMetadataRetriever.release();
    } 
  }
  
  private void h(b paramb, int paramInt1, int paramInt2) {
    if (a) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("getJpegAttributes starting with: ");
      stringBuilder1.append(paramb);
      Log.d("ExifInterface", stringBuilder1.toString());
    } 
    paramb.g(ByteOrder.BIG_ENDIAN);
    paramb.e(paramInt1);
    int i = paramb.readByte();
    if (i == -1) {
      if (paramb.readByte() == -40) {
        paramInt1 = paramInt1 + 1 + 1;
        while (true) {
          i = paramb.readByte();
          if (i == -1) {
            byte b1 = paramb.readByte();
            boolean bool = a;
            if (bool) {
              StringBuilder stringBuilder3 = new StringBuilder();
              stringBuilder3.append("Found JPEG segment indicator: ");
              stringBuilder3.append(Integer.toHexString(b1 & 0xFF));
              Log.d("ExifInterface", stringBuilder3.toString());
            } 
            if (b1 != -39) {
              if (b1 == -38)
                continue; 
              int j = paramb.readUnsignedShort() - 2;
              i = paramInt1 + 1 + 1 + 2;
              if (bool) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("JPEG segment: ");
                stringBuilder3.append(Integer.toHexString(b1 & 0xFF));
                stringBuilder3.append(" (length: ");
                stringBuilder3.append(j + 2);
                stringBuilder3.append(")");
                Log.d("ExifInterface", stringBuilder3.toString());
              } 
              if (j >= 0) {
                int k;
                if (b1 != -31) {
                  if (b1 != -2) {
                    switch (b1) {
                      default:
                        switch (b1) {
                          default:
                            switch (b1) {
                              default:
                                switch (b1) {
                                  default:
                                    paramInt1 = j;
                                    k = paramInt1;
                                    paramInt1 = i;
                                    break;
                                  case -51:
                                  case -50:
                                  case -49:
                                    break;
                                } 
                                break;
                              case -55:
                              case -54:
                              case -53:
                                break;
                            } 
                            break;
                          case -59:
                          case -58:
                          case -57:
                            break;
                        } 
                      case -64:
                      case -63:
                      case -62:
                      case -61:
                        if (paramb.skipBytes(1) == 1) {
                          this.g0[paramInt2].put("ImageLength", c.b(paramb.readUnsignedShort(), this.i0));
                          this.g0[paramInt2].put("ImageWidth", c.b(paramb.readUnsignedShort(), this.i0));
                          paramInt1 = j - 5;
                        } else {
                          throw new IOException("Invalid SOFx");
                        } 
                        k = paramInt1;
                        paramInt1 = i;
                        break;
                    } 
                  } else {
                    byte[] arrayOfByte = new byte[j];
                    if (paramb.read(arrayOfByte) == j) {
                      if (d("UserComment") == null)
                        this.g0[1].put("UserComment", c.a(new String(arrayOfByte, W))); 
                      paramInt1 = i;
                    } else {
                      throw new IOException("Invalid exif");
                    } 
                    b1 = 0;
                  } 
                } else {
                  byte[] arrayOfByte1 = new byte[j];
                  paramb.readFully(arrayOfByte1);
                  k = i + j;
                  byte[] arrayOfByte2 = X;
                  if (L(arrayOfByte1, arrayOfByte2)) {
                    paramInt1 = arrayOfByte2.length;
                    arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, j);
                    this.q0 = i + paramInt1;
                    H(arrayOfByte1, paramInt2);
                    paramInt1 = k;
                  } else {
                    arrayOfByte2 = Y;
                    paramInt1 = k;
                    if (L(arrayOfByte1, arrayOfByte2)) {
                      int m = arrayOfByte2.length;
                      arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, j);
                      paramInt1 = k;
                      if (d("Xmp") == null) {
                        this.g0[0].put("Xmp", new c(1, arrayOfByte1.length, (i + m), arrayOfByte1));
                        this.w0 = true;
                        paramInt1 = k;
                      } 
                    } 
                  } 
                  k = 0;
                } 
                if (k >= 0) {
                  if (paramb.skipBytes(k) == k) {
                    paramInt1 += k;
                    continue;
                  } 
                  throw new IOException("Invalid JPEG segment");
                } 
                throw new IOException("Invalid length");
              } 
              throw new IOException("Invalid length");
            } 
            paramb.g(this.i0);
            return;
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Invalid marker:");
          stringBuilder2.append(Integer.toHexString(i & 0xFF));
          throw new IOException(stringBuilder2.toString());
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid marker: ");
      stringBuilder1.append(Integer.toHexString(i & 0xFF));
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid marker: ");
    stringBuilder.append(Integer.toHexString(i & 0xFF));
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
  
  private int i(BufferedInputStream paramBufferedInputStream) {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte[5000];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    return u(arrayOfByte) ? 4 : (x(arrayOfByte) ? 9 : (t(arrayOfByte) ? 12 : (v(arrayOfByte) ? 7 : (y(arrayOfByte) ? 10 : (w(arrayOfByte) ? 13 : (C(arrayOfByte) ? 14 : 0))))));
  }
  
  private void j(b paramb) {
    m(paramb);
    c c = this.g0[1].get("MakerNote");
    if (c != null) {
      b b1 = new b(c.d);
      b1.g(this.i0);
      byte[] arrayOfByte2 = k;
      byte[] arrayOfByte3 = new byte[arrayOfByte2.length];
      b1.readFully(arrayOfByte3);
      b1.e(0L);
      byte[] arrayOfByte1 = l;
      byte[] arrayOfByte4 = new byte[arrayOfByte1.length];
      b1.readFully(arrayOfByte4);
      if (Arrays.equals(arrayOfByte3, arrayOfByte2)) {
        b1.e(8L);
      } else if (Arrays.equals(arrayOfByte4, arrayOfByte1)) {
        b1.e(12L);
      } 
      I(b1, 6);
      c c2 = this.g0[7].get("PreviewImageStart");
      c c1 = this.g0[7].get("PreviewImageLength");
      if (c2 != null && c1 != null) {
        this.g0[5].put("JPEGInterchangeFormat", c2);
        this.g0[5].put("JPEGInterchangeFormatLength", c1);
      } 
      c1 = this.g0[8].get("AspectFrame");
      if (c1 != null) {
        int[] arrayOfInt = (int[])c1.k(this.i0);
        if (arrayOfInt == null || arrayOfInt.length != 4) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid aspect frame values. frame=");
          stringBuilder.append(Arrays.toString(arrayOfInt));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        if (arrayOfInt[2] > arrayOfInt[0] && arrayOfInt[3] > arrayOfInt[1]) {
          int i = arrayOfInt[2] - arrayOfInt[0] + 1;
          int j = arrayOfInt[3] - arrayOfInt[1] + 1;
          int k = i;
          int m = j;
          if (i < j) {
            k = i + j;
            m = k - j;
            k -= m;
          } 
          c c3 = c.f(k, this.i0);
          c2 = c.f(m, this.i0);
          this.g0[0].put("ImageWidth", c3);
          this.g0[0].put("ImageLength", c2);
        } 
      } 
    } 
  }
  
  private void k(b paramb) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getPngAttributes starting with: ");
      stringBuilder.append(paramb);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    paramb.g(ByteOrder.BIG_ENDIAN);
    byte[] arrayOfByte = m;
    paramb.skipBytes(arrayOfByte.length);
    int i = arrayOfByte.length + 0;
    try {
      while (true) {
        int j = paramb.readInt();
        arrayOfByte = new byte[4];
        if (paramb.read(arrayOfByte) == 4) {
          i = i + 4 + 4;
          if (i != 16 || Arrays.equals(arrayOfByte, o)) {
            if (!Arrays.equals(arrayOfByte, p)) {
              IOException iOException2;
              if (Arrays.equals(arrayOfByte, n)) {
                IOException iOException3;
                byte[] arrayOfByte1 = new byte[j];
                if (paramb.read(arrayOfByte1) == j) {
                  j = paramb.readInt();
                  CRC32 cRC32 = new CRC32();
                  this();
                  cRC32.update(arrayOfByte);
                  cRC32.update(arrayOfByte1);
                  if ((int)cRC32.getValue() == j) {
                    this.q0 = i;
                    H(arrayOfByte1, 0);
                    O();
                    return;
                  } 
                  iOException3 = new IOException();
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                  stringBuilder1.append(j);
                  stringBuilder1.append(", calculated CRC value: ");
                  stringBuilder1.append(cRC32.getValue());
                  this(stringBuilder1.toString());
                  throw iOException3;
                } 
                iOException2 = new IOException();
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("Failed to read given length for given PNG chunk type: ");
                stringBuilder.append(b((byte[])iOException3));
                this(stringBuilder.toString());
                throw iOException2;
              } 
              j += 4;
              iOException2.skipBytes(j);
              i += j;
              continue;
            } 
            return;
          } 
          IOException iOException1 = new IOException();
          this("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
          throw iOException1;
        } 
        IOException iOException = new IOException();
        this("Encountered invalid length while parsing PNG chunktype");
        throw iOException;
      } 
    } catch (EOFException eOFException) {
      IOException iOException = new IOException("Encountered corrupt PNG file.");
      throw iOException;
    } 
  }
  
  private void l(b paramb) {
    paramb.skipBytes(84);
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[4];
    paramb.read(arrayOfByte1);
    paramb.skipBytes(4);
    paramb.read(arrayOfByte2);
    int i = ByteBuffer.wrap(arrayOfByte1).getInt();
    int j = ByteBuffer.wrap(arrayOfByte2).getInt();
    h(paramb, i, 5);
    paramb.e(j);
    paramb.g(ByteOrder.BIG_ENDIAN);
    j = paramb.readInt();
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("numberOfDirectoryEntry: ");
      stringBuilder.append(j);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    for (i = 0; i < j; i++) {
      StringBuilder stringBuilder;
      int k = paramb.readUnsignedShort();
      int m = paramb.readUnsignedShort();
      if (k == J.a) {
        j = paramb.readShort();
        i = paramb.readShort();
        c c2 = c.f(j, this.i0);
        c c1 = c.f(i, this.i0);
        this.g0[0].put("ImageLength", c2);
        this.g0[0].put("ImageWidth", c1);
        if (a) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Updated to length: ");
          stringBuilder.append(j);
          stringBuilder.append(", width: ");
          stringBuilder.append(i);
          Log.d("ExifInterface", stringBuilder.toString());
        } 
        return;
      } 
      stringBuilder.skipBytes(m);
    } 
  }
  
  private void m(b paramb) {
    E(paramb, paramb.available());
    I(paramb, 0);
    N(paramb, 0);
    N(paramb, 5);
    N(paramb, 4);
    O();
    if (this.e0 == 8) {
      c c = this.g0[1].get("MakerNote");
      if (c != null) {
        b b1 = new b(c.d);
        b1.g(this.i0);
        b1.e(6L);
        I(b1, 9);
        c c1 = this.g0[9].get("ColorSpace");
        if (c1 != null)
          this.g0[1].put("ColorSpace", c1); 
      } 
    } 
  }
  
  private void n(b paramb) {
    m(paramb);
    if ((c)this.g0[0].get("JpgFromRaw") != null)
      h(paramb, this.u0, 5); 
    c c1 = this.g0[0].get("ISO");
    c c2 = this.g0[1].get("PhotographicSensitivity");
    if (c1 != null && c2 == null)
      this.g0[1].put("PhotographicSensitivity", c1); 
  }
  
  private void o(b paramb) {
    byte[] arrayOfByte1 = X;
    paramb.skipBytes(arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[paramb.available()];
    paramb.readFully(arrayOfByte2);
    this.q0 = arrayOfByte1.length;
    H(arrayOfByte2, 0);
  }
  
  private void p(b paramb) {
    if (a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getWebpAttributes starting with: ");
      stringBuilder.append(paramb);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    paramb.g(ByteOrder.LITTLE_ENDIAN);
    paramb.skipBytes(q.length);
    int i = paramb.readInt() + 8;
    int j = paramb.skipBytes(r.length) + 8;
    try {
      while (true) {
        byte[] arrayOfByte = new byte[4];
        if (paramb.read(arrayOfByte) == 4) {
          IOException iOException1;
          int k = paramb.readInt();
          int m = j + 4 + 4;
          if (Arrays.equals(s, arrayOfByte)) {
            byte[] arrayOfByte1 = new byte[k];
            if (paramb.read(arrayOfByte1) == k) {
              this.q0 = m;
              H(arrayOfByte1, 0);
              this.q0 = m;
            } else {
              iOException1 = new IOException();
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("Failed to read given length for given PNG chunk type: ");
              stringBuilder.append(b(arrayOfByte));
              this(stringBuilder.toString());
              throw iOException1;
            } 
          } else {
            j = k;
            if (k % 2 == 1)
              j = k + 1; 
            k = m + j;
            if (k != i) {
              if (k <= i) {
                k = iOException1.skipBytes(j);
                if (k == j) {
                  j = m + k;
                  continue;
                } 
                iOException1 = new IOException();
                this("Encountered WebP file with invalid chunk size");
                throw iOException1;
              } 
              iOException1 = new IOException();
              this("Encountered WebP file with invalid chunk size");
              throw iOException1;
            } 
          } 
          return;
        } 
        IOException iOException = new IOException();
        this("Encountered invalid length while parsing WebP chunktype");
        throw iOException;
      } 
    } catch (EOFException eOFException) {
      IOException iOException = new IOException("Encountered corrupt WebP file.");
      throw iOException;
    } 
  }
  
  private void q(b paramb, HashMap paramHashMap) {
    c c2 = (c)paramHashMap.get("JPEGInterchangeFormat");
    c c1 = (c)paramHashMap.get("JPEGInterchangeFormatLength");
    if (c2 != null && c1 != null) {
      int i = c2.i(this.i0);
      int j = c1.i(this.i0);
      int k = i;
      if (this.e0 == 7)
        k = i + this.r0; 
      i = Math.min(j, paramb.b() - k);
      if (k > 0 && i > 0) {
        this.j0 = true;
        j = this.q0 + k;
        this.m0 = j;
        this.n0 = i;
        if (this.b0 == null && this.d0 == null && this.c0 == null) {
          byte[] arrayOfByte = new byte[i];
          paramb.e(j);
          paramb.readFully(arrayOfByte);
          this.o0 = arrayOfByte;
        } 
      } 
      if (a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Setting thumbnail attributes with offset: ");
        stringBuilder.append(k);
        stringBuilder.append(", length: ");
        stringBuilder.append(i);
        Log.d("ExifInterface", stringBuilder.toString());
      } 
    } 
  }
  
  private void r(b paramb, HashMap paramHashMap) {
    c c1 = (c)paramHashMap.get("StripOffsets");
    c c2 = (c)paramHashMap.get("StripByteCounts");
    if (c1 != null && c2 != null) {
      long[] arrayOfLong1 = c(c1.k(this.i0));
      long[] arrayOfLong2 = c(c2.k(this.i0));
      if (arrayOfLong1 == null || arrayOfLong1.length == 0) {
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        return;
      } 
      if (arrayOfLong2 == null || arrayOfLong2.length == 0) {
        Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        return;
      } 
      if (arrayOfLong1.length != arrayOfLong2.length) {
        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        return;
      } 
      long l = 0L;
      int i = arrayOfLong2.length;
      int j;
      for (j = 0; j < i; j++)
        l += arrayOfLong2[j]; 
      int k = (int)l;
      byte[] arrayOfByte = new byte[k];
      this.l0 = true;
      this.k0 = true;
      this.j0 = true;
      i = 0;
      int m = 0;
      j = 0;
      while (i < arrayOfLong1.length) {
        int n = (int)arrayOfLong1[i];
        int i1 = (int)arrayOfLong2[i];
        if (i < arrayOfLong1.length - 1 && (n + i1) != arrayOfLong1[i + 1])
          this.l0 = false; 
        n -= m;
        if (n < 0)
          Log.d("ExifInterface", "Invalid strip offset value"); 
        paramb.e(n);
        byte[] arrayOfByte1 = new byte[i1];
        paramb.read(arrayOfByte1);
        m = m + n + i1;
        System.arraycopy(arrayOfByte1, 0, arrayOfByte, j, i1);
        j += i1;
        i++;
      } 
      this.o0 = arrayOfByte;
      if (this.l0) {
        this.m0 = (int)arrayOfLong1[0] + this.q0;
        this.n0 = k;
      } 
    } 
  }
  
  private static boolean s(BufferedInputStream paramBufferedInputStream) {
    byte[] arrayOfByte = X;
    paramBufferedInputStream.mark(arrayOfByte.length);
    arrayOfByte = new byte[arrayOfByte.length];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    byte b = 0;
    while (true) {
      byte[] arrayOfByte1 = X;
      if (b < arrayOfByte1.length) {
        if (arrayOfByte[b] != arrayOfByte1[b])
          return false; 
        b++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean t(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_3
    //   5: astore #4
    //   7: new b/l/a/a$b
    //   10: astore #5
    //   12: aload_3
    //   13: astore #4
    //   15: aload #5
    //   17: aload_1
    //   18: invokespecial <init> : ([B)V
    //   21: aload #5
    //   23: invokevirtual readInt : ()I
    //   26: i2l
    //   27: lstore #6
    //   29: iconst_4
    //   30: newarray byte
    //   32: astore #4
    //   34: aload #5
    //   36: aload #4
    //   38: invokevirtual read : ([B)I
    //   41: pop
    //   42: aload #4
    //   44: getstatic b/l/a/a.h : [B
    //   47: invokestatic equals : ([B[B)Z
    //   50: istore #8
    //   52: iload #8
    //   54: ifne -> 64
    //   57: aload #5
    //   59: invokevirtual close : ()V
    //   62: iconst_0
    //   63: ireturn
    //   64: ldc2_w 16
    //   67: lstore #9
    //   69: lload #6
    //   71: lconst_1
    //   72: lcmp
    //   73: ifne -> 103
    //   76: aload #5
    //   78: invokevirtual readLong : ()J
    //   81: lstore #11
    //   83: lload #11
    //   85: lstore #6
    //   87: lload #11
    //   89: ldc2_w 16
    //   92: lcmp
    //   93: ifge -> 108
    //   96: aload #5
    //   98: invokevirtual close : ()V
    //   101: iconst_0
    //   102: ireturn
    //   103: ldc2_w 8
    //   106: lstore #9
    //   108: lload #6
    //   110: lstore #11
    //   112: lload #6
    //   114: aload_1
    //   115: arraylength
    //   116: i2l
    //   117: lcmp
    //   118: ifle -> 130
    //   121: aload_1
    //   122: arraylength
    //   123: istore #13
    //   125: iload #13
    //   127: i2l
    //   128: lstore #11
    //   130: lload #11
    //   132: lload #9
    //   134: lsub
    //   135: lstore #9
    //   137: lload #9
    //   139: ldc2_w 8
    //   142: lcmp
    //   143: ifge -> 153
    //   146: aload #5
    //   148: invokevirtual close : ()V
    //   151: iconst_0
    //   152: ireturn
    //   153: iconst_4
    //   154: newarray byte
    //   156: astore_1
    //   157: lconst_0
    //   158: lstore #6
    //   160: iconst_0
    //   161: istore #14
    //   163: iconst_0
    //   164: istore #13
    //   166: lload #6
    //   168: lload #9
    //   170: ldc2_w 4
    //   173: ldiv
    //   174: lcmp
    //   175: ifge -> 300
    //   178: aload #5
    //   180: aload_1
    //   181: invokevirtual read : ([B)I
    //   184: istore #15
    //   186: iload #15
    //   188: iconst_4
    //   189: if_icmpeq -> 199
    //   192: aload #5
    //   194: invokevirtual close : ()V
    //   197: iconst_0
    //   198: ireturn
    //   199: lload #6
    //   201: lconst_1
    //   202: lcmp
    //   203: ifne -> 213
    //   206: iload #13
    //   208: istore #16
    //   210: goto -> 287
    //   213: aload_1
    //   214: getstatic b/l/a/a.i : [B
    //   217: invokestatic equals : ([B[B)Z
    //   220: ifeq -> 229
    //   223: iconst_1
    //   224: istore #15
    //   226: goto -> 254
    //   229: aload_1
    //   230: getstatic b/l/a/a.j : [B
    //   233: invokestatic equals : ([B[B)Z
    //   236: istore #8
    //   238: iload #14
    //   240: istore #15
    //   242: iload #8
    //   244: ifeq -> 254
    //   247: iconst_1
    //   248: istore #13
    //   250: iload #14
    //   252: istore #15
    //   254: iload #15
    //   256: istore #14
    //   258: iload #13
    //   260: istore #16
    //   262: iload #15
    //   264: ifeq -> 287
    //   267: iload #15
    //   269: istore #14
    //   271: iload #13
    //   273: istore #16
    //   275: iload #13
    //   277: ifeq -> 287
    //   280: aload #5
    //   282: invokevirtual close : ()V
    //   285: iconst_1
    //   286: ireturn
    //   287: lload #6
    //   289: lconst_1
    //   290: ladd
    //   291: lstore #6
    //   293: iload #16
    //   295: istore #13
    //   297: goto -> 166
    //   300: aload #5
    //   302: invokevirtual close : ()V
    //   305: goto -> 367
    //   308: astore_1
    //   309: aload #5
    //   311: astore #4
    //   313: goto -> 369
    //   316: astore #4
    //   318: aload #5
    //   320: astore_1
    //   321: aload #4
    //   323: astore #5
    //   325: goto -> 336
    //   328: astore_1
    //   329: goto -> 369
    //   332: astore #5
    //   334: aload_2
    //   335: astore_1
    //   336: aload_1
    //   337: astore #4
    //   339: getstatic b/l/a/a.a : Z
    //   342: ifeq -> 359
    //   345: aload_1
    //   346: astore #4
    //   348: ldc 'ExifInterface'
    //   350: ldc_w 'Exception parsing HEIF file type box.'
    //   353: aload #5
    //   355: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   358: pop
    //   359: aload_1
    //   360: ifnull -> 367
    //   363: aload_1
    //   364: invokevirtual close : ()V
    //   367: iconst_0
    //   368: ireturn
    //   369: aload #4
    //   371: ifnull -> 379
    //   374: aload #4
    //   376: invokevirtual close : ()V
    //   379: goto -> 384
    //   382: aload_1
    //   383: athrow
    //   384: goto -> 382
    // Exception table:
    //   from	to	target	type
    //   7	12	332	java/lang/Exception
    //   7	12	328	finally
    //   15	21	332	java/lang/Exception
    //   15	21	328	finally
    //   21	52	316	java/lang/Exception
    //   21	52	308	finally
    //   76	83	316	java/lang/Exception
    //   76	83	308	finally
    //   112	125	316	java/lang/Exception
    //   112	125	308	finally
    //   153	157	316	java/lang/Exception
    //   153	157	308	finally
    //   166	186	316	java/lang/Exception
    //   166	186	308	finally
    //   213	223	316	java/lang/Exception
    //   213	223	308	finally
    //   229	238	316	java/lang/Exception
    //   229	238	308	finally
    //   339	345	328	finally
    //   348	359	328	finally
  }
  
  private static boolean u(byte[] paramArrayOfbyte) {
    byte b = 0;
    while (true) {
      byte[] arrayOfByte = g;
      if (b < arrayOfByte.length) {
        if (paramArrayOfbyte[b] != arrayOfByte[b])
          return false; 
        b++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean v(byte[] paramArrayOfbyte) {
    boolean bool = false;
    Exception exception = null;
    InputStream inputStream = null;
    try {
      b b = new b();
    } catch (Exception exception1) {
    
    } finally {
      InputStream inputStream1 = inputStream;
      if (inputStream1 != null)
        inputStream1.close(); 
    } 
    if (paramArrayOfbyte != null)
      paramArrayOfbyte.close(); 
    return false;
  }
  
  private boolean w(byte[] paramArrayOfbyte) {
    byte b = 0;
    while (true) {
      byte[] arrayOfByte = m;
      if (b < arrayOfByte.length) {
        if (paramArrayOfbyte[b] != arrayOfByte[b])
          return false; 
        b++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean x(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    for (byte b = 0; b < arrayOfByte.length; b++) {
      if (paramArrayOfbyte[b] != arrayOfByte[b])
        return false; 
    } 
    return true;
  }
  
  private boolean y(byte[] paramArrayOfbyte) {
    boolean bool = false;
    Exception exception = null;
    InputStream inputStream = null;
    try {
      b b = new b();
    } catch (Exception exception1) {
    
    } finally {
      InputStream inputStream1 = inputStream;
      if (inputStream1 != null)
        inputStream1.close(); 
    } 
    if (paramArrayOfbyte != null)
      paramArrayOfbyte.close(); 
    return false;
  }
  
  private static boolean z(FileDescriptor paramFileDescriptor) {
    if (Build.VERSION.SDK_INT >= 21)
      try {
        Os.lseek(paramFileDescriptor, 0L, OsConstants.SEEK_CUR);
        return true;
      } catch (Exception exception) {
        if (a)
          Log.d("ExifInterface", "The file descriptor for the given input is not seekable"); 
      }  
    return false;
  }
  
  public String d(String paramString) {
    if (paramString != null) {
      c c = f(paramString);
      if (c != null) {
        e[] arrayOfE;
        if (!U.contains(paramString))
          return c.j(this.i0); 
        if (paramString.equals("GPSTimeStamp")) {
          int i = c.a;
          if (i != 5 && i != 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GPS Timestamp format is not rational. format=");
            stringBuilder.append(c.a);
            Log.w("ExifInterface", stringBuilder.toString());
            return null;
          } 
          arrayOfE = (e[])c.k(this.i0);
          if (arrayOfE == null || arrayOfE.length != 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid GPS Timestamp array. array=");
            stringBuilder.append(Arrays.toString((Object[])arrayOfE));
            Log.w("ExifInterface", stringBuilder.toString());
            return null;
          } 
          return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf((int)((float)(arrayOfE[0]).a / (float)(arrayOfE[0]).b)), Integer.valueOf((int)((float)(arrayOfE[1]).a / (float)(arrayOfE[1]).b)), Integer.valueOf((int)((float)(arrayOfE[2]).a / (float)(arrayOfE[2]).b)) });
        } 
        try {
          return Double.toString(arrayOfE.h(this.i0));
        } catch (NumberFormatException numberFormatException) {}
      } 
      return null;
    } 
    throw new NullPointerException("tag shouldn't be null");
  }
  
  public int e(String paramString, int paramInt) {
    if (paramString != null) {
      c c = f(paramString);
      if (c == null)
        return paramInt; 
      try {
        return c.i(this.i0);
      } catch (NumberFormatException numberFormatException) {
        return paramInt;
      } 
    } 
    throw new NullPointerException("tag shouldn't be null");
  }
  
  static {
    Integer integer1 = Integer.valueOf(3);
  }
  
  static {
    Integer integer2 = Integer.valueOf(1);
    Integer integer3 = Integer.valueOf(2);
    Integer integer4 = Integer.valueOf(8);
    b = Arrays.asList(new Integer[] { integer2, Integer.valueOf(6), integer1, integer4 });
    Integer integer5 = Integer.valueOf(7);
    Integer integer6 = Integer.valueOf(5);
    c = Arrays.asList(new Integer[] { integer3, integer5, Integer.valueOf(4), integer6 });
  }
  
  class a extends MediaDataSource {
    long b;
    
    a(a this$0, a.b param1b) {}
    
    public void close() {}
    
    public long getSize() {
      return -1L;
    }
    
    public int readAt(long param1Long, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (param1Int2 == 0)
        return 0; 
      if (param1Long < 0L)
        return -1; 
      try {
        long l = this.b;
        if (l != param1Long) {
          if (l >= 0L && param1Long >= l + this.c.available())
            return -1; 
          this.c.e(param1Long);
          this.b = param1Long;
        } 
        int i = param1Int2;
        if (param1Int2 > this.c.available())
          i = this.c.available(); 
        param1Int1 = this.c.read(param1ArrayOfbyte, param1Int1, i);
        if (param1Int1 >= 0) {
          this.b += param1Int1;
          return param1Int1;
        } 
      } catch (IOException iOException) {}
      this.b = -1L;
      return -1;
    }
  }
  
  private static class b extends InputStream implements DataInput {
    private static final ByteOrder b = ByteOrder.LITTLE_ENDIAN;
    
    private static final ByteOrder c = ByteOrder.BIG_ENDIAN;
    
    private DataInputStream d;
    
    private ByteOrder e = ByteOrder.BIG_ENDIAN;
    
    final int f;
    
    int g;
    
    public b(InputStream param1InputStream) {
      this(param1InputStream, ByteOrder.BIG_ENDIAN);
    }
    
    b(InputStream param1InputStream, ByteOrder param1ByteOrder) {
      param1InputStream = new DataInputStream(param1InputStream);
      this.d = (DataInputStream)param1InputStream;
      int i = param1InputStream.available();
      this.f = i;
      this.g = 0;
      this.d.mark(i);
      this.e = param1ByteOrder;
    }
    
    public b(byte[] param1ArrayOfbyte) {
      this(new ByteArrayInputStream(param1ArrayOfbyte));
    }
    
    public int available() {
      return this.d.available();
    }
    
    public int b() {
      return this.f;
    }
    
    public int c() {
      return this.g;
    }
    
    public long d() {
      return readInt() & 0xFFFFFFFFL;
    }
    
    public void e(long param1Long) {
      int i = this.g;
      if (i > param1Long) {
        this.g = 0;
        this.d.reset();
        this.d.mark(this.f);
      } else {
        param1Long -= i;
      } 
      i = (int)param1Long;
      if (skipBytes(i) == i)
        return; 
      throw new IOException("Couldn't seek up to the byteCount");
    }
    
    public void g(ByteOrder param1ByteOrder) {
      this.e = param1ByteOrder;
    }
    
    public int read() {
      this.g++;
      return this.d.read();
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      param1Int1 = this.d.read(param1ArrayOfbyte, param1Int1, param1Int2);
      this.g += param1Int1;
      return param1Int1;
    }
    
    public boolean readBoolean() {
      this.g++;
      return this.d.readBoolean();
    }
    
    public byte readByte() {
      int i = this.g + 1;
      this.g = i;
      if (i <= this.f) {
        i = this.d.read();
        if (i >= 0)
          return (byte)i; 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public char readChar() {
      this.g += 2;
      return this.d.readChar();
    }
    
    public double readDouble() {
      return Double.longBitsToDouble(readLong());
    }
    
    public float readFloat() {
      return Float.intBitsToFloat(readInt());
    }
    
    public void readFully(byte[] param1ArrayOfbyte) {
      int i = this.g + param1ArrayOfbyte.length;
      this.g = i;
      if (i <= this.f) {
        if (this.d.read(param1ArrayOfbyte, 0, param1ArrayOfbyte.length) == param1ArrayOfbyte.length)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public void readFully(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      int i = this.g + param1Int2;
      this.g = i;
      if (i <= this.f) {
        if (this.d.read(param1ArrayOfbyte, param1Int1, param1Int2) == param1Int2)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public int readInt() {
      int i = this.g + 4;
      this.g = i;
      if (i <= this.f) {
        i = this.d.read();
        int j = this.d.read();
        int k = this.d.read();
        int m = this.d.read();
        if ((i | j | k | m) >= 0) {
          ByteOrder byteOrder = this.e;
          if (byteOrder == b)
            return (m << 24) + (k << 16) + (j << 8) + i; 
          if (byteOrder == c)
            return (i << 24) + (j << 16) + (k << 8) + m; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.e);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readLine() {
      Log.d("ExifInterface", "Currently unsupported");
      return null;
    }
    
    public long readLong() {
      int i = this.g + 8;
      this.g = i;
      if (i <= this.f) {
        int j = this.d.read();
        int k = this.d.read();
        int m = this.d.read();
        int n = this.d.read();
        i = this.d.read();
        int i1 = this.d.read();
        int i2 = this.d.read();
        int i3 = this.d.read();
        if ((j | k | m | n | i | i1 | i2 | i3) >= 0) {
          ByteOrder byteOrder = this.e;
          if (byteOrder == b)
            return (i3 << 56L) + (i2 << 48L) + (i1 << 40L) + (i << 32L) + (n << 24L) + (m << 16L) + (k << 8L) + j; 
          if (byteOrder == c)
            return (j << 56L) + (k << 48L) + (m << 40L) + (n << 32L) + (i << 24L) + (i1 << 16L) + (i2 << 8L) + i3; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.e);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public short readShort() {
      int i = this.g + 2;
      this.g = i;
      if (i <= this.f) {
        int j = this.d.read();
        i = this.d.read();
        if ((j | i) >= 0) {
          ByteOrder byteOrder = this.e;
          if (byteOrder == b)
            return (short)((i << 8) + j); 
          if (byteOrder == c)
            return (short)((j << 8) + i); 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.e);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readUTF() {
      this.g += 2;
      return this.d.readUTF();
    }
    
    public int readUnsignedByte() {
      this.g++;
      return this.d.readUnsignedByte();
    }
    
    public int readUnsignedShort() {
      int i = this.g + 2;
      this.g = i;
      if (i <= this.f) {
        int j = this.d.read();
        i = this.d.read();
        if ((j | i) >= 0) {
          ByteOrder byteOrder = this.e;
          if (byteOrder == b)
            return (i << 8) + j; 
          if (byteOrder == c)
            return (j << 8) + i; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.e);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public int skipBytes(int param1Int) {
      int i = Math.min(param1Int, this.f - this.g);
      for (param1Int = 0; param1Int < i; param1Int += this.d.skipBytes(i - param1Int));
      this.g += param1Int;
      return param1Int;
    }
  }
  
  private static class c {
    public final int a;
    
    public final int b;
    
    public final long c;
    
    public final byte[] d;
    
    c(int param1Int1, int param1Int2, long param1Long, byte[] param1ArrayOfbyte) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Long;
      this.d = param1ArrayOfbyte;
    }
    
    c(int param1Int1, int param1Int2, byte[] param1ArrayOfbyte) {
      this(param1Int1, param1Int2, -1L, param1ArrayOfbyte);
    }
    
    public static c a(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append(false);
      byte[] arrayOfByte = stringBuilder.toString().getBytes(a.W);
      return new c(2, arrayOfByte.length, arrayOfByte);
    }
    
    public static c b(long param1Long, ByteOrder param1ByteOrder) {
      return c(new long[] { param1Long }, param1ByteOrder);
    }
    
    public static c c(long[] param1ArrayOflong, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.C[4] * param1ArrayOflong.length]);
      byteBuffer.order(param1ByteOrder);
      int i = param1ArrayOflong.length;
      for (byte b = 0; b < i; b++)
        byteBuffer.putInt((int)param1ArrayOflong[b]); 
      return new c(4, param1ArrayOflong.length, byteBuffer.array());
    }
    
    public static c d(a.e param1e, ByteOrder param1ByteOrder) {
      return e(new a.e[] { param1e }, param1ByteOrder);
    }
    
    public static c e(a.e[] param1ArrayOfe, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.C[5] * param1ArrayOfe.length]);
      byteBuffer.order(param1ByteOrder);
      int i = param1ArrayOfe.length;
      for (byte b = 0; b < i; b++) {
        a.e e1 = param1ArrayOfe[b];
        byteBuffer.putInt((int)e1.a);
        byteBuffer.putInt((int)e1.b);
      } 
      return new c(5, param1ArrayOfe.length, byteBuffer.array());
    }
    
    public static c f(int param1Int, ByteOrder param1ByteOrder) {
      return g(new int[] { param1Int }, param1ByteOrder);
    }
    
    public static c g(int[] param1ArrayOfint, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[a.C[3] * param1ArrayOfint.length]);
      byteBuffer.order(param1ByteOrder);
      int i = param1ArrayOfint.length;
      for (byte b = 0; b < i; b++)
        byteBuffer.putShort((short)param1ArrayOfint[b]); 
      return new c(3, param1ArrayOfint.length, byteBuffer.array());
    }
    
    public double h(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Double.parseDouble((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof double[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof a.e[]) {
          object = object;
          if (object.length == 1)
            return object[0].a(); 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a double value");
      } 
      throw new NumberFormatException("NULL can't be converted to a double value");
    }
    
    public int i(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Integer.parseInt((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return (int)object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a integer value");
      } 
      throw new NumberFormatException("NULL can't be converted to a integer value");
    }
    
    public String j(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object == null)
        return null; 
      if (object instanceof String)
        return (String)object; 
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool = object instanceof long[];
      int i = 0;
      boolean bool1 = false;
      boolean bool2 = false;
      int j = 0;
      if (bool) {
        object = object;
        while (j < object.length) {
          stringBuilder.append(object[j]);
          i = j + 1;
          j = i;
          if (i != object.length) {
            stringBuilder.append(",");
            j = i;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof int[]) {
        object = object;
        j = i;
        while (j < object.length) {
          stringBuilder.append(object[j]);
          i = j + 1;
          j = i;
          if (i != object.length) {
            stringBuilder.append(",");
            j = i;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof double[]) {
        object = object;
        j = bool1;
        while (j < object.length) {
          stringBuilder.append(object[j]);
          i = j + 1;
          j = i;
          if (i != object.length) {
            stringBuilder.append(",");
            j = i;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof a.e[]) {
        object = object;
        j = bool2;
        while (j < object.length) {
          stringBuilder.append(((a.e)object[j]).a);
          stringBuilder.append('/');
          stringBuilder.append(((a.e)object[j]).b);
          i = j + 1;
          j = i;
          if (i != object.length) {
            stringBuilder.append(",");
            j = i;
          } 
        } 
        return stringBuilder.toString();
      } 
      return null;
    }
    
    Object k(ByteOrder param1ByteOrder) {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: new b/l/a/a$b
      //   5: astore_3
      //   6: aload_3
      //   7: aload_0
      //   8: getfield d : [B
      //   11: invokespecial <init> : ([B)V
      //   14: aload_3
      //   15: astore_2
      //   16: aload_3
      //   17: aload_1
      //   18: invokevirtual g : (Ljava/nio/ByteOrder;)V
      //   21: aload_3
      //   22: astore_2
      //   23: aload_0
      //   24: getfield a : I
      //   27: istore #4
      //   29: iconst_1
      //   30: istore #5
      //   32: iconst_0
      //   33: istore #6
      //   35: iconst_0
      //   36: istore #7
      //   38: iconst_0
      //   39: istore #8
      //   41: iconst_0
      //   42: istore #9
      //   44: iconst_0
      //   45: istore #10
      //   47: iconst_0
      //   48: istore #11
      //   50: iconst_0
      //   51: istore #12
      //   53: iconst_0
      //   54: istore #13
      //   56: iconst_0
      //   57: istore #14
      //   59: iload #4
      //   61: tableswitch default -> 124, 1 -> 807, 2 -> 622, 3 -> 563, 4 -> 504, 5 -> 433, 6 -> 807, 7 -> 622, 8 -> 374, 9 -> 315, 10 -> 242, 11 -> 182, 12 -> 127
      //   124: goto -> 916
      //   127: aload_3
      //   128: astore_2
      //   129: aload_0
      //   130: getfield b : I
      //   133: newarray double
      //   135: astore_1
      //   136: aload_3
      //   137: astore_2
      //   138: iload #14
      //   140: aload_0
      //   141: getfield b : I
      //   144: if_icmpge -> 163
      //   147: aload_3
      //   148: astore_2
      //   149: aload_1
      //   150: iload #14
      //   152: aload_3
      //   153: invokevirtual readDouble : ()D
      //   156: dastore
      //   157: iinc #14, 1
      //   160: goto -> 136
      //   163: aload_3
      //   164: invokevirtual close : ()V
      //   167: goto -> 180
      //   170: astore_2
      //   171: ldc 'ExifInterface'
      //   173: ldc 'IOException occurred while closing InputStream'
      //   175: aload_2
      //   176: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   179: pop
      //   180: aload_1
      //   181: areturn
      //   182: aload_3
      //   183: astore_2
      //   184: aload_0
      //   185: getfield b : I
      //   188: newarray double
      //   190: astore_1
      //   191: iload #6
      //   193: istore #14
      //   195: aload_3
      //   196: astore_2
      //   197: iload #14
      //   199: aload_0
      //   200: getfield b : I
      //   203: if_icmpge -> 223
      //   206: aload_3
      //   207: astore_2
      //   208: aload_1
      //   209: iload #14
      //   211: aload_3
      //   212: invokevirtual readFloat : ()F
      //   215: f2d
      //   216: dastore
      //   217: iinc #14, 1
      //   220: goto -> 195
      //   223: aload_3
      //   224: invokevirtual close : ()V
      //   227: goto -> 240
      //   230: astore_2
      //   231: ldc 'ExifInterface'
      //   233: ldc 'IOException occurred while closing InputStream'
      //   235: aload_2
      //   236: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   239: pop
      //   240: aload_1
      //   241: areturn
      //   242: aload_3
      //   243: astore_2
      //   244: aload_0
      //   245: getfield b : I
      //   248: anewarray b/l/a/a$e
      //   251: astore_1
      //   252: iload #7
      //   254: istore #14
      //   256: aload_3
      //   257: astore_2
      //   258: iload #14
      //   260: aload_0
      //   261: getfield b : I
      //   264: if_icmpge -> 296
      //   267: aload_3
      //   268: astore_2
      //   269: aload_1
      //   270: iload #14
      //   272: new b/l/a/a$e
      //   275: dup
      //   276: aload_3
      //   277: invokevirtual readInt : ()I
      //   280: i2l
      //   281: aload_3
      //   282: invokevirtual readInt : ()I
      //   285: i2l
      //   286: invokespecial <init> : (JJ)V
      //   289: aastore
      //   290: iinc #14, 1
      //   293: goto -> 256
      //   296: aload_3
      //   297: invokevirtual close : ()V
      //   300: goto -> 313
      //   303: astore_2
      //   304: ldc 'ExifInterface'
      //   306: ldc 'IOException occurred while closing InputStream'
      //   308: aload_2
      //   309: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   312: pop
      //   313: aload_1
      //   314: areturn
      //   315: aload_3
      //   316: astore_2
      //   317: aload_0
      //   318: getfield b : I
      //   321: newarray int
      //   323: astore_1
      //   324: iload #8
      //   326: istore #14
      //   328: aload_3
      //   329: astore_2
      //   330: iload #14
      //   332: aload_0
      //   333: getfield b : I
      //   336: if_icmpge -> 355
      //   339: aload_3
      //   340: astore_2
      //   341: aload_1
      //   342: iload #14
      //   344: aload_3
      //   345: invokevirtual readInt : ()I
      //   348: iastore
      //   349: iinc #14, 1
      //   352: goto -> 328
      //   355: aload_3
      //   356: invokevirtual close : ()V
      //   359: goto -> 372
      //   362: astore_2
      //   363: ldc 'ExifInterface'
      //   365: ldc 'IOException occurred while closing InputStream'
      //   367: aload_2
      //   368: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   371: pop
      //   372: aload_1
      //   373: areturn
      //   374: aload_3
      //   375: astore_2
      //   376: aload_0
      //   377: getfield b : I
      //   380: newarray int
      //   382: astore_1
      //   383: iload #9
      //   385: istore #14
      //   387: aload_3
      //   388: astore_2
      //   389: iload #14
      //   391: aload_0
      //   392: getfield b : I
      //   395: if_icmpge -> 414
      //   398: aload_3
      //   399: astore_2
      //   400: aload_1
      //   401: iload #14
      //   403: aload_3
      //   404: invokevirtual readShort : ()S
      //   407: iastore
      //   408: iinc #14, 1
      //   411: goto -> 387
      //   414: aload_3
      //   415: invokevirtual close : ()V
      //   418: goto -> 431
      //   421: astore_2
      //   422: ldc 'ExifInterface'
      //   424: ldc 'IOException occurred while closing InputStream'
      //   426: aload_2
      //   427: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   430: pop
      //   431: aload_1
      //   432: areturn
      //   433: aload_3
      //   434: astore_2
      //   435: aload_0
      //   436: getfield b : I
      //   439: anewarray b/l/a/a$e
      //   442: astore_1
      //   443: iload #10
      //   445: istore #14
      //   447: aload_3
      //   448: astore_2
      //   449: iload #14
      //   451: aload_0
      //   452: getfield b : I
      //   455: if_icmpge -> 485
      //   458: aload_3
      //   459: astore_2
      //   460: aload_1
      //   461: iload #14
      //   463: new b/l/a/a$e
      //   466: dup
      //   467: aload_3
      //   468: invokevirtual d : ()J
      //   471: aload_3
      //   472: invokevirtual d : ()J
      //   475: invokespecial <init> : (JJ)V
      //   478: aastore
      //   479: iinc #14, 1
      //   482: goto -> 447
      //   485: aload_3
      //   486: invokevirtual close : ()V
      //   489: goto -> 502
      //   492: astore_2
      //   493: ldc 'ExifInterface'
      //   495: ldc 'IOException occurred while closing InputStream'
      //   497: aload_2
      //   498: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   501: pop
      //   502: aload_1
      //   503: areturn
      //   504: aload_3
      //   505: astore_2
      //   506: aload_0
      //   507: getfield b : I
      //   510: newarray long
      //   512: astore_1
      //   513: iload #11
      //   515: istore #14
      //   517: aload_3
      //   518: astore_2
      //   519: iload #14
      //   521: aload_0
      //   522: getfield b : I
      //   525: if_icmpge -> 544
      //   528: aload_3
      //   529: astore_2
      //   530: aload_1
      //   531: iload #14
      //   533: aload_3
      //   534: invokevirtual d : ()J
      //   537: lastore
      //   538: iinc #14, 1
      //   541: goto -> 517
      //   544: aload_3
      //   545: invokevirtual close : ()V
      //   548: goto -> 561
      //   551: astore_2
      //   552: ldc 'ExifInterface'
      //   554: ldc 'IOException occurred while closing InputStream'
      //   556: aload_2
      //   557: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   560: pop
      //   561: aload_1
      //   562: areturn
      //   563: aload_3
      //   564: astore_2
      //   565: aload_0
      //   566: getfield b : I
      //   569: newarray int
      //   571: astore_1
      //   572: iload #12
      //   574: istore #14
      //   576: aload_3
      //   577: astore_2
      //   578: iload #14
      //   580: aload_0
      //   581: getfield b : I
      //   584: if_icmpge -> 603
      //   587: aload_3
      //   588: astore_2
      //   589: aload_1
      //   590: iload #14
      //   592: aload_3
      //   593: invokevirtual readUnsignedShort : ()I
      //   596: iastore
      //   597: iinc #14, 1
      //   600: goto -> 576
      //   603: aload_3
      //   604: invokevirtual close : ()V
      //   607: goto -> 620
      //   610: astore_2
      //   611: ldc 'ExifInterface'
      //   613: ldc 'IOException occurred while closing InputStream'
      //   615: aload_2
      //   616: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   619: pop
      //   620: aload_1
      //   621: areturn
      //   622: iload #13
      //   624: istore #14
      //   626: aload_3
      //   627: astore_2
      //   628: aload_0
      //   629: getfield b : I
      //   632: getstatic b/l/a/a.D : [B
      //   635: arraylength
      //   636: if_icmplt -> 704
      //   639: iconst_0
      //   640: istore #14
      //   642: aload_3
      //   643: astore_2
      //   644: getstatic b/l/a/a.D : [B
      //   647: astore_1
      //   648: iload #5
      //   650: istore #6
      //   652: aload_3
      //   653: astore_2
      //   654: iload #14
      //   656: aload_1
      //   657: arraylength
      //   658: if_icmpge -> 689
      //   661: aload_3
      //   662: astore_2
      //   663: aload_0
      //   664: getfield d : [B
      //   667: iload #14
      //   669: baload
      //   670: aload_1
      //   671: iload #14
      //   673: baload
      //   674: if_icmpeq -> 683
      //   677: iconst_0
      //   678: istore #6
      //   680: goto -> 689
      //   683: iinc #14, 1
      //   686: goto -> 642
      //   689: iload #13
      //   691: istore #14
      //   693: iload #6
      //   695: ifeq -> 704
      //   698: aload_3
      //   699: astore_2
      //   700: aload_1
      //   701: arraylength
      //   702: istore #14
      //   704: aload_3
      //   705: astore_2
      //   706: new java/lang/StringBuilder
      //   709: astore_1
      //   710: aload_3
      //   711: astore_2
      //   712: aload_1
      //   713: invokespecial <init> : ()V
      //   716: aload_3
      //   717: astore_2
      //   718: iload #14
      //   720: aload_0
      //   721: getfield b : I
      //   724: if_icmpge -> 781
      //   727: aload_3
      //   728: astore_2
      //   729: aload_0
      //   730: getfield d : [B
      //   733: iload #14
      //   735: baload
      //   736: istore #6
      //   738: iload #6
      //   740: ifne -> 746
      //   743: goto -> 781
      //   746: iload #6
      //   748: bipush #32
      //   750: if_icmplt -> 766
      //   753: aload_3
      //   754: astore_2
      //   755: aload_1
      //   756: iload #6
      //   758: i2c
      //   759: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   762: pop
      //   763: goto -> 775
      //   766: aload_3
      //   767: astore_2
      //   768: aload_1
      //   769: bipush #63
      //   771: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   774: pop
      //   775: iinc #14, 1
      //   778: goto -> 716
      //   781: aload_3
      //   782: astore_2
      //   783: aload_1
      //   784: invokevirtual toString : ()Ljava/lang/String;
      //   787: astore_1
      //   788: aload_3
      //   789: invokevirtual close : ()V
      //   792: goto -> 805
      //   795: astore_2
      //   796: ldc 'ExifInterface'
      //   798: ldc 'IOException occurred while closing InputStream'
      //   800: aload_2
      //   801: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   804: pop
      //   805: aload_1
      //   806: areturn
      //   807: aload_3
      //   808: astore_2
      //   809: aload_0
      //   810: getfield d : [B
      //   813: astore_1
      //   814: aload_3
      //   815: astore_2
      //   816: aload_1
      //   817: arraylength
      //   818: iconst_1
      //   819: if_icmpne -> 880
      //   822: aload_1
      //   823: iconst_0
      //   824: baload
      //   825: iflt -> 880
      //   828: aload_1
      //   829: iconst_0
      //   830: baload
      //   831: iconst_1
      //   832: if_icmpgt -> 880
      //   835: aload_3
      //   836: astore_2
      //   837: new java/lang/String
      //   840: dup
      //   841: iconst_1
      //   842: newarray char
      //   844: dup
      //   845: iconst_0
      //   846: aload_0
      //   847: getfield d : [B
      //   850: iconst_0
      //   851: baload
      //   852: bipush #48
      //   854: iadd
      //   855: i2c
      //   856: castore
      //   857: invokespecial <init> : ([C)V
      //   860: astore_1
      //   861: aload_3
      //   862: invokevirtual close : ()V
      //   865: goto -> 878
      //   868: astore_2
      //   869: ldc 'ExifInterface'
      //   871: ldc 'IOException occurred while closing InputStream'
      //   873: aload_2
      //   874: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   877: pop
      //   878: aload_1
      //   879: areturn
      //   880: aload_3
      //   881: astore_2
      //   882: new java/lang/String
      //   885: dup
      //   886: aload_0
      //   887: getfield d : [B
      //   890: getstatic b/l/a/a.W : Ljava/nio/charset/Charset;
      //   893: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
      //   896: astore_1
      //   897: aload_3
      //   898: invokevirtual close : ()V
      //   901: goto -> 914
      //   904: astore_2
      //   905: ldc 'ExifInterface'
      //   907: ldc 'IOException occurred while closing InputStream'
      //   909: aload_2
      //   910: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   913: pop
      //   914: aload_1
      //   915: areturn
      //   916: aload_3
      //   917: invokevirtual close : ()V
      //   920: goto -> 933
      //   923: astore_1
      //   924: ldc 'ExifInterface'
      //   926: ldc 'IOException occurred while closing InputStream'
      //   928: aload_1
      //   929: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   932: pop
      //   933: aconst_null
      //   934: areturn
      //   935: astore_2
      //   936: aload_3
      //   937: astore_1
      //   938: aload_2
      //   939: astore_3
      //   940: goto -> 950
      //   943: astore_1
      //   944: goto -> 985
      //   947: astore_3
      //   948: aconst_null
      //   949: astore_1
      //   950: aload_1
      //   951: astore_2
      //   952: ldc 'ExifInterface'
      //   954: ldc 'IOException occurred during reading a value'
      //   956: aload_3
      //   957: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   960: pop
      //   961: aload_1
      //   962: ifnull -> 982
      //   965: aload_1
      //   966: invokevirtual close : ()V
      //   969: goto -> 982
      //   972: astore_1
      //   973: ldc 'ExifInterface'
      //   975: ldc 'IOException occurred while closing InputStream'
      //   977: aload_1
      //   978: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   981: pop
      //   982: aconst_null
      //   983: areturn
      //   984: astore_1
      //   985: aload_2
      //   986: ifnull -> 1006
      //   989: aload_2
      //   990: invokevirtual close : ()V
      //   993: goto -> 1006
      //   996: astore_2
      //   997: ldc 'ExifInterface'
      //   999: ldc 'IOException occurred while closing InputStream'
      //   1001: aload_2
      //   1002: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1005: pop
      //   1006: goto -> 1011
      //   1009: aload_1
      //   1010: athrow
      //   1011: goto -> 1009
      // Exception table:
      //   from	to	target	type
      //   2	14	947	java/io/IOException
      //   2	14	943	finally
      //   16	21	935	java/io/IOException
      //   16	21	984	finally
      //   23	29	935	java/io/IOException
      //   23	29	984	finally
      //   129	136	935	java/io/IOException
      //   129	136	984	finally
      //   138	147	935	java/io/IOException
      //   138	147	984	finally
      //   149	157	935	java/io/IOException
      //   149	157	984	finally
      //   163	167	170	java/io/IOException
      //   184	191	935	java/io/IOException
      //   184	191	984	finally
      //   197	206	935	java/io/IOException
      //   197	206	984	finally
      //   208	217	935	java/io/IOException
      //   208	217	984	finally
      //   223	227	230	java/io/IOException
      //   244	252	935	java/io/IOException
      //   244	252	984	finally
      //   258	267	935	java/io/IOException
      //   258	267	984	finally
      //   269	290	935	java/io/IOException
      //   269	290	984	finally
      //   296	300	303	java/io/IOException
      //   317	324	935	java/io/IOException
      //   317	324	984	finally
      //   330	339	935	java/io/IOException
      //   330	339	984	finally
      //   341	349	935	java/io/IOException
      //   341	349	984	finally
      //   355	359	362	java/io/IOException
      //   376	383	935	java/io/IOException
      //   376	383	984	finally
      //   389	398	935	java/io/IOException
      //   389	398	984	finally
      //   400	408	935	java/io/IOException
      //   400	408	984	finally
      //   414	418	421	java/io/IOException
      //   435	443	935	java/io/IOException
      //   435	443	984	finally
      //   449	458	935	java/io/IOException
      //   449	458	984	finally
      //   460	479	935	java/io/IOException
      //   460	479	984	finally
      //   485	489	492	java/io/IOException
      //   506	513	935	java/io/IOException
      //   506	513	984	finally
      //   519	528	935	java/io/IOException
      //   519	528	984	finally
      //   530	538	935	java/io/IOException
      //   530	538	984	finally
      //   544	548	551	java/io/IOException
      //   565	572	935	java/io/IOException
      //   565	572	984	finally
      //   578	587	935	java/io/IOException
      //   578	587	984	finally
      //   589	597	935	java/io/IOException
      //   589	597	984	finally
      //   603	607	610	java/io/IOException
      //   628	639	935	java/io/IOException
      //   628	639	984	finally
      //   644	648	935	java/io/IOException
      //   644	648	984	finally
      //   654	661	935	java/io/IOException
      //   654	661	984	finally
      //   663	677	935	java/io/IOException
      //   663	677	984	finally
      //   700	704	935	java/io/IOException
      //   700	704	984	finally
      //   706	710	935	java/io/IOException
      //   706	710	984	finally
      //   712	716	935	java/io/IOException
      //   712	716	984	finally
      //   718	727	935	java/io/IOException
      //   718	727	984	finally
      //   729	738	935	java/io/IOException
      //   729	738	984	finally
      //   755	763	935	java/io/IOException
      //   755	763	984	finally
      //   768	775	935	java/io/IOException
      //   768	775	984	finally
      //   783	788	935	java/io/IOException
      //   783	788	984	finally
      //   788	792	795	java/io/IOException
      //   809	814	935	java/io/IOException
      //   809	814	984	finally
      //   816	822	935	java/io/IOException
      //   816	822	984	finally
      //   837	861	935	java/io/IOException
      //   837	861	984	finally
      //   861	865	868	java/io/IOException
      //   882	897	935	java/io/IOException
      //   882	897	984	finally
      //   897	901	904	java/io/IOException
      //   916	920	923	java/io/IOException
      //   952	961	984	finally
      //   965	969	972	java/io/IOException
      //   989	993	996	java/io/IOException
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(");
      stringBuilder.append(a.B[this.a]);
      stringBuilder.append(", data length:");
      stringBuilder.append(this.d.length);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  static class d {
    public final int a;
    
    public final String b;
    
    public final int c;
    
    public final int d;
    
    d(String param1String, int param1Int1, int param1Int2) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = -1;
    }
    
    d(String param1String, int param1Int1, int param1Int2, int param1Int3) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
    }
    
    boolean a(int param1Int) {
      int i = this.c;
      if (i != 7 && param1Int != 7 && i != param1Int) {
        int j = this.d;
        if (j != param1Int)
          return ((i == 4 || j == 4) && param1Int == 3) ? true : (((i == 9 || j == 9) && param1Int == 8) ? true : (((i == 12 || j == 12) && param1Int == 11))); 
      } 
      return true;
    }
  }
  
  private static class e {
    public final long a;
    
    public final long b;
    
    e(long param1Long1, long param1Long2) {
      if (param1Long2 == 0L) {
        this.a = 0L;
        this.b = 1L;
        return;
      } 
      this.a = param1Long1;
      this.b = param1Long2;
    }
    
    public double a() {
      double d1 = this.a;
      double d2 = this.b;
      Double.isNaN(d1);
      Double.isNaN(d2);
      return d1 / d2;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/l/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */