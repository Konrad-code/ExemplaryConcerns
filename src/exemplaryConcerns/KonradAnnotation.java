package exemplaryConcerns;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)             // Protection used when program during execution wouldn't use this annotation, someone couldn't get referenced data
public @interface KonradAnnotation {
    String toBeExecuted();
}
