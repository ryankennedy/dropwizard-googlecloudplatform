# Dropwizard on Google Cloud Platform

This sample [Dropwizard](http://dropwizard.io/) application runs on Google Cloud Platform's
[App Engine Flexible Environment](https://cloud.google.com/appengine/docs/flexible/).

## Basic Instructions

Download all the bits from Google (you'll want the gcloud command line utility). Once you
have that, go to the [developer console](https://console.cloud.google.com/) and create a
new project. After that, run the following:

```
gcloud config set project <project id>
mvn gcloud:deploy
```

If all succeeds, you should be able to browse to http://<project-id>.appspot.com/ and receive
a lovely greeting.