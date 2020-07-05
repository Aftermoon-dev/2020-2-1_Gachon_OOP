package ex10_1d;

public class ShuffleCipher implements MessageEncoder {
	private int n;
	
	public ShuffleCipher(int n) {
		this.n = n;
	}
	
	public void encode(String plainText) {
		int median = (int) Math.round((plainText.length() / 2));
		
		if(plainText.length() % 2 != 0) {
			median += 1;
		}
		
		String encodeText = plainText;
		for(int repeat = 0; repeat < n; repeat++) {
			String nStr = "";
			char[] firstStr = encodeText.substring(0, median).toCharArray();
			char[] secondStr = encodeText.substring(median).toCharArray();
			for(int i = 0; i < secondStr.length; i++) {
				nStr = nStr + firstStr[i] + secondStr[i];
			}
			
			if(plainText.length() % 2 != 0) {
				encodeText = nStr + firstStr[firstStr.length-1];
			}
			else {
				encodeText = nStr;
			}
		
		}
		
		System.out.println(encodeText);
	}
}
