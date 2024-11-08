
package rodriguez_maria_e1;

import java.util.Scanner;

/**
 *
 * @author Maria Gabriela
 */
public class Rodriguez_Maria_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Menu;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("****Menu****\n"
                    + "1. Piramide\n"
                    + "2.El Mayor\n"
                    + "3.Canales\n"
                    + "4.Caracteres y Vocales\n"
                    + "5.Salir");

            Menu = entrada.nextInt();
            switch (Menu) {
                case 1:
                    int lineas;
                    int num = 1;
                    System.out.println("Cuantas filas desea que sean?");
                    lineas = entrada.nextInt();
                    for (int i = 1; i <= lineas; i++) {
                        int suma = 0;
                        for (int j = 0; j < i; j++) {
                            System.out.print(num + " ");
                            suma += num;
                            num += 2;
                        }
                        System.out.println("= " + suma);
                    }
                    break;

                case 2:
                    int nummayor = 0,
                     numero,
                     cantnumeros = 0,
                     totnum = 0;
                    String cont;
                    double promedio;

                    do {
                        System.out.println("Ingrese el numero");
                        numero = entrada.nextInt();
                        if (numero > nummayor) {
                            nummayor = numero;
                        }
                        totnum += numero;
                        cantnumeros++;
                        System.out.println("Desea continuar? Escribir Si o No");
                        cont = entrada.next();
                    } while (cont.equalsIgnoreCase("si"));

                    promedio = totnum / cantnumeros;
                    System.out.println("El numero mayor ingresado es: " + nummayor);
                    System.out.println("El promedio de los numeros ingresados: " + promedio);
                    System.out.println("");

                    break;
                case 3:
                    String cliente,continuacion="";
                    String canal,caja;
                    int hd = 0,
                     normal = 0,
                     subtotal = 0;
                    double impuesto,total;
                    System.out.println("Ingrese el nombre del cliente: ");
                    cliente = entrada.next();
                    do {
                        System.out.println("Que tipo de canal desea? (HD o normal)");
                        canal = entrada.next();
                        if (canal.equalsIgnoreCase("HD")) {
                            hd++;
                            subtotal += 30;
                        }
                        else if (canal.equalsIgnoreCase("normal")) {
                            normal++;
                            subtotal += 20;
                        }
                        else {
                            System.out.println("Favor ingrese un tipo de canal que si exista!");
                            continue;
                        }

                        System.out.println("Desea continuar? Escribir Si o No");
                        continuacion = entrada.next().toLowerCase();
                    } while(continuacion.equals("si"));
                    while (true) {
                        System.out.println("Ingrese que tipo de caja desea agregar (LIGHTBOX, HDBOX o DVRBOX)");
                        caja = entrada.next();
                        if (caja.equalsIgnoreCase("LIGHTBOX")) {
                            subtotal += 50;
                            break;
                        } else if (caja.equalsIgnoreCase("HDBOX")) {
                            subtotal += 100;
                            break;
                        } else if (caja.equalsIgnoreCase("DVRBOX")) {
                            subtotal += 150;  
                            break;
                        }
                        else{
                            System.out.println("Seleccione un tipo de caja que si exista!");
                        }
                    }
                    impuesto= subtotal*0.15;
                    total=subtotal+impuesto;
                    System.out.println("....Detalles de Compra....");
                    System.out.println("Nombre del Cliente: "+cliente);
                    System.out.println("Numero de programas nomrmales: "+normal+" y numero de programas HD: "+hd);
                    System.out.println("El subtotal de su compra es "+subtotal+" lempiras");
                    System.out.println("El impuesto a pagar de 15% es: "+impuesto+" lempiras");
                    System.out.println("El total de su compra es: "+total+" lempiras");
                    System.out.println("");
                    break;
                case 4:

                    int contv = 0;
                    String texto;
                    char cadena;

                    System.out.println("Favor ingrese una cadena del teclado");
                    texto = entrada.next();

                    for (int i = 0; i < texto.length(); i++) {
                        cadena = texto.charAt(i);

                        switch (cadena) {
                            case ('a'):
                                contv++;
                                break;
                            case ('e'):
                                contv++;
                                break;
                            case ('i'):
                                contv++;
                                break;
                            case ('o'):
                                contv++;
                                break;
                            case ('u'):
                                contv++;
                                break;
                            default:
                                break;
                        }
                    }
                    System.out.println("La cantidad de vocales en la cadena ingresada es:" + contv);
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Gracias por usar el programa!");
                    System.out.println("Hasta Luego");
                    System.exit(0);
                default:
                    System.out.println("Esa opcion no esta disponible");

            }
        }
    }
}
