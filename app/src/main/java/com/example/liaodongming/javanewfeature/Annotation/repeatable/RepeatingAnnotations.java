package com.example.liaodongming.javanewfeature.Annotation.repeatable;

import android.util.Log;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by liaodongming on 2016/9/11.
 */
public class RepeatingAnnotations {

    private static final String TAG = RepeatingAnnotations.class.getSimpleName();

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Manufacturers {
        Manufacturer[] value() default {};
    }

    /**
     * use java 8 new features
     */
    @Manufacturer("Mercedes Benz")
    @Manufacturer("Toyota")
    @Manufacturer("BMW")
    @Manufacturer("Range Rover")
    public interface Car {
        //do something
    }

    /**
     * not using java 8 new features
     */
    @Manufacturers({
            @Manufacturer("BYD"),
            @Manufacturer("Cherry"),
            @Manufacturer("Honda")
    })
    public interface OldCar {
        //do something
    }

    /**
     * Though the container annotation was not used here,
     * the Java compiler this time around takes responsibility
     * for wrapping the two annotations into a container.
     */
    @Repeatable(value = Manufacturers.class)
    public @interface Manufacturer {
        String value();
    }

    public void test() {
        /**
         * 1.
         * The first one is to access them by first getting their container
         * annotation using getAnnotation() or getDeclaredAnnotation() methods of AnnotatedElement interface
         */
        Manufacturers manufacturers = Car.class.getAnnotation(Manufacturers.class);
        for (Manufacturer manufacturer : manufacturers.value()) {
            Log.e(TAG, "manufacturer is = " + manufacturer.value());
        }

        /**
         * The second method relies on newly introduced getAnnotationsByType() and/or
         * getDeclaredAnnotationsByType() methods which automatically scan though the container
         * annotation, extract the repeating annotations and return them at once as an array
         */
        Manufacturer[] manufacturers1 = Car.class.getAnnotationsByType(Manufacturer.class);
        for (Manufacturer manufacturer : manufacturers1) {
            Log.e(TAG, "manufacturer is = " + manufacturer.value());
        }
    }
}
