package Flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        setPrice(price);
        setNeededArea(neededArea);
        setChanceOfGrowth(chanceOfGrowth);
    }

    public void waterFlower(){
        setChanceOfGrowth(chanceOfGrowth + 5);
    }

    public static Flower addFlower(String flower) throws Exception {
        switch (flower) {
            case "Sunflower":
                return new Sunflower("Sunflower", 90, 6, 85);
            case "Rose":
                return new Rose("Rose", 100, 4, 50);
            case "Daisy":
                return new Daisy("Daisy", 65, 4, 60);
            case "Tulip":
                return new Tulip("Tulip", 60, 4, 65);
            case "Poppy":
                return new Poppy("Poppy", 55, 4, 70);
            default:
                throw new Exception("Flower specification needed.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        if (neededArea > 0) {
            this.neededArea = neededArea;
        }
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        if (chanceOfGrowth > 100) {
            chanceOfGrowth = 100;
        } else if (chanceOfGrowth < 0) {
            chanceOfGrowth = 0;
        } else {
            this.chanceOfGrowth = chanceOfGrowth;
        }
    }

    @Override
    public String toString() {
        return "Flowers.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
