package core;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Authors{
    Author[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authors.class)
@interface Author{
    String name();
}

@Author(name="Eldhose")
@Author(name="Sebin")
public class RepeatableMain {
    public static void main(String[] args) {
        Class<RepeatableMain> obj = RepeatableMain.class;
        if(obj.isAnnotationPresent(Authors.class)) {
            Authors auth_list = obj.getAnnotation(Authors.class);
            for(Author author_item: auth_list.value()) {
                System.out.println("Iter: " + author_item.name());
            }
        }
    }
}