package com.softserve.edu03_Loops;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void getName() {
        Employee employee1 = new Employee("Vadym", 5, 250.0);
        assertEquals("Vadym", employee1.getName());
    }

    @Test
    public void getDepartmentNumber() {
        Employee employee = new Employee("Maria", 5, 2500.0);
        assertEquals(5, employee.getDepartmentNumber());
    }
}