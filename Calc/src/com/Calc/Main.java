package com.Calc;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Na {
        System.out.print("CALCULATOR__");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String [] strm = str.split("[-||+||/||*]");
        if(strm.length!=2){
            throw new Na();
        }else {
            String st = strm[0]; //надо для определения индекса оператора




            char ch = str.charAt(st.length()); //надо для определения индекса оператора
            int[] chisla = new int[strm.length];
            for (int i = 0; i < strm.length; i++) {
                chisla[i] = Integer.parseInt(strm[i]);
            }


            for (int i = 0; i < chisla.length; i++) {
                if (chisla[i] > 10 || strm.length != 2) {
                    throw new Na();
                }
            }
            System.out.println();
            int res = 0;
            switch (ch) {
                case '+':
                    res = chisla[0] + chisla[1];
                    break;
                case '-':
                    res = chisla[0] - chisla[1];
                    break;
                case '*':
                    res = chisla[0] * chisla[1];
                    break;
                case '/':
                    res = chisla[0] / chisla[1];
                    break;
                default:
                    throw new Na();
            }
            System.out.print("RESULT__" + res);
        }




    }
}
