/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriogit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Persona;


/**
 *
 * @author MANUEL BERMUDEZ
 */
public class LaboratorioGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> Personas = new ArrayList<>();
        
        Scanner  entrada = new Scanner(System.in); //crea el scanner para ingresar datos por teclado
        String elecc;
        System.out.println("Desea ingresar mas Personas?");
        elecc=entrada.nextLine();
        while("si".equals(elecc)){
            
            String elecc2;
            System.out.print("Ingrese su rol");
            elecc2=entrada.nextLine();
        }
        
    }
    
    
}
