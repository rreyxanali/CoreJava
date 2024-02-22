package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuAddTeacherServiceInter;
import util.FileUtil;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        String surname = sc.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().appendTeacher(teacher);
        System.out.println("teacher addedd");
        Config.save();
    }
}
