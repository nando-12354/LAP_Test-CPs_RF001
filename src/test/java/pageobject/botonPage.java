package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class botonPage extends util {
    @FindBy(xpath = "//button[contains(.,'Nuevo')]") protected WebElement btnNuevo;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[1]") protected WebElement btnEditar;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[2]") protected WebElement btnEditarB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[3]") protected WebElement btnEditarC;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[4]") protected WebElement btnEditarD;
    @FindBy(xpath = "//button[contains(.,'Guardar')]") protected WebElement btnGuardar;
    @FindBy(xpath = "(//button[contains(.,'Guardar')])[2]") protected WebElement btnGuardarB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-trash'])[1]") protected WebElement btnEliminar;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//p-button[@icon='pi pi-trash']/button)[1]") protected WebElement btnEliminarB;
    @FindBy(xpath = "//button[contains(.,'Buscar')]") protected WebElement btnBuscar;
    @FindBy(xpath = "//button[contains(.,'Generar')]") protected WebElement btnGenerar;
    @FindBy(xpath = "//button[contains(.,'Agregar Ticket')]") protected WebElement btnAgregarTicket;
    @FindBy(xpath = "//button[contains(.,'Agregar BP')]") protected WebElement btnAgregarBoarding;
    @FindBy(xpath = "//button[contains(.,'Extornar')]") protected WebElement btnExtornar;
    @FindBy(xpath = "//button[contains(.,'Anular')]") protected WebElement btnAnular;
    @FindBy(xpath = "//button[contains(.,'Cerrar turno')]") WebElement btnCerrarTurno;
    @FindBy(xpath = "//button[contains(.,'Si')]") WebElement btnSi;
    @FindBy(xpath = "//button[contains(.,'Representante')]") protected WebElement btnRepresentante;
    @FindBy(xpath = "(//table//tbody/tr/td/div/p-button[@icon='pi pi-eye']/button)[1]") protected WebElement btnVerDetalleB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-eye'])[1]") protected WebElement btnVerDetalle;
    @FindBy(xpath = "//button[contains(.,'Rehabilitar')]") protected WebElement btnRehabilitar;
    @FindBy(xpath = "//div/button[@type='button']/timesicon") protected WebElement btnCerrar;
    @FindBy(xpath = "//button[contains(.,'Aceptar')]") protected WebElement btnAceptar;

    public botonPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickBotonNuevo(){
        wait.until(ExpectedConditions.visibilityOf(btnNuevo));
        btnNuevo.click();
    }
    public void clickBotonEditar(){
        wait.until(ExpectedConditions.visibilityOf(btnEditar));
        btnEditar.click();
    }
    public void clickBotonEditarB(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarB));
        btnEditarB.click();
    }
    public void clickBotonEditarC(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarC));
        btnEditarC.click();
    }
    public void clickBotonEditarD(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarD));
        btnEditarD.click();
    }
    public void clickBotonGuardar(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardar));
        btnGuardar.click();
    }
    public void clickBotonGuardarB(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardarB));
        btnGuardarB.click();
    }
    public void clickBotonEliminar(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminar));
        btnEliminar.click();
    }
    public void clickBotonEliminarB(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarB));
        btnEliminarB.click();
    }
    public void clickBotonBuscar(){
        wait.until(ExpectedConditions.visibilityOf(btnBuscar));
        btnBuscar.click();
    }
    public void clickBotonGenerar(){
        wait.until(ExpectedConditions.visibilityOf(btnGenerar));
        btnGenerar.click();
    }
    public void clickBotonAgregarTicket(){
        wait.until(ExpectedConditions.visibilityOf(btnAgregarTicket));
        btnAgregarTicket.click();
    }
    public void clickBotonAgregarBoarding(){
        wait.until(ExpectedConditions.visibilityOf(btnAgregarBoarding));
        btnAgregarBoarding.click();
    }
    public void clickBotonExtornar(){
        wait.until(ExpectedConditions.visibilityOf(btnExtornar));
        btnExtornar.click();
    }
    public void clickBotonAnular(){
        wait.until(ExpectedConditions.visibilityOf(btnAnular));
        btnAnular.click();
    }
    public void clickBotonCerrarTurno(){
        wait.until(ExpectedConditions.visibilityOf(btnCerrarTurno));
        btnCerrarTurno.click();
    }
    public void clickBotonSi(){
        wait.until(ExpectedConditions.visibilityOf(btnSi));
        btnSi.click();
    }
    public void clickBotonRepresentante(){
        wait.until(ExpectedConditions.visibilityOf(btnRepresentante));
        btnRepresentante.click();
    }
    public void clickBotonVerDetalle(){
        wait.until(ExpectedConditions.visibilityOf(btnVerDetalle));
        btnVerDetalle.click();
    }
    public void clickBotonVerDetalleB(){
        wait.until(ExpectedConditions.visibilityOf(btnVerDetalleB));
        btnVerDetalleB.click();
    }
    public void clickBotonRehabilitar(){
        wait.until(ExpectedConditions.visibilityOf(btnRehabilitar));
        btnRehabilitar.click();
    }
    public void clickBotonCerrar(){
        wait.until(ExpectedConditions.visibilityOf(btnCerrar));
        btnCerrar.click();
    }
    public void clickBotonAceptar(){
        btnAceptar.click();
    }
}
