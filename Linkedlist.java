import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args)
    {
        String[] things = {"Apple","Noogle","Google","Microsoft","Facebook"};

        List<String> list1 = new LinkedList<String>();
        for(String x: things)
        {
            list1.add(x);
        }
        String[] things2 = {"Coffee","Tea","Latte","Caffine"};
        List<String> list2 = new LinkedList<String>();
        for(String y: things2)
        {
            list2.add(y);
        }
        list1.addAll(list2);
        list2=null;

        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }
    //printMe method

    public static void printMe(List<String>l)
    {
        for(String a : l)
        {
            System.out.printf("%s  ", a);
        }
        System.out.println();
    }
    private static void removeStuff(List<String> l,int from,int to)
    {
        l.subList(from, to).clear();

    }
    private static void reverseMe(List<String>l)
    {
        ListIterator<String> x = l.listIterator(l.size());

        while(x.hasPrevious())
        {
            System.out.printf("%s  ",x.previous());
        }
    }
    
}
