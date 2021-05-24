public class FileCount implements FileVisitor {
    @Override
    public void visit(DocxFileDetails d) {
        return ;
    }

    @Override
    public void visit(HtmlFileDetails h) {
        return;
    }

    @Override
    public void visit(JpgFileDetails j) {
        return;
    }

    @Override
    public void visit(Mp3FileDetails m) {
        return;
    }

    @Override
    public void visit(PptxFileDetails p) {
        return;
    }

    @Override
    public void visit(TxtFileDetails t) {
        return;
    }

    @Override
    public void visit(DirectoryDetails d) {
        int sum = 0;
        for(FileDetails f: d.getList()){
            if (f.getClass().getName()!="DirectoryDetails")
                sum++;
            else
                f.accept(this);
        }
        System.out.println("Found "+sum+"  files");
    }
}
