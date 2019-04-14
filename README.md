1) git add .  

	This is the first command that you'll run after making some changes to the project files.

2) git commit -am "your commit message" 

	adds the changed files into a commit with a commit message as stated inside the inverted commas(in the hading). Using the option -am allows you to add and create a message for the commit in one command.

	The -a flag is used in git to add all the files to your commit and then you'll have to run another command where you write your commit message.

	The m flag is used for connecting a commit message to your commit for example `git commit -m "your message". )

3) git push origin master

	You are ready to push your first commit to the remote repository. The push here is for pushing your changes which requires a branch to push to call it origin and then specify the branch name master (the default branch that always exists on any repository.
