package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="malayalam";
String str1;
char[] test=str.toCharArray();
for (int i = 0; i < test.length; i++) {
	if(i%2!=0) {
		test[i]=Character.toUpperCase(test[i]);
		continue;
				
	}
	
}
System.out.println(test);
	}

}
