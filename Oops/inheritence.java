class person{ // Base Class or Super Class or Parent Class
    // Instance Variable
    public String name;
    public int age;
    public String address;
}
class student extends person{  // Derived Class or Sub Class or Child Class
    public int marks;
    public String grade;
    student(String name, int age,String address,int marks,String grade){ // Constructor
        System.out.println("Constructor is always called during Creation of an Object");
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
        this.grade = grade;
    }    
    // Normal Method   
    void disp(){
        System.out.println("Student Details");
        System.out.println("Name :"+name);
        System.out.println("age :"+age);
        System.out.println("address :"+address);
        System.out.println("marks :"+marks);
        System.out.println("grade :"+grade);

    } 
}

class inheritence{
    public static void main(String[] args){
        student s1 = new student("Abhishek Ranjan", 19, "Patna", 91, "A+");
        s1.disp();
    }
}
