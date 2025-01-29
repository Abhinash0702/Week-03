package TaskScheduler;
public class TaskScheduler {
    private TaskNode head;

    // Constructor to initialize the circular linked list
    public TaskScheduler() {
        head = null;
    }

    // Add a task at the beginning of the circular linked list
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // Add a task at the end of the circular linked list
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add a task at a specific position in the circular linked list
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == head) {
                System.out.println("Position exceeds number of tasks.");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }
        TaskNode temp = head;
        TaskNode prev = null;

        // If head node itself holds the task ID
        if (temp != null && temp.taskId == taskId) {
            if (temp.next == head) {
                head = null; // Only one node
            } else {
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = temp.next;
                prev.next = head;
            }
            return;
        }

        // Search for the task to be removed
        while (temp != null && temp.taskId != taskId) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Task with ID " + taskId + " not found.");
            return;
        }
        prev.next = temp.next;
    }

    // View the current task and move to the next task
    public void viewNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + 
                           ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
        head = temp.next;
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + 
                               ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + 
                                   ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with the given priority.");
        }
    }
}
