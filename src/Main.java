//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //primitive data types
    int number = 10;                //4-bytes
    char a = 'A';                   //2-bytes
    byte num1 = 12;                 //1-byte
    long num2 = 98987676;           //8-bytes

    float numberTwo = 56.2323F;     //4-bytes
    double numberThree = 45.233;    //8-bytes

    boolean isValuePresent = true;

    System.out.println("number variable value is : " + number);
    IO.println("number variable value is : " + number);         //new way of writing, available in JDK 25 version onwards

    System.out.println("a is : " + a);
    System.out.println("num1 is : " + num1);
    System.out.println("num2 is : " + num2);
    System.out.println("numberTwo is : " + numberTwo);
    System.out.println("numberThree is  : " + numberThree);

    System.out.println("boolean type : " + isValuePresent);
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

//for versions before SDE/JDK 25
//public class Main{
//    public static void main(String[] args){
//        int i = 10;
//        System.out.println("i : " + i);
//        IO.println("i : " + i);
//    }
//}