class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task current = null;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
        current = head;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
        current = head;
    }

    // Add at specific position (0-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position == 0) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        int index = 0;

        while (index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove task by ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task curr = head;
        Task prev = null;

        do {
            if (curr.id == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else if (curr == head) {
                    Task temp = head;
                    while (temp.next != head) temp = temp.next;
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task with ID " + id + " removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task with ID " + id + " not found.");
    }

    // View current task and move to next
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Current Task: ID=" + current.id + ", Name=" + current.name +
                ", Priority=" + current.priority + ", Due=" + current.dueDate);
        current = current.next;
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        System.out.println("All Tasks:");
        Task temp = head;
        do {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        boolean found = false;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task: ID=" + temp.id + ", Name=" + temp.name + ", Due=" + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}

public class TaskSchedulerMain {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();


        scheduler.addAtEnd(1, "Write Report", 2, "2025-07-15");
        scheduler.addAtBeginning(2, "Team Meeting", 1, "2025-07-11");
        scheduler.addAtPosition(1, 3, "Code Review", 3, "2025-07-12");
        scheduler.addAtEnd(4, "Presentation", 2, "2025-07-13");


        scheduler.displayTasks();


        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        
        scheduler.searchByPriority(2);


        scheduler.removeById(3);
        scheduler.displayTasks();

        scheduler.removeById(10);
    }
}
