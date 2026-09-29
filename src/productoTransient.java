import java.io.Serializable;

class productoTransient implements Serializable {
    String nome;
    transient int num1;
    double num2;

    public productoTransient(String nome, int num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }

}