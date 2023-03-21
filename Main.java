import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MobilePhone myMobilephone = new MobilePhone("999");

//        for (int i = 0; i <= 2; i++){
//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("enter Name");
//            String name =  scan.nextLine();
//
//            System.out.println("enter number");
//            int number = scan.nextInt();
//            myMobilephone.numberTocall(name, number);
//
//        }
        myMobilephone.addContact("fg", 989);
        System.out.println(myMobilephone.getPhoneBook());
    }
}

// заливать изменения кода на гитхаб