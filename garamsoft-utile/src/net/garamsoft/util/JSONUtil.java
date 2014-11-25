package net.garamsoft.util;

import org.json.JSONObject;

public class JSONUtil {

	public String getString(String key, JSONObject json) {
		try {
			return json.getString(key);
		} catch (Exception e) {
			return new String();
		}
	}
	public int getInt(String key, JSONObject json) {
		try {
			return json.getInt(key);
		} catch (Exception e) {
			return -1;
		}
	}
	public boolean getBoolean(String key, JSONObject json) {
		try {
			return json.getBoolean(key);
		} catch (Exception e) {
			return false;
		}
	}
	public boolean getBoolean(String key, JSONObject json,boolean def) {
		try {
			return json.getBoolean(key);
		} catch (Exception e) {
			return def;
		}
	}
}
