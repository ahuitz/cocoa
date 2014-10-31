/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rosario
 */
public class main {
    
    public static void main(String[] args) {        
        try {
            Lexico lex = new Lexico(new FileReader("prueba.txt"));
            /*AnalizadorSintactico parser = new AnalizadorSintactico(lex);
            parser.parse();*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
