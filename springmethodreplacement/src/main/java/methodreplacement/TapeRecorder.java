package methodreplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Ufuk on 21-04-15.
 */
public class TapeRecorder implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("The voice recorded onto cassette has id: " + args[0].toString());
        return null;
    }
}