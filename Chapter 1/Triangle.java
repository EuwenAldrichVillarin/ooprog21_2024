public class Triangle {
    public static void main(String[]args){
        int i = 7;
        for(int j = 1;j<=i;j++){
            for (int k = i; k > j; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2*j-1); l++) {
                System.out.print("I");
            }
            System.out.println();
        }
    }
}
