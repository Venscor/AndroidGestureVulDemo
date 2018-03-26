package com.ncnipc.androidgroup.venscor.gesturelock;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

/*
 * Author: Ruils 蹇冩��浜у搧姊︾殑瀹夊崜鐮佸啘 
 * Blog: http://blog.csdn.net/ruils
 * QQ: 5452781
 * Email: 5452781@qq.com
 */

public class MainActivity extends Activity implements OnClickListener {
	// 12-01 18:26:09.907: I/ActivityManager(519): Displayed
	// com.android.settings/.ChooseLockPattern: +236ms
	// 12-01 19:35:14.870: I/ActivityManager(519): Displayed
	// com.android.settings/.ConfirmLockPattern: +366ms (total +439ms)

	private static final String TAG = "MainActivity";

	public static final String LOCK = "lock";
	public static final String LOCK_KEY = "lock_key";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SharedPreferences preferences = getSharedPreferences(LOCK, MODE_PRIVATE);

		final String lockPattenString = preferences.getString(LOCK_KEY, null);
		//先查询，如果设置了手机锁，立马进入手机锁界面；
		if (lockPattenString != null) {
			Intent intent = new Intent(this, LockActivity.class);
			startActivity(intent);
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.lock:
			Intent intent = new Intent(this, LockSetupActivity.class);
			startActivity(intent);
			break;
		case R.id.unlock:
			getSharedPreferences(LOCK, MODE_PRIVATE).edit().clear().commit();
			break;

		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
