
public class removeDups {

	public static char[] removeDuplicates(String str1){
		//String result=null;
		if (str1 == null){
			return str1.toCharArray();
		}
		
		char[] str=str1.toCharArray();
		System.out.println("Length of the String: " +str1.length());
		int len = str.length;
		System.out.println("Length of the Character Array: " +len);
		if (len < 2) return str1.toCharArray();
		
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
		int j;
		for (j = 0; j < tail; ++j) {
		if (str[i] == str[j]){
			break;
		}
			
		}
		if (j == tail) {
		str[tail] = str[i];
		++tail;
		}
		}
		str[tail] = 0;
		
		
		return str;
	}
	
	public static void main(String[] args){
		char[] result=removeDups.removeDuplicates("Hello");
		for(int i=0; i<5; i++){
		System.out.println("Returned string: " +result[i]);
		}
	}
}
