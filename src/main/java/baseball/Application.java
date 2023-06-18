package baseball;

import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    static List<Integer> answerNumber;
    public static void initGame() {
        if (answerNumber.isEmpty()) {
            System.out.println("숫자 야구 게임을 시작합니다.");
        }
        answerNumber.clear();
        answerNumber = new SetAnswerNum().getAnswerNum();
    }

    public static void playGame(){
        InputReader reader = new InputReader();
        NumberChecker check = new NumberChecker(answerNumber);

        while(!check.countBaseBall(reader.getInputNumberList()).equals("4 Strikes")){

        }
    }

    public static void main(String[] args) {
            initGame();
            playGame();



    }
}
