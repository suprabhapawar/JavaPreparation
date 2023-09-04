package hashmap;

import java.util.HashMap;
import java.util.Map;

class EMP {
    private String name;
    private int employeeId;

    public EMP(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Implement equals() and hashCode() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EMP emp = (EMP) o;
        return employeeId == emp.employeeId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(employeeId);
    }
}

public class CustomizedHashmp {
    public static void main(String[] args) {
        // Create a HashMap with EMP objects as keys and ages as values
        Map<EMP, Integer> employeeAges = new HashMap<>();

        EMP emp1 = new EMP("John", 1);
        EMP emp2 = new EMP("Alice", 2);

        // Put key-value pairs in the HashMap
        employeeAges.put(emp1, 35);
        employeeAges.put(emp2, 28);

        // Retrieve values using keys
        int johnsAge = employeeAges.get(emp1);
        int alicesAge = employeeAges.get(emp2);

        System.out.println("John's Age: " + johnsAge);
        System.out.println("Alice's Age: " + alicesAge);
    }
}
