import java.util.Scanner;
public class Hitman {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
  
System.out.print("Enter the side lenght of the square:  ");
double sideLenght= scanner.nextDouble();

Square square = new Square(sideLenght);

Double area = 