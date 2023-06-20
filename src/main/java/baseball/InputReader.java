package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputReader {

    static final int GAME_NUMBER_DIGIT = 3;
    static final int END_INPUT_DIGIT = 1;

    public List<Integer> inputNumberList() {
        System.out.print("숫자를 입력해주세요. : ");
        String inputNumberList = Console.readLine();

        try {
            checkValidInput(inputNumberList, GAME_NUMBER_DIGIT);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            return null;
        }
        return inputNumberList.chars().mapToObj(e -> e - '0').collect(Collectors.toList());
    }

    public int inputEndSignal() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String inputNumber = Console.readLine();
        try{
                checkValidInput(inputNumber,END_INPUT_DIGIT);
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
            return -1;
        }
        return Integer.parseInt(inputNumber);
    }

    private void checkValidInput(String input, int digit) throws IllegalArgumentException {
        Set<Character> numberSet = input.chars().
                mapToObj(e -> (char) e).filter((item) -> {
                    return '1' <= item && item <= '9';
                }).collect(Collectors.toSet());

        if (numberSet.size() != digit || input.length() != digit) {
            throw new IllegalArgumentException();
        }
    }


}
