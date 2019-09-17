package Test0916;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Card p=new Card(1,"♠");
        Card q=new Card(1,"♠");
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());
        HashSet<Card> set=new HashSet<>();
        set.add(p);
        System.out.println(set.contains(q));
        HashMap<Card,String> map=new HashMap<>();
        map.put(p,"黑桃A");
        System.out.println(map.get(q));
    }
}
