package ru.merkel.objects;

import ru.merkel.objects.services.Author;
import ru.merkel.objects.services.Book;
import ru.merkel.objects.services.Library;

public class Main {

    public static void main(String[] args) {

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);

//        Author walterScott = new Author("Вальтер", "Скотт");
//        Author hansChristianAndersen = new Author("Ханс Кристиан", "Андерсен");
//        Author charlesDickens = new Author("Чарльз", "Диккенс");
//
//        Book snowQueen = new Book("Снежная Королева", hansChristianAndersen, 1844);
//        Book waverley = new Book("Уэверли или Шестьдесят лет назад", walterScott, 1814);
//        Book adventuresOfOliverTwist = new Book("Приключения Оливера Твиста", charlesDickens, 1837);
//
//        Library library = new Library(3);
//        library.addBook(snowQueen);
//        library.addBook(waverley);
//        library.addBook(adventuresOfOliverTwist);
//
//        library.printBooks();
//
//        library.printBookByTitle("Снежная Королева");
//        library.changePublicationYear("ПриключОливера Твиста", 1839);
//        library.printBookByTitle("Приключения Оливера Твиста");
    }


}