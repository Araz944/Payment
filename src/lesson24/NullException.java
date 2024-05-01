package lesson24;

import java.time.LocalDate;

public class NullException {
    public static void main(String[] args) {
        requiredNonNull(("aa"));
        requiredNonNull((5));
        requiredNonNull(LocalDate.now());
        requiredNonNull(Integer.valueOf(null));
    }

    // METHOD 1:
//    public static void requiredNonNull(String string) {
//        if (string == null) {
//            throw new CustomNullPointerException("this object is null");
//        }
//    }
//
//    public static void requiredNonNull(Integer integer) {
//        if (integer == null) {
//            throw new CustomNullPointerException();
//        }
//    }
//
//    public static void requiredNonNull(LocalDate localDate) {
//        if (localDate == null) {
//            throw new CustomNullPointerException();
//        }
//    }

    // METHOD 2:
    public static <T> void requiredNonNull(T data) {
        if (data == null) {
            throw new CustomNullPointerException();
        }
    }
}
