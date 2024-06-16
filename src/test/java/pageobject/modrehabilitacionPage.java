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
    @FindBy(xpath = "//div/span/input[@inputid='input']") protected WebElement txtTicket;
    @FindBy(xpath = "//span[contains(.,'Agregar Ticket')]") protected WebElement btnAgregarTicket;
    @FindBy(xpath = "//button[contains(.,'Agregar BP')]") protected  WebElement btnBuscarTicket;
    @FindBy(xpath = "//table//tbody/tr/td[3]") protected WebElement txtTicketAgregado;
    @FindBy(xpath = "//button[contains(.,'Representante')]") protected WebElement btnRepresentante;
    @FindBy(xpath = "//div//p-dropdown//div[@role='button']") protected WebElement cmbCompaniaBoarding;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='cias']//div[@role='button']") protected WebElement cmbCompaniaVuelo;
    @FindBy(xpath = "//div//p-calendar//input") protected WebElement txtFechaVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[1]") protected WebElement txtNumeroVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[2]") protected WebElement txtAsiento;
    @FindBy(xpath = "(//div//input[@id='textInput'])[3]") protected WebElement txtPersona;
    @FindBy(xpath = "//div/div/span/p-dropdown[@name='vuelos']//div[@role='button']") protected WebElement cmbVuelo;
    @FindBy(xpath = "//input[@inputid='nroTicketDesde']") protected WebElement txtTicketDesde;
    @FindBy(xpath = "//input[@inputid='nroTicketHasta']") protected WebElement txtTicketHasta;
    @FindBy(xpath = "//div//p-calendar[@formcontrolname='sTicketDesde']//input") protected WebElement txtFechaDesde;
    @FindBy(xpath = "//div//p-calendar[@formcontrolname='sTicketHasta']//input") protected WebElement txtFechaHasta;
    @FindBy(xpath = "//button[contains(.,'Buscar')]") protected WebElement btnBuscar;
    @FindBy(xpath = "//h5[text()='Representante']") protected WebElement lblRepresentante;
    @FindBy(xpath = "(//table//tbody/tr/td/div/p-button/button)[1]") protected WebElement btnDetalle;
    @FindBy(xpath = "//span[contains(.,'Detalle: Ticket')]") protected WebElement lblDetalle;
    @FindBy(xpath = "//div/button[@type='button']/timesicon") protected WebElement btnCerrar;
    @FindBy(xpath = "//table/tbody/tr/td/p-checkbox[1]") protected WebElement checkTicket;
    @FindBy(xpath = "(//table/tbody/tr/td/p-checkbox)[2]") protected WebElement checkBoarding;
    @FindBy(xpath = "(//p-button/button[@type='button'])[1]") protected WebElement btnRehabilitar;
    @FindBy(xpath = "//div//div[text()='¿Desea continuar con la Rehabilitación?']") protected WebElement lblAlerta;
    @FindBy(xpath = "//div//div/div/button[@label='Si']") protected WebElement btnSi;
    @FindBy(xpath = "//h1[text()='La Rehabilitación concluyó satisfactoriamente']") protected WebElement lblExito;
    @FindBy(xpath = "//p-button[@icon='pi pi-file-excel']/button") protected WebElement btnExcel;
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnImprimir;
    @FindBy(xpath = "//p-button[@icon='pi pi-file-pdf']/button") protected WebElement btnVoucher;
    @FindBy(xpath = "//div/button[@label='Aceptar']") protected WebElement btnAceptar;
    public modrehabilitacionPage() {
        PageFactory.initElements(driver, this);
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
    public void clickBotonAgregarTicket(){
        try{
            btnAgregarTicket.click();
        } catch (NoSuchElementException e){
            try{
                btnBuscarTicket.click();
            } catch (NoSuchElementException ee){
                throw new NoSuchElementException("No se encontró el boton");
            }
        }
    }
    public void validarTicketAgregado(String ticketagregado){
        wait.until(ExpectedConditions.visibilityOf(txtTicketAgregado));
        String valor = txtTicketAgregado.getText();
        Assert.assertEquals(ticketagregado, valor);
    }
    public void clickBotonRepresentante(){
        wait.until(ExpectedConditions.visibilityOf(btnRepresentante));
        btnRepresentante.click();
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
    public void abrirNumeroVuelo(){
        wait.until(ExpectedConditions.elementToBeClickable(cmbVuelo));
        cmbVuelo.click();
    }
    public void seleccionarNumeroVuelo(String vuelo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='section']/ul[@role='listbox']")));
        WebElement opcionVuelo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + vuelo + "']"));
        opcionVuelo.click();
    }
    public void clickBotonBuscar(){
        btnBuscar.click();
    }
    public void validarTituloRepresentante(String representante){
        Assert.assertEquals(representante, "Representante", lblRepresentante.getText());
    }
    public void clickBotonVerDetalle(){
        wait.until(ExpectedConditions.visibilityOf(btnDetalle));
        btnDetalle.click();
    }
    public void validarTituloDetalle(String detalle){
        wait.until(ExpectedConditions.visibilityOf(lblDetalle));
        String valor = lblDetalle.getText();
        Assert.assertEquals(detalle, valor);
    }
    public void clickBotonCerrar(){
        btnCerrar.click();
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
    public void clickBotonRehabilitar(){
        btnRehabilitar.click();
    }
    public void validarTituloAlerta(String alerta){
        wait.until(ExpectedConditions.visibilityOf(lblAlerta));
        String valor = lblAlerta.getText();
        Assert.assertEquals(alerta, valor);
    }
    public void clickBotonSi(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div/div/button[@label='Si']")));
        btnSi.click();
    }
    public void validarTituloExito(String exito){
        wait.until(ExpectedConditions.visibilityOf(lblExito));
        String valor = lblExito.getText();
        Assert.assertEquals(exito, valor);
    }
    public void clickBotonExcel(){
        wait.until(ExpectedConditions.visibilityOf(btnExcel));
        btnExcel.click();
    }
    public void clickBotonImprimir(){
        btnImprimir.click();
    }
    public void clickBotonVoucher(){
        btnVoucher.click();
    }
    public void clickBotonAceptar(){
        btnAceptar.click();
    }
}
