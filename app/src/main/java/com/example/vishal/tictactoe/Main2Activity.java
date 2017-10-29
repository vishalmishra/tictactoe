package com.example.vishal.tictactoe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    MediaPlayer player;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
        btn=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        player= MediaPlayer.create(Main2Activity.this,R.raw.r1);
                        player.start();
                        Intent intent=new Intent("com.example.vishal.tictactoe.MainActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
