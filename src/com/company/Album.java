package com.company;

public class Album {
    private String titulo;
    private int anio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
