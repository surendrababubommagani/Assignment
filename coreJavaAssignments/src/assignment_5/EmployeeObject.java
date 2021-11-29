package assignment_5;
import java.util.HashSet;
import java.util.Set;
 class Employee
{
    private int id;
    private String name;
    private int age;
    private double salary;
    private  String dept;

    public Employee(int id,String name, int age,double salary,String dept)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee employee = (Employee) o;

        if (id != employee.id) {
            return false;
        }
        if (!name.equals(employee.name)) {
            return false;
        }
        if (age != employee.age) {
            return false;
        }
        if (salary != employee.salary) {
            return false;
        }
        if (dept != employee.dept) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
         int result1 = dept.hashCode()+result;
        result1 = 31 * result1 + id+age;
        return result1;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", age= " + age + " id= "+id+" salary= "+salary+" dept= "+dept+
                '}';
    }
}
public class EmployeeObject {

	public static void main(String[] args) {
		 Employee e1 = new Employee(12345,"Siva",21,6000,"IT");
	        Employee e2 = new Employee(12346, "kumar",24,19000,"CSE");

	        Set<Employee> getDetails = new HashSet<>();
	        System.out.println("FIRST EMPLOYEE DETAILS");
	        getDetails.add(e1);
	        System.out.println(e1);
	        System.out.println("SECOND EMPLOYEE DETAILS");
	        getDetails.add(e2);
	        System.out.println(e2);

	}

}
