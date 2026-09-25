import java.io.Serializable;

class Producto implements Serializable {
    String nome;
    int num1;
    double num2;

    public Producto(String nome, int num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }

}

