
public class stringReverse {
	
	public static String reverse (String str){
		
		if(str.isEmpty()){
			System.out.println("The string is empty");
			return str;
			}
		
		int p1=0;
		int p2=str.length()-1;
		System.out.println("String length: " +p2);
		char[] characters = str.toCharArray();
		while(p1<p2){
			char temp = characters[p1];
			characters[p1] = characters[p2];
			characters[p2]=temp;
			++p1;
			--p2;
		}
		return new String(characters);
	}
	
	
	public static void main(String[] args){
		String result=stringReverse.reverse("trying");
		System.out.println("Reversed String: " +result);
	}
}
