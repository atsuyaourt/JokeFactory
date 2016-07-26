/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.gradle.jokebackend;

import com.example.jokes.JokeSource;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "jokebackend.gradle.udacity.com",
    ownerName = "jokebackend.gradle.udacity.com",
    packagePath=""
  )
)
public class MyEndpoint {

    /** A simple endpoint method that gets joke from a library */
    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke() {
        MyBean response = new MyBean();
        JokeSource joke = new JokeSource();
        response.setData(joke.tellAJoke());

        return response;
    }

}
