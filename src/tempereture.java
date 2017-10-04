public class tempereture {

    public static void main(String[] args) {

        java.util.Scanner water = new java.util.Scanner(System.in);

        double C_Temp = water.nextDouble();

        double T_Temp =  C_Temp * 9 / 5 + 32;
        System.out.println("攝氏溫度:" + C_Temp);
        System.out.println("華氏溫度:" + T_Temp);



    }
}
