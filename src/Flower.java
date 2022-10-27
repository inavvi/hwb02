public class Flower {

    String flower;
    String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public String getFlower() {
        return flower;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Flower(String flower, String flowerColor, String country, double cost, int lifeSpan) {
        this.flower=flower;
        if (flowerColor==null || flowerColor.isEmpty()) {
            this.flowerColor="белый";
        } else {
            this.flowerColor = flowerColor;
        }
        this.country=country;
        this.cost=cost;
        this.lifeSpan=lifeSpan;
    }



    public void flowerInfo () {
        System.out.println(flower+" цвет "+flowerColor+", страна происхождения "+country+", стоимость "+cost+", срок стояния "+lifeSpan+".");
    }

    public static void calculationflower(Flower... flowers) {
        double totalCost = 0;
        double finalCost=0;
        int minLifeSpan=Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan<minLifeSpan) {
                minLifeSpan=flower.lifeSpan;
            }
            totalCost += flower.getCost();
        }
        finalCost=totalCost + totalCost*0.1;
        finalCost=Math.round(finalCost*100);
        finalCost=finalCost/100;
        System.out.println("Стоимость букета: "+finalCost+", срок стояния "+minLifeSpan+" дней.");
    }

}
