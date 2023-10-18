package functionalprog;

public class Animal {

    private String name;

    private int weight;


    private boolean canSwim;

    private boolean canClimb;

    public Animal(String name, int weight, boolean canSwim, boolean canClimb) {
        this.name = name;
        this.weight = weight;
        this.canSwim = canSwim;
        this.canClimb = canClimb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanClimb() {
        return canClimb;
    }

    public void setCanClimb(boolean canClimb) {
        this.canClimb = canClimb;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", canSwim=" + canSwim +
                ", canClimb=" + canClimb +
                '}';
    }
}
