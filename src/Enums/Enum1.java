package Enums;

/*
An enum is a special "class" that represents a group of constants (unchangeable variables,like final variables.

To create an enum, use the enum keyword (instead of class or interface),
and separate the constants with a comma. Note that they should be in uppercase letters:

You can access enum constants with the dot syntax:

Level myVar = Level.MEDIUM;
 */



public class Enum1 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        Level myVar1=Level.HIGH;
        System.out.println(myVar1);

        Enums.Level myvar2= Enums.Level.LOW;
        System.out.println(myvar2);

    }


}
