package exe4;

class shiftDigits{
	
	public int modifyNumber(int number1) {
		
		Integer num = number1;
		int output;
		String str_num,new_num="";
		
		str_num = num.toString();
		StringBuffer sb = new StringBuffer(new_num);
		char[] charArray = str_num.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++) {
			Integer temp = Math.abs(charArray[i] - charArray[i+1]);
			sb.append(temp.toString());
		}
		char digit = str_num.charAt(str_num.length()-1);
		sb.append(digit);
		output = Integer.parseInt(sb.toString());
		
		return output;
	}
}