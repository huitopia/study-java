package ch04.sec04;

public class forExample {
    public static void main(String[] args) {
        int i;
        int j;
        int k = 0;

        //  1
        for (i = 0; i <= 4; i++) {
            System.out.println(i);
        }
        System.out.println("----------1----------");

        //  2
        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("----------2----------");

        //  3
        for (i = 0; i <= 8; i++) {
            System.out.println(i);
            i += 1;
        }
        System.out.println("----------3----------");

        //  4
        for (i = 2; i <= 10; i++) {
            System.out.println(i);
            i += 1;
        }
        System.out.println("----------4----------");

        //  5
        for (i = 4; -1 < i; i--) {
            System.out.println(i);
        }
        System.out.println("----------5----------");

        //  6
        for (i = 5; 0 < i; i--) {
            System.out.println(i);
        }
        System.out.println("----------6----------");

        //  7
        for (i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println("----------7----------");

        //  8
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------8----------");

        //  9
        for (i = 1; i <= 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------9----------");

        //  10
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------10----------");

        //  11
        for (i = 0; i < 6; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            for (k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("----------11----------");

        //  12
        for (i = 0; i < 6; i++) {
            if (i != 0) {
                for (j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        System.out.println("----------12----------");

        //  13
        for (i = 0; i < 5; i++) {
            if (i != 0) {
                for (k = 0; k < i; k++) {
                    System.out.print(" ");
                }
            }
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------13----------");

        //  14
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------14----------");

        //  15
        for (i = 0; i < 5; i++) {
            for (j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------15----------");

        //  16
        k = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++, k++) {
                System.out.print(k);
                if (k == 9) {
                    k = -1;
                }
            }
            System.out.println();
        }
        System.out.println("----------16----------");
        //  17
        k = 1;
        for (i = 1; i < 6; i++) {
            for (j = 1; j <= i; j++, k++) {
                System.out.print(k);
                if (k == 9) {
                    k = -1;
                }
            }
            System.out.println();
        }
        System.out.println("----------17----------");
    }
}
