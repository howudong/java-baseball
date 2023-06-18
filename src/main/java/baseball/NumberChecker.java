package baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
    private List<Integer> answerNum = new ArrayList<>();
    private int ball;
    private int strike;

    public NumberChecker(List<Integer> answerNum) {
        this.answerNum = answerNum;
        ball = 0;
        strike = 0;
    }

    private void getStrike(List<Integer> inputNum, int idx) {
        if (answerNum.get(idx).equals(inputNum.get(idx))) {
            strike++;
        }
    }

    private void getBall(List<Integer> inputNum, int idx) {
        int num = inputNum.get(idx);
        if (!answerNum.get(idx).equals(num) && answerNum.contains(num)) {
            ball++;
        }
    }

    public String getStrikeAndBall(List<Integer> inputNum) {
        for (int i = 0; i < inputNum.size(); i++) {
            getStrike(inputNum, i);
            getBall(inputNum, i);
        }

        return resultToString(ball, strike);
    }

    private String resultToString(int ball, int strike) {
        if (ball == 0 && strike == 0) return "낫싱";
        if(ball == 0){
            return strike+"스트라이크";
        }
        if(strike == 0){
            return ball+"볼";
        }
        return ball+"볼 " +strike+"스트라이크";
    }

}
