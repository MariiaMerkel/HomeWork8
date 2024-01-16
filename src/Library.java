public class Library {
    private Book[] books;

    public Library(int amount) {
        this.books = new Book[amount];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            if(book != null) {
                System.out.println(book);
            }
        }
    }

    public void printBookByTitle(String title) {
        final Book book = this.findBookByTitle(title);
        if (book != null) {
            System.out.printf("\"%s\" была опубликованна в %d году.%n", book.getTitle(), book.getPublicationYear());
        } else {
            System.out.println("Такой книги нет");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void changePublicationYear(String title, int year) {
        final Book book = this.findBookByTitle(title);
        if (book != null) {
            book.setPublicationYear(year);
        }
    }

}
