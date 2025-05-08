package ar.edu.unahur.obj2;

public class Archivo implements IElemento{
    private String nombre;
    private Integer tamanio;
    private String extension;
    
    public Archivo(String nombre, Integer tamanio, String extension){
        this.nombre = nombre;
        this.tamanio= tamanio;
        this.extension= extension;
        

    }

    @Override
    public String nombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombre'");
    }

    @Override
    public Integer tamanio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanio'");
    }

    @Override
    public void mostrar(Integer identacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public IElemento archivoMasPesado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'archivoMasPesado'");
    }

}
