package ders09.konu01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Object serialization *
 Bir sınıfın serileştirilebilir olması için java.io.Serializable
 arayüzünü uygulaması gerekir. Bu arayüz herhangi bir metod
 içermez (Marker Interface); sadece JVM'e "Bu sınıf güvenle
 baytlara dönüştürülebilir" mesajını verir.
 * * * *
 * Dosyaya Obje Yazmanın Teknik Avantajları *
 1. Nesne Kalıcılığı (Persistence)
 Normal şartlarda bir program kapandığında, bellekteki (RAM) tüm nesneler silinir.
 Programı bir hafta sonra tekrar açtığınızda, kaldığınız yerden devam edebilir
 ve nesneyi eski haliyle yükleyebilirsiniz.
 2. Ağ Üzerinden Veri Aktarımı
 Farklı bilgisayarlar veya sunucular birbirine doğrudan Java nesnesi gönderemez.
 Verinin kablolar üzerinden akabilmesi için standart bir formatta olması gerekir.
 3. Derin Kopyalama (Deep Copy)
 Nesneyi serileştirip hemen ardından (bellekte) geri serileştirirseniz,
 orijinalinden tamamen bağımsız, birebir aynı verilere sahip yeni bir kopya
 elde edersiniz.
 */

public class DosyaYazmaDemo02 {

	public static void main(String[] args) {

		String fileName = "res//Ders09_Konu01_DosyaOps_2.txt";
		ObjectOutputStream outputStream = null;

		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
		} catch (IOException e) {
			System.out.println("Exception!");
			System.exit(0);
		}

		SerializableObjectClass karinca = new SerializableObjectClass("Karinca", 1000, 1.15);
		SerializableObjectClass orumcek = new SerializableObjectClass("Orumcek", 100, 0.5);

		try {
			outputStream.writeObject(karinca);
			outputStream.writeObject(orumcek);
			outputStream.close();
		} catch (IOException e) {
			System.out.println(e);
			System.exit(0);
		}

		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
		} catch (IOException e) {
			System.out.println("Error opening input file " + fileName + ".");
			System.exit(0);
		}
		SerializableObjectClass readOne = null, readTwo = null;
		try {
			readOne = (SerializableObjectClass) inputStream.readObject();
			readTwo = (SerializableObjectClass) inputStream.readObject();
			inputStream.close();
		} catch (Exception e) {
			System.exit(0);
		}
		System.out.println("Dosyadan okunan nesneler:\n" + " file: '" + fileName + "'");
		System.out.println(readOne);
		System.out.println();
		System.out.println(readTwo);
		System.out.println("Bitti.");
	}
}