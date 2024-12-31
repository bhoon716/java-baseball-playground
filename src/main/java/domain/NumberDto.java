package domain;

import validator.NumberValidator;

public class NumberDto {

    private final String[] numbers;

    public NumberDto(String[] numbers) {
        NumberValidator.validateNumbers(numbers);
        this.numbers = numbers;
    }
}
