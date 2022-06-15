package org.example;

import org.example.components.MyComponent2;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        while (true) {
            sleep(1500);
            ((MyComponent2) ApplicationContext.getInstance()
                    .getComponents()
                    .get(Class.forName("org.example.components.MyComponent2")))
                    .increaseChangeableField();
            ApplicationContext.getInstance()
                    .getComponentsObjects();
        }
    }
}