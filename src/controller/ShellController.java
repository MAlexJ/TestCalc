package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellController {
    private String command;

    public void printCommand() {
        System.out.println(this.command);
    }

    public void executeCommand(String command) {
        StringBuffer output = new StringBuffer();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.command = output.toString();
    }
}
