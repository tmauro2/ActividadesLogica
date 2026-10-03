
import java.util.Scanner;

public class porcentajes{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    double precio;
double descuento;
double iva = 19;



System.out.println("Ingrese el nombre del producto");
String prodcuto = teclado.nextLine();
System.out.println("Ingrese el valor de la compra");
precio = teclado.nextDouble();

if (precio >= 500000) {
descuento = 20;
} else if (precio >= 300000) {
descuento = 15;
} else if (precio >= 100000) {
descuento = 10;
} else {
descuento = 0;
}
double valorDescuento = precio* descuento / 100;
double subtotal = precio - valorDescuento;
double valorIva = subtotal * iva / 100;
double total = subtotal + valorIva;
System.out.println("Resumen de la compra");
System.out.println("Precio: $" + precio);
System.out.println("Descuento:"  + valorDescuento + "%");
System.out.println("Subtotal: $" + subtotal);
System.out.println("IVA: $" + valorIva);
System.out.println("TOTAL: $" + total);
    }
}

    
        
    


