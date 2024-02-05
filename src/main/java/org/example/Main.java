package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreCliente;
        String apellidoCliente;
        String tipoCliente;
        Double cantidadArticulos;
        Double precioPorArticulo=50.0;
        Double totalCompra;
        Double descuento;



        Scanner leer = new Scanner(System.in);

        System.out.println("\n*****Bienvenido a ModaExpress*****");
        System.out.print("Ingrese su nombre: ");
        nombreCliente=leer.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellidoCliente=leer.nextLine();
        System.out.print("Digite el tipo de cliente: ");
        tipoCliente=leer.nextLine().toLowerCase();

        if (tipoCliente.equals("regular")){
            System.out.print("Digite la cantidad de articulos que lleva: ");
            cantidadArticulos=leer.nextDouble();
            if (cantidadArticulos==1 | cantidadArticulos ==2 | cantidadArticulos ==3) {
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.05;
                System.out.print("el descuento por su compra es: $" + descuento);
            }else if (cantidadArticulos==4 | cantidadArticulos ==5 | cantidadArticulos==6){
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.1;
                System.out.print("el descuento por su compra es: $" + descuento);
            }else{
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.15;
                System.out.print("el descuento por su compra es: $" + descuento);
            }
        }else if(tipoCliente.equals("vip")){
            System.out.print("Digite la cantidad de articulos que lleva: ");
            cantidadArticulos=leer.nextDouble();
            if (cantidadArticulos==1 | cantidadArticulos ==2 | cantidadArticulos ==3) {
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.1;
                System.out.print("el descuento por su compra es: $" + descuento);
            }else if (cantidadArticulos==4 | cantidadArticulos ==5 | cantidadArticulos==6){
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.15;
                System.out.print("el descuento por su compra es: $" + descuento);
            }else{
                precioPorArticulo = precioPorArticulo * cantidadArticulos;
                System.out.print("el total de su compra es de: $" + precioPorArticulo);
                System.out.println();
                descuento = precioPorArticulo * 0.2;
                System.out.print("el descuento por su compra es: $" + descuento);
            }
        }else{
            System.out.println("Digite una opcion valida");
        }

    }

}