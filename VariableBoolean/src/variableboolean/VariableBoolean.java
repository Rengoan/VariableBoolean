/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableboolean;

/**
 *
 * @author Lukelar
 */
public class VariableBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("Nuestra variable es True");
        } else {
            System.out.println("Nuestra variable es False");
        }

        int edad = 30;
        if (edad < 18) {
            System.out.println("No es mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

}
