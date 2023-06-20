package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberGenerator {
    private static List<Integer> answerNum = new ArrayList<>();

    public NumberGenerator() {
        answerNum.clear();
        getRandomNumberList();
    }

    private void getRandomNumberList() {
        Set<Integer> tmp = new HashSet<Integer>();
        while (tmp.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            tmp.add(randomNumber);
        }
        answerNum = tmp.stream().mapToInt(x -> x).boxed().collect(Collectors.toList());
    }

    public List<Integer> getRandomNumber() {

        return answerNum;
    }
}
