import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutPutArrayMethod {

  public void transformArrayMethod (int [] array){

    for(int i =0; i<array.length; i++){
         if(array[i]%3==0){
           System.out.println(array[i]);
         }
    }
  }



}