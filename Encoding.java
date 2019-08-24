import java.util.*;

public class Encoding {
	public static Set<String> morseCodes(int m, int n) {
		Set<String> result = new TreeSet<>();
		if (m == 0 && n == 0){
			result.add("");
		}
		else if (m == 1 && n == 0){
			result.add(".");
		}
		else if (m == 0 && n == 1){
			result.add("-");
		}
		else{
			if(m > 0) {
				Set<String> subresult1 = morseCodes(m-1, n);
				for(String str : subresult1){
					// append "." to str and add it to "result"
					str = "."+str;
					result.add(str.toString());
				}
			}
			if(n > 0) {
				Set<String> subresult2 = morseCodes(m, n-1);

				for(String str : subresult2){
					// append "-" to str and add it to "result"
					str = "-"+str;
					result.add(str.toString());
				}
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.print(morseCodes(2,2));
	}
}