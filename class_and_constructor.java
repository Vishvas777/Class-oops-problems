class student{
    int rolno;
    String name;
}
void display(){
    System.out.print("Roll number: "+rolno);
    System.out.print("Name: "+name);
}
public static void main(String[]args){
    student s1=new student();
    s1.rolno=1;
    s1.name="John";
    s1.display();
}