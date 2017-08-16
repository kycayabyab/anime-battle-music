package kylecayabyab.com.animebattlemusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton onepiecebutton;
    ImageButton narutobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onepiecebutton = (ImageButton)findViewById(R.id.onepiecebutton);
        narutobutton = (ImageButton)findViewById(R.id.narutobutton);

        onepiecebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (v == onepiecebutton) {
                    MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.overtakenonepiece);
                    ring.start();
                }
                else {
                    MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.overtakenonepiece);
                    ring.stop();
                }
            }
        });

        narutobutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v == narutobutton) {
                    MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.narutomain);
                    ring.start();
                }
            }
        } );
    }
}
