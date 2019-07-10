package hr.faleksic.devopsapp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ActivitesInstrumantedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void activitesInstrumantedTest() {
        ViewInteraction appCompatEditText = onView(withId(R.id.editText));
        appCompatEditText.perform(click());
        appCompatEditText.perform(replaceText("Test"));

        ViewInteraction appCompatButton = onView(withId(R.id.button));
        appCompatButton.perform(click());

        ViewInteraction textView = onView(withId(R.id.textView));
        textView.check(matches(withText("TSET")));

    }
}
