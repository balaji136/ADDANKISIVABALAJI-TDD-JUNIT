package junitDemo;

public class Remove2As {

	public String removeFirst2A(String string) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(string);
		if(sb.charAt(0)=='A') {
			sb=sb.deleteCharAt(0);
			if(sb.charAt(0)=='A') {
				sb=sb.deleteCharAt(0);
			}
		}
		else if(sb.charAt(1)=='A') {
			sb=sb.deleteCharAt(1);
		}
		
		
		return sb.toString();
	}
	

}

