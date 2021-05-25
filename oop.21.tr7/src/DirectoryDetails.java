import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    private List<FileDetails> list;

    public DirectoryDetails(String path, String name) {
        super(path, name);
    }

    @Override
    public void accept(FileVisitor fileVisitor) {
        for (FileDetails f : list) {
            f.accept(fileVisitor);
        }
        fileVisitor.visit(this);
    }

    public void addFile(FileDetails fileDetails) {
        if (list == null)
            list = new ArrayList<>();
        list.add(fileDetails);
    }

    public List<FileDetails> getList() {
        return list;
    }
}