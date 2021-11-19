package exe3;

public class ConvertAlphabets{
	private static final String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	private int consLength = consonants.length();

	public String alterString(String str) {
	
	int index;
	char[] charArray = str.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		index = consonants.indexOf(charArray[i]);
		if(index != -1) {
			charArray[i] = consonants.charAt((index + 1) % consLength);
		}
	}
	return new String(charArray);
}
}
