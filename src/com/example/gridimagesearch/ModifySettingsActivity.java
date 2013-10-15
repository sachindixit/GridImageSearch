package com.example.gridimagesearch;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ModifySettingsActivity extends Activity {

private Spinner spinner1, spinner2, spinner3;
EditText etSiteFilter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modify_settings);
		addItemsOnSpinner1();
		addItemsOnSpinner2();
		addItemsOnSpinner3();
		etSiteFilter = (EditText) findViewById(R.id.etSiteFilter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.modify_settings, menu);
		return true;
	}

	
	  // add items into spinner dynamically
	  public void addItemsOnSpinner1() {
	 
		spinner1 = (Spinner) findViewById(R.id.spinImageSize);
		List<String> list = new ArrayList<String>();
		list.add("Small");
		list.add("Medium");
		list.add("Large");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	  }
	  

	  // add items into spinner dynamically
	  public void addItemsOnSpinner2() {
	 
		spinner2 = (Spinner) findViewById(R.id.spinColor);
		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Red");
		list.add("Yellow");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	  }

	  
	  // add items into spinner dynamically
	  public void addItemsOnSpinner3() {
	 
		spinner3 = (Spinner) findViewById(R.id.spinImageType);
		List<String> list = new ArrayList<String>();
		list.add("Faces");
		list.add("Cartoon");
		list.add("Pictures");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner3.setAdapter(dataAdapter);
	  }
	  
		public void onSaveSettings(View V) {
			String ImageSize = spinner1.getSelectedItem().toString();
			String SiteColor = spinner2.getSelectedItem().toString();
			String ImageType = spinner3.getSelectedItem().toString();
			String SiteFilter = etSiteFilter.getText().toString();  

			Toast.makeText(this, "Save button clicked: "+ 
					ImageSize + " , " + 
					SiteColor + " , " + 
					ImageType + " , " + 
					SiteFilter, Toast.LENGTH_LONG).show();
		/*	
			Toast.makeText(this, "Save button clicked: "+ 
					spinner1.getSelectedItem().toString() + " , " +
					spinner2.getSelectedItem().toString() + " , " +
					spinner3.getSelectedItem().toString() + " , " +
					SiteFilter, Toast.LENGTH_LONG).show(); */
		}
}
