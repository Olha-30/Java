package lab0;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Variant2Test {
    Variant2 variant2 = new Variant2();

    ////////////////////////////////////////////////////////////////////////////////

    @DataProvider
    public Object[][] integerNumbersProvider() {
        return new Object[][]{{2000, 2}, {4000, 4}, {6000, 6}};
    }

    @Test(dataProvider = "integerNumbersProvider")
    public void integerNumbersTask(int m, int expected) {
        Assert.assertEquals(variant2.Tinteger(m), expected);
    }

//////////////////////////////////////////////////////////////////////////////////////////

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{2, false}, {3, true}, {6, false}};
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanTask(int a, boolean expected) {
        Assert.assertEquals(variant2.Tboolean(a), expected);
    }

/////////////////////////////////////////////////////////////////////////////////////////

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{2, 3}, {-3, -5}, {5, 6}};
    }

    @Test(dataProvider = "ifProvider")
    public void ifTask(int b, int expected) {
        Assert.assertEquals(variant2.Tif(b), expected);
    }

    ////////////////////////////////////////////////////////////////////////////////////


    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{2, 6, new int[]{5, 2, 3, 4, 5, 6}}, {1, 4, new int[]{4, 1, 2, 3, 4}}};
    }

    @Test(dataProvider = "forProvider")
    public void forTask(int a, int b, int[] expected) {
        Assert.assertEquals(variant2.Tfor(a, b), expected);
    }

    ////////////////////////////////////////////////////////////////////////////////

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{6, 2, 3}, {9, 4, 2}, {4, 3, 1}};
    }

    @Test(dataProvider = "whileProvider")
    public void Twhile(int a, int b, int expected) {
        Assert.assertEquals(variant2.Twhile(a, b), expected);
    }

    /////////////////////////////////////////////////////////////////////////

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{{2, new int[]{2, 4}}, {3, new int[]{2, 4, 8}}};
    }

    @Test(dataProvider = "arrayProvider")
    public void Tarray(int n, int[] expected) {
        Assert.assertEquals(variant2.Tarray(n), expected);
    }

    //////////////////////////////////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int[][] output) {
        assertEquals(new Variant2().TMatrix(input), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input1 = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
        };
        int[][] output1 = {{5, 10, 15, 20, 25},
                {5, 10, 15, 20, 25}};

        return new Object[][]{{input1, output1}};

    }
}