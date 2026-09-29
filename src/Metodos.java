import java.io.*;

public class Metodos {
    public static void gardarProducto(Producto p) {
        //guardo en ficheros
        //1: Creo el fichero con FileOutputStream
        //Desmonta o castelo de Lego e converte o teu obxecto nunha secuencia de ceros e uns (bytes). Este proceso chámase serialización.
        //
        //Envía esa secuencia de bytes cara a un destino (por exemplo, cara a un ficheiro a través de FileOutputStream).
        try (FileOutputStream crear = new FileOutputStream("serial");
             ObjectOutputStream escribir = new ObjectOutputStream(crear)) {

            escribir.writeObject(p);
            System.out.println("Gardado con éxito!");

        } catch (IOException e) {
            System.out.println("Erro ao gardar: " + e.getMessage());
        }
    }

    public static Producto leerProduct(String nameFile){
        Producto p = null;
        try(FileInputStream fichero = new FileInputStream(nameFile);
            ObjectInputStream leer = new ObjectInputStream(fichero)){
            p = (Producto) leer.readObject();
            System.out.println("Cargado con éxito!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
        return p;
    }

    public static void gardarProductoTransient(productoTransient p) {
        //guardo en ficheros
        //1: Creo el fichero con FileOutputStream
        //Desmonta o castelo de Lego e converte o teu obxecto nunha secuencia de ceros e uns (bytes). Este proceso chámase serialización.
        //
        //Envía esa secuencia de bytes cara a un destino (por exemplo, cara a un ficheiro a través de FileOutputStream).
        try (FileOutputStream crear = new FileOutputStream("serial2");
             ObjectOutputStream escribir = new ObjectOutputStream(crear)) {

            escribir.writeObject(p);
            System.out.println("Gardado con éxito!");

        } catch (IOException e) {
            System.out.println("Erro ao gardar: " + e.getMessage());
        }
    }
    public static productoTransient leerProductTransient(String nameFile){
        productoTransient pt = null;
        try(FileInputStream fichero = new FileInputStream(nameFile);
            ObjectInputStream leer = new ObjectInputStream(fichero)){
            pt = (productoTransient) leer.readObject();
            System.out.println("Cargado con éxito!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
        return pt;
    }

}
