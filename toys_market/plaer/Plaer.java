package plaer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import toys.Toy;

public class Plaer {

     public int getGeneralWeight(Queue<Toy> queue){
         int generalWeight = 0;
      for(Toy t : queue){
         generalWeight = generalWeight+t.getWeight();

      }
       return generalWeight;
     }

     public List<Toy> getToy(Queue<Toy> queue, int generalWeight){
       List<Toy> toys = new ArrayList<>();

       for(int i = 0; i<10; i++)
      {
        int randWeigth = (int) Math.floor(Math.random()*generalWeight);
        System.out.println(randWeigth);
        for (Toy t: queue) 
        {    
            if(t.getWeight()>randWeigth)
            {
              toys.add(t);              
            }          
         }
     }    
         return toys;                  
    }

   //  public Toy getToy(List<Toy> toys){
   //      Creater cr = new Creater();
   //      Toy toy = cr.givenList_shouldReturnARandomElement(toys);
   //      return toy;
   // }    
}
