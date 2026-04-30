package entities.Book;

public enum Status {
    AVAILABLE("disponivel"),
    CHECKED_OUT("indisponivel");

    private String status;

    Status(String descricao){
        this.status = descricao;
    }

    @Override
    public String toString() {
        return status;
    }
}
