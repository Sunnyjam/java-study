package src.main.java.method;

public class Method02 {
    public static void main(String[] args) {
        //main메소드,메소드를 사용하는 것='호출'
        sayHello();
        sayHelloTo("Chiickem");
    }


    /*메소드란 코드를 하나의 블록으로 묻어 놓고 (ex,sayhello) 이름을 붙여놓은 것이라고 생각하기
    public static void sayHelloTo(인자)
     */
    //String type의 인자
    public static void sayHelloTo(String name){
        //표준출력
        System.out.println("Hello"+name);
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
}
