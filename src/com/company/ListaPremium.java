package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaPremium implements Reproduccion{

    private String nombre;
    private LinkedList<Cancion> miLista = new LinkedList<>();

    public ListaPremium() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir(int index) {
        Cancion cancion;
        cancion = miLista.get(index);
        System.out.println("Se reproducira la cancion ");
        System.out.println(cancion.toString());
    }

    @Override
    public void aniadirCancion(List<Cancion> canciones ) {
        System.out.println("Que cancion desea agregar");
        for (Cancion aux:canciones
             ) {
            System.out.println(aux.toString());
        }
        Scanner scan = new Scanner(System.in);
        Cancion cancionAux = new Cancion();
        cancionAux.setNombre(scan.nextLine());
        int index = canciones.indexOf(cancionAux);
        miLista.add(canciones.get(index));
    }

    @Override
    public void eliminarCancion() {
        for (Cancion aux:miLista
             ) {
            System.out.println(aux.toString());
        }
        System.out.println("Que cancion desea eliminar?");
        Scanner scan = new Scanner(System.in);
        Cancion cancionAux = new Cancion();
        cancionAux.setNombre(scan.nextLine());
        miLista.remove(cancionAux);
    }

    @Override
    public void verMiLista() {
        System.out.println("Esta es su lista de reproduccion");
        for (Cancion cancion:miLista) {
            System.out.println(cancion.toString());
        }
    }

    @Override
    public void cambiarCancion() {
        System.out.println("Seleccion la cancion");
        for (Cancion cancion:miLista
             ) {
            System.out.println(cancion.toString());
        }
        Scanner scan = new Scanner(System.in);
        Cancion cancionAux = new Cancion();
        cancionAux.setNombre(scan.nextLine());
        int index = miLista.indexOf(cancionAux);
        reproducir(index);
    }

}
