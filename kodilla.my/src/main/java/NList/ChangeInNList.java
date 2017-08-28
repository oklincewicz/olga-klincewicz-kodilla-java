package NList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeInNList {

    public static void main(String[] args) {

        NList nList = new NList();
        nList.getnListOne().stream()
                .map(x -> x.replaceAll(" ", ""))
                .map(x -> x.replaceAll("\t", ""))
                .forEach(System.out::println);

    }

}
