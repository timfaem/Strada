package com.institutul.strada.activities;

import android.app.Fragment;

import com.institutul.strada.fragments.AbstractFragmentActivity;
import com.institutul.strada.fragments.HomeFragment;

public class HomeActivity extends AbstractFragmentActivity{

	@Override
	public Fragment createFragment() {
		return new HomeFragment();
	}
	
}
