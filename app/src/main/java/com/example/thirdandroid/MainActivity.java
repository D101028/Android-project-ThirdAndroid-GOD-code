package com.example.thirdandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_browser(View view) {
        EditText inputBlock = findViewById(R.id.GodCodeN);
        String user_input = inputBlock.getText().toString();
        String url = "https://nhentai.net/g/" + user_input + "/";
        if (user_input.equals("")){
            url = "https://nhentai.net";
        }
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void open_browser_w(View view) {
        EditText inputBlock = findViewById(R.id.GodCodeW);
        String user_input = inputBlock.getText().toString();
        String url = "https://wnacg.com/photos-index-aid-" + user_input + ".html";
        if (user_input.equals("")){
            url = "https://wnacg.com";
        }
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void open_browser_P(View view) {
        EditText inputBlock = findViewById(R.id.GodCodeP);
        String user_input = inputBlock.getText().toString();
        String url = "https://www.pixiv.net/artworks/" + user_input;
        if (user_input.equals("")){
            url = "https://www.pixiv.net";
        }
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void open_browser_J(View view) {
        EditText inputBlock = findViewById(R.id.GodCodeJ);
        String user_input = inputBlock.getText().toString();
        String url = "https://18comic.vip/album/" + user_input + "/";
        if (user_input.equals("")){
            url = "https://18comic.vip";
        }
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void open_browser_H(View view) {
        EditText inputBlock = findViewById(R.id.GodCodeH);
        String user_input = inputBlock.getText().toString();
        String url = "https://hanime1.me/watch?v=" + user_input;
        if (user_input.equals("")){
            url = "https://hanime1.me";
        }
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void open_history(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, HistoryActivity.class);
        startActivity(intent);
    }
}