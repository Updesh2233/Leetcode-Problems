//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.println("Hello World");

        int n = 8;

        for(int row=1; row<=n; row++) {
            //for each row -> n col
            for(int col=1; col<=n; col++){
                //enter star
                System.out.println("*");
            }
            //to move next line
            System.out.println();
        }
    }
}