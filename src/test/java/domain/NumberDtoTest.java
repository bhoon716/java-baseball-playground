package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberDtoTest {

    @Test
    void length_test(){
        //given
        String[] numbers = {"1", "2", "3", "4"};

        //when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new NumberDto(numbers);
        });

        //then
        assertThat(exception.getMessage()).contains("숫자 길이");
    }

    @Test
    void range_test(){
        //given
        String[] numbers = {"1", "10", "3"};

        //when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new NumberDto(numbers);
        });

        //then
        assertThat(exception.getMessage()).contains("숫자 범위");
    }

    @Test
    void duplicates_test(){
        String[] numbers = {"1", "1", "2"};

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            new NumberDto(numbers);
        });

        assertThat(e.getMessage()).contains("중복 숫자");
    }
}