package com.ncnipc.androidgroup.venscor.gesturelock;

import java.util.List;

import com.ncnipc.androidgroup.venscor.gesturelock.LockPatternView.Cell;
import com.ncnipc.androidgroup.venscor.gesturelock.LockPatternView.DisplayMode;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.KeyEvent;
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

public class LockActivity extends Activity implements
		LockPatternView.OnPatternListener {
	private static final String TAG = "LockActivity";

	private List<Cell> lockPattern;
	private LockPatternView lockPatternView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SharedPreferences preferences = getSharedPreferences(MainActivity.LOCK,
				MODE_PRIVATE);
		String patternString = preferences.getString(MainActivity.LOCK_KEY,
				null);
		//patternString=null时，应该是说没有开启锁
		//二次保证如果没有手势锁，立马回MainActivity
		if (patternString == null) {
			finish();
			return;
		}
		//根据存储的pattern的数据，List<Cell>数据
		lockPattern = LockPatternView.stringToPattern(patternString);
		setContentView(R.layout.activity_lock);
		lockPatternView = (LockPatternView) findViewById(R.id.lock_pattern);
		lockPatternView.setOnPatternListener(this);

		findViewById(R.id.psdBt).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText psdText=(EditText)findViewById(R.id.psd);
				SharedPreferences preferences = getSharedPreferences(MainActivity.LOCK,
						MODE_PRIVATE);
				String patternString = preferences.getString(MainActivity.LOCK_KEY,
						"没有找到");
				Toast.makeText(LockActivity.this, "密码是："+patternString, Toast.LENGTH_LONG).show();
				psdText.setText(patternString);
			}
		});
	}

	//回调方法，静止back回退
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		// disable back key
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			//锁定back键，是的这个Activity不能回退；
			return true;
		}

		return super.onKeyDown(keyCode, event);
	}

	//没有用；
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	//监听器,离开第一个点被触发
	@Override
	public void onPatternStart() {
		Log.d(TAG, "onPatternStart");
	}

	//
	@Override
	public void onPatternCleared() {
		Log.d(TAG, "onPatternCleared");
	}

	//监听器，cell被按下一次触发一次
	@Override
	public void onPatternCellAdded(List<Cell> pattern) {
		Log.d(TAG, "onPatternCellAdded");
		//把绘制的手势转会为String，猜测文件中存储的也是这个字符串；
		Log.e(TAG, LockPatternView.patternToString(pattern));
		// Toast.makeText(this, LockPatternView.patternToString(pattern),
		// Toast.LENGTH_LONG).show();
	}

	/***
	 * 
	 * 监听器，手势绘制完成时被触发,基本监听器是View的onTouchEvent()方法;
	 * 
	 * */
	@Override
	public void onPatternDetected(List<Cell> pattern) {
		Log.d(TAG, "onPatternDetected");

		//判断手势正确性,lockPattern是从程序原先存储中查询到的，
		//pattern是当前用户按下的手势；
		if (pattern.equals(lockPattern)) {
			finish();//手势正确，回到调用者Activity
		} else {
			lockPatternView.setDisplayMode(DisplayMode.Wrong);//就是手势不对，把cell置为红色
			Toast.makeText(this, R.string.lockpattern_error, Toast.LENGTH_LONG)
					.show();
		}
	}

}
