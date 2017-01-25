import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class collection1 {
        // Collection contains integers 1 thru 10 (random order)
        LinkedList L = new LinkedList();
        
        public collection1() {
            int r;
            
            while (L.size() < 10) {
                r = (int)(Math.random()*10+1);
                
                if (L.contains(r)) {
                    continue;
                }
                
                L.add(r);
            }
        }
        
        public void print() {
            System.out.println(L);
        }
        
        public LinkedList getL() {
            return L;
        }
        
        public int getSize() {
            return L.size();
        }
}

class collection2 {
        // Collection contains integers 6 thru 15 (random order)
        LinkedList L = new LinkedList();
        
        public collection2() {
            int r;
            
            while (L.size() < 10) {
                r = (int)(Math.random()*10+6);
                
                if (L.contains(r)) {
                    continue;
                }
                
                L.add(r);
            }
        }
        
        public void print() {
            System.out.println(L);
        }
        
        public LinkedList getL() {
            return L;
        }
        
        public int getSize() {
            return L.size();
        }
}

class collection3 {
    collection1 c1 = new collection1();
    collection2 c2 = new collection2();
    
    LinkedList L = new LinkedList();
    
    public collection3() {
        L.addAll(c2.getL());
        L.addAll(c1.getL());
    }
    
    public void removeMiddle() {
        L.remove((int)L.size()/2);
    }
    
    public void removeDuplicates() {
        Set S = new HashSet(L);
        L = new LinkedList(S);
    }
    
    public void printReverse() {
        int i = L.size()-1;
        
        while (i>=0) {
            System.out.print(L.get(i));
            System.out.print(" ");
            i--;
        }
        System.out.println();
    }
    
    public void printSize() {
        System.out.println(L.size());
    }
}

class collection4 {
    // HashMap chosen because usually O(1) runtime -- fastest
    Map<String, String> dict = new HashMap<String, String>();
    
    public void add(String key, String value) {
        if (dict.containsKey(key)) {
            return;
        }
        
        dict.put(key,value);
    }
    
    public void print() {
        System.out.println(dict);
    }
    
    public void printSize() {
        System.out.println(dict.size());
    }
}

public class Main {
    
    public static void main(String[] args) {
        // Collection contains integers 1 thru 10 (random order)
        collection1 c1 = new collection1();
        c1.print();
        
        // Collection contains 6 thru 15 (random order)
        collection2 c2 = new collection2();
        c2.print();
        
        // Print the size of both collections
        System.out.println(c1.getSize()+c2.getSize());
        
        // Combine the above two collections into a third collection
        collection3 c3 = new collection3(); 
        c3.removeDuplicates(); // Collection cannot have any duplicates (also sorts)
        c3.removeMiddle(); // Remove the middle entry
        c3.printReverse(); // Print the collection in reverse order
        c3.printSize(); // Print the size of the collection
        
        // Define a collection that contains a key/value pair
        collection4 c4 = new collection4();
        
        // Add 5 key/value pairs to the collection
        c4.add("key1", "value1");
        c4.add("key2", "value2");
        c4.add("key3", "value3");
        c4.add("key4", "value4");
        c4.add("key5", "value5");
        
        // Print the key/value pairs
        c4.print();
        
        // add() handles duplicates
        c4.add("key5", "value5");
        
        // Print the key/value pairs
        c4.print();
        
        // Print the size of the collection when done
        c4.printSize();
        
        // Comment the code and explain why the specific collection type was chosen.
        // HashMap chosen because usually O(1) runtime -- fastest
    }
}
