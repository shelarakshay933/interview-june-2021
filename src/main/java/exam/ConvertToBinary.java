package exam;

public class ConvertToBinary {

  public String toBinary(final int n){
    {
        // array to store binary number
        int[] binaryNum = new int[35];
 
        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
 
    // driver program
     public static void main(String[] args)
    {
        int n = 35;
        String ToBinary(n);
    }
    return "";
  }
}
