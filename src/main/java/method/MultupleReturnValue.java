package src.main.java.method;

public class MultupleReturnValue {
    /*여러개의 반환값= 자바에서는 여러개의 반환값을 지정하는 것이 지원되지 않는다, 배열이용하기.*/

    public static void main(String[] args) {
        int[] sumAndProduct = addAndMultiply(2,3);
        System.out.println("sum: "+ sumAndProduct[0]);
        System.out.println("product: "+ sumAndProduct[1]);

    }
    // 두 정수를 더한 값과 곱한 값을 반환한다.
    static public int[] addAndMultiply (int a, int b){
        int sum = a + b;
        int product = a * b;

        int[] result = { sum , product };
        return result;
    }
}
