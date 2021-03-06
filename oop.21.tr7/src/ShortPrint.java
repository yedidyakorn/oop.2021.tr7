public class ShortPrint implements FileVisitor {
    @Override
    public void visit(DocxFileDetails d) {
        System.out.println(d.getName());
    }

    @Override
    public void visit(HtmlFileDetails h) {
        System.out.println(h.getName());
    }

    @Override
    public void visit(JpgFileDetails j) {
        System.out.println(j.getName());
    }

    @Override
    public void visit(Mp3FileDetails m) {
        System.out.println(m.getName());
    }

    @Override
    public void visit(PptxFileDetails p) {
        System.out.println(p.getName());
    }

    @Override
    public void visit(TxtFileDetails t) {
        System.out.println(t.getName());
    }

    @Override
    public void visit(DirectoryDetails d) {
        System.out.println(d.getName());
    }
}
