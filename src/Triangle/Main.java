package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh: ");
        System.out.printf("Nhập cạnh x = ");
        double x = input.nextDouble();
        System.out.println("Nhập cạnh y = ");
        double y = input.nextDouble();
        System.out.println("Nhập cạnh z = ");
        double z = input.nextDouble();
        if ((x + y) > z && (x + z) > y && (y + z) > x) {
            Shape triangle = new Triangle();
            System.out.println((Triangle) triangle);
        } else {
            System.out.println("Không đủ điều kiện tạo thành một hình tam giác");
        }
    }
}
