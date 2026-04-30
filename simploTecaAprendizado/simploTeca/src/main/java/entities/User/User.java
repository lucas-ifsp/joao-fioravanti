package entities.User;

import java.util.Objects;

public abstract class User {
    private final String institucionalid;
    private final String name;
    private String email;
    private String phone;
    private int numberOfBooksToCheckOut;

    public User(String institucionalid, String name, String email, String phone){
        this.institucionalid = institucionalid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.numberOfBooksToCheckOut = 0;
    }

    protected abstract int getLimitOfBooksToCheckOut();
    public abstract int getCheckOutTimeLimitInDays();

    public void increaseNumberOfBooksCheckedOut(){
        if(numberOfBooksToCheckOut < getLimitOfBooksToCheckOut()) {
            numberOfBooksToCheckOut++;
        }
    }

    public void decreaseNumberOfBooksCheckedOut(){
        if(numberOfBooksToCheckOut>0){
            numberOfBooksToCheckOut--;
        }
    }

    public boolean isAbleToCheckOut(){
        return getLimitOfBooksToCheckOut() - numberOfBooksToCheckOut > 0;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInstitucionalid() {
        return institucionalid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfBooksToCheckOut() {
        return numberOfBooksToCheckOut;
    }

    @Override
    public String toString() {
        return "User{" +
                "institucionalid='" + institucionalid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", numberOfBooksToCheckOut=" + numberOfBooksToCheckOut +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(institucionalid, user.institucionalid) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(institucionalid, name);
    }
}
