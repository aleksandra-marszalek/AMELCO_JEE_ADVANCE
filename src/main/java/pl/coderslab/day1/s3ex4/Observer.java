package pl.coderslab.day1.s3ex4;


public interface Observer {

    void updateAfterAdd();
    void updateAfterUpdate();
    void updateAfterDelete();

}