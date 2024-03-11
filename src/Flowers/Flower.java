package Flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public Flower addFlower(String flower) throws Exception {
        switch (flower){
            case "Sunflower":
                return new Sunflower("Sunflower", 90, 6, 85);
            case "Rose":
                return new Rose("Rose", 100, 4,50);
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
