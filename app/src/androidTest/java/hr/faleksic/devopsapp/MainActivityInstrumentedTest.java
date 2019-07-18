package hr.faleksic.devopsapp;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    private MainActivity activity;

    @Rule
    public ActivityTestRule< MainActivity > mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        activity = mActivityRule.getActivity();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull( activity );
    }

    @Test
    public void checkText() {
        EditText editText = activity.findViewById(R.id.editText);
        assertEquals("Enter Message", editText.getText().toString());
    }
}
