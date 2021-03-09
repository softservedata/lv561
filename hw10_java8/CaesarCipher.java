package hw10_java8;

/*
 * Homework Task #2.  
 * Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n).
 * Method encrypt should take a string and return coded string 
 * where every letter is moved on n positions in alphabet 
 * (e.g. encrypt("abc", 3) returns "def“). 
 * Method decrypt should return decoded value.
 */
public class CaesarCipher {
	
	public static StringBuffer entcrypt(String str, int n) {		
		StringBuffer result= new StringBuffer(); 
		  
        for (int i = 0; i < str.length(); i++) { 
            if (Character.isUpperCase(str.charAt(i))) { 
                char ch = (char)(((int)str.charAt(i) + n - 65) % 26 + 65); 
                result.append(ch); 
            } else { 
                char ch = (char)(((int)str.charAt(i) + n - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 		
		return result;
	}
	
	public static StringBuffer decrypt(String str, int n) {
		StringBuffer result= new StringBuffer(); 
		  
        for (int i = 0; i < str.length(); i++) { 
            if (Character.isUpperCase(str.charAt(i))) { 
                char ch = (char)(((int)str.charAt(i) + (26-n) - 65) % 26 + 65); 
                result.append(ch); 
            } else { 
                char ch = (char)(((int)str.charAt(i) + (26-n) - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 		
		return result;
	
	}

}
