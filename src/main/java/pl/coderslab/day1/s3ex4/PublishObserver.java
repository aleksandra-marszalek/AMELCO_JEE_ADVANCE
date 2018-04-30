package pl.coderslab.day1.s3ex4;

public class PublishObserver implements Observer {

    @Override
    public void updateAfterAdd() {
        System.out.println("Publish observer add");
    }

    @Override
    public void updateAfterUpdate() {
        System.out.println("Publish observer update");
    }

    @Override
    public void updateAfterDelete() {
        System.out.println("Publish observer delete");
    }
}
