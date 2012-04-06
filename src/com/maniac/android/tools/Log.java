package com.maniac.android.tools;

public class Log
{
	static final String TAG = "ThemeExplorer";
	
	static public void i(String _msg) { android.util.Log.i(TAG,_msg); }
	static public void d(String _msg) { android.util.Log.d(TAG,_msg); }	
}
