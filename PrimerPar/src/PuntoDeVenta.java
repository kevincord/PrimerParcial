// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PuntoDeVenta {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        Producto producto1 = new Producto("Laptop", 1000.0, "123456789", 10);
        Producto producto2 = new Producto("Mouse", 20.0, "987654321", 20);
        Servicio servicio1 = new Servicio("Mantenimiento", "Mantenimiento preventivo de equipos", 50.0);

        carrito.agregarElemento(producto1);
        carrito.agregarElemento(producto2);
        carrito.agregarElemento(servicio1);

        double totalCompra = carrito.calcularTotal();

        System.out.println("Carrito De Compras:");
        for (ElementoVenta elemento : carrito.getElementos()) {
            if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                System.out.println("Producto: " + producto.getNombre() + " - Precio: $" + producto.getPrecio());
            } else if (elemento instanceof Servicio) {
                Servicio servicio = (Servicio) elemento;
                System.out.println("Servicio: " + servicio.getNombre() + " - Precio: $" + servicio.getPrecio());
            }
        }

        System.out.println("Total de la compra: $" + totalCompra);
    }
}