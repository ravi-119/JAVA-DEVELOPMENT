class typeconversion {
    public static void main(String[] args) {
        /*  There are two types of conversion in java 
            Implicit conversion 
            explicit conversion 
         */

         byte b = 127;
         int a = b;
         System.out.println(b);
         System.out.println(a);

         byte b1 = 125;
         int a0 = b1;
         System.out.println(b1);
         System.out.println(a0);


         int aa = 257;
         byte k = (byte)aa;
         System.out.println(k);

         float f = 5.6f;
         int t = (int)f;
         System.out.println(t);

         int a2 = 2557;
         byte b2 = (byte)a2;
         System.out.println(b2);

         
         int a3 = 10;
         int b4 = 20;
         int add = a3*b4;
         byte bi = (byte)add;
         System.out.println(bi);



    }
}
