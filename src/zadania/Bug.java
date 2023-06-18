package zadania;

public class Bug {
    private String description;
    private String email;
    private int priority;
    private boolean status;

    public Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("The description must be longer than 10 characters");
        } else {
            this.description = description;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("The email must include @");
        }
    }

    public void setPriority(int priority) {
        if ((priority < 6) && (priority > 0)) {
            this.priority = priority;
        } else {
            System.out.println("The priority must be between 1 and 5");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void getAllInfo() {
        System.out.println(description + " " + email + " " + priority + " " + status);
    }

    public void getReportingPerson(String name) {
        System.out.println("Osoba zgłaszjąca błąd to: " + name);
    }

    public void getStatus() {
        System.out.println(status);
    }

    public int getPriority() {
        return priority;
    }
}
