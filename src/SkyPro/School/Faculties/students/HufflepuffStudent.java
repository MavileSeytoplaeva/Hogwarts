package SkyPro.School.Faculties.students;

import SkyPro.School.Faculties.Hufflepuff;
public class HufflepuffStudent extends Hufflepuff {
    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance, hardworking, loyal, honest);
    }
    public int getSum() {
        return super.getMagicPower() + super.getTransgressionDistance()
                + getHardworking()
                + getLoyal()
                + getHonest();
    }
    public String compareWith(HufflepuffStudent student1) {
        if (student1.getSum() > getSum()) {
            return student1.getName() + " лучший пуффендуец, чем " + getName();
        } else if (student1.getSum() == getSum()) {
            return "Баллы равны";
        } else {
            return getName() + " лучший пуффендуец, чем " + student1.getName();
        }
    }
}
