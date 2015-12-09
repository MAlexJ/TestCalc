package controller;

import constant.Constant;

public class MainController {

    public static void main(String[] args) {
        ShellController controller = new ShellController();
        controller.executeCommand(Constant.GET_WINDOWS_GEOMETRY_HEIGHT);
        controller.printCommand();
    }
}
