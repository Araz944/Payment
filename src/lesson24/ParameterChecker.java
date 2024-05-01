package lesson24;

import java.util.Optional;

public class ParameterChecker {
    public static void main(String[] args) {
        System.out.println(processParameter(null));
        System.out.println(processParameter("Hello"));
        System.out.println(processParameter(123));
    }

    public static <T> Optional<T> processParameter(T param) {
        return Optional.ofNullable(param);
//        if (param == null)
//            return Optional.empty();
//        else
//            return Optional.of(param);
    }
}
