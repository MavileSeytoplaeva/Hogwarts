package SkyPro.School.Faculties.students;

import SkyPro.School.Faculties.Ravenclaw;
public class RavenclawStudent extends Ravenclaw {
    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance, smart, wise, witty, fullOfCreativity);
    }
    public int getSum() {
        return super.getMagicPower() + super.getTransgressionDistance()
                + getFullOfCreativity()
                + getSmart()
                + getWitty()
                + getWise();
    }
    public String compareWith(RavenclawStudent student1) {
        if (student1.getSum() > getSum()) {
            return student1.getName() + " лучший когтеврановец, чем " + getName();
        } else if (student1.getSum() == getSum()) {
            return "Баллы равны";
        } else {
            return getName() + " лучший когтеврановец, чем " + student1.getName();
        }
    }
}
