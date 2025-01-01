package validator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NumberValidator {

    public static void validateNumbers(String[] numbers){
        validateLength(numbers);

        validateDuplicates(numbers);

        for(String number: numbers){
            validateNumberRange(number);
        }
    }

    private static void validateLength(String[] numbers){
        if(numbers.length > 3){
            throw new IllegalArgumentException("숫자 길이 3 이상");
        }
    }

    private static void validateDuplicates(String[] numbers) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, numbers);
        if (set.size() != numbers.length) {
            throw new IllegalArgumentException("중복 숫자 존재");
        }
    }

    private static void validateNumberRange(String number) {
        if(!number.matches("[1-9]")){
            throw new IllegalArgumentException("숫자 범위 오류");
        }
    }
}
