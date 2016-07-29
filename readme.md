# Offcourse Info Site

This is the repository for the Offcourse informational site. With this site we hope to present ourselves and contribute to the discourse on online learning.

Production branch builds automatically to: [http://offcourse.io](http://offcourse.io) [![Build Status](https://travis-ci.org/OffCourse/offcourse-documentation.svg?branch=production)](https://travis-ci.org/OffCourse/offcourse-documentation)

Master branch builds automatically to: [http://user-staging.offcourse.io](http://user-staging.offcourse.io)
[![Build Status](https://travis-ci.org/OffCourse/offcourse-documentation.svg?branch=master)](https://travis-ci.org/OffCourse/offcourse-documentation)

The builds will take about 5 minutes to complete. After a successful build Github pages has to regenerate the site, which might take a bit of time too.

## Technical info

This site is build with the static site generator Middleman

To install:
```
bundle install
```

To run:
``` 
bundle exec middleman server
```