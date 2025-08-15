package Com.Pattern;

public class SPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 4;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(i == 1 || i == 4 || i == 7)
                    System.out.print("* ");
                else if (i > 1 && i < 4 && j == 1) {
                    System.out.print("* ");
                }
                else if(i > 4 && i < 7){
                    if(j == 4)System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
