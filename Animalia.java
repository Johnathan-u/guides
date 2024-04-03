public class Animalia {
    private String name;
    private int age;
    private int height;
    private int weight;
    private boolean healthy; // Correctly changed to boolean
    private boolean trained; // Correctly changed to boolean

    // Constructor
    public Animalia(String name, int age, int height, int weight, boolean healthy, boolean trained) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.healthy = healthy;
        this.trained = trained;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean getTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}

