package com.example.root.eragames_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity{
    //AIzaSyAuvld23hxo9DeO2tQKeBeHlmaMYBhcFzM
    //122291065853
    //1932a179-c848-41d6-82d9-ea4a7093f1ff

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

    public void onClickImgYoutube(View view){
        Uri uri = Uri.parse("http://www.youtube.com/user/eragames1/videos");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}
