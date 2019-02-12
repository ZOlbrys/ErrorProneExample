package com.example.errorproneexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleInstrumentedTest {
    @Mock
    SampleDAO mockDAO;

    @Test
    public void testMockitoNullWarnings() {
        final CustomValue mockCustomValue = mock(CustomValue.class);
        final int mockId = 1;

        when(mockCustomValue.getName()).thenReturn("Zach");
        when(mockDAO.getValueWithId(mockId)).thenReturn(mockCustomValue);
        final SampleClass sampleClass = new SampleClass(mockDAO);

        sampleClass.doSomething();

        verify(mockDAO, times(1)).getValueWithId(mockId);
    }
}
