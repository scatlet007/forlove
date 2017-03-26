package shop.utils;

import java.util.Date;

public class Common {
	
	public static String getId(String suffix)
	{
		Date date =new Date();
		return suffix+date.getTime();
	}
}
