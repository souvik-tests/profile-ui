package com.my.newproject2;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	private LinearLayout linear8;
	private LinearLayout cover;
	private LinearLayout linear2;
	private LinearLayout profileborder;
	private LinearLayout space;
	private LinearLayout linear6;
	private LinearLayout profile;
	private LinearLayout linear7;
	private TextView bio;
	private TextView username;
	private LinearLayout verified;
	private TextView fullname;
	private TextView textview4;
	private LinearLayout webverification;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		cover = (LinearLayout) findViewById(R.id.cover);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		profileborder = (LinearLayout) findViewById(R.id.profileborder);
		space = (LinearLayout) findViewById(R.id.space);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		profile = (LinearLayout) findViewById(R.id.profile);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		bio = (TextView) findViewById(R.id.bio);
		username = (TextView) findViewById(R.id.username);
		verified = (LinearLayout) findViewById(R.id.verified);
		fullname = (TextView) findViewById(R.id.fullname);
		textview4 = (TextView) findViewById(R.id.textview4);
		webverification = (LinearLayout) findViewById(R.id.webverification);
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
