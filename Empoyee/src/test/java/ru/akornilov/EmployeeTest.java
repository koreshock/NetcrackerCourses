package ru.akornilov;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testAnnualSalary(){
        Employee employee = new Employee(1, "Alex", "Kornilov", 1000);
        assertEquals(12000, employee.getAnnualSalary(), 0);
    }

    @Test
    public void testRaiseSalary(){
        Employee employee = new Employee(1, "Alex", "Kornilov", 1000);
        assertEquals(1100, employee.raiseSalary(10), 0);
    }

    @Test
    public void testToString(){
        Employee employee = new Employee(1, "Alex", "Kornilov", 1000);
        String resultString = "Employee[id=1, name=Alex Kornilov, salary=1000]";
        assertEquals(resultString, employee.toString());
    }

    @Rule
    public ExpectedException exeption = ExpectedException.none();

    @Test
    public void whenSalaryLessZero(){
        exeption.expect(IllegalArgumentException.class);
        exeption.expectMessage("salary must be greater than zero");
        Employee employee = new Employee(1, "Alex", "Kornilov", -1000);
    }


}