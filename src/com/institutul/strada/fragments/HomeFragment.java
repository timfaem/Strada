package com.institutul.strada.fragments;

import com.institutul.strada.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment {

	private static final String START = "Start Recording";
	private static final String STOP = "Stop Recording";
	private boolean isRunning;

	private TextView latitudeTextView;
	private TextView longitudeTextView;
	private Button controlButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		isRunning = false;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		controlButton = (Button) view.findViewById(R.id.buttoncontrol);
		latitudeTextView = (TextView) view.findViewById(R.id.textView2);
		longitudeTextView = (TextView) view.findViewById(R.id.textView4);

		controlButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				toggleControlButton();
			}
		});

		return view;
	}

	private void toggleControlButton() {
		isRunning = !isRunning;
		controlButton.setText(isRunning ? START : STOP);
	}

}