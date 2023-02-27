package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import util.Browser;

public class LoginSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    //==================================================================================================================
    //                                                 LOGIN
    //==================================================================================================================
    // ID:
    // DATA:
    // RESULTADO:
    @Test
    public void efetuarLoginComSucesso() {

        loginPage.preencherUsernameCorreto();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso(), "PRODUCTS");
    }

    //==================================================================================================================
    // ID:
    // DATA:
    // RESULTADO:
    @Test
    public void efetuarLoginSemSucessoUsernameIncorreto() {

        loginPage.preencherUsernameIncorreto();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }

    //==================================================================================================================
    // ID:
    // DATA:
    // RESULTADO:
    @Test
    public void efetuarLogiSemSucessoPasswordIncorreto() {

        loginPage.preencherUsernameCorreto();
        loginPage.preencherPasswordIncorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }

    //==================================================================================================================
    // ID:
    // DATA:
    // RESULTADO:
    @Test
    public void efetuarLoginSemSucessoUsernameVazio() {

        loginPage.preencherUsernameVazio();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username is required");
    }

    //==================================================================================================================
    // ID:
    // DATA:
    // RESULTADO:
    @Test
    public void efetuarLoginSemSucessoPasswordVazio() {

        loginPage.preencherUsernameCorreto();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Password is required");
    }
}
