package util;

import bean.Config;
import service.menu.*;
import serviceInter.Process;
import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()),
    REGISTER(2,"Register", new MenuRegisterService()),
    SHOW_ALL_TEACHER(3,"Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(4,"Show all students", new MenuShowStudentService()),
    ADD_TEACHER(5,"Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(6,"Add student", new MenuAddStudentService()),
    UNKNOWN();

    private Process service;
    private String label;
    private int number;
    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }
    Menu(){}

    public String getLabel(){
        return label;
    }
    public int getNumber() {
        return number;
    }
    public void process(){
        service.process();
        MenuUtil.showMenu();
    }

    public static void showAllMenu(){
        Menu [] menus = Menu.values();
        for(int i = 0; i< menus.length;i++){
            if(menus[i] != UNKNOWN) {
                if(menus[i]==LOGIN || menus[i] == REGISTER){
                    if(!Config.loggedIn) {
                        System.out.println(menus[i]);
                    }
                } else if(Config.loggedIn) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
    public static Menu find(int number){
        Menu [] menus = Menu.values();
        for(int i = 0; i< menus.length;i++){
            if(menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return number +
                ". " + label;
    }
}
