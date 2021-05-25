public class SizeCalc implements FileVisitor {

    private int sum = 0;

    /**
     * getter for the sum that is calculated in the functions
     *
     * @return total sum
     */
    public int getSize() {
        return sum;
    }

    @Override
    public void visit(DocxFileDetails d) {
        sum += d.getSize();
    }

    @Override
    public void visit(HtmlFileDetails h) {
        sum += h.getSize();
    }

    @Override
    public void visit(JpgFileDetails j) {
        sum += j.getSize();
    }

    @Override
    public void visit(Mp3FileDetails m) {
        sum += m.getSize();
    }

    @Override
    public void visit(PptxFileDetails p) {
        sum += p.getSize();
    }

    @Override
    public void visit(TxtFileDetails t) {
        sum += t.getSize();
    }

    @Override
    public void visit(DirectoryDetails d) {
    }
}
