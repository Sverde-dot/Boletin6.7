
package boletin.pkg67;

import java.util.Scanner;


public class clase7 {
final double PI=3.14159;
Scanner sc = new Scanner(System.in);

public String tipoFigura(){
System.out.println("Introduce el tipo de figura \n1. Cadrado \n2. Triangulo \n3. Circulo ");
String figura=sc.next();
return figura;
}
public void areaFigura(String figura){
switch (figura){
    case "Cadrado":
        System.out.println("Introduce o valor do lado");
  int lado=sc.nextInt();
        System.out.println("A área do cadrado é "+Math.pow(lado,2));
        break;
    case "Triangulo":
        System.out.println("Introduce a altura do triangulo");
        int altura=sc.nextInt();
        System.out.println("Introduce a base do triangulo");
        int base=sc.nextInt();
        System.out.println("A área do triangulo é "+((base*altura)/2));
        break;
    case "Circulo":
        System.out.println("Introduce o radio do circulo");
        float radio=sc.nextFloat();
        System.out.println("A área do círculo é "+(PI*Math.pow(radio, 2)));
        break;
    default:System.out.println("Opción incorrecta");
}
}
}
