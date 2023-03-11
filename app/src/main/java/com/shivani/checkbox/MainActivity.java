package com.shivani.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CheckBox movie,music,games,dance;

    Button Submit;

    TextView txtHobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding();
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h ="";
                if(movie.isChecked()){
                    h+="movie/n";
                }
                if(music.isChecked()){
                    h+="music/n";
                }
                if(games.isChecked()){
                    h+="games/n";
                }
                if (dance.isChecked()){
                    h+="dance/n";
                }
                txtHobby.setText("Hobby="+h);
            }
        });
    }


    private void Binding(){

        movie =findViewById(R.id.movie);
        music =findViewById(R.id.music);
        games = findViewById(R.id.games);
        dance = findViewById(R.id.dance);

        txtHobby=findViewById(R.id.hobby);
    }
}