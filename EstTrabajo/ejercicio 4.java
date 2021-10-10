import java.util.*;

class Main {
  public static void main(String[] args) {
    int edad;
    int sexo;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su edad");
    edad=entrada.nextInt();
    System.out.println("Ingresa 0 si es masculino o 1 si es femenino");
    sexo=entrada.nextInt();


    if(edad >= 70){
       System.out.println("Usted le toca la vacuna C");


    }
    else if (edad >=16 & edad <=69 & sexo == 1){
      System.out.println("Usted le toca la vacuna tipo B");

    }
    else if (edad >=16 & edad <=69 & sexo == 0){
      System.out.println("Usted le toca la vacuna tipo A");
    }
    else if (edad <16){
      System.out.println("Usted le toca la vacuna tipo A");



    }






  }
}