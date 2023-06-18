package baseball;

import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static final String END_FLAG = "3스트라이크";

    static List<Integer> answerNumber = new ArrayList<>();
    static InputReader reader = new InputReader();

    public static void initGame() {
        if (answerNumber.isEmpty()) {
            System.out.println("숫자 야구 게임을 시작합니다.");
        }
        answerNumber.clear();
        answerNumber = new SetAnswerNum().getAnswerNum();
    }

    public static void playGame() {
        NumberChecker check = new NumberChecker(answerNumber);

        List<Integer> inputNumberList = new ArrayList<>();
        String matchResult;
        do {
            inputNumberList = reader.inputNumberList();
            matchResult = check.getStrikeAndBall(inputNumberList);
            System.out.println(matchResult);
        } while (!matchResult.equals(END_FLAG));

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void main(String[] args) {
        do {
            initGame();
            playGame();
        } while (reader.inputEndSignal() != 2);
    }
}
