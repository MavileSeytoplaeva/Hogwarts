package SkyPro.School.Faculties.students;

import SkyPro.School.Faculties.Slytherin;
public class SlytherinStudent extends Slytherin {
    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance, cunning, determination, ambition, resourcefulness, lustForPower);
    }
    public int getSum() {
        return super.getMagicPower() + super.getTransgressionDistance()
                + getAmbition()
                + getCunning()
                + getDetermination()
                + getLustForPower()
                + getResourcefulness();
    }
    public String compareWith(SlytherinStudent student1) {
        if (student1.getSum() > getSum()) {
            return student1.getName() + " лучший слизеринец, чем " + getName();
        } else if (student1.getSum() == getSum()) {
            return "Баллы равны";
        } else {
            return getName() + " лучший слизеринец, чем " + student1.getName();
        }
    }
}
