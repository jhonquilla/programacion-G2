import java.util.*;

class Main {
  public static void main(String[] args) {
    int sueldo;
    int puntaje;
    double porcentaje;
    double bono;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa el sueldo");
    sueldo=entrada.nextInt();
    System.out.println("Ingresa el puntaje");
    puntaje=entrada.nextInt();
 
 if(puntaje >= 100 & puntaje <=200  ){
      porcentaje = (sueldo * 0.1);
      bono = porcentaje + sueldo;
    System.out.println("El bono es de "+ porcentaje+" y el sueldo total es de "+bono);
   }
   else if(puntaje >=201 & puntaje <=300){
     porcentaje = (sueldo * 0.4);
      bono = porcentaje + sueldo;
    System.out.println("El bono es de "+ porcentaje+" y el sueldo total es de "+bono);
  }
   else if(puntaje >=301 & puntaje <=400){
     porcentaje = (sueldo * 0.7);
      bono = porcentaje + sueldo;
    System.out.println("El bono es de "+ porcentaje+" y el sueldo total es de "+bono);}

    else if(puntaje >=401 ){
    porcentaje = (sueldo * 0.8);
    bono = porcentaje + sueldo;
    System.out.println("El bono es de "+ porcentaje+" y el sueldo total es de "+bono);}
}
  
}