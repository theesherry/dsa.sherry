import com.sun.jdi.Value;

import javax.swing.text.View;
import java.security.Key;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {


//        Queue queue=new Queue();
//queue.enqueue(89);
//queue.enqueue(78);
//queue.enqueue(766);
//queue.enqueue(8887);
//queue.enqueue(6666);
//        queue.enqueue(8);
//        queue.enqueue(78);
//        queue.enqueue(76);
//        queue.enqueue(887);
//        queue.enqueue(666);
//queue.show();
//
////queue.deshow();
//        BinaryTree tree=new BinaryTree();
//        tree.insert(7);
//tree.insert(2);
//        tree.insert(1);tree.insert(5);tree.insert(6);tree.insert(8);tree.insert(9);tree.insert(6);tree.insert(4);tree.insert(10);
//tree.print();
//
//String s1="sherry";
//String s2="sherr";
//StringBuffer show = new StringBuffer(s1);
////show.append(1);
//       System.out.println(show.append(s2));
//        System.out.println(s1==s2);
//        System.out.println(show.length());
//        System.out.println(show.insert(11,"sheryy ny aj hilaya"));
//
//if(s1==s2){
//tree.insert(4);
//    tree.print();
//}
//else{
// //   throw new RuntimeException("bkl");
//}
//
//emo d=new emo(43,"lolol");
//   //     d.setAge(54);
//     //   d.setName("drdr");
//        System.out.println(d.getAge());
//        System.out.println(d.getName());
//        mew sherry=new mew();
//        Dew harry =new Dew();
//        sherry.setPriority(1);
//     //   System.out.println(sherry.getPriority());
//        //sherry.start();
//      //  harry.start();
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<=10;i++){
//            String key=sc.nextLine();
//            int value=sc.nextInt();
//            sc.nextLine();
//sherry.nums.put(key,value);
//        }
//      System.out.println(sherry.nums);
//        System.out.println(sherry.nums.get("kashaf"));
        long start=System.nanoTime();
            List<Integer>numss=Arrays.asList(1,23,43,232,23294,56,432321,42455);
            Stream <Integer> s1=numss.parallelStream()
                    .filter(n->n%2==0)
                    .sorted();

            s1.forEach(n-> System.out.println(n));
            long end=System.nanoTime();
            long execution=end=start;
        System.out.println(execution/1000000000);

    }


    }


