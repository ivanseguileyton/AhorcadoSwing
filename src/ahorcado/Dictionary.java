package ahorcado;

import java.util.concurrent.ThreadLocalRandom;

public class Dictionary {

    private String dictionary = "HOLA:ADIOS:TECLADO:RATON:PIZARRA:PUERTA:SEMAFORO:PANTALLA:SISTEMA:EXAMEN:DICCIONARIO:MURALLA:OSCURIDAD:UVA:ELECTRICIDAD";
    private String[] dictionaryArray = dictionary.split(":");

    public String getRandomWord() {

        int num = ThreadLocalRandom.current().nextInt(0, dictionaryArray.length);

        return dictionaryArray[num];
    }

}

