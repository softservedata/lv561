package com.softserve.practical.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

	public static boolean checkUserName(String inputUserName) {
		String pattern = "[a-z_A-Z0-9]{3,15}";; //"[a-z_A-z0-9]{3,15}";// "\\w{3,15}"; "^[a-z_A-z0-9]{3,15}$", "^[a-z0-9_-]{3,15}$"-from
												// presentaition;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inputUserName);
		return m.matches();
	}

	public static void main(String[] args) {
		
		List <String> listUserNames = new ArrayList <>();
		listUserNames.add("User_123");
		listUserNames.add("@User_123");
		listUserNames.add("User%123");
		listUserNames.add("User_123^");
		listUserNames.add("uSer123");
		listUserNames.add("user_123");
		listUserNames.add("USER_123");
		listUserNames.add("user");
		listUserNames.add("USER");
		listUserNames.add("123");
		listUserNames.add("US");
		listUserNames.add("us");
		listUserNames.add("user_Name_more_then_15_characters_of_the_Latin_alphabet");
		listUserNames.add("User 123");
		listUserNames.add("User_123%");
		listUserNames.add("User^123");
		
		for(String listElement : listUserNames) {
			System.out.println("User Name: "+ listElement + " - "+ UserName.checkUserName(listElement) );
			
		}
		
		
		
		
	}

}
