package exercise;
class AdaptiveEmployeeLDAP implements Employee {
    private final EmployeeLDAP employee;

    public AdaptiveEmployeeLDAP(EmployeeLDAP employee) {
        this.employee = employee;
    }
    @Override
    public String getId(){
        return employee.get("uid");
    }
    public String getFirstName(){
        return employee.get("givenName");
    }
    public String getLastName(){
        return employee.get("sn");
    }
    public String getEmail(){
        return employee.get("mail");
    }
}