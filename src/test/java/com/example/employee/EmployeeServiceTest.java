package com.example.employee;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void shouldReturnAllEmployees() {
        var employees = employeeService.getAllEmployees();
        assertEquals(2, employees.size());
    }

    @Test
    void shouldFindEmployeeById() {
        Employee employee = employeeService.getEmployeeById(1L);
        assertNotNull(employee);
        assertEquals("Atharv", employee.getName());
    }

    @Test
    void shouldReturnNullForUnknownEmployee() {
        Employee employee = employeeService.getEmployeeById(999L);
        assertNull(employee);
    }

    @Test
    void shouldAddEmployee() {
        Employee employee = new Employee(3L, "Priya", "DevOps", 55000);
        employeeService.addEmployee(employee);
        assertEquals(3, employeeService.getEmployeeCount());
    }
}
