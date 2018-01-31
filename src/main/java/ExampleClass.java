import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ExampleClass {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://egecalc.ru/").get();
        String title = doc.body().getAllElements().text();
        System.out.println(title);
    }
}
