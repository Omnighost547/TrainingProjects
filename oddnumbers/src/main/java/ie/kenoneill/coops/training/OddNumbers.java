package ie.kenoneill.coops.training;

import java.util.Set;

public class OddNumbers extends Exception {

    public Set<Integer> oddNumbers(Integer maxNumber) {
        Set<Integer> oddNumbers = null;

        for(int count=0; count=maxNumber;)
        Integer oddNumber = maxNumber % 2;

        return oddNumbers;
    }

}
