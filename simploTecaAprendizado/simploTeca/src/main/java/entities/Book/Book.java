package entities.Book;

public class Book {
    private static int idGenerator = 0;
    private final Integer id;
    private final Integer edition;
    private final Integer numberOfPages;
    private final String name;
    private final String authors;
    private final String publisher;
    private final String isbn;
    private Status statusOfBook;
    private final Genre genreOfBook;

    public Book(Integer edition, Integer numberOfPages, String name, String authors, String publisher, String isbn, Status statusOfBook, Genre genreOfBook) {
        this.id = ++idGenerator;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.isbn = isbn;
        this.statusOfBook = statusOfBook;
        this.genreOfBook = genreOfBook;
    }

    public void setStatusOfBook(Status statusOfBook) {
        this.statusOfBook = statusOfBook;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEdition() {
        return edition;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public Status getStatusOfBook() {
        return statusOfBook;
    }

    public Genre getGenreOfBook() {
        return genreOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", edition=" + edition +
                ", numberOfPages=" + numberOfPages +
                ", name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", statusOfBook=" + statusOfBook +
                ", genreOfBook=" + genreOfBook +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Book book)) return false;
        return book.isbn.equals(isbn); //coloquei esse porque isbn é unico seria mesma coisa do id
    }
}
