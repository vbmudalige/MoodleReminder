package com.vidura.moodlereminder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class WelcomeActivity extends Activity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		tv = (TextView) findViewById(R.id.textView2); 
	}
	
	public void showSource(String line){
		tv.append(line);
	}
}
