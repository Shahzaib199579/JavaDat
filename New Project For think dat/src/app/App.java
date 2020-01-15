package app;

import java.util.Arrays;
import java.util.List;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
        @SuppressWarnings("rawtypes")
        String url = "http://en.wikipedia.org/wiki/Java_(programming_language)";

        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();

        Element content = doc.getElementById("mw-content-text");
        Elements paragraphs = content.select("p");
        System.out.println("ok");
    }
}