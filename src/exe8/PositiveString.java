package exe8;

class PositiveString{
	
	public boolean check(String str) {
		
		boolean flag = false;
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++) {
			char temp1 = charArray[i];
			char temp2 = charArray[i+1];
			int ascii_temp1 = (int) temp1;
			int ascii_temp2 = (int) temp2;
			
			if(ascii_temp1 < ascii_temp2==true) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}