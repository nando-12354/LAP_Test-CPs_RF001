package pageobject;

import org.junit.Assert;
import org.openqa.selenium.*;
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
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='numeroTicket']//input") protected WebElement txtTicket;
    @FindBy(xpath = "//table//tbody/tr/td[3]") protected WebElement txtTicketAgregado;
    @FindBy(xpath = "//div//p-calendar//input") protected WebElement txtFechaVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[1]") protected WebElement txtNumeroVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[2]") protected WebElement txtAsiento;
    @FindBy(xpath = "(//div//input[@id='textInput'])[3]") protected WebElement txtPersona;
    @FindBy(xpath = "//div//input[@inputid='vuelo']") protected WebElement inputVueloBpSalida;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='NroTicketDesde']//input") protected WebElement txtTicketDesde;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='NroTicketHasta']//input") protected WebElement txtTicketHasta;
    @FindBy(xpath = "//app-input-date[@formcontrolname='ticketDesde']//p-calendar//input") protected WebElement txtFechaDesde;
    @FindBy(xpath = "//app-input-date[@formcontrolname='ticketHasta']//p-calendar//input") protected WebElement txtFechaHasta;
    @FindBy(xpath = "//app-input-date[@formcontrolname='fechaDesde']//p-calendar//input") protected WebElement txtFechaDesdeBpFecha;
    @FindBy(xpath = "//app-input-date[@formcontrolname='fechaHasta']//p-calendar//input") protected WebElement txtFechaHastaBpFecha;
    @FindBy(xpath = "//table/tbody/tr/td/p-checkbox[1]") protected WebElement checkTicket;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[2]") protected WebElement checkBoarding;
    @FindBy(xpath = "//table/tbody/tr/td/span[text()='31']") protected WebElement clickDiaCalendario;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[4]") protected WebElement checkBoardingB;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[6]") protected WebElement checkBoardingC;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[8]") protected WebElement checkBoardingD;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[10]") protected WebElement checkBoardingE;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[12]") protected WebElement checkBoardingF;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[14]") protected WebElement checkBoardingG;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[16]") protected WebElement checkBoardingH;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[18]") protected WebElement checkBoardingI;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[20]") protected WebElement checkBoardingJ;
    @FindBy(xpath = "//th[contains(.,'Fecha Creación')]") protected WebElement clickCabeceraGrilla;
    @FindBy(xpath = "//table/tbody/tr/td/span[text()='18']") protected WebElement clickDiaCalendarioBpSalida;
    @FindBy(xpath = "//table/tbody/tr/td/span[text()='4']") protected WebElement clickDiaCalendarioTicketVuelo;

    public modrehabilitacionPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void validarOpcionesRehabilitacion(String rehabilitacion){
        boolean opcionValida = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a/span[text()='" + rehabilitacion + "']")));
        String xpath = "//div/ul/li/a/span[text()='" + rehabilitacion + "']";
        try {
            WebElement seguridadOpciones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (seguridadOpciones.isDisplayed() && seguridadOpciones.getText().equals(rehabilitacion)) {
                opcionValida = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó la opción
        }
        Assert.assertTrue("Opción" + rehabilitacion + " no reconocida. Validarlo!", opcionValida);
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
    public void ingresarFechaVuelo(String fecha){
        wait.until(ExpectedConditions.visibilityOf(txtFechaVuelo));
        txtFechaVuelo.sendKeys(fecha);
    }
    public void ingresarLaFechaVuelo(String fecha){
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
        txtFechaDesde.sendKeys(Keys.TAB);
    }
    public void ingresarFechaHasta(String fechahasta){
        wait.until(ExpectedConditions.visibilityOf(txtFechaHasta));
        txtFechaHasta.sendKeys(fechahasta);
        txtFechaHasta.sendKeys(Keys.TAB);
    }
    public void ingresarFechaDesdeBpFecha(String fechadesde){
        wait.until(ExpectedConditions.visibilityOf(txtFechaDesdeBpFecha));
        txtFechaDesdeBpFecha.sendKeys(fechadesde);
        txtFechaDesdeBpFecha.sendKeys(Keys.TAB);
    }
    public void ingresarFechaHastaBpFecha(String fechahasta){
        wait.until(ExpectedConditions.visibilityOf(txtFechaHastaBpFecha));
        txtFechaHastaBpFecha.sendKeys(fechahasta);
        txtFechaHastaBpFecha.sendKeys(Keys.TAB);
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
    public void ingresarNumeroVueloBpSalida(String vuelosalida){
        inputVueloBpSalida.sendKeys(vuelosalida);
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
    public void darClickCalendario(){
        clickDiaCalendario.click();
    }
    public void darClickCalendarioBpSalida(){
        clickDiaCalendarioBpSalida.click();
    }
    public void darClickCalendarioTicketVuelo(){
        clickDiaCalendarioTicketVuelo.click();
    }
    public void seleccionarBoardingB(String selectb){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingB));
        if (selectb.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingB));
            if (!checkBoardingB.isSelected()) {
                checkBoardingB.click();
            }
        } else if (selectb.toLowerCase().equals("no")) {
            if (checkBoardingB.isSelected()) {
                checkBoardingB.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingB)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingB.isSelected());
        }
    }
    public void seleccionarBoardingC(String selectc){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingC));
        if (selectc.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingC));
            if (!checkBoardingC.isSelected()) {
                checkBoardingC.click();
            }
        } else if (selectc.toLowerCase().equals("no")) {
            if (checkBoardingC.isSelected()) {
                checkBoardingC.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingC)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingC.isSelected());
        }
    }
    public void seleccionarBoardingD(String selectd){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingD));
        if (selectd.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingD));
            if (!checkBoardingD.isSelected()) {
                checkBoardingD.click();
            }
        } else if (selectd.toLowerCase().equals("no")) {
            if (checkBoardingD.isSelected()) {
                checkBoardingD.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingD)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingD.isSelected());
        }
    }
    public void seleccionarBoardingE(String selecte){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingE));
        if (selecte.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingE));
            if (!checkBoardingE.isSelected()) {
                checkBoardingE.click();
            }
        } else if (selecte.toLowerCase().equals("no")) {
            if (checkBoardingE.isSelected()) {
                checkBoardingE.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingE)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingE.isSelected());
        }
    }
    public void seleccionarBoardingF(String selectf){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingF));
        if (selectf.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingF));
            if (!checkBoardingF.isSelected()) {
                checkBoardingF.click();
            }
        } else if (selectf.toLowerCase().equals("no")) {
            if (checkBoardingF.isSelected()) {
                checkBoardingF.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingF)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingF.isSelected());
        }
    }
    public void seleccionarBoardingG(String selectg){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingG));
        if (selectg.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingG));
            if (!checkBoardingG.isSelected()) {
                checkBoardingG.click();
            }
        } else if (selectg.toLowerCase().equals("no")) {
            if (checkBoardingG.isSelected()) {
                checkBoardingG.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingG)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingG.isSelected());
        }
    }
    public void seleccionarBoardingH(String selecth){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingH));
        if (selecth.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingH));
            if (!checkBoardingH.isSelected()) {
                checkBoardingH.click();
            }
        } else if (selecth.toLowerCase().equals("no")) {
            if (checkBoardingH.isSelected()) {
                checkBoardingH.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingH)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingH.isSelected());
        }
    }
    public void seleccionarBoardingI(String selecti){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingI));
        if (selecti.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingI));
            if (!checkBoardingI.isSelected()) {
                checkBoardingI.click();
            }
        } else if (selecti.toLowerCase().equals("no")) {
            if (checkBoardingI.isSelected()) {
                checkBoardingI.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingI)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingI.isSelected());
        }
    }
    public void seleccionarBoardingJ(String selectj){
        wait.until(ExpectedConditions.visibilityOf(checkBoardingJ));
        if (selectj.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkBoardingJ));
            if (!checkBoardingJ.isSelected()) {
                checkBoardingJ.click();
            }
        } else if (selectj.toLowerCase().equals("no")) {
            if (checkBoardingJ.isSelected()) {
                checkBoardingJ.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkBoardingJ)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoardingJ.isSelected());
        }
    }
    public void clickCabeceraDeLaGrilla(){
        clickCabeceraGrilla.click();
    }
}
