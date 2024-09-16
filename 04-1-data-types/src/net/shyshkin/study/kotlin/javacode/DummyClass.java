package net.shyshkin.study.kotlin.javacode;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public String isVacationTimeB(Boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbs) {
        for (int numb : numbs) {
            System.out.println(numb);
        }
    }

}
