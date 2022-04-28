package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Cancion {
    private String nombre;
    private float duracion;
    private String genero;
    private Album album;
    private Artista artista;
    static final String[] generosPermitidos = {"ROCK", "TRAP", "JAZZ",
            "HIP HOP", "POP", "METAL" , "CLASICA"};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cancion)) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(nombre, cancion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", album=" + album +
                ", artista=" + artista +
                '}';
    }

    public Cancion crearNuevaCancion(){  ///Trabajar en elmain con una lista de canciones.
        Cancion nuevaCancion = new Cancion();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Nombre de cancion");
        nuevaCancion.setNombre(scan.nextLine());
        System.out.println("Ingrese duracion");
        float auxFloat = scan.nextFloat();
        nuevaCancion.setDuracion(auxFloat);
        System.out.println("Ingrese genero");
        scan.nextLine();
        nuevaCancion.setGenero(scan.nextLine());
        Album albumaux = new Album();
        System.out.println("Ingrese titulo del album");
        scan.nextLine();
        albumaux.setTitulo(scan.toString());
        System.out.println("Ingrese Anio del Album");
        albumaux.setAnio(scan.nextInt());
        scan.nextLine();
        this.album = albumaux;
        Artista artistaaux = new Artista();
        System.out.println("Ingrese Artista");
        scan.nextLine();
        artistaaux.setNombre(scan.toString());
        System.out.println("Ingrese nacionalidad del artista");
        scan.nextLine();
        artistaaux.setNacionalidad(scan.toString());
        System.out.println("Ingrese edad del artis");
        artistaaux.setEdad(scan.nextInt());
         this.artista = artistaaux;
        return nuevaCancion;
    }
}
