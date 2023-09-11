when to go with , class -> Fully represantation -concrete mehod & with body
Interface -> Incomplte representation -abstract method-with body
abstract -> partial representation-concrete&abstract method

[Abstraction --> hiding the implemetaion and allowing the user to access only the functionalities with the help of interface.]

It is achiwed through 2 concepts --> 1.Interface & 2. Abstract class 

loose coupling -- it is achived trhough interface which should not effect the user 
[Interface --> Interface is a medium/mediator which is used to communicate between use and device ]

-----

1.Interface 

public interface Switch  {

    public void sOn();
    //concreated -- method contains body
    // Absract method -- does not contain body

    public  void sOff();
}



ublic class Tubelight implements Switch{

    @Override
    public  void sOn(){
        System.out.println("Tube light turned on");
    }

    @Override
    public  void sOff(){

    }

}



public class LightExecuter {
    public static void main(String[] args) {
        Switch tubelightSwitch = new Tubelight();
        //reference will of Switch type or Interface type and object creation of Class type
        // Abstraction achieved through only interface
        tubelightSwitch.sOn();
    }
}


--------------------------
2. Abstract class

public abstract class  Switch  {

    public abstract void sOn();
    //concreated -- method contains body
    // Absract method -- does not contain body

    public  abstract void sOff();
}



ublic class Tubelight extends Switch{

    @Override
    public  void sOn(){
        System.out.println("Tube light turned on");
    }

    @Override
    public  void sOff(){

    }

}

when you know complete representation of an object then we will go with class and when we dont know complete representation of an object then we will 
go with interface bcz interface does not have class

 classes are used when you have a complete representation of an object, including attributes and methods. Interfaces are used when you want to define a 
contract without specifying the complete implementation details, allowing multiple classes to adhere to the same contract while providing their own implementations.

Class:

A class is a blueprint for creating objects. It defines the structure and behavior that an object of that class will have.
When you have a complete representation of an object, including its attributes (data) and methods (behavior), you use a class to define it.
Objects created from classes have both the structure (fields) and behavior (methods) defined within the class.
Interface:

An interface defines a contract that classes must adhere to. It specifies a set of methods that any class implementing the interface must provide.
When you want to define a contract that multiple classes must follow, but you may not know their complete implementations, you use an interface.
Interfaces do not have the implementation details themselves. They only define the method signatures that must be implemented by classes.
A class that implements an interface provides the actual implementation of the methods defined in the interface.



------------------------------------------------------Abstract v/s Interface ----------------------------------------------------

abstract class contains concrete method ,  abstract method and interface only contains abstract method 


// Abstract class
public abstract class Switch {

    // Concrete method with implementation
    public void toggle() {
        System.out.println("Toggle switch");
    }

    // Abstract method without implementation
    public abstract void sOn();

    // Abstract method without implementation
    public abstract void sOff();
}

// Interface
interface Dimmable {
    void dim();
}



// Concrete class implementing the Dimmable interface
public class Tubelight extends Switch implements Dimmable {

    @Override
    public void sOn() {
        System.out.println("Tube light turned on");
    }

    @Override
    public void sOff() {
        System.out.println("Tube light turned off");
    }

    @Override
    public void dim() {
        System.out.println("Tube light dimmed");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Switch tubelightSwitch = new Tubelight();
        tubelightSwitch.sOn();
        tubelightSwitch.toggle();

        Dimmable dimmableTubelight = new Tubelight();
        dimmableTubelight.dim();
    }
}



-------------------------------------
If class is  not willing to override method then we make it as abstract

public interface Shop {

    public void doBusiness();

    public  void  donateMoney();
}


public abstract class LifeCareMedicals implements Shop{

    @Override
    public void doBusiness(){

    }
}

public class Medical extends  LifeCareMedicals {

    @Override
    public  void donateMoney(){
        System.out.println("donating money to needy people");
    }
}



In the Java programming language, when you have an abstract class that implements an interface, it is not mandatory for the abstract class to provide concrete (non-abstract) implementations for all methods declared in the interface. This is because abstract classes can themselves be incomplete in the sense that they can declare methods as abstract, leaving the responsibility of providing implementations to their concrete subclasses.

In your example, you have the following structure:

Shop Interface:

Defines two abstract methods: doBusiness() and donateMoney().
LifeCareMedicals Abstract Class:

Extends the Shop interface.
Provides an empty implementation (an abstract method with no code) for the doBusiness() method.
Since LifeCareMedicals is declared as an abstract class, it's not required to provide concrete implementations for all methods from the Shop interface. Abstract classes can have abstract methods that are meant to be implemented by concrete subclasses.
Medical Class:

Extends the LifeCareMedicals abstract class.
Provides a concrete implementation for the donateMoney() method declared in the Shop interface.
The key point here is that LifeCareMedicals can be an abstract class that leaves some methods as abstract, and concrete subclasses like Medical are responsible for providing concrete implementations for those abstract methods. This is a fundamental concept in Java's abstraction and inheritance mechanisms, where abstract classes act as a partial blueprint, and concrete subclasses complete the implementation by providing definitions for the remaining abstract methods.

So, it is both possible and a common practice in Java to have abstract classes that don't provide concrete implementations for all interface methods, leaving the responsibility to subclasses to implement those methods as needed.
