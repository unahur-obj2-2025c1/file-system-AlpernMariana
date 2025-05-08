package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private List<IElemento> elementos = new ArrayList<>();
    private String nombre;

    public Carpeta(String nombre){
        this.nombre =nombre;

    }
    public void agregar(IElemento elemento){
        elementos.add(elemento);
    }

}