public abstract class GameCalculator {
    public abstract void hesapla(); //inherit edilen tarafından override edilmek zorunda.

    public void gameOver() {
        System.out.println("Oyun bitti");
    }
}
