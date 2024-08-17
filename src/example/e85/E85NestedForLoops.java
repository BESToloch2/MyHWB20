package example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {

        for (int c=1;c<=7;c++){

            for (int r = 1; r<=c; r++){
                System.out.print(r+" ");
            }
            System.out.println();
        }
        int revers=0;
        for (int c=6;c>=1;c--){
            for (int r = 1; r<=c; r++){
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}
