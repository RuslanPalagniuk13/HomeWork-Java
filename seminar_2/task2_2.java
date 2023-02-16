

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task2_2 {

   public static void main(String[] args) throws SecurityException, IOException {
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
  
      Logger logger = Logger.getLogger(task2_2.class.getName());
      logger.log(Level.INFO, "Все хорошо");
      FileHandler fh = new FileHandler("LogTask2_2.xml");
      logger.addHandler(fh);
      XMLFormatter xml = new XMLFormatter();
      fh.setFormatter(xml);
   }

}