//package com.example.layout;
//
//import android.Manifest;
//import android.app.Activity;
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.os.Build;
//
//import androidx.core.app.ActivityCompat;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class FileUtil {
//    public static final String FILE_NAME = "data.txt";
//
//    public static boolean saveAccount(Context context, String account,String password){
//        try(FileOutputStream fos = context.openFileOutput(FILE_NAME,Context.MODE_PRIVATE)){
//            fos.write((account + "," + password).getBytes());
//            fos.flush();
//            fos.close();
//            return  true;
//        } catch (IOException e){
//            e.printStackTrace();
//
//        }
//        return  false;
//    }
//    public  static Map<String,String> getAccount(Context context){
//        Map<String,String> content = new HashMap<>();
//        try{
//            FileInputStream fis =context.openFileInput(FILE_NAME);
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            String[] infos = new String(buffer).split(",");
//            if(infos.length >0){
//                content.put("account",infos[0]);
//                content.put("password",infos[1]);
//            }
//            fis.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//        return  content;
//    }
//    public  static  void clear(Context context){
//        File file = new File(context.getFilesDir(),FILE_NAME);
//        if(file.exists()){
//            file.delete();
//        }
//    }
//
//    public static Boolean savePublic (Context context, String account,String password){
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            if(context.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//            != PackageManager.PERMISSION_GRANTED){
//                ActivityCompat.requestPermissions(Activity) context,
//                    new;
//            }
//        }
//    }
//}