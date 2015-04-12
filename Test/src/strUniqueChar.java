
public class strUniqueChar {
	
	public static boolean isUniqueChar(String str){
		
		Boolean[] char_set = new Boolean[256];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			char currChar = str.charAt(i);
			
			System.out.println("Value of current character : " +currChar);
			System.out.println("Value of int val : " +val);
			
			
			if(char_set[val]!=null && char_set[val]!= false){
				System.out.println("Inside if already exist loop");
				return false;
			}
			
			char_set[val]=true;
		}
	
		
		return true;
	}
	
	public static void main(String[] args){
		//strUniqueChar unique = new strUniqueChar();
		strUniqueChar.isUniqueChar("abcd");
		
	}

}

