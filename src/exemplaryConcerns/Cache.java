package exemplaryConcerns;

public class Cache implements hashCodeRepresenter, Provider{
    
     @Override                                      // to make a notice for other developers that it's just new definition of parent class Object built-in method and to avoid typo
        public String toString(){
            return "CACHE";
        }
}
