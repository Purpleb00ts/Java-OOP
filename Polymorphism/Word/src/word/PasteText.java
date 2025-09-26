package word;

public class PasteText implements TextTransform{

    private CutText cut;

    public PasteText(CutText cut) {
        this.cut = cut;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (endIndex < text.length()) {
            text.replace(startIndex, endIndex, cut.getCut());
        } else {
            text.replace(startIndex, text.length(), cut.getCut());
        }
    }
}
