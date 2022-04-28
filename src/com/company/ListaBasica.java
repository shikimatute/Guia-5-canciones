package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private Stack<Cancion> miLista = new Stack<>();

    public ListaBasica(){

    }
    public ListaBasica(String nombre, Stack<Cancion> miLista) {
        this.nombre = nombre;
        this.miLista = miLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducir(int index) {
        Stack<Cancion> stackAux = new Stack<>();
        Cancion cancionAux = miLista.pop();
        System.out.println(cancionAux.toString());
        while (!miLista.empty()) {
            stackAux.push(miLista.pop());
        }
        miLista.push(cancionAux);
        while (!stackAux.empty()) {
            miLista.push(stackAux.pop());
        }
    }

    @Override
    public void aniadirCancion(List<Cancion> canciones) {
        for (Cancion aux:
             canciones) {
            System.out.println(aux.toString());
        }
        System.out.println("Que cancion desea agregar");
        Scanner scan = new Scanner(System.in);
        //scan.nextLine();
        Cancion cancionAux = new Cancion();
        cancionAux.setNombre(scan.nextLine());
        int index = canciones.indexOf(cancionAux);
        this.miLista.push(canciones.get(index));
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {
        Stack<Cancion> aux = new Stack<>();
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.firstElement().toString());
            aux.push(miLista.pop());
        }
        for (int i = 0; i < aux.size(); i++) {
            miLista.push(aux.pop());
        }

    }

    @Override
    public void cambiarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
