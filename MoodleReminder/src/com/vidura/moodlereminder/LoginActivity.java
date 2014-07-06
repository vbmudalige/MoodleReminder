package com.vidura.moodlereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener()
				
				{

					@Override
					public void onClick(View v) {
						startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));
					}
				
				});
	}
}
