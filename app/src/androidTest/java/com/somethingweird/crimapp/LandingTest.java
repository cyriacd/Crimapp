package com.somethingweird.crimapp;

import android.app.Activity;
import android.support.test.espresso.assertion.ViewAssertions;

import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by cyriac on 4/18/16.
 */
public class LandingTest {
    @Rule public final ActivityRule<Landing> landingActivityRule = new ActivityRule<>(Landing.class);

    @Test
    public void shouldDisplayLandingActivity(){
        onView(withId(R.id.search_button)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.hourpicker)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.minutepicker)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.meridianpicker)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.destEditText)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.all_crimes)).check(ViewAssertions.matches(isDisplayed()));
    }
    @Test
    public void shouldBeClickableLandingActivity(){
        onView(withId(R.id.search_button)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.meridianpicker)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.destEditText)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.all_crimes)).check(ViewAssertions.matches(isClickable()));
    }
    @Test
    public void shouldBeEnabled(){
        onView(withId(R.id.search_button)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.hourpicker)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.minutepicker)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.meridianpicker)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.searchbylocationbox)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.destEditText)).check(ViewAssertions.matches(isEnabled()));
        onView(withId(R.id.all_crimes)).check(ViewAssertions.matches(isEnabled()));
    }
    @Test
    public void timeShouldBeDisabledOnClick(){
        onView(withId(R.id.all_crimes)).perform(click());
        onView(withId(R.id.hourpicker)).check(ViewAssertions.matches(not(isEnabled())));
        onView(withId(R.id.minutepicker)).check(ViewAssertions.matches(not(isEnabled())));
        onView(withId(R.id.meridianpicker)).check(ViewAssertions.matches(not(isEnabled())));
    }
}
