class Std{
    int roll_no;
    String name;
    int a=2;
    Std(){
        roll_no = a;
        name = "John";
    }
    String Name(){
        return name;
    }
    int Roll(){
        return roll_no;
    }
}

class Student{
public static void main(String[] args) {
    Std s = new Std();
    System.out.println("Name of the student is "+ s.Name());
    System.out.println("Roll No. of the student is "+ s.Roll());
}
}
