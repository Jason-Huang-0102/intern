package practice.deque.linkedlist;
import java.util.LinkedList;
public class LinkedlistDemo {
	public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add("Firefox");
        sites.add("Yahoo");
        System.out.println(sites.poll());
        System.out.println();
        // removeLast() 移除尾部
        sites.removeFirst();
        sites.removeLast();
        sites.set(0, "Apple");
        // getFirst() 取頭值
        System.out.println(sites.getFirst());
        System.out.println();
        // getLast() 取尾值
        System.out.println(sites.getLast());
        System.out.println();
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }
        System.out.println();
    }
}
