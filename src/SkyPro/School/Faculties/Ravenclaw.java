package SkyPro.School.Faculties;

import SkyPro.School.Hogwarts;

public abstract class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " умны " + smart +
                ", мудры " + wise +
                ", остроумны " + witty +
                ", полны творчества " + fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
}
