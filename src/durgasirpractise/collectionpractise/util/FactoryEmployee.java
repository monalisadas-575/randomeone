package durgasirpractise.collectionpractise.util;

import java.util.Comparator;

public class FactoryEmployee extends Employee {
    private int factoryEmployeeAge;
    private String factoryEmployeeName;

    public FactoryEmployee(){
    }

    public FactoryEmployee(int age, String name) {

        //super(age, name);
    }

    public FactoryEmployee( String name, int age) {
        this.factoryEmployeeName=name;
        this.factoryEmployeeAge=age;
    }



    public int getFactoryEmployeeAge() {
        return factoryEmployeeAge;
    }

    public void setFactoryEmployeeAge(int factoryEmployeeAge) {
        this.factoryEmployeeAge = factoryEmployeeAge;
    }

    public String getFactoryEmployeeName() {
        return factoryEmployeeName;
    }

    public void setFactoryEmployeeName(String factoryEmployeeName) {
        this.factoryEmployeeName = factoryEmployeeName;
    }

    @Override
    public String toString() {
        return "FactoryEmployee{" +
                "factoryEmployeeAge=" + factoryEmployeeAge +
                ", factoryEmployeeName='" + factoryEmployeeName + '\'' +
                '}';
    }



//    @Override
//    public int compareTo(Object of) {
//        FactoryEmployee e11 = (FactoryEmployee) of;
//        if (this.getEmployeeAge() > e11.getFactoryEmployeeAge())
//            return 1;
//        if (this.getEmployeeAge() < e11.getFactoryEmployeeAge())
//            return -1;
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        Employee e=(Employee) o;
        if(this.getEmployeeAge()>e.getEmployeeAge())
            return 1;
        if(this.getEmployeeAge()<e.getEmployeeAge())
            return -1;
        return 0;
    }


}
