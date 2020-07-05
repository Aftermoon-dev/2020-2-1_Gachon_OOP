package ex10_1d;

public class ex10_1d {
	public static void main(String[] args) {
		SubstitutionCipher sc1 = new SubstitutionCipher(3);
		SubstitutionCipher sc2 = new SubstitutionCipher(1);
		sc1.encode("abcdefghi");
		sc2.encode("HelloJava");
		
		ShuffleCipher shc1 = new ShuffleCipher(1);
		ShuffleCipher shc2 = new ShuffleCipher(2);
		shc1.encode("abcdefghi");
		shc2.encode("helloworld");
	}
}
