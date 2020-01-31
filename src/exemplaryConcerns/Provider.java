package exemplaryConcerns;

public interface Provider {
    default void save(){
        System.out.println("Baza");
    }
}
