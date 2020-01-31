package exemplaryConcerns;

public class StringBuilderCounter {
    static void fast(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < 100000; i++)
            s.append("*");
    }
}
