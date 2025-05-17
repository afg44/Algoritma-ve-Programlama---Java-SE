package ders07.konu01;


import java.util.Map;
import java.util.Hashtable;

/**
 Java'da Hashtable, anahtar-değer çiftlerini saklamak için kullanılan bir veri yapısıdır
 ve genellikle belirli güvenlik ve eşzamanlılık gereksinimleri olduğunda tercih edilir.

 -Eşzamanlılık Desteği: Hashtable, metodlarını synchronized olarak uygular, yani çoklu
 iş parçacıklı (multi-threaded) ortamlarda güvenli bir şekilde kullanılabilir.
 -Güvenliğe Önem Veren Yapısı: HashMap gibi alternatifler eşzamanlılık konusunda
 hassas olabilirken, Hashtable thread-safe bir veri yapısı sunar.
 -Anahtarları ve Değerleri Yönetme: null değerleri ve anahtarları kabul etmeyen Hashtable,
 veri bütünlüğünü korumaya yardımcı olur.
 -Hızlı Veri Erişimi: Hashing mekanizması sayesinde put(), get(), ve remove() gibi işlemler
 ortalama O(1) zaman karmaşıklığıyla çalışır.
 */

public class HashTableDemo {
    public static void main(String[] args){

//    	Map<String, Integer> students=new HashMap<>();
        Map<String, Integer> students=new Hashtable<>();

        students.put("Mert",56);
        students.put("Nil",23);
        students.put("Suzan",67);
        students.put("Kerim",92);
        students.put("Mert",45);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }

    }
}