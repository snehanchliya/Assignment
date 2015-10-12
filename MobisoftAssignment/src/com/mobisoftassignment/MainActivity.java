package com.mobisoftassignment;


import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements SeekBarCompat.PositionListener {

	Canvas canvas;   
	SeekBarCompat seekBarCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
						
		seekBarCompat = (SeekBarCompat) findViewById(R.id.materialSeekBar);           
        seekBarCompat.setProgress(30);
        seekBarCompat.setPositionListener(this);
        
           
        
	}	
	
	@Override
	public void GetPosition(int position) {
		// TODO Auto-generated method stub
		
		((TextView)findViewById(R.id.counter)).setText(String.valueOf(position));
	}
	
	


}
