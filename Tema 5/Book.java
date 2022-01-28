/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    //Getters

    public boolean isCourseText() {
        return courseText;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    //Setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }

    // ¿¿¿¿ setRefNumber ????
    public void setRefNumber(String ref) {
        this.refNumber = ref;
        if(ref.length() > 3){
            System.out.println(refNumber);
        }else{
            System.out.println("Error");
        }
    }

    // ¿¿¿¿ Falta por hacer setBorrowed ????
    public void borrow() {
        this.borrowed++;
    }

    // ¿¿¿¿ boolean setter ????
    public void setCourseText(boolean courseText) {
        this.courseText = courseText;
    }

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
    }

    // Add the methods here ...

    public void printAuthor(){
        System.out.println(author);
    }

    public void printTitle(){
        System.out.println(title);
    }

    public void printDetails(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        System.out.println(refNumber);
        System.out.println(borrowed);
        System.out.println(courseText);
    } 
}