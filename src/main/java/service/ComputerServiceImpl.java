package service;

import domain.NumberDto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputerServiceImpl implements ComputerService {

    private NumberDto computerNumber;

    private final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @Override
    public void generateComputerNumber() {
        List<String> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        String[] randomNumbers = numberList.subList(0, 3).toArray(new String[0]);
        computerNumber = new NumberDto(randomNumbers);
    }

    @Override
    public NumberDto getComputerNumber() {
        return computerNumber;
    }
}
