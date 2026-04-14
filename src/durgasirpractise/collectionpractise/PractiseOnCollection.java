package durgasirpractise.collectionpractise;

import durgasirpractise.collectionpractise.util.Employee;
import durgasirpractise.collectionpractise.util.FactoryEmployee;

import java.util.*;

public class PractiseOnCollection  implements Comparator{

    public static void main(String[] args) {

       /* System.out.println("starting Practise on problem 1....");
        System.out.println();
        //TODO Create a list without generics and add random elements of diff. types
        List employees1= new LinkedList();
        EmployeeDTO employee2= new EmployeeDTO();
        employee2.setName("Lisa");
        employee2.setOrg_name("Tirtol IT coprporation");
        //Address employeeMona=new Address("Tirtol","odisha","India","753001");
        employee2.setAddress(new Address("Tirtol","odisha","India","753001"));

        employees1.add(employee2);
        //employees1.add(employeeMona);
        employees1.add("dewded");
        employees1.add(123);

        System.out.println("Printing all elements of the list");
        for(Object o:employees1){
            System.out.println(o);
        }
        System.out.println();
        System.out.println(employees1);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("starting Practise on problem 2....");
        //TODO Create a list of Employee
        List<EmployeeDTO> employees= new LinkedList<>();
        EmployeeDTO employee1= new EmployeeDTO();
        employee1.setName("Lisa");
        employee1.setOrg_name("Tirtol IT coprporation");
        employees.add(employee1);



        System.out.println("starting Practise on problem 3....");
        //TODO Add one employee Object in a list of Person ==>problem statement
        List<Person> personList= new ArrayList<>();
        personList.add(new EmployeeDTO());
        Person p= new EmployeeDTO();
        List<EmployeeDTO> employeeDTOS= new ArrayList<>();
        ArrayList<EmployeeDTO> employeeDTOS1= new ArrayList<>();
        */


     /*TODO Introduce an Integer field called age in EmployeeDto class.
     Create  getter setter & crete toString for EmployeeDTo with this age .
     Create a list of 10 employee then sort them in increasing order of the age using set Interface.
     Print the name of youngest & oldest employee.
     TODO Create a map where for each entry key is employee name and value is employee age.
      */
/*
        List<Employee> allEmployee=new ArrayList<>();
        Employee employee100=new Employee(100,"Saumrit");
        Employee employee101=new Employee(103,"Monalisa");
        Employee employee102=new Employee(1000,"Sandeep");
        Employee employee103=new Employee(260,"Sobha");
        Employee employee104=new Employee(606,"Gayadhara");
        allEmployee.add(employee100);
        allEmployee.add(employee101);
        allEmployee.add(employee102);
        allEmployee.add(employee103);
        allEmployee.add(employee104);
        System.out.println(allEmployee);



        TreeSet<Employee> employeeSet=new TreeSet<>(allEmployee);
        System.out.println(employeeSet);

        //TODO Create a map where, for each entry key is employee name and value is employee age.
        Map<String,Integer> m = new HashMap<>();
        for(Employee emp:employeeSet){
            m.put(emp.getEmployeeName(),emp.getEmployeeAge());
            System.out.println("Added  "+emp.getEmployeeName()+" to the map");
        }
        System.out.println(m);

 */

        //TODO compare the object of factoryEmployee with Employee object.
        FactoryEmployee fe1=new FactoryEmployee(75,"Gangadhar");
        Employee e11=new Employee(20,"mona");
        System.out.println(e11.compareTo(fe1));
        System.out.println(fe1.compareTo(e11));


        FactoryEmployee fe=new FactoryEmployee(43,"Rajanikanta");

        Object e22=new Employee(25,"leena");

        System.out.println(e22);
       // System.out.println(   ((Employee)e22).compareTo()   );
        System.out.println(((Employee)e22).getEmployeeAge());




    }

    @Override
    public int compare(Object o1, Object o2) {
        return (-1)*(((Employee)o1).getEmployeeName()).compareTo(((Employee)o2).getEmployeeName());
    }
}
