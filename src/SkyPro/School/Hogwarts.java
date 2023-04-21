package SkyPro.School;
public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;


    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return
                "Имя " + name + '\'' +
                ", Сила магии " + magicPower +
                ", расстояние трансгресии " + transgressionDistance;
    }
public void compareWith(Hogwarts student1) {
    if (getMagicPower() > student1.getMagicPower()) {
        System.out.println(getName() + "  обладает бОльшей мощностью магии, чем " + student1.getName());
    } else if (getMagicPower() == student1.getMagicPower()) {
        System.out.println("Баллы равны");
    } else {
        System.out.println(student1.getName() + "  обладает бОльшей мощностью магии, чем " + getName());
    }

    if (getTransgressionDistance() > student1.getTransgressionDistance()) {
        System.out.println(getName() + "  обладает бОльшим расстоянием трансгрессии, чем " + student1.getName());
    } else if (getMagicPower() == student1.getMagicPower()) {
        System.out.println("Баллы равны");
    } else {
        System.out.println(student1.getName() + "  обладает бОльшим расстоянием трансгрессии, чем " + getName());
    }

    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
