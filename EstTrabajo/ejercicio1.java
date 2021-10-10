import java.util.*;
class Promedio {
  public static void main(String[] args) {
    float examen1;
    float examen2;
    float examen3;
    float resultado;
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa el primer examen");
    examen1=entrada.nextFloat();
    System.out.println("Ingresa el segunda examen");
    examen2=entrada.nextFloat();
    System.out.println("Ingresa el tercer examen");
    examen3=entrada.nextFloat();


    resultado=(examen1+examen2+examen3)/3;


    System.out.println("El promedio es "+resultado);

    
   
  }
}