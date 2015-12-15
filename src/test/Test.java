/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import socket.SocketCliente;

/**
 *
 * @author Carlos Sánchez
 */
public class Test 
{
    public static void main(String []args)
    {
        SocketCliente socketCliente=new SocketCliente("localhost",9999);
        socketCliente.conectar();
        System.out.println("Cliente conectado");
        while(true)
        {
            String msj=leer("Ingrese el mensaje a enviar:");
            socketCliente.salida(msj);
            if(msj.equals("EXIT"))
                break;
            else                     
                System.out.println("rsp: "+socketCliente.leer());
        }
        
    }
    
    public static String leer(String mensaje)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }
}
