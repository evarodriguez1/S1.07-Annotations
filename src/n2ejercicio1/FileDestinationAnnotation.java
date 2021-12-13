package n2ejercicio1;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // Nivell 3
@Target(TYPE)
public @interface FileDestinationAnnotation {
	String Folder();

	String FileName();
}
