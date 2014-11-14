package com.example.portfolio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class ClassPage extends Activity {

	
	private TextView passedView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_class_page);
		
		String passedVar = getIntent().getStringExtra(MainActivity.ID_Extra);
		passedView = (TextView)findViewById(R.id.tv1);
		
		//passedView.setText("You have clicked item id: "+passedVar);
		if(passedVar.equals("0"))
		{
			passedView.setText("Intro to Programming");
			ImageView iv = (ImageView)findViewById(R.id.imageView1);
			iv.setImageResource(R.drawable.bowden);
			TextView tv2 = (TextView)findViewById(R.id.tv2);
			tv2.setText("Styled as a choose your own adventure game, The Caves of Bowden was created as a windows form applicaton. The game lets you guide your party through one of twelve unique playthroughs.");
		}
		else if(passedVar.equals("1"))
		{
			passedView.setText("Object Oriented Programming");
			ImageView iv = (ImageView)findViewById(R.id.imageView1);
			iv.setImageResource(R.drawable.oop);
			TextView tv2 = (TextView)findViewById(R.id.tv2);
			tv2.setText("A Drag and Drop file sorting virus, that allows the user to create rules to move, copy, zip, unzip, rename, and delete files. Allowing a user friendly experience to relocate files just by dropping them into a window.");
		}
		else if(passedVar.equals("2"))
		{
			passedView.setText("C++");
			ImageView iv = (ImageView)findViewById(R.id.imageView1);
			iv.setImageResource(R.drawable.poker);
			TextView tv2 = (TextView)findViewById(R.id.tv2);
			tv2.setText("A Texas-Hold 'em style poker game created by Jordan Max and myself. ");
		}
		else
		{
			passedView.setText("Authoring Interactive Media");
			ImageView iv = (ImageView)findViewById(R.id.imageView1);
			iv.setImageResource(R.drawable.aim);
			TextView tv2 = (TextView)findViewById(R.id.tv2);
			tv2.setText("A simple website created using HTML5 and CSS.");
		}
		
		Button btn1 = (Button)findViewById(R.id.button1);
		
		// Show the Up button in the action bar.
		setupActionBar();
	}
	public void btnClicked(View view){
		Intent i = new Intent(this,MainActivity.class);
		startActivity(i);
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.class_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
