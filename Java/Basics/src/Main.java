import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод первого числа
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Запрашиваем у пользователя ввод второго числа
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Запрашиваем у пользователя ввод третьего числа
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        // Суммируем три числа
        double sum = num1 + num2 + num3;

        // Выводим результат на экран
        System.out.println("Сумма трех чиселок: " + sum);


        // Закрываем Scanner
        scanner.close();

    }
}

/*
class Car {

    private String name = "Unnown";
    private String color;

     Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    void GetInfo() {
         System.out.println("Name: " + name +" " + "Color" + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Black");
        car1.GetInfo();



    }
}

*/

// final - не изменяемые; static статистиче поля для классов; создание перегруженных конструкторов
// и обычных, создание перегруженных методов; extends - наследование; super - вызов из дочернего;
// @Override - переопределение метода в дочернем классе; Исключения