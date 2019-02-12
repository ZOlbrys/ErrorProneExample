package com.example.errorproneexample;

import org.junit.Before;
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

    int mockId = 1;

    @Before
    public void setup() {
        final CustomValue mockCustomValue = mock(CustomValue.class);

        when(mockCustomValue.getName()).thenReturn("Zach");
        when(mockDAO.getValueWithId(mockId)).thenReturn(mockCustomValue);   // warning reported here
    }

    @Test
    public void testMockitoNullWarnings() {
        final SampleClass sampleClass = new SampleClass(mockDAO);

        sampleClass.doSomething();

        verify(mockDAO, times(1)).getValueWithId(mockId);
    }
}
