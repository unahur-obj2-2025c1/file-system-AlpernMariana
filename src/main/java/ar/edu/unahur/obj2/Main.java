package ar.edu.unahur.obj2;

public class Main {
    public static void main(String[] args) {

    Carpeta carpetaAN1 = new Carpeta("Carpeta A Nivel 1");
        Carpeta carpetaBN1 = new Carpeta("Carpeta B Nivel 1");
        Carpeta carpetaAN2 = new Carpeta("Carpeta A Nivel 2");
        Carpeta root = new Carpeta("root");

        Archivo file1 = new Archivo("Dibujo-A",250 , "jpg");
        Archivo file2 = new Archivo("Notas", 50, "txt");
        Archivo file3 = new Archivo("Rock",300 , "mp3");
        Archivo file4 = new Archivo("Imagen-A",240 , "jpg");
        Archivo file5 = new Archivo("Posticks",50 , "txt");
        Archivo file6 = new Archivo("Video-Parte-I", 600, "mp4");
        Archivo file7 = new Archivo("Video-Parte-II", 680, "mp4");
        Archivo file8 = new Archivo("Rap", 300, "mp3");
        Archivo file9 = new Archivo("Notas Rapidas", 120, "txt");

        carpetaAN2.agregar(file9);
        carpetaAN2.agregar(file8);
        carpetaBN1.agregar(file7);
        carpetaBN1.agregar(carpetaAN2);
        carpetaBN1.agregar(file6);
        carpetaBN1.agregar(file5);
        carpetaAN1.agregar(file4);
        carpetaAN1.agregar(file3);
        root.agregar(file2);
        root.agregar(file1);
        root.agregar(carpetaAN1);
        root.agregar(carpetaBN1);    

        FileSystem fs = new FileSystem();
        fs.agregarElemento(root);
        fs.listar();

    }
}