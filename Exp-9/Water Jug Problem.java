class Test {
    static int flag = 0;

    public static void main(String args[]) {
        state(0, 0);
    }

    public static void state(int x, int y) {
        System.out.println("A: " + x + "\t" + "B: " + y);

        if (flag == 1) {
            System.out.println("A: 2" + "\t" + "B: 0");
            return;
        }

        if (y < 3) {
            state(x, ++y);
        }

        else if (y == 3) {
            if (x == 3) {
                System.out.println("A: 4" + "\t" + "B: 2");
                x = 0;
                y--;
                flag = 1;
            } else {
                x = 3;
                y = 0;
            }
            state(x, y);
        }
    }
}
