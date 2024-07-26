package gitcommand;

public class LearnGitCommand {

}

/*
* To use git commands, install Git Bash
* Create a new repository name GitCommandDemo, we will get lot of commands once the repository is created
* Use the commands provided in repository to push the code
* 
* To use Git command, we need the Git repository url
* https://github.com/resoni-majesha/GitCommandDemo
* Right click on project -> Show in -> System Explorer
* Go inside GitMasterDemo project folder and open cmd
* Commands
* 1. git init - To create a local repository
* 2. git add. - To add files to the staging
* 3. git config --global user.email "you@example.com" - To mention who is the commitor
*    git config --global user.name "Your Name" - Coommitor name
* 4. git commit -m "Your Message" - To commit the code - Code get saved into the local repository
* 5. git remote add origin https://github.com/resoni-majesha/GitCommandDemo - To configure the remote repository
* 6. git push -u origin master - Code will be pushed to remote repository
* 7. git pull origin master - 
* 
* 
* To get the code form remote to local repository, i.e., in your system folder
* Yu need to workspace setup
* For that we need to do cloning
* Clone the remote repository code to the local repository
* Go to DevOps code in github
* Lets say if yu don't have DevOps code in local(Eclipse) - Delete it from local(eclipse) for ur understanding
* So, yu want to get the DevOps project code from remote repository to local, yu need to setup the workspace
* Now yu are in Java perspective
* In the top right, yu will see lot of perspective
* Click on Git perspective -> clone a git repository & add the clone to this view
* Provide the uri, username & token, click next
* It will take all the files from the remote repo and clone it to the local repo
* Right click on the project, Import projects -> Finish
* Now it is imported to the java perspective
* 
* git clone https://github.com/resoni-majesha/DevOps - Command to clone the remote repo to local
* Let's delete DevOps code from eclipse
* Delete it from git perspective also in eclipse
* Now, go to local disk, create a folder DevOps, open cmd from here and enter the clone command
* The files will be added here in the folder
* 
* fork - If yu want take someone's repository into your account, you can use fork
* Like real fork, use it and take food
* It will create someone's repository into your account
* 
*/