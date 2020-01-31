package exemplaryConcerns;

public class StringCounter {
    
    static void slow(){
        String s = "";
        for(int i = 0; i < 100000; i++)
            s+="*";
    }
}
