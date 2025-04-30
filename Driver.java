import java.util.Scanner;
public class Driver {
    public static void main(String args[]) { // partial drive

        Scanner sc = new Scanner(System.in);
        char ch = '1';
        System.out.println("Select Vending Machine");
        System.out.print("\n");
        System.out.print("1. VM-1");
        System.out.print("\n");
        System.out.print("2. VM-2");
        System.out.print("\n");

        ch = sc.next().charAt(0);
        if (ch == '1') {
            VM1 vm1 = new VM1();
            float p;
            float v;
            int n;
            float x;
            vm1.vm1Startup();

            System.out.print(" Vending Machine-1");
            System.out.print("\n");
            System.out.print(" MENU of Operations");
            System.out.print("\n");
            System.out.print(" 0. create(float)");
            System.out.print("\n");
            System.out.print(" 1. coin(float)");
            System.out.print("\n");
            System.out.print(" 2. sugar()");
            System.out.print("\n");
            System.out.print(" 3. chocolate()");
            System.out.print("\n");
            System.out.print(" 4. cappuccino()");
            System.out.print("\n");
            System.out.print(" 5. insert_cups(int)");
            System.out.print("\n");
            System.out.print(" 6. set_price(float)");
            System.out.print("\n");
            System.out.print(" 7. cancel()");
            System.out.print("\n");
            System.out.print(" 8. card(float)");
            System.out.print("\n");
            System.out.print(" q. Quit the demo program");
            System.out.print("\n");
            System.out.print(" Please make a note of these operations");
            System.out.print("\n");
            System.out.print(" Vending Machine-1 Execution");
            System.out.print("\n");

            while (ch != 'q') {

                System.out.print(" Select Operation: ");
                System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar \n 3-chocolate,4-cappuccino,5-insert_cups \n 6-set_price,7-cancel, 8-card");
                System.out.print("\n");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0': //create
                        System.out.print(" Operation: create(float p)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextFloat();
                        vm1.create(p);
                        break;
                    case '1': //coin
                        System.out.print(" Operation: coin(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextFloat();
                        vm1.coin(v);
                        break;
                    case '2': //sugar
                        System.out.print(" Operation: sugar()");
                        System.out.print("\n");
                        vm1.sugar();
                        break;
                    case '3': // chocolate
                        System.out.print(" Operation: chocolate()");
                        System.out.print("\n");
                        vm1.chocolate();
                        break;
                    case '4': // cappuccino
                        System.out.print(" Operation: cappuccino()");
                        System.out.print("\n");
                        vm1.cappuccino();
                        break;
                    case '5': // insert_cups
                        System.out.print(" Operation: insert_cups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter n:");
                        System.out.print("\n");
                        n = sc.nextInt();
                        vm1.insert_cups(n);
                        break;
                    case '6': // set_price
                        System.out.print(" Operation: set_price(float v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextFloat();
                        vm1.set_price(v);
                        break;
                    case '7': // cancel
                        System.out.print(" Operation: cancel()");
                        System.out.print("\n");
                        vm1.cancel();
                        break;
                    case '8': // card
                        System.out.print(" Operation: card(float x)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter x:");
                        System.out.print("\n");
                        x = sc.nextFloat();
                        vm1.card(x);
                        break;
                } // endswitch
            } //endwhile
        }
        if (ch == '2') {
            VM2 vm2 = new VM2();
            int p;
            int v;
            int n;
            int x;
            vm2.vm1Startup();

            System.out.print(" Vending Machine-2");
            System.out.print("\n");
            System.out.print(" MENU of Operations");
            System.out.print("\n");
            System.out.print(" 0. create(int)");
            System.out.print("\n");
            System.out.print(" 1. coin(int)");
            System.out.print("\n");
            System.out.print(" 2. sugar()");
            System.out.print("\n");
            System.out.print(" 3. cream()");
            System.out.print("\n");
            System.out.print(" 4. coffee()");
            System.out.print("\n");
            System.out.print(" 5. insert_cups(int)");
            System.out.print("\n");
            System.out.print(" 6. set_price(int)");
            System.out.print("\n");
            System.out.print(" 7. cancel()");
            System.out.print("\n");
            System.out.print(" q. Quit the demo program");
            System.out.print("\n");
            System.out.print(" Please make a note of these operations");
            System.out.print("\n");
            System.out.print(" Vending Machine-1 Execution");
            System.out.print("\n");

            while (ch != 'q') {

                System.out.print(" Select Operation: ");
                System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar \n 3-Cream,4-Coffee,5-insert_cups \n 6-set_price,7-cancel");
                System.out.print("\n");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0': //create
                        System.out.print(" Operation: create(INT p)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextInt();
                        vm2.CREATE(p);
                        break;
                    case '1': //coin
                        System.out.print(" Operation: coin(INT v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextInt();
                        vm2.coin(v);
                        break;
                    case '2': //sugar
                        System.out.print(" Operation: sugar()");
                        System.out.print("\n");
                        vm2.sugar();
                        break;
                    case '3': // cream
                        System.out.print(" Operation: cream()");
                        System.out.print("\n");
                        vm2.cream();
                        break;
                    case '4': // cappuccino
                        System.out.print(" Operation: coffee()");
                        System.out.print("\n");
                        vm2.coffee();
                        break;
                    case '5': // insert_cups
                        System.out.print(" Operation: insert_cups(int n)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter n:");
                        System.out.print("\n");
                        n = sc.nextInt();
                        vm2.insertCups(n);
                        break;
                    case '6': // set_price
                        System.out.print(" Operation: set_price(int v)");
                        System.out.print("\n");
                        System.out.print(" Enter value of parameter v:");
                        System.out.print("\n");
                        v = sc.nextInt();
                        vm2.setprice(v);
                        break;
                    case '7': // cancel
                        System.out.print(" Operation: cancel()");
                        System.out.print("\n");
                        vm2.CANCEL();
                        break;
                } // endswitch
            } //endwhile
        }

    }
}