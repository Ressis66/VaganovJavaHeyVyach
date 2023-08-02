import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiMethodSimple {

  public static String integerCommand(int number) {
    if(number> 7) return "������";
    else return "";
  }

  public static void main(String[] args) {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
    {
      int parsedNumber = Integer.parseInt(br.readLine());
      integerCommand(parsedNumber);

    }
    catch(IOException ex){
      ex.printStackTrace();

    }
  }
}

