package com.institutul.strada.fragments;

import com.institutul.strada.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public abstract class AbstractFragmentActivity extends Activity {

	protected FragmentManager fragmentManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);

		fragmentManager = this.getFragmentManager();
		Fragment fragment = fragmentManager.findFragmentById(R.id.container);
		if (fragment == null) {
			fragment = createFragment();
			fragmentManager.beginTransaction().add(R.id.container, fragment).commit();
		}
	}

	public abstract Fragment createFragment();

}
