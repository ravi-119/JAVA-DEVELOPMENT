class arithmeticoperator {
    public static void main(String[] args){

        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2;
        System.out.println(result);

        int result1 = num1 - num2;
        System.out.println(result1);

        int result2 = num1 * num2;
        System.out.println(result2);

        int result3  = num1 / num2;
        System.out.println(result3);

        int result4 = num1 % num2;
        System.out.println(result4);

        int num = 7;
        // num = num + 2;
        // num+=2;
        // num*=2;

        // num++; // post increment
        // ++num;    // pre increment
        // num--;    // post decrement
        // --num;    // post decrement
        // System.out.println(num);


        int result5 = num++;  // fetch the value and then increment
        System.out.println(result5);

    }
}