package assignment_6;

import java.util.Objects;

class Employee implements Comparable<Employee> {
        private int id;
        private String name;
        private String dept;
        private int salary;
        public static String field;

        public Employee() {
        }

        public Employee(int id, String name, String dept, int salary) {
                this.id = id;
                this.name = name;
                this.dept = dept;
                this.salary = salary;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getDept() {
                return dept;
        }

        public int getSalary() {
                return salary;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Employee employee = (Employee) o;
                return id == employee.id && Objects.equals(dept, employee.dept);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, dept);
        }

        @Override
        public int compareTo(Employee e) {
                if (field == "salary") {
                        return this.getSalary() > e.getSalary() ? 1 : -1;
                } else if (field == "id") {
                        return this.getId() > e.getId() ? 1 : -1;
                } else if (field == "name") {
                        return this.getName().compareTo(e.getName());
                } else if (field == "dept") {
                        return this.getDept().compareTo(e.getDept());
                }


                return 0;
        }
}