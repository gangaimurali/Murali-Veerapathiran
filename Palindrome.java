package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="malayalam";
		String Rev="";
		
		for (int i = inp.length()-1; i >= 0; i--) {
			Rev=Rev+inp.charAt(i);
					}
		if(inp.equalsIgnoreCase(Rev)) {
			System.out.println(inp+" is Palindrome");
		}
			else
			{
				System.out.println(inp+" is not a Palindrome");	
			}
				
		}
	}


