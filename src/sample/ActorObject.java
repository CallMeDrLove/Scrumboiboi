package sample;

public class ActorObject {
    private int actorID;
    private String firstName;
    private String lastName;

    public ActorObject(int actorID, String firstName, String lastName) {
        this.actorID = actorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ActorObject(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  "Actor \n"  +
                firstName + " " +
                 lastName;
    }
}
