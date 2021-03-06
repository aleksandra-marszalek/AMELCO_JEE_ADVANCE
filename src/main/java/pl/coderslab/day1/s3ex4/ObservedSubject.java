package pl.coderslab.day1.s3ex4;


    public interface ObservedSubject {

        void attachObserver(Observer obs);
        void detachObserver(Observer obs);

        void notifyAfterAdd();
        void notifyAfterUpdate();
        void notifyAfterDelete();
    }

