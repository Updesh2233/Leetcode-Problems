import com.sun.security.jgss.GSSUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.println("Hello World");
// Square Pattern
        int n = 8;

        for(int row=1; row<=n; row++) {
            //for each row -> n col
            for(int col=1; col<=n; col++){
                //enter star
                System.out.print("*");
            }
            //to move next line
            System.out.println();
        }
        // rectangle shape
        int m = 3;
        for(int row=1; row<=m; row++){
            for(int col=1; col<=5; col++){
                System.out.print("@ ");
            }
            System.out.println();
        }

        //right angle triangle
        int p = 5;

        for(int row=1; row<=p; row++){

            for(int col=1; col<=row; col++) {
                System.out.print("# ");
            }
        System.out.println();
        }

        // rombus

        int u = 5;
        for(int row=1; row<=u; row++){

            for(int col=1; col<=u-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=u; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}