package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");

        System.out.println("Ingrese el aforo del lugar de la fiesta: ");
        objetoLugar.setAforo(entradaPorTeclado.nextInt());

        int aforoGlobal = objetoLugar.getAforo();
        Invitado[] invitados = new Invitado[objetoLugar.getAforo()];





        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO
        int controlRegistros =0;
        System.out.println("Menu del programa");
        System.out.println("**********************");
        System.out.println("0. SALIR \n1. REGISTRO DEL LUGAR \n2. REGISTRO DE LA FIESTA \n3. REGISTRO INVITADO \n4. VER INVITADOS");
        do {
            System.out.print("Digite la acccion que desea realizar: ");
            controlRegistros=entradaPorTeclado.nextInt();

            switch (controlRegistros){
                case 1:
                    System.out.print("Digita el aforo: ");
                    objetoLugar.setAforo(entradaPorTeclado.nextInt());
                    System.out.print("Digita la direccion: ");
                    objetoLugar.setDireccion(entradaPorTeclado.next());
                    break;

                case 2:
                    System.out.print("Fecha: ");
                    objetoFiesta.setFecha(entradaPorTeclado.next());
                    System.out.print("Costos de alimentos: ");
                    objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de bebidas: ");
                    objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de lugar: ");
                    objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de equipos: ");
                    objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
                    break;

                case 3:

                    System.out.println("El aforo va en: " + objetoLugar.getAforo());


                    int contadorInvitado = aforoGlobal -objetoLugar.getAforo();


                    System.out.print("Ingrese el nombre del invitado: ");
                    invitados[contadorInvitado] = new Invitado();
                    invitados[contadorInvitado].setNombres((entradaPorTeclado.next()));

                    objetoLugar.setAforo(objetoLugar.getAforo()-1);

                    /*System.out.print("ingrese el documento: ");
                    objetoInvitado.setId(entradaPorTeclado.next());
                    System.out.print("Ingrese la edad: ");
                    objetoInvitado.setEdad(entradaPorTeclado.nextInt());
                    System.out.print("Este invitado paga la enrada?");
                    objetoInvitado.setAplicaCover(entradaPorTeclado.nextBoolean());*/




                    break;

                case 4:
                    for (int i=0; i<invitados.length; i++){
                        System.out.println(invitados[i].getNombres());

                    }
                    break;

                default:
                    System.out.println("SELECCIONA UNA OPCION VALIDA!!!!!!");
                    break;
            }




        }while (controlRegistros != 0);



    }
}