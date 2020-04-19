import java.util.Scanner;
public class Calificaciones{
  public static void main(String args[]){
   Scanner lectura = new Scanner(System.in);

   String alumno;
 
   int materias, notas, calificaciones = 0, promedio;

   System.out.println("Ingrese el nombre del alumno: ");
   alumno = lectura.nextLine();

   System.out.println("ingrese la cantidad de materias en las que estas inscripto: ");
   materias = lectura.nextInt(); 
   int i = 0;
   while (i < materias){
   
     System.out.println("Ingrese su calificacion: ");
     notas = lectura.nextInt();	   
     calificaciones = calificaciones + notas;
     i++;
   }

   promedio = (calificaciones / materias);
   
   if (promedio >= 6){
    System.out.println("El alumno " + alumno + " aprobo con un promedio gral de: " + promedio + " FELICIDADES"); 
  }else{
    System.out.println("El alumno " + alumno + " reprobo con un promedio gral de: " + promedio); 	
  } 
 }
}