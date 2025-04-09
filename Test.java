interface InterfaceOne{
public void show();
}
interface InterfaceTwo{
public void display();
}
class A implements InterfaceOne,InterfaceTwo{
public void show(){
System.out.println("show something");
}
public void display(){
System.out.println("Display something");
}
}
public class Test{
public static  void main(String[] args){
A a =new A();
a.show();
a.display();
}
}

