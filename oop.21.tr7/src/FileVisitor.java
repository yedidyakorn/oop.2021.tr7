public interface FileVisitor {

    public void visit(DocxFileDetails d);
    public void visit(HtmlFileDetails h);
    public void visit(JpgFileDetails j);
    public void visit(Mp3FileDetails m);
    public void visit(PptxFileDetails p);
    public void visit(TxtFileDetails t);
    public void visit(DirectoryDetails d);
}
