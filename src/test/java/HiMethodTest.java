import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HiMethodTest {

  @BeforeClass
  public void setUpClass() throws Exception {
    new HiMethod();
  }

  @DataProvider
  public Object[][] validUsernameProvider() {
    return new Object[][]{
        {
            new String[]{
                "��������"
            }
        }
    };
  }

  @DataProvider
  public Object[][] inValidUsernameProvider() {
    return new Object[][]{
        {
            new String[]{
                "����", "����"
            }
        }
    };
  }

  @Test(dataProvider = "validUsernameProvider")
  public void validUsernameTest(String[] usernames) {
    for (String username : usernames) {
      String valid = HiMethod.integerCommand(username);
      Assert.assertEquals("������, ��������", valid);
    }
  }

  @Test(dataProvider = "inValidUsernameProvider")
  public void inValidUsernameTest(String[] usernames) {
    for (String username : usernames) {
      String invalid = HiMethod.integerCommand(username);
      Assert.assertEquals("��� ������ �����", invalid);
    }
  }
}
