---
layout: post
partial: sheet
page: infosite
tags: technical
order: 2
title: Editing
date: 31-10-2015
---
The content is quite easy to edit as the build step is automated with Travis CI. Just edit anywhere in the Github repository, and the site is regenerated. You can do so [here](https://github.com/OffCourse/offcourse-documentation/tree/master/source/content). Most of the files are in the markdown format. [Github](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) has a nice cheatsheet if you’re unfamiliar with it. Some files are in the erb format, which is HTML embedded with Ruby code. Unfortunately there is no markdown parsing in these files. If you want to see how long you still need to wait to see your edit live on [staging server](user-staging.github.io) you can check [Travis](https://travis-ci.org/OffCourse/offcourse-documentation) yourself. 