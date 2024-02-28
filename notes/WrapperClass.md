Wrapper Classes is used to convert primitive data types to an object based model

This is done using the valueOf operator

Example
Integer object = Integer.valueOf(value);

The same can be performed using a technique called 
## Autoboxing ##
Integer object = value;

## Unboxing ## Conv of wrapper to primitive
Let data be a wrapper integer class such as Integer data = Integer.valueOf(6);
int a = data; || int a = data.intValue();