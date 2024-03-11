package Animals;

public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    public static Animal addAnimal(String name) throws Exception {
        switch (name){
            case "Sheep":
                return new Sheep("animal", "Sheep", Size.SMALL, "");
            case "Cow":
                return new Cow("animal", "Cow", Size.BIG, "");
            case "Horse":
                return new Horse("animal", "Horse", Size.BIG, "");
            case "Chicken":
                return new Chicken("animal", "Chicken", Size.SMALL, "");
            default:
                throw new Exception("Animal specification needed.");
        }
    }

    public Animal(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Animals.Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
