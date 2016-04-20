package com.somethingweird.crimapp;

import android.support.test.espresso.assertion.ViewAssertions;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by cyriac on 4/18/16.
 */
public class AboutTest {
    @Rule public final ActivityRule<About> aboutActivityRule = new ActivityRule<>(About.class);

    @Test
    public void shouldDisplayLandingActivity(){
        onView(withId(R.id.about_us_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.howtouse)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.theme_switch)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.textView)).check(ViewAssertions.matches(isDisplayed()));
    }
    @Test
    public void shouldBeClickableLandingActivity(){
        onView(withId(R.id.about_us_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.howtouse)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.theme_switch)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.textView)).check(ViewAssertions.matches(isDisplayed()));
    }
    @Test
    public void shouldBeEnabled(){
        onView(withId(R.id.about_us_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout_div)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.how_to_use_layout)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.about_us)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.howtouse)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.theme_switch)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.textView)).check(ViewAssertions.matches(isDisplayed()));
    }
}
