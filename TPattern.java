package Com.Pattern;

public class TPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 9;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(i == 1 )
                    System.out.print("* ");
                else if(i > 1 && j == 5)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
