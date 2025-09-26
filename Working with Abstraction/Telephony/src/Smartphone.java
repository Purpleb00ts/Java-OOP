import java.util.*;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public String call(){
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (String number : numbers) {
            if(!containsLetter(number)) {
                String calling = "Calling... " + number;
                sj.add(calling);
            } else {
                sj.add("Invalid number!");
            }
        }
        return sj.toString();
    }

    public String browse(){
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (String url : urls) {
            if(!containsDigit(url)) {
                String browsing = "Browsing: " + url + "!";
                sj.add(browsing);
            } else {
                sj.add("Invalid URL!");
            }
        }
        return sj.toString();
    }

    private boolean containsDigit(String url){
        for(char c : url.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    private boolean containsLetter(String number){
        for(char c : number.toCharArray()){
            if(Character.isLetter(c)){
                return true;
            }
        }
        return false;
    }
}
