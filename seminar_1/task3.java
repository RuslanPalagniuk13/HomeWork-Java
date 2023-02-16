/** Задача 3:
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task3 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      double firstNum = in.nextDouble();
      System.out.print("Введите оператор: (+, -, *, /): ");
      char Opr = in.next().charAt(0);
      System.out.print("Введите второе число: ");
      double secondNum = in.nextDouble();
      double result; 

      switch(Opr) {
         case '+': result = firstNum + secondNum;
            break;
         case '-': result = firstNum - secondNum;
            break;
         case '*': result = firstNum * secondNum;
            break;
         case '/': result = firstNum / secondNum;
            break;
         default:  System.out.printf("Неверно! Введите корректный оператор");
            return;
      }
      
      if(firstNum % 1 == 0 && secondNum % 1 == 0 && result % 1 == 0) {
         System.out.println("Полученный результат: " + (int)firstNum + " " + Opr + " " + (int)secondNum + " = " + (int)result);
      }else if(firstNum % 1 == 0 && secondNum % 1 == 0) {
         System.out.println("Полученный результат: " + (int)firstNum + " " + Opr + " " + (int)secondNum + " = " + (int)result);
      }else {
         System.out.println("Полученный результат: " + firstNum + " " + Opr + " " + secondNum + " = " + result);
      }
  }

}


