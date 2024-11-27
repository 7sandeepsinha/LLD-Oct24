package javaAdvancedConcepts;

@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);
}
// a + b, a-b a*b a/b a.pow(b) a%B  a%%b a || b