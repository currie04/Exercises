public class NumberSquareJoin {
    public int squareDigits(int n) {
        //convert integer to string so we can loop through digits
        String s = Integer.toString(n);
        //create a new string builder to add elements inside the loop
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //changing the characters (digits) back to integers to perform arithmetic
          int x = Integer.parseInt(String.valueOf(s.charAt(i)));
          //adding value to string builder
          sBuilder.append(x*x);
        }
        //string builder -> string -> to integer
        return  Integer.valueOf(sBuilder.toString());
    }
}
