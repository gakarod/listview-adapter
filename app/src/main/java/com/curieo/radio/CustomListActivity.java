package com.curieo.radio;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list);
		populateUsersList();
	}

	private void populateUsersList() {
		// Construct the data source
		ArrayList<User> arrayOfUsers = User.getUsers();
		// Create the adapter to convert the array to views
		CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
		// Attach the adapter to a ListView
		ListView listView = (ListView) findViewById(R.id.lvUsers);
		ListView listView2 = (ListView) findViewById(R.id.lvUsers2);
		listView.setAdapter(adapter);
		listView2.setAdapter(adapter);
	}
	
}
