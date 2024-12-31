package service;

import domain.NumberDto;

public interface ComputerService {
    void generateComputerNumber();

    NumberDto getComputerNumber();
}
