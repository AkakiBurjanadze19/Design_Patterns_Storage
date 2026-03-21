package Structural.Composite.FileSystemManager;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> fileSystemItems = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFileSystemItem(FileSystemItem fileSystemItem) {
        fileSystemItems.add(fileSystemItem);
    }

    @Override
    public void display() {
        System.out.println("Directory " + name);
        fileSystemItems.forEach(FileSystemItem::display);
    }

    @Override
    public int getSize() {
        return fileSystemItems
                .stream()
                .mapToInt(FileSystemItem::getSize)
                .sum();
    }
}