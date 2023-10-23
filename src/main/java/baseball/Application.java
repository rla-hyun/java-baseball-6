package baseball;

import camp.nextstep.edu.missionutils.Console;
import game.GameBoard;
import game.Validation;

public class Application {

    private static GameBoard game;
    private static Validation validation;

    private static boolean restart() {
        validation = new Validation();
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return validation.change(Console.readLine());
    }

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        game = new GameBoard();
        boolean state = true;
        while(state) {
            if(game.board())
                state = restart();
            else
                break;
        }
        System.out.println("게임을 완전히 종료합니다.");
    }
}
