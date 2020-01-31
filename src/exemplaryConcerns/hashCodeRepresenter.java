package exemplaryConcerns;

public interface hashCodeRepresenter {
    
    default void hashCodeGenerator(){
        for(long i = Integer.MIN_VALUE; i < (Integer.MIN_VALUE + 100); i++){
            Long l = (i << 32) + i;
            System.out.print(l.hashCode() + " ");
            if(i % 100 == 0)
                System.out.println();
        }
        System.out.println("");
    }
}
