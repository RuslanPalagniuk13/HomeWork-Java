/* Задача 3:
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

/* Задача 3:
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

 import java.io.IOException;
 import java.util.Scanner; 
 import javax.swing.text.DefaultStyledDocument.ElementSpec;
 
 public class task3_4 {
    public static void main(String[] args) throws SecurityException, IOException {
       try (Scanner in = new Scanner(System.in)) {
          int i;
          double result = 0;
          double firstNum = 0;
          char Opr = 0;
          char jr = 0;
          double secondNum = 0;
          for(i = 0; i <= 4;i++)
          {
             switch(i){
                case 1: 
                      System.out.print("Введите первое число: ");
                      firstNum = in.nextDouble(); 
                      System.out.print("Для продолжения введите - (y), для отмены - (n): ");
                      jr = in.next().charAt(0);
                      if(jr == 'n'){
                         i = i - 1;
                      }
                   break;
                case 2: 
                      System.out.print("Введите оператор: (-, +, /, *): ");
                      Opr = in.next().charAt(0);
                      System.out.print("Для продолжения введите - (y), для отмены - (n): ");
                      jr = in.next().charAt(0);
                      if(jr == 'n'){
                         i = i - 1;
                      }
                   break;
                case 3: 
                      System.out.print("Введите второе число: ");
                      secondNum = in.nextDouble();
                      System.out.print("Для продолжения введите - (y), для отмены - (n): ");
                      jr = in.next().charAt(0);
                      if(jr == 'n'){
                         i = i - 1;
                      }
                   break;
                case 4:
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
             }
          }
          if(firstNum % 1 == 0 && secondNum % 1 == 0 && result % 1 == 0) {
             System.out.println("Полученный результат: " + (int)firstNum + " " + Opr + " " + (int)secondNum + " = " + (int)result);
          }else if(firstNum % 1 == 0 && secondNum % 1 == 0) {
             System.out.println("Полученный результат: " + (int)firstNum + " " + Opr + " " + (int)secondNum + " = " + result);
          }else {
             System.out.println("Полученный результат: " + firstNum + " " + Opr + " " + secondNum + " = " + result);
          }
       }
    }
 }