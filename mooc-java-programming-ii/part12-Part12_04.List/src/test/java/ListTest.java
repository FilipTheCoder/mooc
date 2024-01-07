
import fi.helsinki.cs.tmc.edutestutils.Points;
import junit.framework.Assert;
import main.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

@Points("12-04.1 12-04.2")
public class ListTest {

    @Test
    public void addTest() {
        int size = 20;
        List<Integer> list = new List();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        assertTrue("Correct size is displayed, expected " + size + " got " + list.size(), list.size() == size);
    }

    @Test
    public void containsTest() {
        Integer v = 5;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        junit.framework.Assert.assertEquals(true, list.contains(v));

    }

    @Test
    public void removeLast() {
        int v = 9;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(v);
        Assert.assertFalse(list.contains(v));
    }

    @Test
    public void removeFirst() {
        int v = 0;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(v);
        Assert.assertFalse(list.contains(v));
    }

    @Test
    public void removeMiddle() {
        int v = 5;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(v);
        Assert.assertFalse(list.contains(v));
    }

    @Test
    public void valueBasedOnIndex() {
        int v = 5;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Assert.assertTrue(list.value(v) == v);
    }

    @Test
    public void valueBasedOnLargerIndex() {
        int v = 5;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        try {
            int value = list.value(121);
            Assert.assertTrue(false);
        } catch(Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void valueBasedOnSmallerIndex() {
        int v = 5;
        List<Integer> list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        try {
            int value = list.value(-1);
            Assert.assertTrue(false);
        } catch(Exception e) {
            Assert.assertTrue(true);
        }
    }
}
