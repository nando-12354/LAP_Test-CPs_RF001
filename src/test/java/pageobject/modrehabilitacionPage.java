package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modrehabilitacionPage extends util {
    @FindBy(xpath = "(//span[contains(.,'Ticket')])[8]") protected WebElement opTicket;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket']") protected WebElement subopTicketNormal;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket-masivo']") protected WebElement subopTicketMasivo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket-salida']") protected WebElement subopTicketSalida;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket-vuelo']") protected WebElement subopTicketVuelo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket-hora']") protected WebElement subopTicketRango;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/ticket-fecha']") protected WebElement subopTicketFecha;
    @FindBy(xpath = "(//span[contains(.,'Boarding Pass')])[1]") protected WebElement opBoarding;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/boarding-normal']") protected WebElement subopBoardingNormal;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/boarding-masivo']") protected WebElement subopBoardingMasivo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/boarding-salida']") protected WebElement subopBoardingSalida;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/boarding-vuelo']") protected WebElement subopBoardingVuelo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/rehabilitacion/boarding-fecha']") protected WebElement subopBoardingFecha;
    @FindBy(xpath = "//form/div/div/span/input[@formcontrolname='sNumeroTicket']") protected WebElement txtTicket;
    @FindBy(xpath = "//table//tbody/tr/td[3]") protected WebElement txtTicketAgregado;
    @FindBy(xpath = "//div//p-dropdown//div[@role='button']") protected WebElement cmbCompaniaBoarding;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='cias']//div[@role='button']") protected WebElement cmbCompaniaVuelo;
    @FindBy(xpath = "//div//p-calendar//input") protected WebElement txtFechaVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[1]") protected WebElement txtNumeroVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[2]") protected WebElement txtAsiento;
    @FindBy(xpath = "(//div//input[@id='textInput'])[3]") protected WebElement txtPersona;
    @FindBy(xpath = "//input[@inputid='nroTicketDesde']") protected WebElement txtTicketDesde;
    @FindBy(xpath = "//input[@inputid='nroTicketHasta']") protected WebElement txtTicketHasta;
    @FindBy(xpath = "//div//p-calendar[@formcontrolname='sTicketDesde']//input") protected WebElement txtFechaDesde;
    @FindBy(xpath = "//div//p-calendar[@formcontrolname='sTicketHasta']//input") protected WebElement txtFechaHasta;
    @FindBy(xpath = "//div//p-calendar[@id='fechaDesde']//input") protected WebElement txtFechaDesdeBpFecha;
    @FindBy(xpath = "//div//p-calendar[@id='fechaHasta']//input") protected WebElement txtFechaHastaBpFecha;
    @FindBy(xpath = "//table/tbody/tr/td/p-checkbox[1]") protected WebElement checkTicket;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[2]") protected WebElement checkBoarding;

    public modrehabilitacionPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void ingresarOpcionTicket(){
        wait.until(ExpectedConditions.visibilityOf(opTicket));
        opTicket.click();
    }
    public void ingresarSubOpcionTicketNormal(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketNormal));
        subopTicketNormal.click();
    }
    public void ingresarSubOpcionTicketMasivo(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketMasivo));
        subopTicketMasivo.click();
    }
    public void ingresarSubOpcionTicketSalida(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketSalida));
        subopTicketSalida.click();
    }
    public void ingresarSubOpcionTicketVuelo(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketVuelo));
        subopTicketVuelo.click();
    }
    public void ingresarSubOpcionTicketRango(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketRango));
        subopTicketRango.click();
    }
    public void ingresarSubOpcionTicketFecha(){
        wait.until(ExpectedConditions.visibilityOf(subopTicketFecha));
        subopTicketFecha.click();
    }
    public void ingresarOpcionBoarding(){
        wait.until(ExpectedConditions.visibilityOf(opBoarding));
        opBoarding.click();
    }
    public void ingresarSubOpcionBoardingNormal(){
        wait.until(ExpectedConditions.visibilityOf(subopBoardingNormal));
        subopBoardingNormal.click();
    }
    public void ingresarSubOpcionBoardingMasivo(){
        wait.until(ExpectedConditions.visibilityOf(subopBoardingMasivo));
        subopBoardingMasivo.click();
    }
    public void ingresarSubOpcionBoardingSalida(){
        wait.until(ExpectedConditions.visibilityOf(subopBoardingSalida));
        subopBoardingSalida.click();
    }
    public void ingresarSubOpcionBoardingVuelo(){
        wait.until(ExpectedConditions.visibilityOf(subopBoardingVuelo));
        subopBoardingVuelo.click();
    }
    public void ingresarSubOpcionBoardingFecha(){
        wait.until(ExpectedConditions.visibilityOf(subopBoardingFecha));
        subopBoardingFecha.click();
    }
    public void ingresarNumeroTicket(String ticket){
        wait.until(ExpectedConditions.visibilityOf(txtTicket));
        txtTicket.sendKeys(ticket);
    }
    public void validarTicketAgregado(String ticketagregado){
        wait.until(ExpectedConditions.visibilityOf(txtTicketAgregado));
        String valor = txtTicketAgregado.getText();
        Assert.assertEquals(ticketagregado, valor);
    }
    public void abrirCompaniaVuelo(){
        wait.until(ExpectedConditions.elementToBeClickable(cmbCompaniaVuelo));
        cmbCompaniaVuelo.click();
    }
    public void seleccionarCompaniaVuelo(String companiavuelo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionCompaniavuelo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + companiavuelo + "']"));
        opcionCompaniavuelo.click();
    }
    public void ingresarFechaVuelo(String fecha){
        wait.until(ExpectedConditions.visibilityOf(txtFechaVuelo));
        txtFechaVuelo.sendKeys(fecha);
    }
    public void ingresarTicketDesde(String ticketdesde){
        wait.until(ExpectedConditions.visibilityOf(txtTicketDesde));
        txtTicketDesde.sendKeys(ticketdesde);
    }
    public void ingresarTicketHasta(String tickethasta){
        wait.until(ExpectedConditions.visibilityOf(txtTicketHasta));
        txtTicketHasta.sendKeys(tickethasta);
    }
    public void ingresarFechaDesde(String fechadesde){
        wait.until(ExpectedConditions.visibilityOf(txtFechaDesde));
        txtFechaDesde.sendKeys(fechadesde);
    }
    public void ingresarFechaHasta(String fechahasta){
        wait.until(ExpectedConditions.visibilityOf(txtFechaHasta));
        txtFechaHasta.sendKeys(fechahasta);
    }
    public void ingresarFechaDesdeBpFecha(String fechadesde){
        wait.until(ExpectedConditions.visibilityOf(txtFechaDesdeBpFecha));
        txtFechaDesdeBpFecha.sendKeys(fechadesde);
    }
    public void ingresarFechaHastaBpFecha(String fechahasta){
        wait.until(ExpectedConditions.visibilityOf(txtFechaHastaBpFecha));
        txtFechaHastaBpFecha.sendKeys(fechahasta);
    }
    public void ingresarAsiento(String asiento){
        txtAsiento.sendKeys(asiento);
    }
    public void ingresarPersona(String persona){
        txtPersona.sendKeys(persona);
    }
    public void ingresarNumeroVuelo(String vuelo){
        txtNumeroVuelo.sendKeys(vuelo);
    }
    public void seleccionarTicket(String selecticket){
        wait.until(ExpectedConditions.visibilityOf(checkTicket));
        if (selecticket.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkTicket));
            if (!checkTicket.isSelected()) {
                checkTicket.click();
            }
        } else if (selecticket.toLowerCase().equals("no")) {
            if (checkTicket.isSelected()) {
                checkTicket.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkTicket)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicket.isSelected());
        }
    }
    public void seleccionarBoarding(String selecbp){
        wait.until(ExpectedConditions.visibilityOf(checkBoarding));
        if (selecbp.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoarding));
            if (!checkBoarding.isSelected()) {
                checkBoarding.click();
            }
        } else if (selecbp.toLowerCase().equals("no")) {
            if (checkBoarding.isSelected()) {
                checkBoarding.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoarding)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoarding.isSelected());
        }
    }

}
