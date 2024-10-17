package Model.DTO;

import java.util.Date;

public class BookReturnDTO {
    private int id;
    private BookDTO book;
    private UserDTO user;
    private Date returnDate;

    public BookReturnDTO() {

    }

    public BookReturnDTO(int id) {
        this.id = id;
    }

    public BookReturnDTO(UserDTO user, BookDTO book, Date returnDate) {
        this.user = user;
        this.book = book;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public BookDTO getBookID() {
        return book;
    }

    public void setBookID(BookDTO book) {
        this.book = book;
    }

    public UserDTO getUserID() {
        return user;
    }

    public void setUserID(UserDTO user) {
        this.user = user;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookReturnDTO{");
        sb.append("id=").append(id);
        sb.append(", book=").append(book);
        sb.append(", user=").append(user);
        sb.append(", returnDate=").append(returnDate);
        sb.append('}');
        return sb.toString();
    }
}
