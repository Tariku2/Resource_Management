package lamba.ex;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;

import java.util.Objects;

public interface Consumer<T> {

    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T>after) {

        Objects.requireNonNull(after);
        return (T t)->{accept(t); after.accept(t);};

    };

}
