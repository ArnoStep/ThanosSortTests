
/**
 * Thanos method Sorting
 * @author Arno Stepanyan
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{3, 12, -2, 6, 123182, 27137121, 0, -100, 222, 1};

        // выбираем отрезок из массива для сортировки
        thanosSort(array,0, 9);

        for (int i = 0; i < array.length; ++i) {

            System.out.println(array[i] + " ");

        }

    }

    public static void thanosSort(int[] massive, int leftBound, int rightBound) {

        if (rightBound <= leftBound) return;

        int middleValue = (leftBound + rightBound) / 2;

        thanosSort(massive, leftBound, middleValue);

        thanosSort(massive, middleValue + 1, rightBound);

        thanosSnap(massive, leftBound, middleValue, rightBound);

    }

    public static void thanosSnap(int[] massive, int leftBound, int middleValue, int rightBound) {

        int leftPartLength = middleValue - leftBound + 1;
        int rightPartLength = rightBound - middleValue;

        int[] leftMassive = new int [leftPartLength];
        int[] rightMassive = new int [rightPartLength];

        for (int i = 0; i < leftPartLength; ++i) {
            leftMassive[i] = massive[leftBound+i];
        }

        for (int i = 0; i < rightPartLength; ++i) {
            rightMassive[i] = massive[middleValue + i + 1];
        }

        int leftPartIterator = 0;
        int rightPartIterator = 0;

        for (int i = leftBound; i < rightBound + 1; ++i) {

            if (leftPartIterator < leftPartLength && rightPartIterator < rightPartLength) {
                if (leftMassive[leftPartIterator] < rightMassive[rightPartIterator]) {
                    massive[i] = leftMassive[leftPartIterator];
                    leftPartIterator++;
                }
                else {
                    massive[i] = rightMassive[rightPartIterator];
                    rightPartIterator++;
                }
            }

            else if (leftPartIterator < leftPartLength) {
                massive[i] = leftMassive[leftPartIterator];
                leftPartIterator++;
            }

            else if (rightPartIterator < rightPartLength) {
                massive[i] = rightMassive[rightPartIterator];
                rightPartIterator++;
            }
        }
    }

}