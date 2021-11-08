import java.util.*;

class Main {
  public static void main(String[] args) {

   double num1,num2,resultado;


   String operador;
   Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa el numero 1");
    num1 = entrada.nextDouble(); 
     System.out.println("Ingresa el numero 2");
    num2 = entrada.nextDouble(); 
     Scanner op = new Scanner(System.in);
     System.out.println("Ingresa el operador");
     operador = op.nextLine();

     if (operador.equals  ("+")){
       resultado = num1 + num2;
       System.out.println("El resultado de la suma es "+resultado);


     }
     else if(operador.equals ("-")){
       resultado = num1 - num2;
       System.out.println("El resultado de la resta es "+resultado);
     }
      else if(operador.equals  ("*")){
       resultado = num1 * num2;
       System.out.println("El resultado de la multiplicacion es "+resultado);
     }
      else if(operador.equals  ("^")){
       resultado = Math.pow(num1,num2);
       System.out.println("El resultado de la potencia es "+resultado);
     }
      else if(operador.equals  ("/")){
       resultado = num1 / num2;
       System.out.println("El resultado de la division es "+resultado);
     }


  }

}