package service.menu;

import service.menu.inter.MenuRegisterServiceInter;
import service.menu.inter.MenuService;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void processLogic() {
        System.out.println("register");
    }
}
