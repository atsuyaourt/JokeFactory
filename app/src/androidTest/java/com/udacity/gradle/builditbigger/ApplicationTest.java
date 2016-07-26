package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    // Test if the AsyncTask is fetching a non-empty String
    public void testFetchJokeAsyncTask() throws ExecutionException, InterruptedException {
        String jokeStr = null;
        try {
            jokeStr = new FetchJokeAsyncTask(this.getContext()).execute().get();
            assertNotNull(jokeStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}