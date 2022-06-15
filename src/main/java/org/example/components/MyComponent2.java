package org.example.components;

import org.example.annotations.Autowired;
import org.example.annotations.MyComponent;

@MyComponent
public class MyComponent2 extends ComponentOutput {

    @Autowired
    MyComponent1 myComponent1;

    NonComponent nonComponent;

    private int testChangeableField = 0;
    public void increaseChangeAbleField(){
        testChangeableField++;
    }

    public String getClassName(){
        return super.getClassName() + " (" + testChangeableField + ")";
    }

    @Override
    public String toString() {
        return "\nThis class is " + this.getClassName() + " autowired is " + myComponent1.getClassName();
    }
}
