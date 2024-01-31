package toys;

public class Toy implements Comparable<Toy>{
    
        private String id;
        private String name;
        private int weight;

        public Toy(String id, String name, int weight) {
    
            this.id = id;  
            this.name = name;
            this.weight = weight;
    
        }
        public String getId()
        {
            return id;
        }
        public String getName(){
            return name;
        }

       public int getWeight(){
        return weight;

       }
   
        @Override
        public int compareTo(Toy toy){
      
            return this.getWeight()- toy.getWeight();

        }
       
        @Override
        public String toString(){
            return  "\nid "+ id+"\nname "+name+"\nweight "+weight;
        }
          
    }
    
    

