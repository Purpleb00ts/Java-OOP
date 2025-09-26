package word;

public class CutText implements TextTransform{
    protected String cut;

    public String getCut() {
        return cut;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        cut = text.substring(startIndex, endIndex);
        text.delete(startIndex, endIndex);
        if(startIndex == endIndex){
            cut = "";
        }
    }
}
