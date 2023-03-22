// Создайте класс Book (книга), в конструктор которого передавайте автора,
// название книги и количество страниц.
//
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").

public class Book implements Comparable<Book> {
  private String author;
  private String title;
  private int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  @Override
  public String toString() {
    return author + " \"" + title + "\" " + pages;
  }

  @Override
  public int compareTo(Book other) {
    if(this.author.compareTo(other.author) != 0){
      return this.author.compareTo(other.author);
    }
    return this.title.compareTo(other.title);
  }
}
