package net.garamsoft.util;

public class CommonsUtil {
	public static String nullToEmptyString(String str){
		if (str==null) {
			return new String();
		}
		return str;
  }
}
