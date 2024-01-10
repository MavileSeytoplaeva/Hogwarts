
package SkyPro.School.Faculties.students;
import SkyPro.School.Faculties.Gryffindor;
public class GryffindorStudent extends Gryffindor {

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance, nobility, honor, courage);
    }

    public int getSum() {
        return super.getMagicPower() + super.getTransgressionDistance()
                + getNobility()
                + getHonor()
                + getCourage();
    }
    public String compareWith(GryffindorStudent student1) {
        if (student1.getSum() > getSum()) {
            return student1.getName() + " лучший гриффиндорец, чем " + getName();
        } else if (student1.getSum() == getSum()) {
            return "Баллы равны";
        } else {
            return getName() + " лучший гриффиндорец, чем " + student1.getName();
        }
    }
}
