package quotes;

public class quotesAndAuthor {
    String text;
    String author;

    public quotesAndAuthor(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "quotes And Author{ \n\n" +
                "Text='" + text + '\''+'\n' +'\n'+
                "Author='" + author + '\'' +
                '}';
    }
}
