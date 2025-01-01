package validator;

public class JudgeCountValidator {

    public static void validateJudgeCount(Integer strikeCount, Integer ballCount){
        validateCountRange(strikeCount);
        validateCountRange(ballCount);

        validateCountSum(strikeCount, ballCount);
    }

    private static void validateCountRange(Integer count){
        if(count < 0 || count > 3 ){
            throw new IllegalArgumentException("카운트 범위 오류: " + count);
        }
    }

    private static void validateCountSum(Integer strikeCount, Integer ballCount){
        int sum = strikeCount + ballCount;
        if(sum < 0 || sum > 3){
            throw new IllegalArgumentException("카운트 총합 오류: " + sum);
        }
    }
}
