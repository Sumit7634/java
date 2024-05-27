
import java.util.ArrayList;
import java.util.Iterator;

public class Demo{
    public static void main(String[] args) {
        ArrayList all = new ArrayList();

        all.add(0,10);
        all.add(20);
        all.add(30);
        all.add(3, "Sumit");

        System.out.println(all);


        ArrayList al2= new ArrayList();
        al2.add("Ram");
        al2.add(30);
        al2.add(69);
        al2.add(96);


        System.out.println(al2);


        all.addAll(al2);
        System.out.println(all);

        all.removeAll(al2);
        System.out.println(all);
        Iterator itr = all.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    
}
