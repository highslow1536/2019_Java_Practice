import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[7];
        int max=0;
        System.out.println("양수 7개를 입력하세요.");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");

        scanner.close();
    }
}
