public class FileStas implements FileVisitor {
    @Override
    public void visit(DocxFileDetails d) {
        System.out.println("The file "+d.getName()+" has an average of "+(double)d.getWords()/d.getPages()+" words per page.");
    }

    @Override
    public void visit(HtmlFileDetails h) {
        System.out.println("The file "+h.getName()+" contains "+h.getLines()+" lines.");
    }

    @Override
    public void visit(JpgFileDetails j) {
        System.out.println("The picture "+j.getName()+" has an average of "+(double)j.getSize()/(j.getHeight()*j.getWidth())+" bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails m) {
        System.out.println("The bitrate of "+m.getName()+" is "+(double)m.getSize()/m.getLengthSec()+" bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails p) {
        System.out.println("The average slide size in Presentation "+p.getName()+" is "+(double)p.getSize()/p.getSlides()+".");
    }

    @Override
    public void visit(TxtFileDetails t) {
        System.out.println("The file "+t.getName()+" contains "+t.getWords()+" words.");
    }

    @Override
    public void visit(DirectoryDetails d) {
        System.out.println("Directory "+d.getName()+" has "+d.getList().size()+" files.");
    }
}
