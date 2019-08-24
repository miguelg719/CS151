
public class Unique {

	public static String uniqueLetters(String str) {
		
		String result= "";
		int count=0;
		str = str.replace(" ", "").toLowerCase();
		char letter;
		
		for(int i=0; i < str.length(); i++) {
			letter = str.charAt(i);
			for(int j=0; j < str.length(); j++) {
					if(str.charAt(j) == letter) {
						count++;
					}
			}
			if(count == 1) {
				result = result + letter;
			}
			count = 0;
		}
		
		return result;
	}

	public static void main(String[] args) {
		String res = uniqueLetters("harrasses");
		System.out.println(res);
	}

}
