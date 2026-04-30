package entities.Book;

public enum Genre {
    ACTION("ação"),
    DRAMA("drama"),
    HISTORY("historia"),
    HORROR("terror"),
    SCIENCE("ciencia"),
    TECHNICAL("tecnico");

    private String genero;

    Genre(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return genero;
    }
}
