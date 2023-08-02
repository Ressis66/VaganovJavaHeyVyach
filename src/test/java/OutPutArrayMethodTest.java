import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class OutPutArrayMethodTest {

  OutPutArrayMethod outPutArrayMethod = mock(OutPutArrayMethod.class);

  @Test
  void whenOutPutIsSuccessful() {
    int arr[] = {1,2,9};
    outPutArrayMethod.transformArrayMethod(arr);
    verify(outPutArrayMethod,times(1)).transformArrayMethod(arr);
  }
}
