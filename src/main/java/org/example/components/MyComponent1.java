package org.example.components;

import org.example.annotations.Autowired;
import org.example.annotations.MyComponent;

@MyComponent
public class MyComponent1 extends ComponentOutput{

    @Autowired
    private MyComponent2 myComponent2;

    private NonComponent nonComponent;

    @Override
    public String toString() {
        return "\nThis class is " + this.getClassName() + " autowired is " + myComponent2.getClassName();
    }
}
