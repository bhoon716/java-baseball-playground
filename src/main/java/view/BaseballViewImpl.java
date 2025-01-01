package view;

import domain.JudgeCountDto;

public class BaseballViewImpl implements BaseballView {

    @Override
    public void printInputRequest() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    @Override
    public void printJudgeCount(JudgeCountDto judgeCountDto) {
        System.out.println(judgeCountDto);
    }

    @Override
    public void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
