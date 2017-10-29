package com.example.vishal.tictactoe;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,ne;
    MediaPlayer player;
    String p1,p2;
    EditText e1,e2;
    int startX, startY, stopX, stopY;
    int turn,count=0,count1=0;
    TextView tv,tv1;
    private Paint paint = new Paint();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(1f);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        ne=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);
        tv1=(TextView)findViewById(R.id.textView2);

        turn=1;
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                b1.setBackgroundResource(R.drawable.b);
                b2.setBackgroundResource(R.drawable.b);
                b3.setBackgroundResource(R.drawable.b);
                b4.setBackgroundResource(R.drawable.b);
                b5.setBackgroundResource(R.drawable.b);
                b6.setBackgroundResource(R.drawable.b);
                b7.setBackgroundResource(R.drawable.b);
                b8.setBackgroundResource(R.drawable.b);
                b9.setBackgroundResource(R.drawable.b);
            }
        });
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(b1.getText().toString().equals("")){
            if(turn==1){
                turn=2;
            b1.setText("X");}
            else if(turn==2){
                turn=1;
            b1.setText("0");}
        }
        player=MediaPlayer.create(MainActivity.this,R.raw.r1);
        player.start();
        endGame();
    }
   });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b2.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b2.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b3.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b3.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b4.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b4.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b5.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b5.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b6.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b6.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b7.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b7.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b8.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b8.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b9.setText("X");}
                    else if(turn==2){
                        turn=1;
                        b9.setText("0");}
                }
                player=MediaPlayer.create(MainActivity.this,R.raw.r1);
                player.start();
                endGame();
            }
        });

    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
boolean end=false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            count++;
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b2.setBackgroundResource(R.drawable.match);
            b3.setBackgroundResource(R.drawable.match);
        } else if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b4.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b6.setBackgroundResource(R.drawable.match);
        } else if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b7.setBackgroundResource(R.drawable.match);
            b8.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b4.setBackgroundResource(R.drawable.match);
            b7.setBackgroundResource(R.drawable.match);
        } else if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b2.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b8.setBackgroundResource(R.drawable.match);
        } else if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b3.setBackgroundResource(R.drawable.match);
            b6.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count++;
            end=true;
            b3.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b7.setBackgroundResource(R.drawable.match);
        } else if (a.equals("0") && b.equals("0") && c.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b2.setBackgroundResource(R.drawable.match);
            b3.setBackgroundResource(R.drawable.match);
        } else if (d.equals("0") && e.equals("0") && f.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b4.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b6.setBackgroundResource(R.drawable.match);
        } else if (g.equals("0") && h.equals("0") && i.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b7.setBackgroundResource(R.drawable.match);
            b8.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (a.equals("0") && d.equals("0") && g.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b4.setBackgroundResource(R.drawable.match);
            b7.setBackgroundResource(R.drawable.match);
        } else if (b.equals("0") && e.equals("0") && h.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b2.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b8.setBackgroundResource(R.drawable.match);
        } else if (c.equals("0") && f.equals("0") && i.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b3.setBackgroundResource(R.drawable.match);
            b6.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (a.equals("0") && e.equals("0") && i.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b1.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b9.setBackgroundResource(R.drawable.match);
        } else if (g.equals("0") && e.equals("0") && c.equals("0")) {
            Toast.makeText(MainActivity.this, "Player 0 Win", Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(MainActivity.this,R.raw.w);
            player.start();
            count1++;
            end=true;
            b3.setBackgroundResource(R.drawable.match);
            b5.setBackgroundResource(R.drawable.match);
            b7.setBackgroundResource(R.drawable.match);
        }
if(end){
    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);
    b9.setEnabled(false);
}

tv.setText("Player X : "+Integer.toString(count));
        tv1.setText("Player 0 : "+Integer.toString(count1));
    }
}
