import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FileStas implements FileVisitor {
    @Override
    public void visit(DocxFileDetails d) {
        NumberFormat formatter = new DecimalFormat("0.000000");
        System.out.println("The file " + d.getName() + " has an average of " +
                formatter.format((double) d.getWords() / d.getPages()) + " words per page.");
    }

    @Override
    public void visit(HtmlFileDetails h) {
        System.out.println("The file " + h.getName() + " contains " + h.getLines() + " lines.");
    }

    @Override
    public void visit(JpgFileDetails j) {
        NumberFormat formatter = new DecimalFormat("0.000000");
        System.out.println("The picture " + j.getName() + " has an average of " +
                formatter.format((double) j.getSize() / (j.getHeight() * j.getWidth())) + " bits per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails m) {
        NumberFormat formatter = new DecimalFormat("0.000000");
        System.out.println("The bitrate of " + m.getName() + " is " +
                formatter.format((double) m.getSize() / m.getLengthSec()) + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails p) {
        NumberFormat formatter = new DecimalFormat("0.000000");
        System.out.println("The average slide size in Presentation " +
                p.getName() + " is " + formatter.format((double) p.getSize() / p.getSlides()) + ".");
    }

    @Override
    public void visit(TxtFileDetails t) {
        System.out.println("The file " + t.getName() + " contains " + t.getWords() + " words.");
    }

    @Override
    public void visit(DirectoryDetails d) {
        FileCount fileCount = new FileCount();
        d.accept(fileCount);
        System.out.println("Directory " + d.getName() + " has " + fileCount.getSum() + " files.");
    }
}
