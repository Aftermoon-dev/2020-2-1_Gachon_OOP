package ex10_1d;

public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	
	public SubstitutionCipher(int shift) {
		this.shift = shift;
	}
	
	public void encode(String plainText) {
		char[] encodeStr = new char[plainText.length()];
		
		for(int i = 0; i < encodeStr.length; i++) {
			encodeStr[i] = (char) (plainText.charAt(i) + this.shift);
		}
		
		System.out.println(String.valueOf(encodeStr));
	}
}
