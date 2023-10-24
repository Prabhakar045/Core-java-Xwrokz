package com.xworkz.dto;



public class AllDTOTester {

    public static void main(String[] args) {
        BoardDTO dto = new BoardDTO();
        dto.setId(1);
        dto.setBoardName("jk board");
        dto.setSize("123*45");
        //System.out.println(dto);   // implicit or Indirectly calling of toString()
        System.out.println(dto.toString());  // Explicitly

        String str = null;
        String str1 ="null";
        System.out.println(str1.equals(str));


        // StudentDTO
        StudentDTO student = new StudentDTO();
        student.setStudentId(11);
        student.setStudentName("Prabhakar");
        student.setAge(22);
        System.out.println(student.toString());

        //EmployeeDTO
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmployeeId(21);
        employee.setEmployeeName("Rahul");
        employee.setSalary(50000.0);
        System.out.println(employee.toString());

        //ProductDTO
        ProductDTO product = new ProductDTO();
        product.setProductId(301);
        product.setProductName("Smartphone");
        product.setPrice(25000 );
        System.out.println(product.toString());

        //CarDTO
        CarDTO car = new CarDTO();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2022);
        System.out.println(car.toString());

        //BookDTO
        BookDTO1 book = new BookDTO1();
        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        book.setPageCount(218);
        System.out.println(book.toString());

        //Mall
        MallDTO mall = new MallDTO();
        mall.setId(1111);
        mall.setName("Orion Mall");
        mall.setSize("50000Sp");
        System.out.println(mall.toString());

    }
}

