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
}