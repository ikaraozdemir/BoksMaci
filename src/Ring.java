public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run () {
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("============ YENİ ROUND =================");
                if(f1.whoIsFist()){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()) {
                        break;
                    }
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {

        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight &&
                this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    public boolean isWin() {
        if (f2.health == 0){
            System.out.println("Maçı kazanan :" + this.f1.name);
            return true;
        }
        if (f1.health == 0){
            System.out.println("Maçı kazanan :" + this.f2.name);
            return true;
        }
        return false;
    }
    public void printScore() {
        System.out.println("------------------------------------------");
        System.out.println(this.f1.name +" Kalan can: " + this.f1.health);
        System.out.println(this.f2.name +" Kalan can: " + this.f2.health);
    }
}
