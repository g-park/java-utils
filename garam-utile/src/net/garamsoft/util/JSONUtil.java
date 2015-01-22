package net.garamsoft.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtil {

	static public String getString(String key, JSONObject json) {
		try {
			return json.getString(key);
		} catch (Exception e) {
			return "";
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
	public static boolean put(String key, Object value, JSONObject json) {
		try {
			json.put(key, value);
			return true;
		} catch (JSONException e) {
			return false;
		}
	}
	public static JSONArray getJSONArray(String key, JSONObject json) {
		try {
			return json.getJSONArray(key);
		} catch (JSONException e) {
			return new JSONArray();
		}
	}
}
