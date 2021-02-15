import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsTester {
    @Test
    public void thanosSortTest1() {

        // отсортированный
        int[] array = {-2, -1, 2, 3, 4};

        Main.thanosSort(array, 0, 4);

        int[] resultArray = {-2, -1, 2, 3, 4};

        Assertions.assertArrayEquals(resultArray, array);
    }

    @Test
    public void thanosSortTest2() {

        // частично упорядоченный
        int[] array = {8888888, 222222, 33333, -6666, 999999};

        Main.thanosSort(array, 0, 4);

        int[] resultArray = {-6666, 33333, 222222, 999999, 8888888};

        Assertions.assertArrayEquals(resultArray, array);
    }

    @Test
    public void thanosSortTest3() {

        // отсортированный в обратном порядке
        int[] array = {10, 5, 0, -3, -10};

        Main.thanosSort(array, 0, 4);

        int[] resultArray = {-10, -3, 0, 5, 10};

        Assertions.assertArrayEquals(resultArray, array);
    }

    @Test
    public void thanosSortTest4() {

        // с повторяющимися элементами
        int[] array = {1, -2, 3, 6, 0, 3, -2, 1};

        Main.thanosSort(array, 0, 7);

        int[] resultArray = {-2, -2, 0, 1, 1, 3, 3, 6};

        Assertions.assertArrayEquals(resultArray, array);
    }

    @Test
    public void thanosSortTest5() {

        // все элементы одинаковы
        int[] array = {0, 0, 0, 0, 0};

        Main.thanosSort(array, 0, 4);

        int[] resultArray = {0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(resultArray, array);
    }

}
