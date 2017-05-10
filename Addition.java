/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexpressiontutorial;

/**
 *
 * @author Matthew Garcia
 */
public class Addition {
    public String findAddition(String expression) {
        int numberOfAddition = 0;
        int index = 0;

        while (index < expression.length()) {
            String character = expression.substring(index, index + 1);
            if (character.equals("+")) {
                numberOfAddition++;
            }
            index++;
        }
        System.out.println("Number Addition" + numberOfAddition);
        String replace = expression;

        if (numberOfAddition == 0) {
            return replace;
        } else {

            while (numberOfAddition > 0) {
                index = 0;
                while (index < replace.length() - 1) {

                    String character = replace.substring(index, index + 1);
                    if (character.equals("+")) {

                        int placeHolder = index;
                        String digit = "";
                        String secondDigit = "";

                        character = replace.substring(index - 1, index);
                        //first digit
                        while (!character.equals("+") && !character.equals("-")
                                && !character.equals("/") && !character.equals("*")) {
                            index--;
                            if (index <= 0) {

                                character = "+";
                            } else {
                                character = replace.substring((index - 1), index);
                            }

                        }
                        digit = replace.substring(index, placeHolder);
                       // System.out.println("Digit is " + digit);
                        index = placeHolder;
                        character = replace.substring(index + 1, index + 2);
                        //5*45
                        while (!character.equals("+") && !character.equals("-")
                                && !character.equals("/") && !character.equals("*")) {
                            secondDigit += character;

                            index += 1;
                            if (index >= replace.length() - 1) {
                                character = "+";
                            } else {
                                character = replace.substring(index + 1, index + 2);
                            }

                        }
                       // System.out.println("Second Digit " + secondDigit);

                        double value = Double.valueOf(digit) + Double.valueOf(secondDigit);

                        replace = replace.replace(digit + "+" + secondDigit, String.valueOf(value));
                        
                        numberOfAddition--;
                        index = 0;

                    }
                    index++;

                }

            }
            return replace;
        }

    } 
}
