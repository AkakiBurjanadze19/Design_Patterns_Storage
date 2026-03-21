package Structural.Composite.FileSystemManager;

public class Usage {
    public static void main(String[] args) {
        File file1 = new File("report.pdf", 1000);
        File file2 = new File("note.txt", 128);
        File file3 = new File("guide.txt", 500);

        Directory dir = new Directory("my_files");
        dir.addFileSystemItem(file1);
        dir.addFileSystemItem(file2);
        dir.addFileSystemItem(file3);

        dir.display();
        System.out.println("Total size: " + dir.getSize());
    }
}
