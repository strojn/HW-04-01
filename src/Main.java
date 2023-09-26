//Створіть проект з класом Main.java.
//
//        Потрібно: Створити клас Book. Створити класи Title, Author та Content,
//        кожен з яких повинен містити одне рядкове поле та метод void show().
//        Реалізувати можливість додавання назви книги, імені автора та змісту.
//        Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву книги: ");
        book.title.text = input.nextLine();
        System.out.println("Введіть ім'я автора книги: ");
        book.author.text = input.nextLine();
        System.out.println("Введіть зміст книги: ");
        book.content.text = input.nextLine();

        book.title.show();
        System.out.print(" ");
        book.author.show();
        System.out.print(" ");
        book.content.show();
    }
}