public class Match {
    Fighter fOne;
    Fighter fTwo;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.fOne = f1;
        this.fTwo = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if(isCheck()) {

            while(this.fOne.health > 0  &&  this.fTwo.health > 0) {

                fTwo.health = fOne.hit(fTwo);
                System.out.println(this.fTwo.name + " sağlık: " + this.fTwo.health);

                fOne.health = fTwo.hit(fOne);
                System.out.println(this.fOne.name + " sağlık: " + this.fOne.health);

            }

            isWin();


        }else {
            System.out.println("Müsabakanın başlaması için sporcuların sikletleri aynı olmalı! ");
        }
    }

    boolean isCheck() {
        return (this.fOne.weight >= minWeight && this.fOne.weight <= maxWeight) && (this.fTwo.weight >= minWeight && this.fTwo.weight <= maxWeight);
    }

    boolean isWin() {

        if (this.fTwo.health > this.fOne.health) {
            System.out.println(this.fTwo.name + " KAZANDI");
        }else if(this.fTwo.health == this.fOne.health){
            System.out.println(" MAÇ BERABERE BİTTİ");
        }else {
            System.out.println(this.fOne.name + " KAZANDI");
        }

        return true;
    }

}
