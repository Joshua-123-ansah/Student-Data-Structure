
public class CoursesDemo {
    public static void main(String args[]){
        Student josh=new Student("Joshua",1,"Male","MIS");
        Student faddal=new Student("Faddal",16,"Male","MIS");
        Student moha=new Student("Faddal",18,"Male","CS");
        Student emma=new Student("Faddal",20,"Male","CS");
        Student owusu=new Student("Faddal",22,"Male","CS");
        Courses course=new Courses("dataStructures",10);
        course.addStudent(josh,"dataStructures");
        course.addStudent(faddal,"dataStructures");
        course.addStudent(moha,"dataStructures");
        course.addStudent(emma,"dataStructures");
        course.addStudent(owusu,"dataStructures");
        System.out.println(course.lowestAge("dataStructures"));
    }
}

