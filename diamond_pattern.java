package problems;

public class diamond_pattern {
    public static void main(String[] args) {
        int n = 5;
        //steep hill
        for (int i = 1; i < n; i++) {   //note less than
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {  //note less than
                System.out.print("* ");
            }
            System.out.println();
        }
        //down hill
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for ( int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <=n; j++) {  //note less than
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

