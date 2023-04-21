package SkyPro.School.Faculties;

import SkyPro.School.Hogwarts;

public abstract class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() +
                " трудолюбивы " + hardworking +
                ", верны " + loyal +
                ", честны " + honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
}
