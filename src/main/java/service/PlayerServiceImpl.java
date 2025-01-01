package service;

import domain.NumberDto;

import java.util.Scanner;

public class PlayerServiceImpl implements PlayerService{

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public boolean askRestart() {
        String input = scanner.nextLine();
        if(input == "1") {
            return true;
        }
        if(input == "2") {
            return false;
        }
        throw new IllegalArgumentException("잘못된 값");
    }

    @Override
    public NumberDto inputPlayerNumber() {
        String input = scanner.nextLine();
        String[] playerNumber = input.split("");
        return new NumberDto(playerNumber);
    }
}
