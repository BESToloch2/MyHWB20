package example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int sum=0;

        for (int r=0;r<a.length;r+=2){

            for (int c=0;c<a[r].length;c+=2){

                    sum+=a[r][c];
                }
            }
        System.out.println(sum);
    }
}
