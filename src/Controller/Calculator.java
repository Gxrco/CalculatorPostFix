package Controller;

import Model.PostfixCalculator;
import Model.Stack;

public class Calculator {

    private Stack<Integer> memory;
    private String postFix;

    PostfixCalculator pc = new PostfixCalculator();



    public Calculator(){
        memory = new Stack<>();
        postFix = "";
    }

    public int getValue(String postFix, int x){
        for (int i =0; i<postFix.length(); i++){
            char ch = postFix.charAt(i);
            if('0' <= ch && ch<='9'){
                memory.push(ch-'0');
            }else{
                switch(ch){
                    case 'x':
                        memory.push(x);
                        break;

                    case '+':
                        int b = memory.pull();
                        int a = memory.pull();
                        pc.suma(a,b);

                    case '-':
                        int d = memory.pull();
                        int c = memory.pull();
                        pc.resta(c,d);

                    case '*':
                        int f = memory.pull();
                        int e = memory.pull();
                        pc.resta(e,f);

                    case '/':
                        int h = memory.pull();
                        int g = memory.pull();
                        pc.resta(g,h);
                }
            }
        }

        return memory.pull();

    }

}
