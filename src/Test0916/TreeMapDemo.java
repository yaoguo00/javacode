package Test0916;

import java.util.*;

class CardComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        return o1.value-o2.value;
    }
}
public class TreeMapDemo {
    public static void main(String[] args) {
        Card p=new Card(1,"♠");
        Card q=new Card(1,"♠");
        CardComparator comptor=new CardComparator();
        TreeSet<Card> set=new TreeSet<>(comptor);
        set.add(p);
        System.out.println(set.contains(q));
        TreeMap<Card,String> map=new TreeMap<>(comptor);
        map.put(p,"黑桃A");
        System.out.println(map.get(q));
        Majiang m1=new Majiang("万","一");
        Majiang m2=new Majiang("万","一");
        TreeMap<Majiang,String> map2=new TreeMap<>();
        map2.put(m1,"胡了");
        System.out.println(map2.get(m2));
    }
}
