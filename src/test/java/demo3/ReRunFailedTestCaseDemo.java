package demo3;
 
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class ReRunFailedTestCaseDemo {
 
    @Test
    public void test01(){
        System.out.println("test01");
    }
 
    @Test
    public void test02(){
        Assert.assertTrue(10==11);
        System.out.println("test02");
    }
 
    @Test
    public void test03(){
        System.out.println("test03");
    }
 
}