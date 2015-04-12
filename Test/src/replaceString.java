
public class replaceString {
	
	public static String replaceSpaces(String originalString, String replaceWith){
		//String original=originalString;
		//String replaceWith=replaceWith;
		char[] origStr=originalString.toCharArray();
		//char[] origStr={'s', ' ', 'g', 'y'};
		System.out.println("Original string lenght: " +origStr.length);
		//char[] tobeReplaced=replaceWith.toCharArray();
		int newLength;
		//Count number of spaces in the string
		int spaceCount=0;
		for(int i=0; i<origStr.length;i++){
			if(origStr[i] == ' '){
				spaceCount++;
			}
		
		
		}
		newLength=origStr.length+spaceCount*2;
		//System.out.println("Trying to retrive expanded array: " +origStr[33]);
		System.out.println("New length of the String: " +newLength);
		origStr[newLength]='\0';
		for(int i=origStr.length-1; i>=0; i++){
			if(origStr[i] == ' '){
				origStr[newLength-1]='0';
				origStr[newLength-2]='2';
				origStr[newLength-3]='%';	
				newLength=newLength-3;
			}
			else{
				origStr[newLength-1]=origStr[i];
				newLength=newLength-1;
			}
		}
		return origStr.toString();
		
	}

		
	public static void main(String[] args){
		String originalString= "Original string to be replaced";
		String replaceWith = "%20";
		String result=replaceString.replaceSpaces(originalString, replaceWith);
		System.out.println("Replaced string: "+result);
	}
}
