package com.ipduckhelper;

import java.math.BigInteger;
import java.security.SecureRandom;

public class NaverUtil {
	private final static String Client_ID = "xMVFYICwTOVdYhxSGeI8";
	private final static String Client_Secret = "j9aOydr5SM";
	
	public static String getClientId() {
		return Client_ID;
	}
	public static String getClientSecret() {
		return Client_Secret;
	}
	
	public static String MakeToken() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
}
