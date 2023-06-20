package baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
    private List<Integer> answerNum = new ArrayList<>();

    public NumberChecker(List<Integer> answerNum) {
        this.answerNum = answerNum;
    }

    public void printResult(String resultWord) {
        if (resultWord != null) {
            System.out.println(resultWord);
        }
    }

    public String getStrikeAndBall(List<Integer> inputNum) {
        if (inputNum == null) {
            return null;
        }

        int strike = 0;
        int ball = 0;
        for (int i = 0; i < inputNum.size(); i++) {
            strike += getStrike(inputNum, i);
            ball += getBall(inputNum, i);
        }

        return resultToString(ball, strike);
    }


    private int getStrike(List<Integer> inputNum, int idx) {
        int strike = 0;
        if (answerNum.get(idx).equals(inputNum.get(idx))) {
            strike++;
        }
        return strike;
    }

    private int getBall(List<Integer> inputNum, int idx) {
        int ball = 0;
        int num = inputNum.get(idx);
        if (!answerNum.get(idx).equals(num) && answerNum.contains(num)) {
            ball++;
        }
        return ball;
    }


    private String resultToString(int ball, int strike) {
        if (ball == 0 && strike == 0) return "낫싱";
        if (ball == 0) {
            return strike + "스트라이크";
        }
        if (strike == 0) {
            return ball + "볼";
        }
        return ball + "볼 " + strike + "스트라이크";
    }

}
