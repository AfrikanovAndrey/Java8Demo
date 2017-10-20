package java8.lambda;

@FunctionalInterface
interface Checkable<T>{
    boolean check(T t);

    default boolean check2(T t){
        return true;
    }
}
