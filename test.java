
public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Test!!!!");

String s="WATER";
//String s="WELCOME";
int half=s.length()/2;
String firstHalf=s.substring(0,half);
String secondHalf=s.substring(half,s.length());
System.out.println(firstHalf);
System.out.println(secondHalf);
int j=0;
String res="";

for(int i=0;i<s.length();i++) {
	for(int k=s.length()-1;k>i;k--) {
		System.out.print(" ");
	}
	if(j<secondHalf.length()) {
		res+=secondHalf.charAt(j);
		System.out.println(res);
		j+=1;
		
	}
	else {
		res+=firstHalf.charAt(i-j);
		System.out.println(res);
	}
	
}
	}

}
