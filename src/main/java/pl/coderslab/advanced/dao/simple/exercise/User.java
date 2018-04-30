package pl.coderslab.advanced.dao.simple.exercise;

public class User implements Model {

    /**
     * Column id
     */

    private Long id;

    /**
     * Column username
     */
    private String username;

    /**
     * Column email
     */
    private String email;

    /**
     * Column group_id
     */
    private Group group;

    public User(Long id, String username, String email, Group group) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.group = group;
    }

    public User(String username, String email, Group group) {
        this(null, username, email, group);
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", getId(), getUsername(), getEmail(), getGroup().getId());
    }
}
