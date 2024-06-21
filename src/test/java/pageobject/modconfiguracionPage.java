package pageobject;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modconfiguracionPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/configuracion/parametros']") protected WebElement opParametros;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/configuracion/lista-campos']") protected WebElement opListaCampos;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[1]") protected WebElement btnVerConfiguracionA;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[2]") protected WebElement btnVerConfiguracionB;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[3]") protected WebElement btnVerConfiguracionC;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[4]") protected WebElement btnVerConfiguracionD;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[5]") protected WebElement btnVerConfiguracionE;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[6]") protected WebElement btnVerConfiguracionF;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[7]") protected WebElement btnVerConfiguracionG;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[8]") protected WebElement btnVerConfiguracionH;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[9]") protected WebElement btnVerConfiguracionI;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[10]") protected WebElement btnVerConfiguracionJ;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[11]") protected WebElement btnVerConfiguracionK;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[12]") protected WebElement btnVerConfiguracionL;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[13]") protected WebElement btnVerConfiguracionM;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[14]") protected WebElement btnVerConfiguracionN;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[15]") protected WebElement btnVerConfiguracionO;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[16]") protected WebElement btnVerConfiguracionP;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[17]") protected WebElement btnVerConfiguracionQ;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-eye'])[18]") protected WebElement btnVerConfiguracionR;
    @FindBy(xpath = "(//div/app-lista-campo/form//app-input-text//input[@id='input'])[1]") protected WebElement inputNombreCampo;
    @FindBy(xpath = "(//div/app-lista-campo/form//app-input-text//input[@id='input'])[2]") protected WebElement inputCodigoAsociado;
    @FindBy(xpath = "(//div/app-lista-campo/form//app-input-text//input[@id='input'])[3]") protected WebElement inputCodigo;
    @FindBy(xpath = "//textarea[@inputid='textarea']") protected WebElement inputDescripcion;
    @FindBy(xpath = "//textarea[@inputid='textarea']") protected WebElement inputEditarDescripcion;
    @FindBy(xpath = "(//app-editar-lista-campo/form//span[@class='tituloValor'])[1]") protected WebElement lblNombreCampo;
    @FindBy(xpath = "(//app-editar-lista-campo/form//span[@class='tituloValor'])[2]") protected WebElement lblCodigo;
    @FindBy(xpath = "(//app-editar-lista-campo/form//span[@class='tituloValor'])[3]") protected WebElement lblCodigoAsociado;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[1]") protected WebElement pesLimiteMaximo;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[2]") protected WebElement pesLimiteMinimo;

    public modconfiguracionPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void ingresarOpcionParametros(){
        wait.until(ExpectedConditions.visibilityOf(opParametros));
        opParametros.click();
    }
    public void ingresarOpcionListaCampos(){
        wait.until(ExpectedConditions.visibilityOf(opListaCampos));
        opListaCampos.click();
    }
    public void clickBotonVerConfiguracionA() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionA));
        btnVerConfiguracionA.click();
    }
    public void clickBotonVerConfiguracionB() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionB));
        btnVerConfiguracionB.click();
    }
    public void clickBotonVerConfiguracionC() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionC));
        btnVerConfiguracionC.click();
    }
    public void clickBotonVerConfiguracionD() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionD));
        btnVerConfiguracionD.click();
    }
    public void clickBotonVerConfiguracionE() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionE));
        btnVerConfiguracionE.click();
    }
    public void clickBotonVerConfiguracionF() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionF));
        btnVerConfiguracionF.click();
    }
    public void clickBotonVerConfiguracionG() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionG));
        btnVerConfiguracionG.click();
    }
    public void clickBotonVerConfiguracionH() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionH));
        btnVerConfiguracionH.click();
    }
    public void clickBotonVerConfiguracionI() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionI));
        btnVerConfiguracionI.click();
    }
    public void clickBotonVerConfiguracionJ() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionJ));
        btnVerConfiguracionJ.click();
    }
    public void clickBotonVerConfiguracionK() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionK));
        btnVerConfiguracionK.click();
    }
    public void clickBotonVerConfiguracionL() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionL));
        btnVerConfiguracionL.click();
    }
    public void clickBotonVerConfiguracionM() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionM));
        btnVerConfiguracionM.click();
    }
    public void clickBotonVerConfiguracionN() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionN));
        btnVerConfiguracionN.click();
    }
    public void clickBotonVerConfiguracionO() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionO));
        btnVerConfiguracionO.click();
    }
    public void clickBotonVerConfiguracionP() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionP));
        btnVerConfiguracionP.click();
    }
    public void clickBotonVerConfiguracionQ() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionQ));
        btnVerConfiguracionQ.click();
    }
    public void clickBotonVerConfiguracionR() {
        wait.until(ExpectedConditions.visibilityOf(btnVerConfiguracionR));
        btnVerConfiguracionR.click();
    }
    public void ingresarNombreCampo(String nombrecampo){
        wait.until(ExpectedConditions.visibilityOf(inputNombreCampo));
        inputNombreCampo.sendKeys(nombrecampo);
    }
    public void ingresarCodigoAsociado(String codigoasociado){
        wait.until(ExpectedConditions.visibilityOf(inputCodigoAsociado));
        inputCodigoAsociado.sendKeys(codigoasociado);
    }
    public void ingresarCodigo(String codigo){
        wait.until(ExpectedConditions.visibilityOf(inputCodigo));
        inputCodigo.sendKeys(codigo);
    }
    public void ingresarDescripcion(String descripcion){
        wait.until(ExpectedConditions.visibilityOf(inputDescripcion));
        inputDescripcion.sendKeys(descripcion);
    }
    public void ingresarEditarDescripcion(String editardescripcion){
        wait.until(ExpectedConditions.visibilityOf(inputEditarDescripcion));
        limpiarCampo(inputEditarDescripcion);
        inputEditarDescripcion.sendKeys(editardescripcion);
    }
    public void validarNombreCampo(String valnombrecampo){
        wait.until(ExpectedConditions.visibilityOf(lblNombreCampo));
        String valor = lblNombreCampo.getText();
        Assert.assertEquals(valnombrecampo, valor);
    }
    public void validarCodigoAsociado(String valcodigoasociado){
        wait.until(ExpectedConditions.visibilityOf(lblCodigo));
        String valor = lblCodigo.getText();
        Assert.assertEquals(valcodigoasociado, valor);
    }
    public void validarCodigo(String valcodigo){
        wait.until(ExpectedConditions.visibilityOf(lblCodigoAsociado));
        String valor = lblCodigoAsociado.getText();
        Assert.assertEquals(valcodigo, valor);
    }
    public void clickPestanaLimiteMaximo(){
        wait.until(ExpectedConditions.visibilityOf(pesLimiteMaximo));
        pesLimiteMaximo.click();
    }
    public void clickPestanaLimiteMinimo(){
        wait.until(ExpectedConditions.visibilityOf(pesLimiteMinimo));
        pesLimiteMinimo.click();
    }
}
