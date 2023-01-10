package balajiconstruction;

import java.util.Scanner;

public class UserInformation {

    public static void consolUserInput(Customer customer, Plot plot) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Name");
        String name = sc.next();
        customer.setName(name);

        System.out.println("Customer Mobile Number");
        String mobile = sc.next();
        customer.setMobileNumber(mobile);

        System.out.println("Sector Name");
        String sectorName = sc.next();
        plot.setSectorName(sectorName);

        System.out.println("Plot Id");
        String id = sc.next();
        plot.setPlotId(id);

        System.out.println("Plot Type");
        System.out.println("1. Default Size Plot (50*20)");
        System.out.println("2. Default Width Size (L*20)");
        System.out.println("3. Fully Customized (L*W)");
        int choice = sc.nextInt();
        if (choice == 1) {
            plot.setLength(50);
            plot.setWidth(20);
        } else if (choice == 2) {
            int flag = 0;

            do {
                System.out.println("Plot Length");
                double length = sc.nextDouble();
                if (length >= 50 && length <= 100) {
                    plot.setLength(length);
                    flag = 1;
                } else {
                    System.out.println("Length can not be less than 50 or greater than 100");
                    flag = 0;
                }

            } while (flag == 0);

            plot.setWidth(20);
        } else if (choice == 3) {
            System.out.println("Plot Length");
            int flag = 0;

            do {
                System.out.println("Plot Length");
                double length = sc.nextDouble();
                if (length >= 50 && length <= 100) {
                    plot.setLength(length);
                    flag = 1;
                } else {
                    System.out.println("Length can not be less than 50 or greater than 100");
                    flag = 0;
                }

            } while (flag == 0);

            flag = 0;

            do {
                System.out.println("Plot width");
                double width = sc.nextDouble();
                if (width >= 15 && width <= 50) {
                    plot.setWidth(width);
                    flag = 1;
                } else {
                    System.out.println("Width can not be less than 15 or greater than 50");
                    flag = 0;
                }

            } while (flag == 0);

        } else {
            System.out.println("Wrong Input");
            System.exit(0);
        }

    }

}
