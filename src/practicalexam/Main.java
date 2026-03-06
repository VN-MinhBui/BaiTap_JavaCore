package practicalexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Nhập ID: ");
        p.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        p.setName(sc.nextLine());

        System.out.print("Nhập thumbnail path: ");
        p.setThumbnail(sc.nextLine());

        System.out.print("Nhập giá: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Nhập số lượng: ");
        p.setQty(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhập miêu tả: ");
        p.setDescription(sc.nextLine());

        System.out.println("\nThông tin sản phẩm:");
        p.info();

        System.out.print("\nNhập số lượng muốn đặt: ");
        int orderQty = sc.nextInt();

        if(p.checkAvailability(orderQty)){
            double total = p.placeOrder(orderQty);
            System.out.println("Đặt hàng thành công !^^");
            System.out.println("Tổng giá: " + total);
        }else{
            System.out.println("Không đủ mặt hàng!");
        }
    }
}
