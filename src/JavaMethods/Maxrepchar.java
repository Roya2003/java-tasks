package JavaMethods;


class Maxrepchar {


    public static void main(String[] var0) {

//        for counting how many character are in your name

        String var1 = "helllo";

        var1 = var1.replaceAll(" ", "");

        int[] var2 = new int[127];

        int var3;

        for(var3 = 0; var3 < var1.length(); ++var3) {
            ++var2[var1.charAt(var3)];
        }


        var3 = -1;

        char var4 = ' ';

        for(int var5 = 0; var5 < var1.length(); ++var5)
        {
            if (var3 < var2[var1.charAt(var5)])

            {
                var3 = var2[var1.charAt(var5)];

                var4 = var1.charAt(var5);
            }

        }

        System.out.println("maximum repeat character is  " +var4);


}
}