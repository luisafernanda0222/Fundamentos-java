//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione un ejercicio:");
            System.out.println("1. Casteo y Operadores: Ejercicio-1");
            System.out.println("2. Casteo y Operadores: Ejercicio-2");
            System.out.println("3. Casteo y Operadores: Ejercicio-3");
            System.out.println("4. Casteo y Operadores: Ejercicio-4");
            System.out.println("5. Casteo y Operadores: Ejercicio-5");
            System.out.println("6. Casteo y Operadores: Ejercicio-6");
            System.out.println("7. Casteo y Operadores: Ejercicio-7");
            System.out.println("8. Casteo y Operadores: Ejercicio-8");
            System.out.println("9. Casteo y Operadores: Ejercicio-9");
            System.out.println("10. Casteo y Operadores: Ejercicio-10");
            System.out.println("11. Operadores de Asignación: Ejercicio-1");
            System.out.println("12. Operadores de Asignación: Ejercicio-2");
            System.out.println("13. Operadores de Asignación: Ejercicio-3");
            System.out.println("14. Operadores de Asignación: Ejercicio-4");
            System.out.println("15. Operadores de Asignación: Ejercicio-5");
            System.out.println("16. Operadores de Incremento y Decremento: Ejercicio-1");
            System.out.println("17. Operadores de Incremento y Decremento: Ejercicio-2");
            System.out.println("18. Operadores de Incremento y Decremento: Ejercicio-3");
            System.out.println("19. Operadores de Incremento y Decremento: Ejercicio-4");
            System.out.println("20. Operadores de Incremento y Decremento: Ejercicio-5");
            System.out.println("21. Ejercicios Combinados: Ejercicio-1");
            System.out.println("22. Ejercicios Combinados: Ejercicio-2");
            System.out.println("23. Ejercicios Combinados: Ejercicio-3");
            System.out.println("24. Ejercicios Combinados: Ejercicio-4");
            System.out.println("25. Ejercicios Combinados: Ejercicio-5");
            System.out.println("26. Ejercicios Combinados: Ejercicio-6");
            System.out.println("27. Ejercicios Combinados: Ejercicio-7");
            System.out.println("28. Ejercicios Combinados: Ejercicio-8");
            System.out.println("29. Ejercicios Combinados: Ejercicio-9");
            System.out.println("30. Ejercicios Combinados: Ejercicio-10");
            System.out.println("0. Salir");

            System.out.print("Ingrese una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int x = (int) 5.89 + (int) 3.45;
                    System.out.println("RESULTADO: " + x);
                    break;
                case 2:
                    char myChar = 'A';
                    int myInt = (int) myChar;
                    System.out.println("RESULTADO: " + myInt);
                    break;
                case 3:
                    double d = 100.04;
                    long l = (long) d;
                    int i = (int) l;
                    System.out.println("RESULTADO: " + i);
                    break;
                case 4:
                    String numCadena = "22";
                    int numEntero = Integer.parseInt(numCadena);
                    System.out.println("RESULTADO: " + numEntero);
                    break;
                case 5:
                    int A = (int) (char) (byte) -1;
                    System.out.println("RESULTADO: " + A);
                    break;
                case 6:
                    int Num = 65;
                    char caracter = (char) Num;
                    System.out.println("RESULTADO: " + caracter);
                    break;
                case 7:
                    long num = 1000000L;
                    int numeroEntero = (int) num;
                    System.out.println("RESULTADO: " + numeroEntero);
                    break;
                case 8:
                    // Casteo y Operadores: Ejercicio-8
                    String total = Float.toString(22.0f);
                    System.out.println("RESULTADO: " + total);
                    break;
                case 9:
                    int numero = (int) Math.round(3.7);
                    System.out.println("RESULTADO: " + numero);
                    break;
                case 10:
                    byte b = 50;
                    short s = (short) b;
                    System.out.println("RESULTADO: " + s);
                    break;
                case 11:
                    int x1 = 10;
                    x1 += 5;
                    System.out.println("RESULTADO: " + x1);
                    break;
                case 12:
                    int x2 = 10;
                    int y = 5;
                    y *= (x2 + 5);
                    System.out.println("RESULTADO: " + y);
                    break;
                case 13:
                    int a = 15;
                    a %= 4;
                    System.out.println("RESULTADO: " + a);
                    break;
                case 14:
                    int x3 = 10;
                    int y1 = 5;
                    x3 += y1;
                    System.out.println("RESULTADO: " + x3);
                    break;
                case 15:
                    int x4 = 10;
                    x4 ^= 2;
                    System.out.println("RESULTADO: " + x4);
                    break;
                case 16:
                    int x5 = 5;
                    int y2 = ++x5;
                    System.out.println("RESULTADO x: " + x5 + ",RESULTADO y: " + y2);
                    break;
                case 17:
                    int a1 = 5;
                    System.out.println("RESULTADO a1++: " + a1++);
                    System.out.println("RESULTADO a1: " + a1);
                    break;
                case 18:
                    int count = 10;
                    count--;
                    System.out.println("RESULTADO: " + count);
                    break;
                case 19:
                case 20:
                    int x6 = 3;
                    x6 = x6++;
                    System.out.println("RESULTADO: " + x6);
                    break;
                case 21:
                    int i1 = 5;
                    i1 += ++i1 + i1++ + ++i1;
                    System.out.println("RESULTADO: " + i1);
                    break;
                case 22:
                    double d1 = 7.9;
                    int i2 = (int) d1;
                    i2++;
                    System.out.println("RESULTADO: " + i2);
                    break;
                case 23:

                    double d2 = 5.7;
                    int i3 = (int) d2;
                    i3 *= 2;
                    System.out.println("RESULTADO: " + i3--);
                    break;
                case 24:
                    int num1 = 9;
                    double result = (double) num1 / 2;
                    System.out.println("RESULTADO: " + result);
                    break;
                case 25:
                    char c = 'X';
                    c += 32;
                    System.out.println("RESULTADO: " + c);
                    break;
                case 26:
                    long longValue = 223L;
                    short shortValue = (short) longValue;
                    shortValue *= 2;
                    System.out.println("RESULTADO: " + shortValue);
                    break;
                case 27:
                    int x7 = 10;
                    x7 += (x7++) + (++x7);
                    System.out.println("RESULTADO: " + x7);
                    break;
                case 28:
                    float floatValue = 2f;
                    byte byteValue = (byte) floatValue;
                    byteValue = (byte) --byteValue;
                    System.out.println("RESULTADO: " + byteValue);
                    break;
                case 29:
                    int i4 = 257;
                    byte b1 = (byte) i4;
                    System.out.println("RESULTADO: " + b1);
                    break;
                case 30:
                    double d3 = 3.8;
                    int i5 = (int) d3;
                    i5 += 5;
                    i5++;
                    System.out.println("RESULTADO: " + i5);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Debes de ingresar un numero .");
            }
        } while (choice != 0);

        scanner.close();
    }
    {

        // Casteo y Operadores: Ejercicio-1 ¿Cuál será el resultado de la siguiente operación?

        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);

        // El resultado es 8

        // Casteo y Operadores: Ejercicio-2 Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?

        char myChar = 'A';
        int myInt = (int) myChar;
        System.out.println(myInt);

        // El resultado es 65

        // Casteo y Operadores: Ejercicio-3 ¿Qué valor se imprimirá?

        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println(i);

        // El resultado es 100

        // Casteo y Operadores: Ejercicio-4 Escribe código para convertir un String que contiene un número a un int.

        String numCadena = "22";
        int numEntero = Integer.parseInt(numCadena);
        System.out.println(numEntero);

        // El resultado es 22

        // Casteo y Operadores: Ejercicio-5 ¿Cuál es el resultado de (int) (char) (byte) -1?

        int A = (int) (char) (byte) -1;
        System.out.println(A);

        // El resultado es 65535

        // Casteo y Operadores: Ejercicio-6 Convierte el número 65 a un char. ¿Qué carácter obtienes?

        int Num = 65;
        char caracter = (char) Num;
        System.out.println(caracter);

        // El resultado es A

        // Casteo y Operadores: Ejercicio-7 ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?

        long num = 1000000L;
        int numeroEntero = (int) num;
        System.out.println(numeroEntero);

        // El resultado es 1000000

        // Casteo y Operadores: Ejercicio-8 Escribe código para convertir un float a un String.

        String total = Float.toString(22.0f);
        System.out.println(total);

        // El resultado es 22.0

        // Casteo y Operadores: Ejercicio-9 ¿Cuál es el resultado de (int) Math.round(3.7)?

        int numero = (int) Math.round(3.7);
        System.out.println(numero);

        // El resultado es 4

        // Casteo y Operadores: Ejercicio-10 Dado byte b = 50;, ¿cómo lo convertirías a short?

        byte b = 50;
        short s = (short) b;
        System.out.println(s);

        // El resultado es 50

        // Operadores de Asignación: Ejercicio-1 ¿Cuál es el valor de x después de la siguiente operación?

        int x1 = 10;
        x1 += 5;
        System.out.println(x1);

        // El resultado es 15

        // Operadores de Asignación: Ejercicio-2 Simplifica la siguiente expresión usando un operador de asignación compuesta: y = y * (x + 5);

        int x2 = 10;
        int y = 5;
        y *= (x2 + 5);
        System.out.println(y);

        // El resultado es 75

        // Operadores de Asignación: Ejercicio-3 ¿Cuál es el valor de a después de estas operaciones?

        int a = 15;
        a %= 4;
        System.out.println(a);

        // El resultado es 3

        // Operadores de Asignación: Ejercicio-4 Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.

        int x3 = 10;
        int y1 = 5;
        x3 += y1;
        System.out.println(x3);

        // El resultado es 15

        // Operadores de Asignación: Ejercicio-5 Qué hace la siguiente operación? x ^= 2;

        int x4 = 10;
        x4 ^= 2;
        System.out.println(x4);

        // El resultado es 8

        // Operadores de Incremento y Decremento: Ejercicio-1¿Cuál es el valor de x e y después de estas operaciones?


        int x5 = 5;
        int y2 = ++x5;
        System.out.println("x: " + x5 + ", y: " + y2);

        // El resultado de x es 6
        // El resultado de y es 6

        // Operadores de Incremento y Decremento: Ejercicio-2 ¿Qué se imprimirá en la consola?

        int a1 = 5;
        System.out.println(a1++);
        System.out.println(a1);

        // El resultado de a1++ es 5
        // El resultado de a1+ es 6

        // Operadores de Incremento y Decremento: Ejercicio-3 Escribe código que use el operador de decremento para disminuir una variable count en 1.

        int count = 10;
        count--;
        System.out.println(count);

        // El resultado es 9

        // Operadores de Incremento y Decremento: Ejercicio-4¿Cuál es la diferencia entre ++i y i++?


        // Operadores de Incremento y Decremento: Ejercicio-5 ¿Qué valor tendrá x después de esta operación?

        int x6 = 3;
        x6 = x6++;
        System.out.println(x6);

        // El resultado es 3

        // Ejercicios Combinados Ejercicio-1 ¿Cuál es el resultado de la siguiente expresión?

        int i1 = 5;
        i1 += ++i1 + i1++ + ++i1;
        System.out.println(i1);

        // El resultado es 25

        // Ejercicios Combinados Ejercicio-2 Escribe código para convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento.
        double d1 = 7.9;
        int i2 = (int) d1;
        i2++;
        System.out.println(i2);

        // El resultado es 8

        // Ejercicios Combinados Ejercicio-3 ¿Qué se imprimirá en la consola?

        double d2 = 5.7;
        int i3 = (int) d2;
        i3 *= 2;
        System.out.println(i3--);

        // El resultado es 10

        // Ejercicios Combinados Ejercicio-4 Crea una expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.

        int num1 = 9;
        double result = (double) num1 / 2;
        result *= 2;
        System.out.println(result);

        // El resultado es 9.0

        // Ejercicios Combinados Ejercicio-5 ¿Cuál es el resultado de la siguiente operación?

        char c = 'X';
        c += 32;
        System.out.println(c);

        // El resultado es x

        // Ejercicios Combinados Ejercicio-6 Escribe código para convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3.

        long longValue = 223L;
        short shortValue = (short) longValue;
        shortValue *= 2;
        System.out.println(shortValue);

        // El resultado es 446

        // Ejercicios Combinados Ejercicio-7 ¿Qué valor tendrá x después de estas operaciones?

        int x7 = 10;
        x7 += (x7++) + (++x7);
        System.out.println(x7);

        // El resultado es 32

        // Ejercicios Combinados Ejercicio-8 Crea una expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento.

        float floatValue = 2f;
        byte byteValue = (byte) floatValue;
        byteValue = (byte) --byteValue;
        System.out.println(byteValue);

        // El resultado es 1

        // Ejercicios Combinados Ejercicio-9 ¿Cuál es el resultado de la siguiente operación?

        int i4 = 257;
        byte b1 = (byte) i4;
        System.out.println(b1);

        // El resultado es 1

        // Ejercicios Combinados Ejercicio-10 Escribe una expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1.

        double d3 = 3.8;
        int i5 = (int) d3;
        i5 += 5;
        i5++;
        System.out.println(i5);

        // El resultado es 9
    }
}