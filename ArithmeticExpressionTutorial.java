/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexpressiontutorial;

import java.util.Scanner;

/**
 *
 * @author Matthew Garcia
 */
public class ArithmeticExpressionTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please put in your expression surrounded by parenthesis: ");
        String expression = input.nextLine();
        
        Expression e = new Expression(expression);
        e.findParenthesis();
        
        
    }

}
