package exemplaryConcerns;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KonradAnnotation(toBeExecuted = "file")                                        // annotation redirecting some kind of "method-flag-variable" to "file" - used to save data to file / or "database" to save to database
public class Main {
    public static void main(String[] args) {
        
        Cache cache = new Cache();
        cache.save();
                                                                                // Annotation implementation
        Class randomClass = Main.class;                                         // usage of basic Object built-in method to create empty class object
        Annotation[] annotations = randomClass.getAnnotations();                // creation of Annotation type array on previously created object with built-in annotations getter getAnnotations()
        
        for(Annotation annotation : annotations){                               // enhanced loop moving on Annotation type now defined iterator "annotation" to filter "annotations" array
            if(annotation instanceof KonradAnnotation){                         // condition using instanceof to filter only KonradAnnotation annotations
                KonradAnnotation myAnnotation = (KonradAnnotation) annotation;  // creation of KonradAnnotation type object "myAnnotation" (which is annotation) from downcasted value of inner-loop iterator "annotation"
                System.out.println("to: " + myAnnotation.toBeExecuted());       // printing string and result of execution of KonradAnnotation built-in "method-flag-variable" called "toBeExectued" on previously obtained object "myAnnotation"
            }
        }
        
        long now = System.currentTimeMillis();
        StringCounter.slow();
        System.out.println("Slow elapsed " + (System.currentTimeMillis() - now) + " ms");
        
        now = System.currentTimeMillis();
        StringBuilderCounter.fast();
        System.out.println("Fast elapsed " + (System.currentTimeMillis() - now) + " ms");
        
        System.out.println(cache);
        
        cache.hashCodeGenerator();
        
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adolf", "Kowalczynski", 19));
        personList.add(new Person("Zenon", "Porebski", 12));
        personList.add(new Person("Waldemar", "Nakonieczny", 49));
        personList.add(new Person("Andrzej", "Kortez", 25));
        Collections.sort(personList);
        System.out.println(personList);
        
        FINALLY.method();
    }
}
