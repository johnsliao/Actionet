public class Main {
    
    public static void main(String[] args) {
        int n = 10; // Handles any 'n'
        
        for (int i=n-1; i>0; i--) {
            for (int j=1; j<n; j++) {
                if (j<i) {
                    System.out.print(".");
                }
                else {
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
        
    }
}
