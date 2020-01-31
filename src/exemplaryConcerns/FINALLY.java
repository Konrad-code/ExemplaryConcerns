package exemplaryConcerns;

public class FINALLY {

    public static int method(){
        int[] array = new int[10];
        array[9] = 8;
        array[1] = 2;
        
        try{
            System.out.println(array[1]);
            return 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Poza indeksem");
        }
        finally{
            System.out.println("KONIEC");
        }
        return 0;
    }    
}
