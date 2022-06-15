package org.example.components;

import org.example.annotations.Autowired;
import org.example.annotations.Component;

@Component
public class MyComponent3 extends ComponentOutput {
    @Autowired
    private MyComponent1 myComponent1;

    @Autowired
    private MyComponent2 myComponent2;

    @Override
    public String toString() {
        return "\nThis class is "
                + this.getClassName()
                + " autowired are "
                + myComponent1.getClassName()
                + " and "
                + myComponent2.getClassName();
    }
}
