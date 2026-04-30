package entities.Transaction;
import entities.Book.Book;
import entities.User.User;
import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private static int idGenerator = 0;
    private final Integer id;
    private final LocalDate issueDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;
    private final User user;
    private final Book book;

    public Transaction(User user, Book book, int dayPermitedOfUser) {
        this.id = ++idGenerator;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(dayPermitedOfUser);
        this.user = user;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public void setReturnDate(LocalDate returnDate) {
        if(returnDate == null  || returnDate.isBefore(issueDate)) return;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                ", user=" + user +
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Transaction transactionObject)) return false;
        return transactionObject.getId().equals(id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
