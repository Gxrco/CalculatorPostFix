package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostfixCalculator implements IPostfixCalculator{


    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("/") || item.equals("*");
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        String[] splitInput = _expresion.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitInput));
        return list;
    }
}
