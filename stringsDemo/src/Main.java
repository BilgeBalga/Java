import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj = " Bugün hava çok güzel. ";  //String bir char arraydir.
        System.out.println(mesaj);


       /* System.out.println("Eleman sayısı : " + mesaj.length());
          System.out.println("5. eleman : " + mesaj.charAt(4));
          System.out.println(mesaj.concat(" Yaşasın!"));

          System.out.println(mesaj.startsWith("B"));  //("") ile başlıyor mu? True/False
          System.out.println(mesaj.endsWith("."));

        System.out.println(mesaj.indexOf('a')); //mesajın içerisinde kaçıncı eleman olduğunu verir.(ilk bulduğu yerde.)
        System.out.println(mesaj.lastIndexOf("a")); //aramaya sağdan başlar.*/

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //2.indexten itibaren yazdırır.
        System.out.println(mesaj.substring(2,5)); //2. indexten 5.indexe kadar yazdırır.

        System.out.println("-------------------------------------------------");

        for (String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim()); //Stringin başındaki ve sonundaki boşlukları atar.



    }
}
