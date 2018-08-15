package ext.javaDev.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharUtil {
	
	/**
	 * 判断是否是汉字
	 * @param str
	 * @return
	 */
	public static boolean isChinese(String str) {

		String regEx = "[\\u4e00-\\u9fa5]+";

		Pattern p = Pattern.compile(regEx);

		Matcher m = p.matcher(str);

		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}

}
