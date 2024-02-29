public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double whoFirst;


    public Fighter(String name, int damage, int health, int weight, double dodge, double whoFirst) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.whoFirst = whoFirst;

    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " birim kadar hasar verdi.");

        if (foe.isdodge()) {
            System.out.println("--------------------------------");
            System.out.println(foe.name + " gelen hasarı savurdu.");
            System.out.println("--------------------------------");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean isdodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    public boolean whoIsFist() {
        double randomNumber2 = Math.random() * 100;
        return randomNumber2 <= this.whoFirst;
    }
}