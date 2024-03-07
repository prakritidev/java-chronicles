# Notes

When to use `super` ?

It is used by subclass to reference immidiate parent class. 

```

class Parent {
    public String name;
}

class Child extends Parent {
    String name;
    void detail(){
        super.name = "duck";
        name = "me";
    }
}

```

#### What is Has-A (Aggregation) Relationship ?

Aggregation is a term which is used to refer one way relationship between two objects. For example, Student class can have reference of Address class but vice versa does not make sense.

In Java, aggregation represents HAS-A relationship, which means when a class contains reference of another class known to have aggregation

 
