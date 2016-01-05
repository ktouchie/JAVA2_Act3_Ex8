import java.util.*;
class pascal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines of PASCAL'S TRIANGLE would you like to see?")
        int n = sc.nextInt();
        
        
    }
    
    public static int[][] triangle(int x) {
        int[][] array = new int[x+1][x+1];          // declare array with x+1 lines and x+1 columns
        int j=0;
        for (int i=0; i<=x; i++) {                  // fill in all the 1s
            array[i][0]=1;
            array[i][j]=1;
            j++
        }
        if (x>1) {                                  // if triangle is big enough, add rest of pascal's numbers
            for (int p=2; p<=x; p++) {
                for (int q=1; q<x; q++) {
                    array[p][q] = array[p-1][q-1]+array[p-1][q];
                }
            }
        }
        
        
    }
    
    public static void printArray(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    
}