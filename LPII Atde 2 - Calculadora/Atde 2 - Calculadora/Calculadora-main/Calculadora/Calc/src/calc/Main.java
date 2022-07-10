/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.List;
import calc.Calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
	Calc calc = new Calc();

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("1-Soma\n");
        System.out.println("2-Subtração\n");
        System.out.println("3-Divisao\n");
        System.out.println("4-Multiplicação\n");
        System.out.println("5-Sair\n");
        
        int l = leitor.nextInt();
 
        int op = l;
        
        do{
            Scanner num1 = new Scanner(System.in);
            System.out.println("Digite o primeiro numero:");
            int number1 = num1.nextInt();
                
            Scanner num2 = new Scanner(System.in);
            System.out.println("Digite o primeiro numero:");
            int number2 = num2.nextInt();
 
            switch(op){
                case 1:
                   System.out.println("Soma: " + number1 + " + " + number2 + ": " + calc.sum(number1, number2));
                break;
                case 2:
                    System.out.println("Sub: " + number1 + " - " + number2 + ": " + calc.sub(number1, number2));
                break;
                case 3:
                    System.out.println("Div: " + number1 + " / " + number2 + ": " + calc.div(number1, number2));
                break;
                case 4:
                    System.out.println("Mult: " + number1 + " * " + number2 + ": " + calc.mult(number1, number2));
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
            }
            
            List<String> operation = calc.getLastOperations();
    
            Scanner aux = new Scanner(System.in);
        
            System.out.println("1-Soma\n");
            System.out.println("2-Subtração\n");
            System.out.println("3-Divisao\n");
            System.out.println("4-Multiplicação\n");
            System.out.println("0-Sair\n");
        
            int a = aux.nextInt();
 
            op = a;
            
        }while(op != 0);
        
        List<String> operation = calc.getLastOperations();
        System.out.println("Operações realizadas");
            for (String oper : operation) {
		System.out.println(operation);
            }
    }
}
