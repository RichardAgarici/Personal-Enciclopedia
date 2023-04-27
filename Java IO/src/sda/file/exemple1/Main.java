package sda.file.exemple1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read any file and save it in the same folder.
 * The content and title of the new file should be reversed (from the back).
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("C:\\Users\\laure\\Documents\\JavaAdvancedCodingSDA\\resources\\ex1");
//lines cand am fisier foarte mare
        if (Files.isDirectory(filePath)) {
            System.err.println("Given path it is not a File, it is a Directory");
        } else {
            List<String> newFileContent = readFileContentAndReverseIt(filePath);

            writeContentNewFile(filePath, newFileContent);
        }
    }

    private static void writeContentNewFile(Path filePath, List<String> newFileContent) throws IOException {
        String newFileName = reverseStringCharacters(filePath.getFileName().toString());
        Path baseDirectory = filePath.getParent();
        Path newFilePath = baseDirectory.resolve(newFileName);
        if (!Files.exists(newFilePath)) {
            Files.createFile(newFilePath);
        }

        Files.write(newFilePath, newFileContent);
    }

    private static List<String> readFileContentAndReverseIt(Path filePath) throws IOException {
        List<String> originalFileContent = Files.readAllLines(filePath);
        System.out.println(originalFileContent);

        List<String> listWithReverseStrings = originalFileContent.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());

        List<String> newFileContent = new ArrayList<>();
        for (int i = listWithReverseStrings.size() - 1; i >= 0; i--) {
            newFileContent.add(listWithReverseStrings.get(i));
        }
        return newFileContent;
    }

    public static String reverseString(String inputString) {
        String reverseString = "";
        String[] stringElements = inputString.split(" ");
        for (int i = stringElements.length - 1; i > 0; i--) {
            reverseString = reverseString + stringElements[i] + " ";
        }
        return reverseString;
    }

    public static String reverseStringCharacters(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString = reverseString + input.charAt(i);
        }
        return reverseString;
    }
}