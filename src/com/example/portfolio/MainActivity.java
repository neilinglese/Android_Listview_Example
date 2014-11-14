package com.example.portfolio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView list;
	public final static String ID_Extra="com.example.portfolio.MainActivity";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list = (ListView)findViewById(R.id.listView1);
        
        String[] items = getResources().getStringArray(R.array.Classes);
        
        list.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items));
        
        list.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> parent, View view,
        			int postion, long id){
        		
        		Intent i =new Intent(MainActivity.this,ClassPage.class);
        		i.putExtra(ID_Extra, String.valueOf(id));
        		startActivity(i);
        		
        		
        		
        	}
        	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
