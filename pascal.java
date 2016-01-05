import java.util.*;
class pascal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines of PASCAL'S TRIANGLE would you like to see?")
        int n = sc.nextInt();
        
        
    }
    
    public static int[][] triangle(int x) {
        int[][] array = new int[x][x];          // declare array with x lines and x columns
        int j=0;
        for (int i=0; i<array.length; i++) {    // fill in all the 1s
            array[i][0]=1;
            array[i][j]=1;
            j++
        }
        
        
        
    }
    
    public static void printArray(int[][] a) {
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static int sumRow(int[][] a, int b) {        
        int sum = 0;        
        for (int i=0; i<a.length; i++) {
            sum += a[b][i];
        }        
        return sum;
    }
    
}