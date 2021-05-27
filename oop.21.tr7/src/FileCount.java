public class FileCount implements FileVisitor {

    private int sum = 0;

    public int getSum() {
        int temp=sum;
        sum=0;
        return temp;
    }

    @Override
    public void visit(DocxFileDetails d) {
        sum++;
    }

    @Override
    public void visit(HtmlFileDetails h) {
        sum++;
    }

    @Override
    public void visit(JpgFileDetails j) {
        sum++;
    }

    @Override
    public void visit(Mp3FileDetails m) {
        sum++;
    }

    @Override
    public void visit(PptxFileDetails p) {
        sum++;
    }

    @Override
    public void visit(TxtFileDetails t) {
        sum++;
    }

    @Override
    public void visit(DirectoryDetails d) {
    }
}
