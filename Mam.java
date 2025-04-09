class Animal{
String name;
String sound;
public void showDetails(){
System.out.println("name:"+name);
System.out.println("sound:"+sound);
}
}
class Dog extends Animal{
}
class Cat extends Animal{
}
public class Mam{
public static void main(String[] args){
Dog d1=new Dog();
d1.name="edger";
d1.sound="bark";
d1.showDetails();
Cat c1=new Cat();
c1.name="kitty";
c1.sound="meow";
c1.showDetails();
}
}
