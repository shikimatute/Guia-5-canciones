package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Cancion> listaCanciones = new ArrayList<>();
        Cancion o = new Cancion();
        o = o.crearNuevaCancion();
        listaCanciones.add(o);
        String usuarioLogin = login();
        checkUsuario(usuarioLogin, listaCanciones);
    }

    public static String login() {
        System.out.println("Ingrese usuario");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void checkUsuario(String usuario, List<Cancion> listaCanciones) {
        if (usuario.compareTo("free") == 0) {
            menuFree(listaCanciones);
        }
        if (usuario.compareTo("premium") == 0) {
            menuPremium(listaCanciones);
        }
    }

    public static void menuFree(List<Cancion> listaCanciones) {
        int caseUsuario;
        Scanner scan = new Scanner(System.in);
        ListaBasica usuarioFree = new ListaBasica();
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("OPCION 1: VER LISTA");
            System.out.println("OPCION 2: AGREGAR CANCION A LA LISTA");
            System.out.println("OPCION 3: REPRODUCIR LISTA");
            System.out.println("OPCION 4: BORRAR CANCION DE LA LISTA");
            System.out.println("OPCION 5: CAMBIAR CANCION");
            System.out.println("OPCION 0: SALIR");
            caseUsuario = scan.nextInt();
            switch (caseUsuario) {
                case 1 -> usuarioFree.verMiLista();
                case 2 -> usuarioFree.aniadirCancion(listaCanciones);
                case 3 -> usuarioFree.reproducir(0);
                case 4 -> usuarioFree.eliminarCancion();
                case 5 -> usuarioFree.cambiarCancion();
                default -> System.out.println("Ingreso valor invalido");
            }

        } while (caseUsuario!=0);

    }
    public static void menuPremium (List<Cancion> listaCanciones){
        int caseUsuario;
        Scanner scan = new Scanner(System.in);
        ListaPremium usuarioPremium = new ListaPremium();
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("OPCION 1: VER LISTA");
            System.out.println("OPCION 2: AGREGAR CANCION A LA LISTA");
            System.out.println("OPCION 3: REPRODUCIR LISTA");
            System.out.println("OPCION 4: BORRAR CANCION DE LA LISTA");
            System.out.println("OPCION 5: CAMBIAR CANCION");
            System.out.println("OPCION 0: SALIR");
            caseUsuario = scan.nextInt();
            switch (caseUsuario) {
                case 1 -> usuarioPremium.verMiLista();
                case 2 -> usuarioPremium.aniadirCancion(listaCanciones);
                case 3 -> usuarioPremium.reproducir(0);
                case 4 -> usuarioPremium.eliminarCancion();
                case 5 -> usuarioPremium.cambiarCancion();
                default -> System.out.println("Ingreso valor invalido");
            }

        } while (caseUsuario!=0);
    }
}