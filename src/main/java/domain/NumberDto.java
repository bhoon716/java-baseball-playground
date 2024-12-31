package domain;

public class NumberDto {

    private final String[] numbers;

    public NumberDto(String[] numbers) {
        validateNumbers(numbers);
        this.numbers = numbers;
    }

    private void validateNumbers(String[] numbers){
        if(numbers.length > 3){
            throw new IllegalArgumentException("숫자 길이 3 이상");
        }

        for(String number: numbers){
            validateNumberRange(number);
        }
    }

    private void validateNumberRange(String number) {
        if(!number.matches("[1-9]")){
            throw new IllegalArgumentException("숫자 범위 오류");
        }
    }
}
