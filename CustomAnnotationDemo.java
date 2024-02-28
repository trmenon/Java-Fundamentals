package core;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    String value() default "default value";
}

public class CustomAnnotationDemo {
    @MyCustomAnnotation(value="java programming")
    public void method(){
        System.out.println("Test method 1");
    }

    public static void main(String[] args) {
        CustomAnnotationDemo obj = new CustomAnnotationDemo();
        obj.method();
        try{
            
            Class CustAnnReflection = obj.getClass();
            Method [] m = CustAnnReflection.getDeclaredMethods();
            // System.out.println(CustAnnReflection.getAnnotatedInterfaces());
            for(Method meth: m) {
                System.out.println(meth.getName());
                System.out.println(meth.getDeclaredAnnotation(MyCustomAnnotation.class));
            }
        }catch(Exception exp) {

        }
    }
}
