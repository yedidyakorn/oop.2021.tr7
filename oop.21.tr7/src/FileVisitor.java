public interface FileVisitor {

    void visit(DocxFileDetails d);

    void visit(HtmlFileDetails h);

    void visit(JpgFileDetails j);

    void visit(Mp3FileDetails m);

    void visit(PptxFileDetails p);

    void visit(TxtFileDetails t);

    void visit(DirectoryDetails d);
}
