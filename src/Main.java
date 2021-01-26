import java.lang.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//
//        String domain1 = "http://kurczaki.pl/blog/kura-w-miescie";
//        String domain2 = "http://kurczaki.pl/blog/powrot-kury";
//        String domain3 = "http://kurczaki.pl/blog/kurczaki-kontratakuja";
//        String domain4 = "http://kurczaki.pl/blog/kura-santy";
//        String domain5 = "http://kurczaki.pl/blog/kura-kao";
//
        String [] domain = new String [5];

       domain[0] = "http://kurczaki.pl/blog/kura-w-miescie";
       domain[1] = "http://kurczaki.pl/blog/powrot-kury";
       domain[2] = "http://kurczaki.pl/blog/kurczaki-kontratakuja";
       domain[3] = "http://kurczaki.pl/blog/kura-santy";
       domain[4] = "http://kurczaki.pl/blog/kura-kao";

        for (int i = 0; i < domain.length ; i++) {

            StringBuilder domainTemp = new StringBuilder(domain[i]);
            domainTemp.delete(0, 18);
            domainTemp.insert(0, "http://naukajavy.pl");
            String domainTemp2 = new String(domainTemp);
            domain[i] = domainTemp2;
            System.out.println(domain[i]);

        }

    }
}
