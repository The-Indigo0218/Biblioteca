package Model.DTO;

import java.util.Date;

public class BookLoanDTO {

    private int id;
    private UserDTO userId;
    private BookDTO bookId;
    private Date dateLoan;

    public BookLoanDTO(int id) {
        this.id = id;
    }

    public BookLoanDTO(UserDTO userId, BookDTO bookId, Date dateLoan) {
        this.userId = userId;
        this.bookId = bookId;
        this.dateLoan = dateLoan;
    }

    public int getId() {
        return id;
    }

    public UserDTO getUserId() {
        return userId;
    }

    public void setUserId(UserDTO userId) {
        this.userId = userId;
    }

    public BookDTO getBookId() {
        return bookId;
    }

    public void setBookId(BookDTO bookId) {
        this.bookId = bookId;
    }

    public Date getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(Date dateLoan) {
        this.dateLoan = dateLoan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookLoanDTO{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bookId=").append(bookId);
        sb.append(", dateLoan=").append(dateLoan);
        sb.append('}');
        return sb.toString();
    }
}
