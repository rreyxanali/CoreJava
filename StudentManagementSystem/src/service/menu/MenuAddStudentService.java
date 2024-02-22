package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuAddStudentServiceInter;
import util.FileUtil;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        String surname = sc.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        Config.instance().appendStudent(student);
        System.out.println("student addedd");
        Config.save();

    }
}
