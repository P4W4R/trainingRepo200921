package org.cap.util;

public class AccountUtil {

	private static int accNo=0;
	private static int accNo1=0;
	
	public static int generateAccountNumber(){
		return accNo++;
	}
}
