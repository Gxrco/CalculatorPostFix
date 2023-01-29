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
        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        String[] splitInput = _expresion.split("");
        List<String> list = Arrays.asList(splitInput);
        return (ArrayList<String>) list;
    }
}
