
public class Student {

    private String mname;
    private int mgrade;
    private double mgpa;
    private String mschool;
    private String mstreet;
    private int mclazz;

    //constructor

    public Student(String name, int grade, double gpa, String school, int clazz) {
        mname = name;
        mgrade = grade;
        mschool = school;
        mgpa = gpa;
        //this.street = street;
        mclazz = clazz;
    }

    public double getGradepoint(){
    return mgpa;
    }

}



