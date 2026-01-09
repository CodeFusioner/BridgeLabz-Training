package linkedList;

class TaskNode {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CircularTaskScheduler {
    private TaskNode head = null;
    private TaskNode current = null;

    public void addAtBeginning(int id, String name, String priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        node.next = head;
        temp.next = node;
        head = node;
    }

    public void addAtEnd(int id, String name, String priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    public void addAtPosition(int pos, int id, String name, String priority, String dueDate) {
        if (pos == 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode node = new TaskNode(id, name, priority, dueDate);
        node.next = temp.next;
        temp.next = node;
    }

    public void removeById(int id) {
        if (head == null) return;

        if (head.taskId == id && head.next == head) {
            head = current = null;
            return;
        }

        if (head.taskId == id) {
            TaskNode last = head;
            while (last.next != head)
                last = last.next;

            head = head.next;
            last.next = head;
            if (current.taskId == id) current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next.taskId == id) {
            if (current == temp.next)
                current = temp.next.next;
            temp.next = temp.next.next;
        }
    }

    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        print(current);
        current = current.next;
    }

    public void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            print(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(String priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority.equalsIgnoreCase(priority))
                print(temp);
            temp = temp.next;
        } while (temp != head);
    }

    private void print(TaskNode t) {
        System.out.println(t.taskId + " | " + t.taskName + " | " + t.priority + " | " + t.dueDate);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {

        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addAtEnd(1, "Coding Practice", "High", "10-01-2026");
        scheduler.addAtEnd(2, "Project Work", "Medium", "15-01-2026");
        scheduler.addAtBeginning(3, "Revision", "High", "09-01-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nCurrent Tasks Cycle:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nHigh Priority Tasks:");
        scheduler.searchByPriority("High");

        scheduler.removeById(2);

        System.out.println("\nAfter Deletion:");
        scheduler.displayAll();
    }
}
