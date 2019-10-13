package Laborator1;

public class Main {
    public static void main(String[] args) {

        float media_1 , media_2 , media_3;
        Monitor monitor = new Monitor();
        Monitor monitor1 = new Monitor();
        monitor1.setParameters("blue" , 22.3f , 15.1f);
        monitor.setParameters("red" , 31.2f , 22.5f);
        String color = monitor.getColor();
        Float dimension = monitor.getDimension();
        Float resolution = monitor.getResolution();

        if(monitor.getDimension() > monitor1.getDimension())
            System.out.println("First monitor is bigger " + monitor.getDimension());
        else
            System.out.println("Second monitor is bigger " + monitor1.getDimension());

        System.out.println("Monitor's color is : " + color + "\nDimension is :" + dimension + "\nResolution is :" + resolution +"\n");

        Student st_1 = new Student("Aleg" , 19 , 9.1f);
        Student st_2 = new Student("Oleg" , 19 , 7.6f);
        Student st_3 = new Student("Mihai" , 19 , 9.51f);
        Student st_4 = new Student("Mishanea" , 19 , 8.68f);
        Student st_5 = new Student("Cristian-Dumitru" , 19 , 10f);
        Student st_6 = new Student("Jora" , 19 , 5.6f);

        University university_1 = new University("UTM" , 1964);
        University university_2 = new University("ASEM" , 1965);
        University university_3 = new University("USM" , 1955);

        university_1.adding(st_1);
        university_1.adding(st_2);
        university_3.adding(st_3);
        university_3.adding(st_4);
        university_2.adding(st_5);
        university_2.adding(st_6);

        media_1 = media(st_1.getMark() , st_2.getMark());
        media_2 = media(st_3.getMark() , st_4.getMark());
        media_3 = media(st_5.getMark() , st_6.getMark());

        System.out.println("Media of students from UTM is :" + media_1
                + "\nMedia of students form ASEM is :" + media_3 + "\nMedia of students form USM is :" + media_2);

        System.out.println(university_1.getStudents().get(0).getName());
    }
    public static float media(float tmp_1 , float tmp_2){
        float result = (tmp_1 + tmp_2) / 2;
        return result;
    }
}
