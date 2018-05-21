package by.itacademy.menu;

import by.itacademy.exceptions.InputException;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class InputChoice {
    private Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}[,]{1}[\\s][A-Z]{2}");

    public int input() {
        boolean flag = true;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            try {
                num = scanner.nextInt();
                flag = false;
                break;
            } catch (Exception e) {
                System.out.println("Неверный тип введенных данных! Повторите попытку! Принимаются значения типа int");
                scanner.next();
            }
        }
        return num;
    }

    public String inputName() {
        Scanner scanner=new Scanner(System.in);
        String name = null;
        boolean flag = true;
        while (flag) {
            try {
                name = scanner.nextLine();
                flag = false;
                if (!p.matcher(name).matches()) throw new InputException("Введено неверное название города!");
            } catch (InputException e) {
                System.out.println(e);
                System.out.println("Не соответствие шаблону!");
                System.out.println("Имя должно быть с большой буквы, затем запятая, далее 2 заглавные буквы");
                name = scanner.nextLine();
            }
        }
        return name;
    }
}