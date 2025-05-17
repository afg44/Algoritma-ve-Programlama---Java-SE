package ders06.konu03;

public class ArrayIndex {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 3 };
		System.out.println(sayilar[4]);

		try {
//			System.out.println(sayilar[0]);
			System.out.println(sayilar[4]);
		} catch (StringIndexOutOfBoundsException exception) {
			System.out.println("exception 0");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("exception 1");
		} catch (Exception exception) {
			System.out.println("exception 2");
		} finally {
			System.out.println("Bu satir her ihtimalde calisir");
		}
		System.out.println("main metotu tamamlandi...");

	}
}
