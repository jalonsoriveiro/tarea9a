/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tarea9a.Clientes.addCliente;
import static tarea9a.Clientes.getCliente;
import static tarea9a.Clientes.*;
import tarea9a.Metodos.*;
import static tarea9a.interfaz.Interfaz.menu;


 
/**
 *
 * @author jose
 */
public class Tarea9a {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.IOException
     */
     public static void main(String[] args) throws ClassNotFoundException, IOException {

         Clientes[] ar_Clientes = new Clientes[3];
      
         ar_Clientes[0]= new Clientes("355","jose","6666","asdasd","58");
         ar_Clientes[1]= new Clientes("355","Perico","6666","asdasd","58");
         ar_Clientes[2]= new Clientes("355","Perico","6666","asdasd","58");
                  
            
                addCliente(ar_Clientes);
                //getCliente();
                buscarCliente("Perico");
                rmFichero();
                menu();

    }
    
}
