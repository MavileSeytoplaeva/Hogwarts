package SkyPro.School.Faculties;

import SkyPro.School.Faculties.students.GryffindorStudent;
import SkyPro.School.Hogwarts;

public abstract class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private Gryffindor[] gryffindors;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() +
                " благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + courage;
    }
//
//    public int getSum(GryffindorStudent student) {
//        return super.getMagicPower() + super.getTransgressionDistance()
//                + nobility
//                + honor
//                + courage;
//    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
}
