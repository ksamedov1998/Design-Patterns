package behavioral.memento;
/*
*   Concept
*       Restore object to previous state
*       Externalize internal state
*       Undo/Rollback
*       Shields complex internals
*   Example
*       java.util.Date
*       java.io.Serializable
*   Design
*       Class based
*       Originator - element we want to get a copy of
*       CareTaker - manages copies
*       Memento - represent copy of originator
*       Called Magic Cookie
*   Pitfalls
*       Can be expensive (for memory)
*       Deletes/history
*       Not expose information
*/
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeCareTaker employeeCareTaker = new EmployeeCareTaker();

        employee.setName("Jon Cheek");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1998");

        employeeCareTaker.save(employee);

        System.out.println(employee);

        employee.setPhone("885-666-1991");

        System.out.println(employee);

        employeeCareTaker.revert(employee);

        System.out.println(employee);
    }
}
