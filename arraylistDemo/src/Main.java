import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());
        //System.out.println(sayilar.get(0));
        //sayilar.set(2,100);

        //sayilar.remove(0); // belirtilen indexteki elemanı ve indexi siler
        //sayilar.clear();
       // System.out.println(sayilar.get(0));

        for(Object i: sayilar){  //Object ->> [1,10,'Ankara'] // for(int i: sayilar); --> [1,2,3]
            System.out.println(i);
        }

    }
}
