package org.example.Slides_303_14;

@FunctionalInterface
public interface MyFunctionalInterfaceKBA {

    public Integer sqr(int a);

    default String sqr(String a) {
        return a + a;
    }
}
 13 changes: 13 additions & 0 deletions13  
