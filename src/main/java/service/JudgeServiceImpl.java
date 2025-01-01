package service;

import domain.JudgeCountDto;
import domain.NumberDto;

public class JudgeServiceImpl implements JudgeService {

    private String[] playerNumbers;
    private String[] computerNumber;

    @Override
    public JudgeCountDto judgeNumber(NumberDto playerNumber, NumberDto computerNumber) {
        this.playerNumbers = playerNumber.getNumbers();
        this.computerNumber = computerNumber.getNumbers();

        int strikeCount = judgeStrikeCount();
        int ballCount = judgeBallCount();
        return new JudgeCountDto(strikeCount, ballCount);
    }

    private int judgeStrikeCount() {
        int count = 0;
        if (playerNumbers[0].equals(computerNumber[0])) {
            count++;
        }
        if (playerNumbers[1].equals(computerNumber[1])) {
            count++;
        }
        if (playerNumbers[2].equals(computerNumber[2])) {
            count++;
        }
        return count;
    }

    private int judgeBallCount() {
        int count = 0;
        if (playerNumbers[0].equals(computerNumber[1]) || playerNumbers[0].equals(computerNumber[2])) {
            count++;
        }
        if (playerNumbers[1].equals(computerNumber[0]) || playerNumbers[1].equals(computerNumber[2])) {
            count++;
        }
        if (playerNumbers[2].equals(computerNumber[0]) || playerNumbers[2].equals(computerNumber[1])) {
            count++;
        }
        return count;
    }
}
