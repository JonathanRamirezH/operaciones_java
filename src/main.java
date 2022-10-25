import encapsulado.atributos;
import otherClass.orientationObjrct;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        atributos atbr = new atributos();
        orientationObjrct objeto = new orientationObjrct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");
        atbr.setName(scanner.nextLine());
        System.out.println("Ingresa un numero entero");
        //int valor1 = scanner.nextInt();
        atbr.setNum1(scanner.nextInt());
        System.out.println("Ingresa otro numero entero");
        //int valor2 = scanner.nextInt();
        atbr.setNum2(scanner.nextInt());
        objeto.tuNombre(atbr.getName());
        atbr.setDecision(scanner.nextInt());
            switch (atbr.getDecision()){
                case 1:
                    objeto.suma(atbr.getName(), atbr.getNum1(), atbr.getNum2());
                    break;
                case 2:
                    objeto.resta(atbr.getName(), atbr.getNum1(), atbr.getNum2());
                    break;
                case 3:
                    objeto.multiplicacion(atbr.getName(), atbr.getNum1(), atbr.getNum2());
                    break;
                case 4:
                    objeto.division(atbr.getName(), atbr.getNum1(), atbr.getNum2());
                    break;
                default:
                    System.out.println("MMMMMMMMMMMMM...\nNo tengo una accción para ese número, asi que me voy.\n" +
                            "BYEEEEEE!");
            }

        //objeto.suma(atbr.getName(), atbr.getNum1(), atbr.getNum2());
        //objeto.imprimiHola();

    }
}
