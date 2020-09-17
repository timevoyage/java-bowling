package bowling.view;

import java.util.Scanner;

public class InputView {

    private static final String PRINT_INPUT_PLAYER = "플레이어 이름은? (3 english letters) : ";
    private static final String PRINT_INPUT_FRAME_NUMBER_PITCH = "%d프레임 투구 : ";

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputPlayer() {
        System.out.print(PRINT_INPUT_PLAYER);
        return scanner.nextLine();
    }

    public static String inputPitch(int frameNumber) {
        System.out.print(String.format(PRINT_INPUT_FRAME_NUMBER_PITCH, frameNumber));
        return scanner.nextLine();
    }

}
