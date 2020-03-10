package behavioralPatterns1;
import java.io.*;
public class Repository implements Part {
    public String[] employees = {"David", "Scott", "Rhett", "Andrew", "Jessica"};

    public Iterator getIterator() {
        return new EmployeeIterator();
    }
    
    private class EmployeeIterator implements Iterator {
        int index;
        
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            } 
            return false;
        }

        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}