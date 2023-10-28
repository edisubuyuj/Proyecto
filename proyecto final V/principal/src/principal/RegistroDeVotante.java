/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 50240
 */
class RegistroDeVotante {
    String nombreVotante, apellidoVotante, sexoVotante, NacimientoVotante,direccionVotante;
    String departamentoVotante, ResidenciaVotante, paisVotante, emailVotante;
    int dpiVotante;

    Scanner teclado = new Scanner(System.in);

    public void obtenerDatosUsuario() {
        System.out.println("Obtener Nombre completo");
        nombreVotante = teclado.nextLine();
        System.out.println("Obtener Apellido completo");
        apellidoVotante = teclado.nextLine();
        System.out.println("Obtener el DPI del votante");
        dpiVotante = teclado.nextInt();
        System.out.println("Escribir genero del votante");
        sexoVotante = teclado.nextLine();
        System.out.println("Fecha de nacimiento");
        NacimientoVotante =  teclado.nextLine();
        System.out.println("direccion de residencia");
        direccionVotante = teclado.nextLine();
        System.out.println("Municipio donde recide");
        ResidenciaVotante = teclado.nextLine();
        System.out.println("Departamento de residencia");
        departamentoVotante = teclado.nextLine();
        System.out.println("Pais de Origen");
        paisVotante = teclado.nextLine();
        System.out.println("correo electronico");
        emailVotante = teclado.nextLine();
        
        teclado.nextLine();
    }

    File archivo = new File("archivo_texto.txt");

    public void CrearVotante() {

        try {
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dpiVotante + "|" + nombreVotante + "|" + apellidoVotante + "|" + sexoVotante + "|"+ NacimientoVotante + "|" + direccionVotante + "|" + ResidenciaVotante + "|" + departamentoVotante + "|" + paisVotante + "|" + emailVotante + "\n");
            bw.close();

        } catch (IOException ex) {
            System.out.println("Error " + ex + "\n");
        }
        System.out.println("\nVotante creado ");

    }

    
    
    
}
