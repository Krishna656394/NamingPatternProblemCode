package Com.Pattern;

public class NPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(j == 1 || j == col || j == i )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
