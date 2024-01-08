package StringCalculator;



import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        String inputString="0";
        Scanner myScanner = new Scanner(System.in);
        //ScriptEngineManager myStringEvaluator = new ScriptEngineManager();  //geeft null error
        //https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form
        //ExpressionParser parser = new SpelExpressionParser(); // werkt enkel met IntelliJ full version :-(

        System.out.println("Basic calculation app: \n- Please only use basic operators + - * /\n");


        while (inputString!="exit") {

            inputString = myScanner.nextLine();



        try {

            System.out.println(Eval.eval(inputString));

        } catch (ArithmeticException  manuelsKillerException) {
            System.out.println("You win, damn you!!!!");
            manuelsKillerException.printStackTrace();
        }

}



    }
}
