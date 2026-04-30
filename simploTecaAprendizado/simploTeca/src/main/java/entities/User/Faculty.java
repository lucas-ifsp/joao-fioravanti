package entities.User;

public final class Faculty extends User {
    private String department;

    public Faculty(String institucionalid, String name, String email, String phone, String department) {
        super(institucionalid, name, email, phone);
        this.department = department;
    }

    @Override
    protected int getLimitOfBooksToCheckOut() {
        return 5;
    }

    @Override
    public int getCheckOutTimeLimitInDays() {
        return 30;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
