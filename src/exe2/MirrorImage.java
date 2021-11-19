package exe2;

public class MirrorImage {
	public String getImage(String str) {
	StringBuffer sb1 = new StringBuffer(str);
	sb1.append("|");  
	StringBuffer sb2 = new StringBuffer(str);
	sb2.reverse();
	sb1.append(sb2);
	return sb1.toString();
}
}
