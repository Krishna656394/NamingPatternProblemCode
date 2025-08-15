package Com.Pattern;

public class KPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 4;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(i <= 4){
                    if (j == 1 || j == (5-i))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else {
                    if (j == 1 || j == (i-3))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
