import base.HomePage;

public class Test  extends HomePage {
    @org.testng.annotations.Test
    public void search(){
        typeOnInputBox("#gh-ac","ring");
    }
}