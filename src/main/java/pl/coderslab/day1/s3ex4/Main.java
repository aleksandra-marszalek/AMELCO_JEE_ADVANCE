package pl.coderslab.day1.s3ex4;


public class Main {

    public static void main(String[] args) {

        Observer fb1 = new FacebookObserver();
        Observer fb2 = new FacebookObserver();
        Observer pub1 = new PublishObserver();


        Post post = new Post("some title", "some text");

        post.attachObserver(fb1);

        post.savePost();
        post.updatePost();

        System.out.println("Add new observers");

        post.attachObserver(pub1);
        post.attachObserver(fb2);

        post.savePost();
        post.updatePost();



    }

}