--> All the wrapper class behaviour is a immutable (we cannot modify content of an object)

int age = 23;
Integer age1 =age;   //Boxing

int age2 = age1;   //Unboxing

Number is a Abstract class - 



public class Testerr {

    public static void main(String[] args) {
        int i=90;
 
        Integer age =1;                   //   without using new keyword or literals(Integer) creating Integer object
        Integer age = new Integer(i);    // with using new keyword creating Integer object
        int age1 = age;

        System.out.println(age1);

    }
}
