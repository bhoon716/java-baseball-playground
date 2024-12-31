package service;

import domain.NumberDto;

public interface PlayerService {

    boolean askRestart();

    NumberDto inputPlayerNumber();
}
