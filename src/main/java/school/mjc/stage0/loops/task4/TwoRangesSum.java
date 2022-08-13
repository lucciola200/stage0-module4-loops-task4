package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int countedSum = 0;
        boolean isEqual;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            isEqual = numberToSkip == lastInRow;
            for (int i = 1; i <= lastInRow; i++) {
                if (isEqual) {
                    sum += i;
                } else {
                    if (i % numberToSkip == 0) {
                        sum += i;
                        continue;
                    }
                    countedSum += i;
                }
            }
            System.out.println("skipped sum is " + sum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
