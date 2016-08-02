# Joke Factory

A joke-telling Android application built using Gradle. This includes four modules:

* a Java library that provides jokes
* a Google Could Endpoints (GCE) project that serves those jokes
* an Android Library containing an activity for displaying jokes
* an Android app that fetches jokes from the GCE module and passes them to the Android Library for display.

## Tasks Done

* Add free and paid flavors to an app, and set up build to share code between them
* Factor reusable functionality into a Java library
* Factor reusable Android functionality into an Android library
* Configure a multi project build to compile libraries and app
* Use the Gradle App Engine plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server

\* This project is a part of the [Android Developer Nanodegree](https://www.udacity.com/course/android-developer-nanodegree-by-google--nd801)