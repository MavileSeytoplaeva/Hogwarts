package SkyPro;

import SkyPro.School.Faculties.students.GryffindorStudent;
import SkyPro.School.Faculties.students.HufflepuffStudent;
import SkyPro.School.Faculties.students.RavenclawStudent;
import SkyPro.School.Faculties.students.SlytherinStudent;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер", 25,67,56,43,88);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона Грейнджер", 65,43,78,56,99);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Уизли", 34, 45, 56, 67, 78);
        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой", 53, 56, 12, 87, 45, 66, 77);
        SlytherinStudent grahamMontagu = new SlytherinStudent("Грэхэм Монтегю", 87, 65, 37, 96, 23, 73, 88);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гойл", 80, 12, 81, 39, 24, 83, 45);
        HufflepuffStudent zachariasSmith = new HufflepuffStudent("Захария Смит", 98, 18, 60, 37, 55);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори", 67, 43, 90, 56, 71);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 43, 56, 98, 13, 75);
        RavenclawStudent zhouChang = new RavenclawStudent("Чжоу Чанг", 87, 35, 26, 95, 36, 77);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 76, 54, 23, 76, 99, 54);
        RavenclawStudent marcusBelby = new RavenclawStudent("Маркус Белби", 61, 24, 75, 25, 65, 11);
        harryPotter.compareWith(cedricDiggory);
        gregoryGoyle.compareWith(marcusBelby);
    }

}
