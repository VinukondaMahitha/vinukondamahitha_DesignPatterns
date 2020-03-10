package behavioralPatterns1;
public class Behavioral {
    public static void main() {

        Repository employeeRepository = new Repository();

        for(Iterator iterator = employeeRepository.getIterator(); 
                iterator.hasNext();) {
            String employee = (String)iterator.next();
            System.out.println("Employee: " + employee);
        }
    }
}