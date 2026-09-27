package Adiltaxs;

 class  MultiplicationWithoutStar {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int result = 0;

        for (int i = 1; i <= b; i++) {
            result += a;   // repeatedly add 'a', b times
        }

        System.out.println(a + " x " + b + " = " + result);
    }
}
