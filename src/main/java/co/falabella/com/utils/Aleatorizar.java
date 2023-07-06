package co.falabella.com.utils;

import java.util.Random;

public class Aleatorizar {

    public int generarIndiceAleatorio(int tamanoArreglo) {
        Random random = new Random();
        return random.nextInt(tamanoArreglo);
    }

    /*
    private static final Random RANDOM = new Random();

    public int generarIndiceAleatorio(int tamanoArreglo) {
        return RANDOM.nextInt(tamanoArreglo);
    }
     */
}
