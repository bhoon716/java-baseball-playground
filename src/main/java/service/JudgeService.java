package service;

import domain.JudgeCountDto;
import domain.NumberDto;

public interface JudgeService {

    JudgeCountDto judgeNumber(NumberDto playerNumber, NumberDto computerNumber);
}
