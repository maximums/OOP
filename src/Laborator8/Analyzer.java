package Laborator8;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Analyzer {
    private static double getAppInput(TextField input){
        return Double.parseDouble(input.getText());
    }
    public static void divisionOf2num(TextField firstNumber, TextField secondNumber, Text errors, Text output){
        Double result;
        try {
            getAppInput(firstNumber);
            getAppInput(secondNumber);
            try {
                if(Math.abs(getAppInput(firstNumber) / getAppInput(secondNumber)) >= Double.POSITIVE_INFINITY )
                    throw new ArithmeticException();
                else
                    try {
                        if(getAppInput(secondNumber) == 13)
                            throw new UnluckyException();
                        else {
                            result = getAppInput(firstNumber) / getAppInput(secondNumber);
                            output.setText("\t"+result.toString());
                            errors.setText("");
                        }
                    }catch (UnluckyException ue){
                        errors.setText("   UnluckyException\nDivisor is equal with 13");
                        output.setText("\t0.0");
                    }
            }catch (ArithmeticException ae){
                errors.setText("Arithmetic Exception");
                output.setText("\t0.0");
            }
        }catch (NumberFormatException e){
            errors.setText("Invalid input format");
            output.setText("\t0.0");
        }
    }
}
