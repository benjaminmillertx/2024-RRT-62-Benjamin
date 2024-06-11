import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

@Test
void testFindByIdKnownGoodValue() {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    int knownGoodId = 1; // Assume 1 is a valid ID in your database

    Employee employee = employeeDAO.findById(knownGoodId);

    assertNotNull(employee, "Employee should not be null for a known good ID");
    assertEquals(knownGoodId, employee.getId(), "The employee ID should match the known good ID");
}
@Test
void testFindByIdKnownBadValue() {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    int knownBadId = -1; // Assume -1 is not a valid ID in your database

    Employee employee = employeeDAO.findById(knownBadId);

    assertNull(employee, "Employee should be null for a known bad ID");
}
@Test
void testFindByFirstNameKnownGoodValue() {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    String knownGoodFirstName = "John"; // Assume there is at least one employee with first name "John"

    List<Employee> employees = employeeDAO.findByFirstName(knownGoodFirstName);

    assertNotNull(employees, "Employee list should not be null for a known good first name");
    assertFalse(employees.isEmpty(), "Employee list should not be empty for a known good first name");

    for (Employee employee : employees) {
        assertEquals(knownGoodFirstName, employee.getFirstName(), "Employee's first name should match the known good first name");
    }
}
@Test
void testInsertQueryAndDeleteEmployee() {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    Employee newEmployee = new Employee();
    newEmployee.setFirstName("Test");
    newEmployee.setLastName("User");
    newEmployee.setEmail("test.user@example.com");

    // Insert the new employee
    employeeDAO.insert(newEmployee);

    // Retrieve the newly inserted employee by some unique attribute
    List<Employee> insertedEmployees = employeeDAO.findByFirstName("Test");
    assertFalse(insertedEmployees.isEmpty(), "Inserted employee should be found");

    Employee insertedEmployee = insertedEmployees.get(0);
    assertEquals("Test", insertedEmployee.getFirstName(), "First name should match the inserted value");
    assertEquals("User", insertedEmployee.getLastName(), "Last name should match the inserted value");
    assertEquals("test.user@example.com", insertedEmployee.getEmail(), "Email should match the inserted value");

    // Delete the newly inserted employee
    employeeDAO.delete(insertedEmployee.getId());

    // Verify the employee is deleted
    Employee deletedEmployee = employeeDAO.findById(insertedEmployee.getId());
    assertNull(deletedEmployee, "Employee should be null after deletion");
}



