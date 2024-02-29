public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ahmet", 15, 100,85,50, 50);
        Fighter f2 = new Fighter("Mehmet", 10, 110, 90, 20, 50);
        Ring ring1 = new Ring(f1,f2,80,120);
        ring1.run();
    }
}