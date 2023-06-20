package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberGenerator {

    public List<Integer> getRandomNumberList() {
        List<Integer> answerNumList = new ArrayList<>();
        while (answerNumList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            answerNumList.add(randomNumber);
        }
        answerNumList = answerNumList.stream().mapToInt(x -> x).boxed().collect(Collectors.toList());

        return answerNumList;
    }
}
