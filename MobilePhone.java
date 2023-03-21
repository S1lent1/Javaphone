import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;

public class MobilePhone extends Telephone {

    //    переменные класса
    private int tempMemory;
    private int charge;
    private final HashMap <String, Integer> phoneBook = new HashMap<>();

    //--------------
//    наследование переменных абстрактного класса
    public MobilePhone(String mynunber){
        super(mynunber);
    }
    //--------------
//
    public int putONcharge(){
        return this.charge += 10;
    }

    //--------------
//    переопределение абстрактных методов
    @Override
    public void call(String number){

        if (charge == 100){
            System.out.println("calling to" + number);
            this.charge -= 2;
        }else if(charge == 2){
            System.out.println("I have not enouth charge");
        }
    }
    //метод возваращает имитацию на общение, попробовать воссоздать реальное общение:
// 1) при создании >2 экземпляров реализовать возможность связаться друг с другом, т.е
// экз-ы будут переписываться в реальном времени поочереди
// * по сути - это копирование функции messageTo, только в обертке звонка
//
// 2) попытаться создать скрипт, который можно запустить на разных компьютерах
// (или на одном компе, только две разных скрипта, которые будут знать как передавать
// информацию друг другу) в одной локальной сети, позволяющий общаться экз-ам
// * по сути - это копирование функции messageTo, только в обертке звонка
//
    @Override
    public boolean charge(){
        return this.charge >= 2;
    }

    //--------------
// собственные методы класса
    public void inputNumber(int number){
        Scanner scan = new Scanner(System.in);

        this.tempMemory = number;
        System.out.println("call");
        System.out.println("add");
        System.out.println("delete? backspace");
        String answer = scan.nextLine();
        switch (answer) {
            case "add" -> {
                String name = scan.nextLine();
                this.addContact(name, number);
            }
            case "call" -> {
                String temp = number + "";
                this.call(temp);
            }
        }

//        return this.phoneBook;
    }
    // позволяет вводить номер (с возможностью его редактирования при опечатке) и решать:
// позвонить на него, отправить сообщение, добавить его в контакты
// * попробовать выводить похожие номера из контаков по мере ввода
// * при звонке/смс на номер сохранять его либо как "последний набранный номер", если
// будет необходимо после довать его в контакты или черный список
// ** вместо сохраннения "последнего номера" сохранять "последние 10 номеров"
    public void addContact(String name, int number){
        System.out.println("do you want to add last dialed number?");
        this.phoneBook.put(name, number);
    }
// позволяет отдельной функцией (словно кнопка) добавить новый номер в контакты
// ? определить как он будет работать с функцией inputNumber
    //---------------

    // геттеры и сеттеры
    public HashMap<String, Integer> getPhoneBook() {
        return phoneBook;
    }
}
