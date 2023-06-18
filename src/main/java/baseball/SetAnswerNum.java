package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetAnswerNum {
    private static List<Integer> answerNum = new ArrayList<>();

    public SetAnswerNum() {
        answerNum.clear();
        createRandomList();
    }

    private void createRandomList() {
        Set<Integer> tmp = new HashSet<Integer>();
        while (tmp.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            tmp.add(randomNumber);
        }
        answerNum = tmp.stream().mapToInt(x -> x).boxed().collect(Collectors.toList());
    }

    public List<Integer> getAnswerNum() {
        return answerNum;
    }
}
