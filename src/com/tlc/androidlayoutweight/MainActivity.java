package com.tlc.androidlayoutweight;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * weight ������Ŀ��=ԭ�����+ʣ��ռ���ռ�İٷֱȿ�� ʣ����=��Ļ���-���пؼ���ȵĺͣ��������У� ������Ļ���=w ��һ�����
 * �ؼ����Ϊ0 
 * View1=0+w*1/3=w*1/3 
 * View2=0+w*2/3=w*2/3 �ڶ������
 * �ؼ����Ϊfill_parent����match_parent 
 * view1=w+(w-2w)*1/3=w-w*1/3=w*2/3
 * view2=w+(w-2w)*2/3=w-w*2/3=w*1/3 
 * �ڶ������ �ؼ����һ��Ϊ0dp��һ��Ϊmatch_parent��fill_parent
 * view1=0+(w-w)*1/3=0 
 * view2=w+(w-w)*2/3=w-w*2/3=w
 * 
 * @author longchao
 * 
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
