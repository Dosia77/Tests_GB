
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import create.Creater;
import toys.Toy;
import view.Viewer;

public class Main {

     public static void main(String[] args) {
 
         Viewer vr = new Viewer();
         Creater cr = new Creater();
          String str1 = "1, Constructor, 2";
          String str2 = "2, Robot, 2";
          String str3 = "3, Doll, 6";
        
        vr.start(str1, str2, str3);
       List<Toy> toys = new ArrayList<Toy>();
      //  List<Toy> toys2 = new ArrayList<Toy>();
      //  toys2.add(cr.createToy(str3));
      //  toys2.add(cr.createToy(str2));
      //  toys2.add(cr.createToy(str1));
      // Queue<Toy> queue = cr.createQueue(cr.createToy(str3),cr.createToy(str2),cr.createToy(str1));

      // for (int i=0;i<3;i++) 
    //   int min = 0; 
    //  // int randWeigth = (int) Math.floor(Math.random()*10);
    //    for(Toy t : queue)
    //     {
      

    //         if(t.getWeight()>1)//randWeigth)
    //         {
    //           toys.add(t);              
    //         }
    //       min= min+1;
    //       }
          //System.out.println(randWeigth);
         // System.out.println(toys);
}  

}

     


     
