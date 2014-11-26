package net.garamsoft.util;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtil {

	static public String getString(String key, JSONObject json) {
		try {
			return json.getString(key);
		} catch (Exception e) {
			return new String();
		}
	}
	static public int getInt(String key, JSONObject json) {
		try {
			return json.getInt(key);
		} catch (Exception e) {
			return -1;
		}
	}
	static public boolean getBoolean(String key, JSONObject json) {
		try {
			return json.getBoolean(key);
		} catch (Exception e) {
			return false;
		}
	}
	static public boolean getBoolean(String key, JSONObject json,boolean def) {
		try {
			return json.getBoolean(key);
		} catch (Exception e) {
			return def;
		}
	}
	
	static public void putString(String key,String value,JSONObject json){
		try {
			json.put(key, value);
		} catch (JSONException e) {}
	}
}
