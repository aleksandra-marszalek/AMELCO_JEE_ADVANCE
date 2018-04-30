package pl.coderslab.day1.s3ex4;

public class SubscriberObserver implements Observer {

    @Override
    public void updateAfterAdd() {
        System.out.println("Subscribe observer add");
    }

    @Override
    public void updateAfterUpdate() {
        System.out.println("Subscribe observer update");
    }

    @Override
    public void updateAfterDelete() {
        System.out.println("Subscribe observer delete");
    }
}
