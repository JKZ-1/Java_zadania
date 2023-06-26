package zadania.Interface;

//Interface: 1. Dodaj klasę BugReporter + 3 pola + 3 dodatkowe metody + walidacja maila przeniesiona z Bug
//2. Dodaj interface ConsoleNotification z metodą notifyStatusChange
//3. W klasie Bug dodaj metodę toString
public class Bug implements ConsoleNotification {
    private String description;
    private int priority;
    private boolean status;
    private BugReporter bugReporter;

    public Bug(String description, BugReporter bugReporter, int priority) {
        this.description = description;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.status = false;
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
        notifyStatusChange();
        this.status = status;
    }

    public void getAllInfo() {
        System.out.println(description + " " + priority + " " + status);
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

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("The status has changed");
    }
}
