package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public void addPrototype(String name, Student prototype){
        registry.put(name, prototype);
    }

    public Student getPrototype(String name){
        return registry.get(name);
    }
}
