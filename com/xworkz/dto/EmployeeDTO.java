package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private double salary;

    @Override
    public String toString() {
        return "[Employee ID = " + this.employeeId + ", Employee Name = " + this.employeeName + ", Salary = " + this.salary + "]";

    }
}
