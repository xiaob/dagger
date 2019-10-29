package union.com.myapplication.lesson2;

import java.util.Scanner;

public class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouter router = DaggerCommandRouterFactory.create().router();
        router.route("test");
    }
}
