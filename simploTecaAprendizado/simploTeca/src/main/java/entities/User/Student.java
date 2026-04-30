package entities.User;

public final class Student extends User{
    private String course;

    public Student(String institucionalid, String name, String email, String phone, String course) {
        super(institucionalid, name, email, phone);
        this.course = course;
    }

    @Override
    protected int getLimitOfBooksToCheckOut() {
        return 3;
    }

    @Override
    public int getCheckOutTimeLimitInDays() {
        return 7;
    }

    public String getCouse() {
        return course;
    }

    public void setCouse(String couse) {
        this.course = couse;
    }
}
