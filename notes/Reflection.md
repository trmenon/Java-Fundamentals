## Introduction ##

Analysing and modifying all capabilities at runtime.
ReflectionAPI in java is used to manipulate class and its members such as <Fields> <Methods> <Constructor>

## Use cases ##
serialization & deserialization
Dynamic loading

## Import ##
java.lang.lang

## Implementation ##
Implementation is done using 3 ways
1. Using forName() method
2. Using getClass() method
3. Using .class extension of reqd class

<forName()>: Class reflection_class = class.forName("Dog");
<getClass()>: Class reflection_class = object.getClass();
<Using .class - extension>: Class reflection_class = Dog.class;