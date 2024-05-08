

/*
Objectives for Today

By the end of today, you will:
   * Understand how we can store a git repository on a remote hosting service.
   * Identify the commands to:
        * sync remote changes to our local files
        * sync our local changes to the remote files
        * make a new local copy of a remote repository
   * Describe good practices for committing to repositories shared by multiple users.
 */


public class Collaboration {
    
    public static void main(String[] args) {
        

        /*
        Last class, we had discussed tracking changes over time using a version control system.
        We had seen how we can use git to create a 'commit'.

        These commits let us create a saved point in the history of our code that we could rewind to or branch off of.


        Today, we're going to see how we can link our local git changes to a remote server so that the code can be
        shared to the public.

        In order to share a repository, we first have to add a 'remote' URL to the repository. However, before we do that,
         we have to create a remote copy of the repository. This can be done by creating your own git server on a
         computer somewhere, but more often, we use a website like GitHub, GitLab, or BitBucket.


         Once we create an account and log in, we have the ability to generate new uniquely-named repositories with the
         click of a button.

         Now that we've done this, we're ready to link our code to this remote repo. On the command line,
         we can do this by typing 'git remote add <name> <url>'.

        Once we've set up a remote branch, we're able to "push" our changes to the remote branch.
        We can do this by typing "git push origin main" on the command line.

        NOTE: only code that exists in a commit can be pushed. Unstaged changes stay local until you commit them.


        We can see that only the branch we pushed is visible to github, and right now github has a linear view of our
        history. However, every commit is visible, and we can see the whole history of our repository.

         We can see that every time we commit, the changes don't make it to the server until we push again. In fact,
        in our Log history, we can even see where the "remote" copy of master lives.


        If I want a copy of a repo that I find on a remote repository like Github, I can
        clone it with git clone <path_to_repo>.


        When someone pushes changes to a repo we've cloned, we don't see those changes right away.
        The 'git pull' command lets us take all the changes from the remote, and add them to our local copy of the repo.

        Note: if we try to push to a repo that we haven't pulled from and there are changes we don't know about, the push
        will fail and we'll get a warning that we need to pull first.
         */
    }
}
