package app;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class App {
    public static void main(String[] args) throws Exception {
        // ListClientExample lce = new ListClientExample();
        // @SuppressWarnings("rawtypes")
        // List list = lce.getList();
        // System.out.println(list);

        // -----------------------------------------------------------

        // run a few simple tests
        // @SuppressWarnings("rawtypes")
        // MyArrayList<Integer> mal = new MyArrayList<Integer>();
        // mal.add(1);
        // mal.add(2);
        // mal.add(3);
        // System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);

        // mal.remove(2);
        // System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);

        // Chapter 3
        // run a few simple tests
        // @SuppressWarnings("rawtypes")
        // List<Integer> mll = new MyLinkedList<Integer>();
        // mll.add(1);
        // mll.add(2);
        // mll.add(3);
        // System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());

        // mll.remove(new Integer(2));
        // System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());

        // jsoup
        // String url = "http://en.wikipedia.org/wiki/Java_(programming_language)";

        // Connection conn = Jsoup.connect(url);

        // Document doc = conn.get();

        // Element content = doc.getElementById("mw-content-text");
        // Elements paragraphs = content.select("p");
        // for (int i = 0; i < paragraphs.size(); i++) {
        //     Element firstPara = paragraphs.get(i);

        //     Iterable<Node> iter = new WikiNodeIterable(firstPara);
        //     for (Node n : iter) {
        //         if (n instanceof TextNode) {
        //             System.out.print(n.toString());
        //         }
        //     }
        // }

        // ---------- Chapter 7 -----------------------------
        String destination = "https://en.wikipedia.org/wiki/Philosophy";
        String source = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        WikiPhilosophy.testConjecture(destination, source, 10);
    }
}