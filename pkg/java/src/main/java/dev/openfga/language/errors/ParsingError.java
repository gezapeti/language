package dev.openfga.language.errors;

import java.util.Objects;

public abstract class ParsingError extends SimpleError {

    private StartEnd line;

    private StartEnd column;

    private String file;

    private String fullMessage;

    private String type;

    public ParsingError() {}

    public ParsingError(String type, ErrorProperties properties) {
        super(properties.getMessage());
        line = properties.getLine();
        column = properties.getColumn();
        fullMessage = properties.getFullMessage(type);
        file = properties.getFile();
        this.type = type;
    }

    public StartEnd getLine() {
        return getLine(0);
    }

    public StartEnd getLine(int offset) {
        if (line == null) {
            return null;
        }
        return line.withOffset(offset);
    }

    public void setLine(StartEnd line) {
        this.line = line;
    }

    public StartEnd getColumn() {
        return getColumn(0);
    }

    public StartEnd getColumn(int offset) {
        if (line == null) {
            return null;
        }
        return column.withOffset(offset);
    }

    public void setColumn(StartEnd column) {
        this.column = column;
    }

    public String getFullMessage() {
        return fullMessage;
    }

    public void setFullMessage(String fullMessage) {
        this.fullMessage = fullMessage;
    }

    public String toString() {
        return Objects.requireNonNullElseGet(fullMessage, this::getMessage);
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getType() {
        return file;
    }

    public void setType(String type) {
        this.type = type;
    }
}
