package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // ListClientExample lce = new ListClientExample();
        // @SuppressWarnings("rawtypes")
        // List list = lce.getList();
        // System.out.println(list);

        // -----------------------------------------------------------

        // run a few simple tests
        @SuppressWarnings("rawtypes")
        MyArrayList<Integer> mal = new MyArrayList<Integer>();
		mal.add(1);
		mal.add(2);
		mal.add(3);
		System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);

		mal.remove(2);
		System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);
    }
}