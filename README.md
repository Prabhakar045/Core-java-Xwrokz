@overiding -> This helps us to achieve method overriding,
 This annotation helps compiler ensure that you're correctly overriding a method by checking if the method signature in the subclass matches the method signature in the superclass. 

[ Can explain runtime polymorphism achieve usind Mwthod over riding and compiler time polymorphism achieved while method over loading ]
1. to chieve method over riding --
- 2 class are required 
- 


Suppose we have a piece of code that says that “My car has 800CC engine”. I start using this application, i say that no my car doesn’t have 800CC engine instead of that my car has 1200CC engine. This is my implementation for that particular piece of code

**We use overriding when we have to change the functionality of particular method that was written by some other developer. But remember this will not change the code of the developer whose method you are overriding.

Whosoever use that developer code will be able to use developer’s method implementation. And whosoever use your class where you have overriden the method, will be able to access your implementation .

Example :

public class A{

public String getCarName(){

return “Maruti 800”;

}

}

public class B extends B{

@Override

public String getCarName(){

return “Maruti Swift”;

}

}

public class MainTest{

pubic static void main(String[] args){

A a = new A();

System.out.println(a.getCarName()); //Will print Maruti 800

B b = new B();

System.out.println(b.getCarName()) //Will print Maruit Swift

}

}

