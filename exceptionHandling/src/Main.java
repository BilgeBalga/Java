import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        try
        {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) { // exception = .ArrayIndexOutOfBoundsException
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Loglandı : " + exception);
        } finally {
            System.out.println("Ben her türlü çalışırım.");
        }

    }
}
