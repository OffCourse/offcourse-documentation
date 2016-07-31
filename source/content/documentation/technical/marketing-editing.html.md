---
layout: post
partial: sheet
page: infosite
tags: technical
order: 2
title: Editing
date: 31-10-2015
---
The content is quite easy to edit as it is separated from the templates and the build step is automated. Just edit anywhere in the [repository](https://github.com/OffCourse/offcourse-documentation/tree/master/source/content), for instance the [content](https://github.com/OffCourse/offcourse-documentation/tree/master/source/content), and the site is regenerated. Most of the files are in the markdown format. [Github](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) has a nice cheat-sheet if you’re unfamiliar with it. Some files are in the ERB format, which stands for Embedded Ruby. You can recognize them by the .erb extension or the presence of ```<% %>``` or ```<%= %>``` tags. Unfortunately there is no markdown parsing in these files, but you can use normal HTML. Once you're done, and have committed your edits, [Travis](https://travis-ci.org/) will start regenerating the site. If you want to know when your edit will be live on the [staging server](http://user-staging.offcourse.io) you can check the [build](https://travis-ci.org/OffCourse/offcourse-documentation). 