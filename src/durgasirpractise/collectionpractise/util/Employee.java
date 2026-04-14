package durgasirpractise.collectionpractise.util;

public  class Employee implements Person,Comparable{


    private String orgName;
    private Address address;
    private int employeeAge;
    private String employeeName;



    public Employee() {

    }
    public Employee(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Employee(int employeeAge, String employeeName) {
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;
    }
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employee_name){
        this.employeeName=employee_name;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
/*
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", orgName='" + orgName + '\'' +
                ", address=" + address +
                '}';

    }
*/

    @Override
    public String toString() {
        return'('+employeeName + "," +
                + employeeAge +
                ')';
    }



    @Override
    public int compareTo(Object o) {//fe1.compareTo(e11)
        Employee e=(Employee) o;
        if(this.employeeAge>e.employeeAge)
            return 1;
        if(this.employeeAge<e.employeeAge)
            return -1;
        return 0;
    }
}
