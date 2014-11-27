package test.rns;

import com.rns.util.NumericUtil;

public class NumericUtilTest {

	public static void main(String[] args) {
	
		System.out.println("empty:" + NumericUtil.isNumeric(""));  
		System.out.println("space:" + NumericUtil.isNumeric(" "));
		System.out.println("null:" + NumericUtil.isNumeric(null));  
		System.out.println("123:" + NumericUtil.isNumeric("123"));  
	    System.out.println("123.45:" + NumericUtil.isNumeric("123.45"));  
	    System.out.println("$123:" + NumericUtil.isNumeric("$123"));  
	    System.out.println("123x:" + NumericUtil.isNumeric("123x")); 
	    System.out.println("-123" + NumericUtil.isNumeric("-123")); 
	    System.out.println("+123" + NumericUtil.isNumeric("+123")); 
	    System.out.println("123+" + NumericUtil.isNumeric("123+")); 
	}
}
