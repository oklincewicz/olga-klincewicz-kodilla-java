package NList;

import java.util.ArrayList;
import java.util.List;

public class NList {

    private List<String> nListOne = new ArrayList<>();

    public NList () {
        nListOne.add("1 2 3 x c v bv");
        nListOne.add("123 wer \t4 \t5");
        nListOne.add("12 12 \t 3 \t4 \t5");
    }

    public List<String> getnListOne() {
        return new ArrayList<>(nListOne);
    }

}
