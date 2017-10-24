package com.example.soksan.mixcolor001;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    SeekBar red,green,blue;
    int a=255,r=0,g=0,bl=0,color=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red=(SeekBar)findViewById(R.id.seekBar1);
        green=(SeekBar)findViewById(R.id.seekBar2);
        blue=(SeekBar)findViewById(R.id.seekBar3);
        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);
        layout=(RelativeLayout)findViewById(R.id.Layout);

        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r=red.getProgress();
                color=Color.argb(a,r,g,bl);
                layout.setBackgroundColor(color);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,(""+a),Toast.LENGTH_LONG).show();
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                g=green.getProgress();
                color=Color.argb(a,r,g,bl);
                layout.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,(""+g),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bl=blue.getProgress();
                color=Color.argb(a,r,g,bl);
                layout.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,(""+bl),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}