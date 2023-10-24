package com.Xworkz.ColllectionMap;

import com.Xworkz.ConstantEnum.BloodGroup;
import com.Xworkz.ConstantEnum.BookType;
import com.Xworkz.ConstantEnum.Gender;
import com.Xworkz.ConstantEnum.MaritalStatus;
import com.Xworkz.OurOwnObject.PatientDTO;
import com.Xworkz.OurOwnObjectBookdeatils.BookDto;
import com.Xworkz.ourOwnObjectsCustomerDetails.CustomerDto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetTester2 {

    public static void main(String[] args) {

        Map<Integer , PatientDTO> map = new HashMap<>();
        // map.put(1, new PatientDTO());
        map.put(1,new PatientDTO(1,"Raja", Gender.male, BloodGroup.Apos, "Bangalore", 28, "Heart", "q-45", "Rani"));
        map.put(2, new PatientDTO(3, "Rama", Gender.male, BloodGroup.Apos, "Mysore", 30, "Brain", "q-46", "Sita"));
        map.put(3, new PatientDTO(2, "Mahantesh", Gender.male, BloodGroup.Apos, "Bagalkote", 25, "Coma", "q-47", "Girija"));
        map.put(4, new PatientDTO(4, "Prabhakar", Gender.male, BloodGroup.Apos, "Pune", 22, "Appendix", "q-48", "Tri...."));
        map.put(5, new PatientDTO(5, "Shekhar", Gender.male, BloodGroup.Bpos, "Bidar", 22, "Piles", "q-49", "Vaishnavi"));

        System.out.println( map.get(5) +"\n");



        Set<Map.Entry<Integer, PatientDTO>> set = map.entrySet();

        //iterator
        Iterator<Map.Entry<Integer, PatientDTO>> itr =  set.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, PatientDTO> entry = itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());


        }


        //Set.stream().forEach(System.out::println);  using java 8

//        for(Map.Entry<Integer, PatientDTO> mapEntry: set){
//            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
//        }



        Map<Integer , BookDto> map1 = new HashMap<>();
        map1.put(1, new BookDto(1,"Java",589, "James gosling", 1989, 400.00, BookType.coding, "pbk"));
        map1.put(2, new BookDto(3,"Five pinots on someone",400, "chetan Bhagath", 2013, 400.00, BookType.stories, "pbk"));
        map1.put(3, new BookDto(2,"C",139, "Prabhakar", 2020, 4004.00, BookType.coding, "pb"));
        map1.put(4, new BookDto(5,"The Birth of Shiva",1289, "madurya", 2012, 300.00, BookType.stories, "pbk1"));
        map1.put(5, new BookDto(4, "Python Programming", 450, "Guido van Rossum", 2015, 350.00, BookType.CODING, "pbk"));
        map1.put(6, new BookDto(6, "The Great Gatsby", 180, "F. Scott Fitzgerald", 1925, 250.00, BookType.STORIES, "pbk"));
        map1.put(7, new BookDto(7, "Data Structures and Algorithms", 600, "Clifford A. Shaffer", 2019, 420.00, BookType.CODING, "pbk"));

        System.out.println("**************");
        Set<Map.Entry<Integer, BookDto>> set1 = map1.entrySet();

        for(Map.Entry<Integer, BookDto> mapEntry: set1){
            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
        }

        Map<Integer, CustomerDto> map2 = new HashMap<>();
        map2.put(1, new CustomerDto(1,"Prabhakar",22,"Earth", Gender.male, MaritalStatus.single));
        map2.put(2, new CustomerDto(2,"manthesh",23,"Rajajaia nagara", Gender.male, MaritalStatus.single));
        map2.put(3, new CustomerDto(3,"shekhar",23,"cirle", Gender.male, MaritalStatus.single));
        map2.put(4, new CustomerDto(4,"rocky",35,"Bangalore", Gender.male, MaritalStatus.married));
        map2.put(5, new CustomerDto(5,"Rakshith", 23, "Bashayam circle",Gender.male,MaritalStatus.mingle));
        map2.put(6, new CustomerDto(6, "Indian", 25, "India", Gender.male, MaritalStatus.single));

        System.out.println("**************");
        Set<Map.Entry<Integer, CustomerDto>> set2 = map2.entrySet();

        for(Map.Entry<Integer, CustomerDto> mapEntry: set2){
            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
        }
    }

}
