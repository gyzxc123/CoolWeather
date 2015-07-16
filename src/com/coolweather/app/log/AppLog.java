package com.coolweather.app.log;

import android.util.Log;

public class AppLog {

	private static int LOG_LEVEL = 2;
	private static final int LOG_VERBOSE = 1;
	private static final int LOG_DEBUG = 2;
	private static final int LOG_INFO = 3;
	private static final int LOG_WARN = 4;
	private static final int LOG_ERROR = 5;

	public static void v(String tag, String msg) {
		if (LOG_LEVEL < LOG_VERBOSE) {
			Log.v(tag, msg);
		}
	}

	public static void d(String tag, String msg) {
		if (LOG_LEVEL < LOG_DEBUG) {
			Log.d(tag, msg);
		}
	}

	public static void i(String tag, String msg) {
		if (LOG_LEVEL < LOG_INFO) {
			Log.i(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (LOG_LEVEL < LOG_WARN) {
			Log.w(tag, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (LOG_LEVEL < LOG_ERROR) {
			Log.e(tag, msg);
		}
	}
}
