package service.menu;

import bean.Config;
import service.menu.inter.MenuLoginServiceInter;
import service.menu.inter.MenuService;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter{
    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username");
        String username = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("password");
        String password = scanner2.nextLine();

        if(!(username.equals("user") && password.equals("123456"))){
            throw new IllegalArgumentException("username or password is invalid");
        }

        Config.setLoggedIn(true);

    }
}
