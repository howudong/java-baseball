package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.stream.Collectors;

public class InputReader {
    public List<Integer> inputNumberList() {
        System.out.print("숫자를 입력해주세요. : ");
        String inputNumber = Console.readLine();

        return inputNumber.chars().mapToObj(e -> e - '0').collect(Collectors.toList());
    }

    public int inputEndSignal() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String inputNumber = Console.readLine();

        return Integer.parseInt(inputNumber);
    }


}
