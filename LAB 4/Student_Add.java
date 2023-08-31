class Stu1{
    int roll_no;
    int ph_no;
    String name;
    int a=1;
    String Add;
    Stu1(){
        roll_no = a;
        name = "Sam";
        ph_no = 2021364251;
        Add = "CTC";
    }
    String Name(){
        return name;
    }
    int Roll(){
        return roll_no;
    }
    int Phone_Number(){
        return ph_no;
    }
    String Add(){
        return Add;
    }
} 

class Stu2{
    int ph_no;
    int roll_no;
    String name;
    int a=2;
    String Add;
    Stu2(){
        roll_no = a;
        name = "John";
        ph_no = 44448888;
        Add = "BBSR";
    }
    String Name(){
        return name;
    }
    int Roll(){
        return roll_no;
    }
    int Phone_Number(){
        return ph_no;
    }
    String Add(){
        return Add;
    }
} 

class Student_Add{
public static void main(String[] args) {
    Stu1 s1 = new Stu1();
    Stu2 s2 = new Stu2();
    System.out.println("Sam's Credentials:");
    System.out.println("Name of the student is "+ s1.Name());
    System.out.println("Roll No. of the student is "+ s1.Roll());
    System.out.println("Roll No. of the student is "+ s1.Phone_Number());
    System.out.println("Roll No. of the student is "+ s1.Add());
    System.out.println("");
    System.out.println("John's Credentials:");
    System.out.println("Name of the student is "+ s2.Name());
    System.out.println("Roll No. of the student is "+ s2.Roll());
    System.out.println("Roll No. of the student is "+ s2.Phone_Number());
    System.out.println("Roll No. of the student is "+ s2.Add());
}
}
