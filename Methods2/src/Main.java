
public class Main {

	public static void main(String[] args) {
		int sayi = topla(10,24);
		System.out.println(sayi);
		String mesaj = sehirVer();
		System.out.println(mesaj);
		int toplama =topla2(1,2,3,4,5,6,7,8,9,10);
		System.out.println(toplama);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}
	public static int topla(int sayi1, int sayi2) {
	  return sayi1+sayi2;
	}
	  public static int topla2(int... sayilar) {
		  int toplam=0;
		 for(int sayi : sayilar) {
			 toplam = toplam + sayi;
		 }
		 return toplam;
	  }
	
	public static String sehirVer() {
		return "İstanbul";
	}
}
