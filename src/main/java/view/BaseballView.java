package view;

import domain.JudgeCountDto;

public interface BaseballView {

    void printInputRequest();

    void printJudgeCount(JudgeCountDto judgeCountDto);

    void printGameEnd();
}
