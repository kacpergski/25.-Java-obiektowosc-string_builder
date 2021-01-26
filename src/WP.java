import java.lang.*;

public class WP {
    public static void main(String[] args) {


        String[] domain = new String[5000000];
        for (int j = 0; j < domain.length; j++) {
            domain[j] = "http://wp.pl/inna";
        }

//        domain[1] = "http://kurczaki.pl/blog/powrot-kury";
//        domain[2] = "http://kurczaki.pl/blog/kurczaki-kontratakuja";
//        domain[3] = "http://kurczaki.pl/blog/kura-santy";
//        domain[4] = "http://kurczaki.pl/blog/kura-kao";

        for (int i = 0; i < domain.length; i++) {

            StringBuilder domainTemp = new StringBuilder(domain[i]);
            domainTemp.delete(0, 12);
            domainTemp.insert(0, "http://wirualnapolska.pl");
            String domainTemp2 = new String(domainTemp);
            domain[i] = domainTemp2;
            System.out.println(domain[i]);
        }
    }
}