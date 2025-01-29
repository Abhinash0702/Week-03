package TaskScheduler;
import java.util.Scanner;

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\nTask Scheduler");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Next Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Due Date: ");
                    String dueDate = scanner.nextLine();
                    scheduler.addTaskAtBeginning(taskId, taskName, priority, dueDate);
                }
                case 2 -> {
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Due Date: ");
                    String dueDate = scanner.nextLine();
                    scheduler.addTaskAtEnd(taskId, taskName, priority, dueDate);
                }
                case 3 -> {
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Due Date: ");
                    String dueDate = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    int position = scanner.nextInt();
                    scheduler.addTaskAtPosition(taskId, taskName, priority, dueDate, position);
                }
                case 4 -> {
                    System.out.print("Enter Task ID to Remove: ");
                    int taskId = scanner.nextInt();
                    scheduler.removeTaskById(taskId);
                }
                case 5 -> scheduler.viewNextTask();
                case 6 -> scheduler.displayAllTasks();
                case 7 -> {
                    System.out.print("Enter Priority to Search: ");
                    int priority = scanner.nextInt();
                    scheduler.searchByPriority(priority);
                }
                case 8 -> {
                    System.out.println("Exiting Task Scheduler.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
