package exercise;

class AdaptiveEmployeeCSV implements Employee{
    private EmployeeCSV employeeCSV;
    String[] tokens;
    public AdaptiveEmployeeCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
        this.tokens = employeeCSV.tokens();
    }

    @Override
    public String getId() {
        return this.tokens[0];
    }

    @Override
    public String getFirstName() {
        return this.tokens[1];
    }

    @Override
    public String getLastName() {
        return this.tokens[2];
    }

    @Override
    public String getEmail() {
        return this.tokens[3];
    }

}