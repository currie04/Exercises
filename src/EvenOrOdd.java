public class EvenOrOdd {
    public static boolean evenOrOdd(double num){
        double numDiv2 = num/2.0;

        int X = (int)numDiv2;
        double temp2 = numDiv2 - X;
        return !(temp2 > 0);
    }



    public static void main(String[] args) {
        double userEntered = Double.parseDouble(args[0]);
        if(evenOrOdd(userEntered)){
            System.out.printf("%s is even", args[0]);
        } else {
            System.out.printf("%s is odd", args[0]);
        }
    }
}


