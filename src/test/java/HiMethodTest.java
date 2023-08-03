import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HiMethodTest {

  @DataProvider
  public Object[][] validUsernameProvider() {
    return new Object[][]{
        {
            new String[]{
                "Вячеслав"
            }
        }
    };
  }

  @DataProvider
  public Object[][] inValidUsernameProvider() {
    return new Object[][]{
        {
            new String[]{
                "Петр", "Макс"
            }
        }
    };
  }

  @Test(dataProvider = "validUsernameProvider")
  public void validUsernameTest(String[] usernames) {
    for (String username : usernames) {
      String valid = HiMethod.integerCommand(username);
      Assert.assertEquals("Привет, Вячеслав", valid);
    }
  }

  @Test(dataProvider = "inValidUsernameProvider")
  public void inValidUsernameTest(String[] usernames) {
    for (String username : usernames) {
      String invalid = HiMethod.integerCommand(username);
      Assert.assertEquals("Нет такого имени", invalid);
    }
  }
}
