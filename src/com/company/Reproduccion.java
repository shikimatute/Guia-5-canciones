package com.company;

import java.util.List;

public interface Reproduccion {

        void reproducir(int index);
        void aniadirCancion(List<Cancion> cancion);
        void eliminarCancion();
        void verMiLista();
        void cambiarCancion();
}
