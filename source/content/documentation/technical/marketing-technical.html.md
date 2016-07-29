---
layout: post
partial: sheet
page: infosite
tags: technical
order: 3
title: Technical
date: 31-10-2015
---
Should more invasive changes need to be made some technical information might be handy. The site is build with the [Middleman](https://middlemanapp.com/) static site generator. This system does most of the heavy lifting generating all the pages. It is build in Ruby, but it’s not all that intimidating. To setup a dev environment you have to go through several steps:

- Clone the repository from [github](https://github.com/OffCourse/offcourse-documentation)
- Install [boot](https://github.com/boot-clj/boot#install)
- Install the dependencies

<pre><code>bundle install</code></pre>

- Run the server

<pre><code>bundle exec middleman server</code></pre>

Should you want to edit the stylesheets you’re in for a surprise: they’re written in [Clojure](http://clojure.org/index) extended with [Garden](https://github.com/noprompt/garden). It’s a bit of work to get into, but for larger projects the freedom of expression is limitless. A good way to get into it is [this book](http://www.braveclojure.com/). On top of the CSS framework we use strategy close to [SMACCS](https://smacss.com/). You can read about it there, or if you'd rather watch: [this](https://www.pluralsight.com/courses/scalable-modular-architecture-for-css) is a good accompanying course.