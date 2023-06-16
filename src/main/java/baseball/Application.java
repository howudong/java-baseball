package baseball;

import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    static List<Integer> answerNum = new ArrayList<>();
    public static void InitGame(){
        answerNum.clear();
        System.out.println("숫자 야구 게임을 시작합니다.");
        SetAnswerNumber();

    }
    public static void SetAnswerNumber(){
        while(answerNum.size() <= 3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if(!answerNum.contains(randomNumber)){
                answerNum.add(randomNumber);
            }
        }
    }
    public static List<Integer> GetInputNumber(){
        System.out.print("숫자를 입력해주세요 :");
        String inputNumber = Console.readLine();

        return inputNumber.chars().mapToObj(e -> e-'0').collect(Collectors.toList());
    }
    public static void main(String[] args) {
        InitGame();
        List<Integer> InputNumber = GetInputNumber();


    }
}
