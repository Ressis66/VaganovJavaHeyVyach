import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiMethod {
  public static String integerCommand(String name) {
    if (name.equals("��������")) return "������, ��������";
    else return "��� ������ �����";
  }

  public static void main(String[] args) {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String parsedNumber = br.readLine();
      integerCommand(parsedNumber);

    } catch (IOException ex) {
      ex.printStackTrace();

    }
  }
}