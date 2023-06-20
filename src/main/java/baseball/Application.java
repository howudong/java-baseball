package baseball;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static final String ANSWER_FLAG = "3스트라이크";
    static final int RESTART_FLAG = 1;

    static List<Integer> answerNumber = new ArrayList<>();
    static InputReader reader = new InputReader();
    static boolean isGameEnd = false;

    public static void initGame() {
        if (answerNumber.isEmpty()) {
            System.out.println("숫자 야구 게임을 시작합니다.");
        }
        answerNumber.clear();
        answerNumber = new NumberGenerator().getRandomNumber();
    }

    public static void playGame() {
        NumberChecker check = new NumberChecker(answerNumber);

        List<Integer> inputNumberList;
        String matchResult;
        do {
            inputNumberList = reader.inputNumberList();
            matchResult = check.getStrikeAndBall(inputNumberList);
            check.printResult(matchResult);
        } while (matchResult != null && !matchResult.equals(ANSWER_FLAG));

        if (matchResult == null) {
            isGameEnd = true;
            return;
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }


    public static void main(String[] args) {
        do {
            initGame();
            playGame();
        } while (!isGameEnd && reader.inputEndSignal() == RESTART_FLAG);
    }
}
