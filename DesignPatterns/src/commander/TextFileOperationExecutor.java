package org.example.commander;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    private final List<TextFileOperation> textFileOperationList = new ArrayList<>();

    public String executeAction(TextFileOperation operation) {
        textFileOperationList.add(operation);
        return operation.execute();
    }

}
