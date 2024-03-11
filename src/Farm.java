import Flowers.Flower;

import java.util.ArrayList;

public class Farm {
    private String name;
    private ArrayList<Flower> garden;
    private int size = 100;

    public int getFlowersSize() {
        int flowerSize = 0;
        for (int i = 0; i < garden.size(); i++) {
            flowerSize += garden.get(i).getNeededArea();
        }
        return flowerSize;
    }

    public void addFlower(String name) throws Exception {
        Flower f = Flower.addFlower(name);
        if ((f.getNeededArea() + getFlowersSize()) > size) {
           garden.add(f);
        }
    }
}
