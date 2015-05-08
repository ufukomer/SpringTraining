package constants;

/**
 * Created by Ufuk on 02-05-15.
 */
public final class Constants {

    public static String TAG(Object context) {
        return context.getClass().getSimpleName();
    }

    private Constants() {
        // This method prevents even the native class from calling this constructor as well
        throw new AssertionError();
    }
}