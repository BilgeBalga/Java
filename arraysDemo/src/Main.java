public class Main {

    public static void main(String[] args) {
	    String ogrenci1 = "Engin";
        String ogrenci2 = "Bilge";
        String ogrenci3 = "Eylül";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("----------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Bilge";
        ogrenciler[2] = "Eylül";

        for (int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------------");
        
        //Ogrenciler dizisindeki her bir elemanı gez. O anki elemana takma isim ver.
        for(String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
