import java.util.*;
public class PasswordGenerator {
    public static String generatePassword(int n){
    	String upper= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String lower="abcdefghijklmnopqrstuvwxyz";
    	String digits ="0123456789";
    	String special ="~!@#$%^&*()_+-'?/.><,:;";
    	String symbols= upper +lower+ digits +special;
    	int m= symbols.length();
    	String password ="";
    	Random r= new Random();
    	for(int i=0;i<n;i++) {
    		password += symbols.charAt(r.nextInt(m));
    	}
     return password; 
    }
	public static void main(String[] args) {
	 System.out.println("Password of length 15 :"+ generatePassword(15));
     System.out.println("Password of length 10 :"+ generatePassword(10));
     System.out.println("Password of length 9 :"+ generatePassword(9));
     System.out.println("Password of length 8 :"+ generatePassword(8));
     System.out.println("Password of length 7 :"+ generatePassword(7));
     System.out.println("Password of length 6 :"+ generatePassword(6));
     System.out.println("Password of length 5 :"+ generatePassword(5));
     System.out.println("Password of length 4 :"+ generatePassword(4));
     System.out.println("Password of length 3 :"+ generatePassword(3));
     
		
		
		
		
	}

}
