package src.main.java.repetitive;

public class ArrayFor {
    public static void main(String[] args) {
        String[] days = {"월","화","수","목","금","토","일"};

        for (int i =0; i < days.length; i=i+1){
            System.out.println(days[i]+"요일");
        }
    }
}
