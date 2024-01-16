public class Main {

    public static void main(String[] args) {

        Author walterScott = new Author("Вальтер", "Скотт");
        Author hansChristianAndersen = new Author("Ханс Кристиан", "Андерсен");
        Author charlesDickens = new Author("Чарльз", "Диккенс");

        Book snowQueen = new Book("Снежная Королева", hansChristianAndersen, 1844);
        Book waverley = new Book("Уэверли или Шестьдесят лет назад", walterScott, 1814);
        Book adventuresOfOliverTwist = new Book("Приключения Оливера Твиста", charlesDickens, 1837);

        Library library = new Library(3);
        library.addBook(snowQueen);
        library.addBook(waverley);
        library.addBook(adventuresOfOliverTwist);

        library.printBooks();

        library.printBookByTitle("Снежная Королева");
        library.changPublicationYear("Приключения Оливера Твиста", 1839);
        library.printBookByTitle("Приключения Оливера Твиста");
    }


}