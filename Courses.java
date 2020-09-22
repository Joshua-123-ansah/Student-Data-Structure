import java.util.ArrayList;

public class Courses {
    private String name;
    private int quantity;

    ArrayList<Student> webTechnology=new ArrayList<Student>();
    ArrayList<Student> dataStructures=new ArrayList<Student>();

    /**
     * Default constructor
     */
    public Courses(){
        this.name="no name";
        this.quantity=0;
    }

    /**
     * Overloaded constructor
     * @param name
     * @param quantity
     */
    public Courses(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    /**
     * This adds to respective courses
     * @param student
     * @param course
     */
    public void addStudent(Student student,String course){
       if(course.equals("webTechnology")){
           if(webTechnology.size()>=quantity)
               System.out.println("The class is full");
           webTechnology.add(student);
       }
       else if(course.equals("dataStructures")){
           if(dataStructures.size()>=quantity)
               System.out.println("The class is full");
           dataStructures.add(student);
       }
    }

    /**
     * This return details about the person with the lowest age in each course.
     * @param course
     * @return lowest age
     */
    public String lowestAge(String course) {
        int lowestAge = Integer.MAX_VALUE;
        Student lowestAgeStudent = null;
        if (course == "webTechnology") {
            for (Student st : webTechnology) {
                if (st.getAge() < lowestAge) {
                    lowestAge = st.getAge();
                    lowestAgeStudent = st;
                }
            }
            System.out.println(lowestAge);
            return lowestAgeStudent.toString();
        }
        if (course == "dataStructures") {
            for (Student st : dataStructures) {
                if (st.getAge() < lowestAge) {
                    lowestAge = st.getAge();
                    lowestAgeStudent = st;
                }
            }
            System.out.println("Lowest Age: "+lowestAge);
            return lowestAgeStudent.toString();
        }
        return "Details of course not available";
    }

    /**
     * This return  the details of the oldest person in each course
     * @param course
     * @return oldestStudent.toString()
     */
    public String oldestStudent(String course){
        int oldestStudentAge=0;
        Student oldestStudent=null;
        if(course=="webTechnology"){
            for(Student st: webTechnology){
                if(st.getAge()>oldestStudentAge){
                    oldestStudentAge=st.getAge();
                    oldestStudent=st;
                }
            }
            System.out.println("Oldest Age: "+oldestStudent.getAge());
            return oldestStudent.toString();
        }

        else if(course=="dataStructures"){
            for(Student st: dataStructures){
                if(st.getAge()>oldestStudentAge){
                    oldestStudentAge=st.getAge();
                    oldestStudent=st;
                }
            }
            System.out.println("Oldest Age: "+oldestStudent.getAge());
            return oldestStudent.toString();
        }
        return "Detail of course not available";
    }
}



