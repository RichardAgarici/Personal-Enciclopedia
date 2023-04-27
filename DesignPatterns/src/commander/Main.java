package org.example.commander;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor executor= new TextFileOperationExecutor();
        System.out.println(executor.executeAction(new OpenTextFileOperation(new TextFile("file1.txt"))));
        System.out.println(executor.executeAction(new SaveTextFileOperation(new TextFile("file1.txt"))));
    }
}
