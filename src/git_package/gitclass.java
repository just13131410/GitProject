package git_package;

public class gitclass {
	public static void main(String args[]){  
		gitclass Klasse = new gitclass();
		int iSquare = Klasse.square(20);
	     System.out.println(iSquare);
	     
	    int count = Klasse.countA("wararars");
	     System.out.println(count);
	     
	 } 
	
	public int square (int x) {
		return x*x;
	}
	public int countA (String sWord) {
		int count = 0;
		for (int i = 0; i < sWord.length(); i++) {
			if (sWord.charAt(i) == 'a' || sWord.charAt(i) == 'A') {
				count++;
			}
				
		}
		return count;
	}


}
