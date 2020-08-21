package structural.adapter;

/*
* NOTE
*   - If we add new method/fields it would be decorator pattern
* */
public class EmployeeAdapterFromLdap implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapterFromLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterFromLdap{" +
                "instance=" + instance +
                '}';
    }
}
