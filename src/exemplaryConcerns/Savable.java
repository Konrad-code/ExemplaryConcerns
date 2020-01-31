package exemplaryConcerns;

public interface Savable {
    
        public default void saveToDatabase(){
            System.out.println("Save to Database");
    }
}
