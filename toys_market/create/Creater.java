package create;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import toys.Toy;


public class Creater {

//     public Toy givenList_shouldReturnARandomElement(List<Toy> list) {
//     Random rand = new Random();
//     Toy toy = list.get(rand.nextInt(list.size()));
//     return toy;
// }
   public Toy createToy(String str){
    String[] toy1Info = str.split(", ");
    Toy toy = new Toy(toy1Info[0],toy1Info[1] , Integer.parseInt(toy1Info[2]));
    return toy;
   } 
    
   public Queue<Toy> createQueue(Toy toy, Toy toy1, Toy toy2){

    Queue<Toy> queue = new PriorityQueue<Toy>(Comparator.reverseOrder());
    queue.add(toy);
    queue.add(toy1);
    queue.add(toy2);

    return queue;

   }
}



    

