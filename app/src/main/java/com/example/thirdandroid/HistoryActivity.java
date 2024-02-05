package com.example.thirdandroid;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.view.View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HistoryActivity extends AppCompatActivity {

//    public static void write(String fileName, String content) throws IOException {
//        FileWriter f = new FileWriter(fileName);
//        BufferedWriter b = new BufferedWriter(f);
//        b.write(content);
//        b.flush();
//        f.close();
//    }
//    public static String read(String fileName) {
//        try{
//            // 建立FileReader物件，並設定讀取的檔案為SD卡中的output.txt檔案
//            FileReader fr = new FileReader(fileName);
//            // 將BufferedReader與FileReader做連結
//            BufferedReader br = new BufferedReader(fr);
//            String readData = "";
//            String temp = br.readLine(); //readLine()讀取一整行
//            while (temp != null){
//                String temp0 = temp;
//                temp = br.readLine();
//                if (temp == null){
//                    readData += temp0;
//                }else{
//                    readData += temp0 + "\n";
//                }
//            }
//            br.close();
//            // System.out.println(readData);
//            return readData;
//        }catch(Exception e){
//            // e.printStackTrace();
//            return "";
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    public void test(View view) throws IOException {
        // 寫入檔案
        String filename = "first.json";
        String fileContents = "{\"1\": \"Hello World!\"}";
        try (FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE)) {
            fos.write(fileContents.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 讀取檔案
        try (FileInputStream fis = openFileInput(filename)) {
            // 讀取檔案內容
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void A_click(View view) throws IOException {

    }
    public void B_click(View view) throws IOException {

    }
}