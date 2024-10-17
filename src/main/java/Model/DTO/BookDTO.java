package Model.DTO;

import java.util.Date;

public class BookDTO {
    private int id;
    private String author;
    private String title;
    private Date date;
    private String state;

    public BookDTO(int id) {
        this.id = id;
    }

    public BookDTO(String author, String title, Date date, String state) {
        this.author = author;
        this.title = title;
        this.date = date;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookDTO{");
        sb.append("id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", date=").append(date);
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
