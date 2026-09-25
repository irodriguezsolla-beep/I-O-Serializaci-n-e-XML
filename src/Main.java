//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //instacio el objeto
    Producto p = new Producto("Mano", 10, 25.5);
    Metodos.gardarProducto(p);
    Producto vacio = new Producto(null,0,0);
    Metodos.gardarProducto(p);
    Metodos.leerProduct("serial");

}
