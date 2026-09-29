//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //instacio el objeto
    Producto p = new Producto("Manos", 10, 25.5);
    Metodos.gardarProducto(p);
    Producto comprobación = Metodos.leerProduct("serial");
    System.out.println(comprobación.num1);

    productoTransient pp = new productoTransient("Manos", 10, 25.5);
    Metodos.gardarProductoTransient(pp);
    productoTransient comprobacion2 = Metodos.leerProductTransient("serial2");
    System.out.println(comprobacion2.num1);
}