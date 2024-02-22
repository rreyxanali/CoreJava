package serviceInter;

public interface Process {
    void processLogic();
    default void process(){
        processLogic();
    }
}
