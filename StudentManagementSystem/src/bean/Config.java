package bean;

import util.FileUtil;

import java.io.Serializable;

public class Config implements Serializable {  // for writing to file
    private static Config config = null;
    public static boolean loggedIn;
    private Student [] students = new Student[0];
    private Teacher [] teachers = new Teacher[0];
    private static final String fileName = "app.obj";
    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void appendStudent(Student student){
        Student[] newStudentArray = new Student[students.length + 1];
        for(int i=0; i<students.length;i++){
            newStudentArray[i] = students[i];
        }
        newStudentArray[newStudentArray.length-1] = student;
        students = newStudentArray;
    }

    public void appendTeacher(Teacher teacher){
        Teacher[] newTeacherArray = new Teacher[teachers.length + 1];
        for(int i=0; i<teachers.length;i++){
            newTeacherArray[i] = teachers[i];
        }
        newTeacherArray[newTeacherArray.length-1] = teacher;
        teachers = newTeacherArray;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static void save(){
        FileUtil.writeObjectToFile(Config.instance(), fileName);
    }

    public static void initialize(){
        Object obj = FileUtil.readFileDeserialize(fileName);
        if(obj == null){
            return;
        }
        if(obj instanceof Config){
            config = (Config) obj;
        }
    }

    public static Config instance(){ //singleton
        if(config==null){
            config = new Config();
        }
        return config;
    }
}
