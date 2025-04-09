class Person{
String name;
int phone;
public void showAddress(){
System.out.println("Name:"+name);
System.out.println("phone:"+phone);
}
}
class Teacher extends Person{
}
class Student extends Person{
}
class Staff extends Person{
}
public class per{
public static void main(String[] args){
Teacher t1=new Teacher();
t1.name="john";
t1.phone=94096;
t1.showAddress();
Student st1=new Student();
st1.name="anil";
st1.phone=83557;
st1.showAddress();
Staff s1=new Staff();
s1.name="abhi";
s1.phone=97236;
s1.showAddress();
}
}

