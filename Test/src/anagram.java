import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


public class anagram {
	
	public static boolean anagramCheck(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		
		ResultSet rs;
		Connection conn;
		Statement stmt;
		int[] letters = new int[256];
		//int num_unique_chars=0;
		//int num_completed_t=0;
		char[] s_array = s.toCharArray();
		char[] t_array = t.toCharArray();
		for (int i=0; i<s_array.length; i++){
			letters[s_array[i]]++;	
			letters[t_array[i]]--;
			}
		for(int j=0; j<256; j++){
			if(letters[j]!=0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args){
		boolean result = anagram.anagramCheck("e", "d");
		System.out.println("Are two input strings anagram? " +result);
	}
}
