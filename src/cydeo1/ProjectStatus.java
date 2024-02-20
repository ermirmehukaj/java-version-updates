package cydeo1;

public enum ProjectStatus {


    OPEN,CLOSED,PROGRES("IN PROGRES");
    String status;
    ProjectStatus(String status){
        this.status = status;
    }
}
