This is growing set of examples of my Selenium test automation skills.

Introduction
I will be showing an interatively built test suite from the very simplest of Selenium scripts to some more advanced and use-case specific kinds of testing.

Assumptions
You should know Java core 8+, have some familiarity with the Eclipse IDE, and some basic git commands. A knowledge of software quality assurance practices is also helpful!

Not Covered
I don't plan to document install and configuration initially, but if it seems like it would be useful, please leave me some feedback.

"Chapters"
Each "chapter" of this demo is tied to a commit and will follow the naming convention of "# - Title" where # is the number of a chapter and Title is the name of the skill being utilized. E.g. 1 - Open and Close A Browser. A brief explanation of what has changed/been added to each commit will be given in this README.md file when it is committed.

Chapter Explanations

1 - Open and Close A Browser
SKILL DEMONSTRATED: Selenium project set up and basics
In this chapter, I have gone from the bare, empty git repo and added the basic elements required for a Java Selenium project:

* I'm using the Eclipse IDE, so I have created that project along with all of it's configurations. These should just load for you when you open the project in Eclipse.
* I made this a Maven project so that it should be easier for you to follow along without downloading a lot of jars.
* I added dependencies for two maven packages in the pom.xml file (basically the Maven package.json - if you're familiar with Node) - Selenium and TestNG. Selenium has everything we need to orchestrate our tests and TestNG has some cool assertions we'll use in future chapters.
* I added a new folder, Chapter1, and in there I created my first Selenium "test" - OpenAndCloseABrowser. It's really more a script because at the moment, it doesn't test anything with assertions. For details about what's going on this chapter's skill example check the source for that file on this commit and read the comments.


