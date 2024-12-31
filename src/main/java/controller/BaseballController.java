package controller;

import domain.JudgeCountDto;
import domain.NumberDto;
import service.ComputerService;
import service.JudgeService;
import service.PlayerService;
import view.BaseballView;

public class BaseballController {

    private final BaseballView baseballView;
    private final PlayerService playerService;
    private final ComputerService computerService;
    private final JudgeService judgeService;

    public BaseballController(BaseballView baseballView, PlayerService playerService, ComputerService computerService, JudgeService judgeService) {
        this.baseballView = baseballView;
        this.playerService = playerService;
        this.computerService = computerService;
        this.judgeService = judgeService;
    }

    public void playBaseball(){
        do {
            playOneRound();
        } while(playerService.askRestart());
    }

    private void playOneRound() {
        computerService.generateComputerNumber();

        JudgeCountDto result;
        do {
             result = tryOnce();
             baseballView.printJudgeCount(result);
        } while(!result.isThreeStrike);
    }

    private JudgeCountDto tryOnce() {
        NumberDto playerNumber = playerService.inputPlayerNumber();
        NumberDto computerNumber = computerService.getComputerNumber();
        return judgeService.judgeNumber(playerNumber, computerNumber);
    }
}
