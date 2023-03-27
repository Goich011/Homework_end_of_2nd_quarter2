package homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        boolean flag = true;
        ArrayList<Toy> toys = new ArrayList<Toy>();
        while(flag){
            System.out.print("1 - Загрузить игрушки из записанной базы данных\n" +
            "2 - Добавить новую игрушку\n" +
            "3 - Показать информацию по всем игрушкам\n" +
            "4 - Редактировать % вероятности выигрыша игрушки\n" +
            "5 - Сыграть в лотерею\n" +
            "0 - Выход\n");
            char entered = scanner.next().charAt(0);
            switch(entered){
                case '1': {
                    toys = logic.createToys();
                    break;
                }
                case '2': {
                    toys.add(logic.createToy(toys));
                    break;
                }
                case '3': {
                    logic.printToys(toys);
                    break;
                }
                case '4': {
                    logic.changeDropRate(toys);
                    break;
                }
                case '5': {
                    logic.getRandomToy(toys);
                    break;
                }
                case '0': {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
    }
}