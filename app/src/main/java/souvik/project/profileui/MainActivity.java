package souvik.project.profileui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
	
	
	private LinearLayout linear8;
	private LinearLayout cover;
	private LinearLayout linear9;
	private LinearLayout content_area;
	private TextView username;
	private LinearLayout verified;
	private LinearLayout linear2;
	private LinearLayout profileborder;
	private LinearLayout space;
	private LinearLayout linear6;
	private LinearLayout profile;
	private LinearLayout linear7;
	private TextView fullname;
	private TextView bio;
	private TextView website_url;
	private LinearLayout webverified;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private TextView postcount;
	private TextView textview6;
	private TextView followercount;
	private TextView textview8;
	private TextView followingcount;
	private TextView textview10;
	private LinearLayout linear14;
	private LinearLayout row;
	private LinearLayout linear22;
	private LinearLayout linear26;
	private LinearLayout space1;
	private LinearLayout linear28;
	private LinearLayout space2;
	private LinearLayout linear31;
	private LinearLayout icon1;
	private LinearLayout icon2;
	private LinearLayout icon3;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private ImageView img1;
	private ImageView img2;
	private ImageView img3;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private ImageView img4;
	private ImageView img5;
	
	private Intent web = new Intent();
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
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		content_area = (LinearLayout) findViewById(R.id.content_area);
		username = (TextView) findViewById(R.id.username);
		verified = (LinearLayout) findViewById(R.id.verified);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		profileborder = (LinearLayout) findViewById(R.id.profileborder);
		space = (LinearLayout) findViewById(R.id.space);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		profile = (LinearLayout) findViewById(R.id.profile);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		fullname = (TextView) findViewById(R.id.fullname);
		bio = (TextView) findViewById(R.id.bio);
		website_url = (TextView) findViewById(R.id.website_url);
		webverified = (LinearLayout) findViewById(R.id.webverified);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		postcount = (TextView) findViewById(R.id.postcount);
		textview6 = (TextView) findViewById(R.id.textview6);
		followercount = (TextView) findViewById(R.id.followercount);
		textview8 = (TextView) findViewById(R.id.textview8);
		followingcount = (TextView) findViewById(R.id.followingcount);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		row = (LinearLayout) findViewById(R.id.row);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		space1 = (LinearLayout) findViewById(R.id.space1);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		space2 = (LinearLayout) findViewById(R.id.space2);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		icon1 = (LinearLayout) findViewById(R.id.icon1);
		icon2 = (LinearLayout) findViewById(R.id.icon2);
		icon3 = (LinearLayout) findViewById(R.id.icon3);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		img1 = (ImageView) findViewById(R.id.img1);
		img2 = (ImageView) findViewById(R.id.img2);
		img3 = (ImageView) findViewById(R.id.img3);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		img4 = (ImageView) findViewById(R.id.img4);
		img5 = (ImageView) findViewById(R.id.img5);
		
		verified.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_initBottomSheet();
			}
		});
		
		website_url.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setClass(getApplicationContext(), WebActivity.class);
				startActivity(web);
			}
		});
		
		webverified.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_web_verify();
			}
		});
	}
	private void initializeLogic() {
		Glide.with(getApplicationContext()).load(Uri.parse("https://res.cloudinary.com/souvik-network/image/upload/v1595976207/Android%20Github/Profile%20Ui/photo-1595927238580-797684d76bd8_han98w.jpg")).into(img1);
		Glide.with(getApplicationContext()).load(Uri.parse("https://res.cloudinary.com/souvik-network/image/upload/v1595976414/Android%20Github/Profile%20Ui/photo-1595925324535-7df87ec53632_unt3i3.jpg")).into(img2);
		Glide.with(getApplicationContext()).load(Uri.parse("https://res.cloudinary.com/souvik-network/image/upload/v1595976512/Android%20Github/Profile%20Ui/photo-1595925024338-c52444a47e0f_xycula.jpg")).into(img3);
		Glide.with(getApplicationContext()).load(Uri.parse("https://res.cloudinary.com/souvik-network/image/upload/v1595977282/Android%20Github/Profile%20Ui/photo-1595919386761-efb886f4364b_siklta.jpg")).into(img4);
		Glide.with(getApplicationContext()).load(Uri.parse("https://res.cloudinary.com/souvik-network/image/upload/v1595977362/Android%20Github/Profile%20Ui/photo-1595924550188-6401320ac78d_s5e5aj.jpg")).into(img5);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _initBottomSheet () {
		final com.google.android.material.bottomsheet.BottomSheetDialog dialog = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this); View lay = getLayoutInflater().inflate(R.layout.idverification, null); dialog.setContentView(lay);
		final LinearLayout linear1 = (LinearLayout)lay.findViewById(R.id.mainview); 
		dialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		dialog.show();
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable(); wd.setColor(Color.WHITE); wd.setCornerRadius((int)10f);
		linear1.setBackground(wd);
		linear2.setOnClickListener(new OnClickListener() { @Override public void onClick(View v) {
				dialog.dismiss(); }});
	}
	
	
	private void _web_verify () {
		final com.google.android.material.bottomsheet.BottomSheetDialog dialog = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this); View lay = getLayoutInflater().inflate(R.layout.webverification, null); dialog.setContentView(lay);
		final LinearLayout linear1 = (LinearLayout)lay.findViewById(R.id.mainweb); 
		dialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		dialog.show();
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable(); wd.setColor(Color.WHITE); wd.setCornerRadius((int)10f);
		linear1.setBackground(wd);
		linear2.setOnClickListener(new OnClickListener() { @Override public void onClick(View v) {
				dialog.dismiss(); }});
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
