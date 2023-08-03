import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutPutArrayMethod {

  public static void transformArrayMethod (int [] array){

    for(int i =0; i<array.length; i++){
         if(array[i]%3==0){
           System.out.println(array[i]);
         }
    }
  }

  public static void main(String[] args) {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
    {
     String parsedString = br.readLine();
      String strArr[] = parsedString.split(" ");
      int numArr[] = new int[strArr.length];
      for (int i = 0; i < strArr.length; i++) {
        numArr[i] = Integer.parseInt(strArr[i]);
      }
      transformArrayMethod(numArr);
    }
    catch(IOException ex){
      ex.printStackTrace();

    }
  }


}