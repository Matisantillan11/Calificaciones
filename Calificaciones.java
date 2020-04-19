import java.util.Scanner;
public class Calificaciones{
  public static void main(String args[]){
   Scanner lectura = new Scanner(System.in);

   String alumno;
 
   int mat, bio, qui, promedio;

   System.out.println("Ingrese el nombre del alumno: ");
   alumno = lectura.nextLine();

   System.out.println("Digite su calificación en Matematicas");
   mat = lectura.nextInt(); 

   System.out.println("Digite su calificación en Biologia");  
   bio = lectura.nextInt();

   System.out.println("Digite su calificación en Quimica"); 
   qui = lectura.nextInt();

   promedio = (mat + bio + qui) / 3;
   
   if (promedio >= 6){
    System.out.println("El alumno " + alumno + "aprobo con un promedio gral de: " + promedio + " FELICIDADES"); 
  }else{
    System.out.println("El alumno " + alumno + "reprobo con un promedio gral de: " + promedio); 	
  } 
 }
}