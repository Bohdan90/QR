package com.lazer.android;

import com.lazer.android.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	public void CreateQR(View view) {
		Intent intent = new Intent(MainActivity.this, Creating.class);
	    startActivity(intent);
	}

	public void ReadQR(View view) {
		Intent intent = new Intent(MainActivity.this, Reading.class);
	    startActivity(intent);
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}