public class Book {
private String books;
private int yearsOfRelease;
public Book(String books, int yearsOfRelease){
    this.books = books;
    this.yearsOfRelease = yearsOfRelease;
}
public String getBooks(){
    return this.books;
}
public int getYearsOfRelease(){
    return this.yearsOfRelease;
}
public void setYearsOfRelease(int yearsOfRelease){
    this.yearsOfRelease = yearsOfRelease;
}
public String toString(){
    return "Название книги " + books + " " + yearsOfRelease;
}
}
