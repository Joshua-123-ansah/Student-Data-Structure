
class Student{
    private String name;
    private int age;
    private String gender;
    private String major;

    /**
     * @brief: Default Constructor to Initialize class
     */
    Student(){
        this.name="No name yet";
        this.gender="No gender yet";
        this.age=0;
        this.major="No major yet";
    }

    /**
     * @param name
     * @param age
     * @param gender
     * @param major
     */
    Student(String name,int age,String gender, String major){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.major=major;
    }

    /**
     * @brief: Accessor method for name instance variable
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * @brief: Accessor method for age instance variable
     * @return age
     */
    public int getAge(){
        return age;
    }
    /**
     * @brief: Accessor method for gender instance variable
     * @return gender
     */
    public String getGender(){
        return gender;
    }
    /**
     * @brief: Accessor method for major instance variable
     * @return major
     */
    public String getMajor(){
        return major;
    }
    /**
     * @brief: Mutator method to set name instance variable
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * @brief: Mutator method to set age instance variable
     * @param age
     */
    public void setAge(int age){
        this.age=age;
    }
    /**
     * @brief: Mutator method to set gender instance variable
     * @param gender
     */
    public void setGender(String gender){
        this.gender=gender;
    }
    /**
     * @brief: Mutator method to set gender instance variable
     * @param major
     */
    public void setMajor(String major){
        this.major=major;
    }

    public String toString(){
        return "Name: "+getName()+"\n"+"Age: "+getAge()+"\n"+"Gender: "+getGender()+"\n"+"Major: "+getMajor();
    }

    /**
     * This over right the java inbuilt equal method in a class.
     * @param anObject
     * @return
     */
    public boolean equal(Object anObject){
        if(anObject==this){
            return true;
        }
        if(anObject instanceof Student){
            Student p1=(Student)anObject;
            //Comparing instance variable
            if(p1.getName()==this.getName()){
                if(p1.getAge()==this.getAge()){
                    if(p1.getGender()==this.getGender()){
                        if(p1.getMajor()==this.getMajor()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
}
