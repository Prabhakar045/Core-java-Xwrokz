
collection is Class 

Collection always store data in the foem of Object only
Collection internally take care of Arrays 

--------------------------------List ---------------------
It preserve order of insertion
List is ordered collection of data , it means It preserve order of insertion
it allow Duplicate values and accepts null values 

public class Tester3_List {

    public static void main(String[] args) {

        //Abstraction
        // <> Generics helps to add similar type of data
        // Here ArrayList() is giving implementation
        List<String> moviesName = new ArrayList<>();
        //  Collection moviesName = new TreeSet();
        moviesName.add("KGF");
        moviesName.add("KGF 2");
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.add("om");
        moviesName.add("Gadar");
        moviesName.add("Pathan");
        moviesName.add(3, "pbk");
        moviesName.add(null);
        moviesName.add(null);
        moviesName.add("KGF");



        for(Object movies : moviesName){
            System.out.println(movies);
        }

        System.out.println(moviesName.size());
        System.out.println(moviesName.remove("jogi"));
        System.out.println(moviesName.size());

    }




------------------------Linked List-------------------------------------
Linked list store data in the form of node.
It store data randomnly in the memory.
doubly linked List data Structure fallowed in LinkedList

Adding and deleting element is faster in LikedList comapred to ArrayList
Every node considered as element 


------------------

compareTo() -> only used for default values / variables 

Custom sorting ---
comparator -> custom variable sorting


comparable v/s comparator 
comparable  -> java.lang package  , it has compareTo() method  ** it can be overridden only 1 time to sort Id
comparator -> java.util ,  it has compare() method    ** i can be overridden multiple time 

Comparable when you have a single natural ordering/ single variable sorting, and use 
Comparator when you need custom or multiple sorting options for a class or when you're working with classes you cannot modify.


-------------------Map (I) ------------------
Set internally use HashMap and it have a Put method 
Set uses map to store data inn the form of key and value pair 
Map adding data in the form of entry(INterface)
Entry is called as Pair of key and Value pair

--------------------------Iterator (method)---------------------
process or fetch data from Collection framework interface
its return type is -> iterator()
