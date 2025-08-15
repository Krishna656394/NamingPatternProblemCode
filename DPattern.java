package Com.Pattern;

public class DPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(i == 1 || i == row )
                    System.out.print("* ");
                else {
                    if(j == 4 || j == col)System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
