public class Main {

    public static void main(String[] args) {
        //(220/284) 220= 1den başlayıp 220ye kadar bolenlerin sayısı 280 --- 280i bölen sayıların toplamı 220
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1%i == 0) {
                total1 = total1 + i;
            }
        }
            for (int i = 1; i < number2; i++) {
                if (number2%i == 0) {
                    total2 = total2 + i;
                }
            }

            if (total1==number2 || total2==number1){
                System.out.println("bu iki sayı Arkadaş sayılardır");
            } else {
                System.out.println("bu iki sayı Arkadaş sayı değildir.");
            }
    }
}

