    package com.Xworkz.OurOwnObject;

    import com.Xworkz.ConstantEnum.BloodGroup;
    import com.Xworkz.ConstantEnum.Gender;

    import java.util.*;
    import java.util.concurrent.CopyOnWriteArrayList;
    import java.util.stream.Collectors;

    public class PatientExecutor {
        public static void main(String[] args) {
            List<PatientDTO> dto = new CopyOnWriteArrayList<>();
            dto.add(new PatientDTO(1,"Raja", Gender.male, BloodGroup.Apos, "Bangalore", 28, "Heart", "q-45", "Rani"));
            dto.add(new PatientDTO(3, "Rama", Gender.male, BloodGroup.Apos, "Mysore", 30, "Brain", "q-46", "Sita"));
            dto.add(new PatientDTO(2, "Mahantesh", Gender.male, BloodGroup.Apos, "Bagalkote", 25, "Coma", "q-47", "Girija"));
            dto.add(new PatientDTO(4, "Prabhakar", Gender.male, BloodGroup.Apos, "Pune", 22, "Appendix", "q-48", "Tri...."));
            dto.add(new PatientDTO(5, "Shekhar", Gender.male, BloodGroup.Bpos, "Bidar", 22, "Piles", "q-49", "Vaishnavi"));

            System.out.println("process the patient data using for each");
//            for (PatientDTO patt : dto) {
//                //dto.add(new PatientDTO(6, "Shekhar1", Gender.male, BloodGroup.Bpos, "Bidar", 22, "Piles", "q-49", "Vaishnavi"));
//                System.out.println(patt);
//            }


            // fetching data
            Iterator<PatientDTO> itr  = dto.iterator();
            dto.add(new PatientDTO(6, "Shekhar1", Gender.male, BloodGroup.Bpos, "Bidar", 22, "Piles", "q-49", "Vaishnavi"));

            while (itr.hasNext()){
                PatientDTO p = itr.next();
                System.out.println(p);
            }


            //Updating iterator
             itr  = dto.iterator();
            while (itr.hasNext()){
                PatientDTO p = itr.next();
                System.out.println(p);
            }

            System.out.println("**************");

            System.out.println(dto.stream().sorted().collect(Collectors.toList()));  // to sort by id
            System.out.println(dto.stream().sorted(Comparator.comparing(PatientDTO::getName)).collect(Collectors.toList()));
            System.out.println(dto.stream().sorted(Comparator.comparing(PatientDTO::getAge)).findFirst());




            List<Integer> dto1=new ArrayList<>();
            dto1.add(1);
            dto1.add(5);
            dto1.add(3);
            dto1.add(24);
            dto1.add(15);
            dto1.add(2345);
            dto1.add(6);
            Collections.sort(dto1);
            System.out.println(dto1);

            Collections.sort(dto);
            //System.out.println(dto);
            for (PatientDTO patient:dto) {
                System.out.println(patient);
            }
        }
    }