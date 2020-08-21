package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeBD("1234", "John", "Wick", "john@wick.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie","Solo","Han","han@lovesChewie.com");
        employees.add(employeeFromDB);
        // wrap EmployeeLdap with EmployeeAdapterFromLdap
        employees.add(new EmployeeAdapterFromLdap(employeeFromLdap));
        return employees;
    }
}
