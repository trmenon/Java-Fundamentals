package core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Animal {

}

class Dog extends Animal {
    public void display() {
        System.out.println("Im a dog class");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // Class object = d.getClass();
        // String name = object.getName();
        // int mod = object.getModifiers();
        // String modifier = Modifier.toString(0);
        // Class supClass = object.getSuperclass();

        // System.out.println("Name:"+name);
        // System.out.println("Modifier:"+modifier);
        // System.out.println("Modifier Integer:"+mod);
        // System.out.println("Super Class:"+supClass);


        CatMain c = new CatMain();
        Class cObj = c.getClass();
        // Methods
        Method[] cObjMethods = cObj.getMethods();
        // for(Method m: cObjMethods) {
        //     System.out.println("Method");
        //     System.out.println(m.getName());
        //     System.out.println(m.getParameterTypes());
        //     System.out.println(m.getReturnType());
        //     System.out.println(m.getModifiers());
        //     System.out.println(m.toString());
        // }

        Field cFieldObject;
        try {
            cFieldObject = cObj.getDeclaredField("name");
            cFieldObject.set(c, "Not cat");
            String value = (String)cFieldObject.get(c);
            System.out.println(value);
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}
