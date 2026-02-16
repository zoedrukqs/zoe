import java.util.Scanner;
public class nacholee {
    public static void main(String[] args) {
        System.out.println("Vamos a sumar dos numeros");
        int n1 = 0, n2 = 0, suma = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        n1= sc.nextInt();
        System.out.println("Ingrese el numero 2");
        n2= sc.nextInt();
        System.out.println("La suma de los numeros es: " + SumaNumeros(n1,n2));
    }
    public static int SumaNumeros(int n1 , int n2){
        return n1 + n2;
    }
}
