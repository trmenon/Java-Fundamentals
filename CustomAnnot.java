package core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@interface MetaAnnotation {
    String value();
}
@MyAnnotation(value="MetaAttonation")
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value="My Annotation")
class MyClass {

}

public class CustomAnnot {
    public static void main(String[] args) {
        Class <MyClass> ob = MyClass.class;
        if(ob.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annot = ob.getAnnotation(MyAnnotation.class);
            System.out.println("ANnotation Object: " + annot.value());
        }
    }
    
}
