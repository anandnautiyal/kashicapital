-----------------------------------------------------------------
	common git commands 
-----------------------------------------------------------------

1) git add .  

	This is the first command that you'll run after making some changes to the project files.

2) git commit -am "your commit message" 

	adds the changed files into a commit with a commit message as stated inside the inverted commas(in the hading). Using the option -am allows you to add and create a message for the commit in one command.

	The -a flag is used in git to add all the files to your commit and then you'll have to run another command where you write your commit message.

	The m flag is used for connecting a commit message to your commit for example `git commit -m "your message". )

3) git push origin master

	You are ready to push your first commit to the remote repository. The push here is for pushing your changes which requires a branch to push to call it origin and then specify the branch name master (the default branch that always exists on any repository.



-------------------------------------------------------------------
Steps to create a new branch and checkout to local


1) Create a new branch on github from master

2) On local create a new branch with - in name e.g. kashicapital-14042019.

3) git pull https://github.com/anandnautiyal/kashicapital.git kashicapital-14042019:kashicapital-14042019

git push https://github.com/anandnautiyal/kashicapital.git kashicapital:kashicapital


......................................
Steps to commit changes to new branch 


1) git add


	You can git add changed files, but until you commit they won’t belong to any particular branch.

	Git has a staging area, for files that you want to commit. On GitHub when you edit a file, you commit it as soon as you save it. On your machine, you can edit a number of files and commit them altogether.

	Staging a file in Git’s terminology means adding it to the staging area, in preparation for a commit.

	Add your amended file to the staging area:

	git add attendees_and_learners.rst

	Some of the changes in attendees_and_learners.rst will be committed, and the more recent ones will not.

	run git add on the file again to stage the newer changes

2) git commit -m "added my github name"

	Commit your changes

	When you’re happy with your files, and have added the changes you want to commit to the staging area:

	git commit -m "added my github name"

	The -m flag is for the message (“added my github name”) on the commit - every commit needs a commit message.
		
3)  git push -u https://github.com/anandnautiyal/kashicapital.git kashicapital-14042019

	Push your changes to GitHub

	When you made a change on GitHub, it not only saved the change and committed the file at the same time, it also showed up right away in your GitHub repository. Here there is an extra step: we need to push the files to GitHub.

	If you were pushing changes from master locally to master on GitHub, you could just issue the command git push and let Git work out what needs to go where.

	It’s always better to be explicit though. What’s more, you have multiple branches here, so you need to tell git where to push (i.e. back to the remote repository you cloned from, on GitHub) and what exactly to push (your new branch).

------------------------------------------------------------------
After checkout you can follow below steps
------------------------------------------------------------------

1) open command prompt and navigate to project dreictory

2) if you have already Maven installed then run below command other wise first intall Maven.

	mvn spring-boot:run

3) After tomcat server is started, access below URL on browser

   http://localhost:8080

   you will be redirected to login page.

4) Use creadentails admin/password1