package domain;

public class JudgeCountDto {

    private final Integer strikeCount;
    private final Integer ballCount;

    public JudgeCountDto(Integer strikeCount, Integer ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean isThreeStrike(){
        return strikeCount == 3;
    }

    @Override
    public String toString() {
        if (strikeCount == 0 && ballCount == 0) {
            return "낫싱";
        }
        if (strikeCount == 0) {
            return ballCount + "볼";
        }
        if (ballCount == 0) {
            return strikeCount + "스트라이크";
        }
        return ballCount + "볼 " + strikeCount + "스트라이크";
    }
}