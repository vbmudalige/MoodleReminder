package com.vidura.moodlereminder;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

	protected static final String DEBUG_TAG = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		final EditText tUserName = (EditText)findViewById(R.id.editText1);
		final EditText tPassword = (EditText) findViewById(R.id.editText2);
		final Button b = (Button) findViewById(R.id.button1);
		
		final TextView tv = (TextView) findViewById(R.id.textView3);
		
		//final WelcomeActivity wa = new WelcomeActivity();
		
		b.setOnClickListener(new OnClickListener()
				
				{
			
			public void onClick(View view) {
			    
			    ConnectivityManager connMgr = (ConnectivityManager) 
			        getSystemService(Context.CONNECTIVITY_SERVICE);
			    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo(); 
			    boolean isWifiConn = networkInfo.isConnected();
			    if(isWifiConn){
			    	 tv.append("Wifi connected" + " " + networkInfo.toString() );
			    	  
			    }else{
			    	tv.append("Wifi not connected" + " " + networkInfo.toString() );
			    }
			   
			}
			
/*
					@Override
					public void onClick(View v) {
						try{
							final URL url = new URL("https://www.google.com");
							URLConnection con = url.openConnection();
							
							BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
							String line = "";
						   
							tv.append(url.getPath());
							//startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));
							while((line = reader.readLine()) != null){
								tv.append(line);
								//wa.showSource(line);
							}
						}
						catch(Exception e){
							System.out.println("Error");
						}
					}
*/				
				});
	}
}
