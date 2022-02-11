public class Main {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzei : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
           // case'G': 2 değer içinde aynı sonuç istiyorsan.
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
