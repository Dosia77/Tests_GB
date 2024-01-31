package view;

import java.util.Queue;
import toys.Toy;
import create.*;
import plaer.Plaer;
import writer.*;

public class Viewer {

    public void start(String str1, String str2, String str3){

     Writer wr = new Writer();
     Creater cr = new Creater();
     Plaer pl = new Plaer();

    Toy toy1 = cr.createToy(str1);
    Toy toy2 = cr.createToy(str2);
    Toy toy3 = cr.createToy(str3);
    
    Queue<Toy> queue = cr.createQueue(toy1,toy2,toy3);
    int generalWeight = pl.getGeneralWeight(queue);

    wr.writeToys(pl.getToy(queue, generalWeight));
   // System.out.println(queue);   
}

}