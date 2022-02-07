package questions.q_1_1_68;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        List<Employee> original = new ArrayList<>();

        original.add(new Employee("Jone", 20, 1999.02));
        original.add(new Employee("Poles", 20, 20000));
        original.add(new Employee("Dutra", 20, 3000));
        original.add(new Employee("Yuer", 20, 509.90));

        proccess(original, (Employee e) -> {return e.getSalary() >= 3000; });

        System.out.println(original);
    }

    private static void proccess(List<Employee> employees, Predicate<Employee> predicate){
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            if(predicate.test(employeeIterator.next())){
                employeeIterator.remove();
            }
        }
    }
}
