package com.xworkz.Exammanagement;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

public class HallTicket {

    private String subjectName;
    private String candidateName;
    private String usnNo;
    private String subjectCode;

    public void displayDetails(){
        System.out.println("Subject Name is: "+subjectName);
        System.out.println("candidate name is:"+candidateName);
        System.out.println("University No is: "+usnNo);
        System.out.println("Subject code is: "+subjectCode);
    }

}
