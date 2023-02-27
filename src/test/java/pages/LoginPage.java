package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage {

    //==================================================================================================================
    //                                          Página Login | LOGIN
    //==================================================================================================================

    // Declaração de campos de preenchimento:

    public static final By frmUsername = By.cssSelector("#user-name");
    public static final By frmPassword = By.cssSelector("#password");
    public static final By btnLogin = By.cssSelector("#login-button");

    // Validações:
    public static final By mnuProducts= By.cssSelector("#header_container > div.header_secondary_container > span");
    public static final By lblIncorrectLogin = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:
    public void preencherUsernameCorreto() { BaseTest.sendKeys(frmUsername, "standard_user"); }

    public void preencherPasswordCorreto() {
        BaseTest.sendKeys(frmPassword, "secret_sauce");
    }

    // Preencher com dados incorretos:
    public void preencherUsernameIncorreto() {
        BaseTest.sendKeys(frmUsername, "UsernameIncorreto");
    }

    public void preencherPasswordIncorreto() {
        BaseTest.sendKeys(frmPassword, "PasswordIncorreto");
    }

    // Dados vazio:
    public void preencherUsernameVazio() {
        BaseTest.sendKeys(frmUsername, "");
    }

    public void preencherPasswordVazio() {
        BaseTest.sendKeys(frmPassword, "");
    }

    // Efetuar Login:
    public void clicarLoginBtn() {
        BaseTest.click(btnLogin);
    }

    // Validações:
    public String validarLoginComSucesso() {
        return BaseTest.getText(mnuProducts);
    }

    public String validarLoginSemSucesso() {
        return BaseTest.getText(lblIncorrectLogin);
    }

}
