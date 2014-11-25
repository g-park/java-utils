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
}
