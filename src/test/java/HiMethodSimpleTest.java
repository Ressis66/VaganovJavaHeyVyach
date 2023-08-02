import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HiMethodSimpleTest {

  @Test
  void setHiMethod() {
    assertEquals("Привет", HiMethodSimple.integerCommand(10));
  }
}
