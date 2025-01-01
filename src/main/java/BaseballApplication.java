import controller.BaseballController;
import service.*;
import view.BaseballView;
import view.BaseballViewImpl;

public class BaseballApplication {

    public static void main(String[] args) {
        BaseballView baseballView = new BaseballViewImpl();
        PlayerService playerService = new PlayerServiceImpl();
        ComputerService computerService = new ComputerServiceImpl();
        JudgeService judgeService = new JudgeServiceImpl();

        BaseballController baseballController = new BaseballController(
                baseballView, playerService, computerService, judgeService
        );

        try{
            baseballController.runGame();
        } catch (IllegalArgumentException e){
            System.out.println("에외 처리: " + e.getMessage());
        }
    }
}
