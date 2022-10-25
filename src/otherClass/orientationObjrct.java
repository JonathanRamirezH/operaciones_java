package otherClass;
import encapsulado.atributos;
import javaInterface.javaInterface;

public class orientationObjrct implements javaInterface{
    public void imprimiHola(){
        System.out.println("Hola, mundo");
    }

    @Override
    public void tuNombre(String name) {
        System.out.printf("Ok %s ¿Qué que quieres hacer con los numeros que me diste?\n" +
                "1.- Sumar\n" +
                "2.- Restar\n" +
                "3.- Multiplicar\n" +
                "4.- Dividir\n", name);
    }

    @Override
    public void suma(String name, int num1, int num2){
        int resultado = num1 + num2;
        System.out.printf("%s el resultado de la suma es ---------------> %d", name, resultado);
    }

    @Override
    public void resta(String name, int num1, int num2) {
        int resultado = num1 - num2;
        System.out.printf("%s el resultado de tu resta es -------------> %d", name, resultado);
    }

    @Override
    public void multiplicacion(String name, int num1, int num2) {
        int resultado = num1 * num2;
        System.out.printf("%s el resultado de tu multiplicación ------------------> %d", name, resultado);
    }

    @Override
    public void division(String name, int num1, int num2) {
        int resultado = num1 / num2;
        System.out.printf("%s el resultado de tu division es -------------------------> %d", name, resultado);
    }
}
