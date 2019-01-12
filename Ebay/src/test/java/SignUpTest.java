import base.SignUp;
import org.testng.annotations.Test;

public class SignUpTest  extends SignUp {

    //  User can Sign up
    @Test
    public void signUpForeBay() {
        createAnAccount();
    }
}