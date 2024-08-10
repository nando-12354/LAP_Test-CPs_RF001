package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contiene los metodos para validar los botones de la pagina
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class botonPage extends util {
    @FindBy(xpath = "//button[contains(.,'Nuevo')]") protected WebElement btnNuevo;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-pencil'])[1]") protected WebElement btnEditar;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[2]") protected WebElement btnEditarB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[3]") protected WebElement btnEditarC;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[4]") protected WebElement btnEditarD;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[5]") protected WebElement btnEditarE;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[6]") protected WebElement btnEditarF;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-cog'])[1]") protected WebElement btnConfiguracion;
    @FindBy(xpath = "//button[contains(.,'Guardar')]") protected WebElement btnGuardar;
    @FindBy(xpath = "(//button[contains(.,'Guardar')])[2]") protected WebElement btnGuardarB;
    @FindBy(xpath = "(//p-button/button[@type='button'])[3]") protected WebElement btnGuardarC;
    @FindBy(xpath = "//button[contains(.,'Cancelar')]") protected WebElement btnCancelar;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-trash'])[1]") protected WebElement btnEliminar;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//p-button[@icon='pi pi-trash']/button)[1]") protected WebElement btnEliminarTicket;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-trash'])[7]") protected WebElement btnEliminarG;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-trash'])[10]") protected WebElement btnEliminarJ;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//p-button[@icon='pi pi-trash']/button)[1]") protected WebElement btnEliminarB;
    @FindBy(xpath = "//button[contains(.,'Buscar')]") protected WebElement btnBuscar;
    @FindBy(xpath = "//button[contains(.,'Generar')]") protected WebElement btnGenerar;
    @FindBy(xpath = "//button[contains(.,'Agregar Ticket')]") protected WebElement btnAgregarTicket;
    @FindBy(xpath = "//button[contains(.,'Agregar BP')]") protected WebElement btnAgregarBoarding;
    @FindBy(xpath = "//button[contains(.,'Extornar')]") protected WebElement btnExtornar;
    @FindBy(xpath = "//button[contains(.,'Anular')]") protected WebElement btnAnular;
    @FindBy(xpath = "//button[contains(.,'Cerrar turno')]") protected WebElement btnCerrarTurno;
    @FindBy(xpath = "//button[contains(.,'Si')]") protected WebElement btnSi;
    @FindBy(xpath = "//button[contains(.,'Atrás')]") protected WebElement btnAtras;
    @FindBy(xpath = "//button[contains(.,'Representante')]") protected WebElement btnRepresentante;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td/span/i)[1]") protected WebElement btnVerDetalleC;
    @FindBy(xpath = "(//table//tbody/tr/td/div/p-button[@icon='pi pi-eye']/button)[1]") protected WebElement btnVerDetalleB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-eye'])[1]") protected WebElement btnVerDetalle;
    @FindBy(xpath = "//button[contains(.,'Rehabilitar')]") protected WebElement btnRehabilitar;
    @FindBy(xpath = "//div/button[@type='button']/timesicon") protected WebElement btnCerrar;
    @FindBy(xpath = "//button[contains(.,'Aceptar')]") protected WebElement btnAceptar;
    @FindBy(xpath = "//button[contains(.,'Extender')]") protected WebElement btnExtender;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[1]") protected WebElement btnEditarParametrosGeneralesA;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[2]") protected WebElement btnEditarParametrosGeneralesB;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[3]") protected WebElement btnEditarParametrosGeneralesC;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[4]") protected WebElement btnEditarParametrosGeneralesD;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[5]") protected WebElement btnEditarParametrosGeneralesE;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[6]") protected WebElement btnEditarParametrosGeneralesF;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[7]") protected WebElement btnEditarParametrosGeneralesG;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[8]") protected WebElement btnEditarParametrosGeneralesH;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[9]") protected WebElement btnEditarParametrosGeneralesI;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[10]") protected WebElement btnEditarParametrosGeneralesJ;
    @FindBy(xpath = "(//p-table//table//tbody/tr/td//button[@icon='pi pi-pencil'])[11]") protected WebElement btnEditarParametrosGeneralesK;
    @FindBy(xpath = "(//p-table//table/tbody/tr/td//button)[1]") protected WebElement btnVerCampos;

    public botonPage() {
        PageFactory.initElements(slowDriver, this);
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
    public void clickBotonEditarE(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarE));
        btnEditarE.click();
    }
    public void clickBotonEditarF(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarF));
        btnEditarF.click();
    }
    public void clickBotonConfiguracion(){
        wait.until(ExpectedConditions.visibilityOf(btnConfiguracion));
        btnConfiguracion.click();
    }
    public void clickBotonGuardar(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardar));
        btnGuardar.click();
    }
    public void clickBotonGuardarB(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardarB));
        btnGuardarB.click();
    }
    public void clickBotonGuardarC(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardarC));
        btnGuardarC.click();
    }
    public void clickBotonEliminar(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminar));
        btnEliminar.click();
    }
    public void clickBotonEliminarTicket(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarTicket));
        btnEliminarTicket.click();
    }
    public void clickBotonEliminarG(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarG));
        btnEliminarG.click();
    }
    public void clickBotonEliminarJ(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarJ));
        btnEliminarJ.click();
    }
    public void clickBotonEliminarB(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarB));
        btnEliminarB.click();
    }
    public void clickBotonBuscar(){
        wait.until(ExpectedConditions.visibilityOf(btnBuscar));
        btnBuscar.click();
    }
    public void clickBotonCancelar(){
        wait.until(ExpectedConditions.visibilityOf(btnCancelar));
        btnCancelar.click();
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
    public void clickBotonAtras(){
        wait.until(ExpectedConditions.visibilityOf(btnAtras));
        btnAtras.click();
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
    public void clickBotonVerDetalleC(){
        wait.until(ExpectedConditions.visibilityOf(btnVerDetalleC));
        btnVerDetalleC.click();
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
        wait.until(ExpectedConditions.visibilityOf(btnAceptar));
        btnAceptar.click();
    }
    public void clickBotonExtender(){
        wait.until(ExpectedConditions.visibilityOf(btnExtender));
        btnExtender.click();
    }
    public void clickBotonEditarParametrosGeneralesA(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesA));
        btnEditarParametrosGeneralesA.click();
    }
    public void clickBotonEditarParametrosGeneralesB(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesB));
        btnEditarParametrosGeneralesB.click();
    }
    public void clickBotonEditarParametrosGeneralesC(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesC));
        btnEditarParametrosGeneralesC.click();
    }
    public void clickBotonEditarParametrosGeneralesD(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesD));
        btnEditarParametrosGeneralesD.click();
    }
    public void clickBotonEditarParametrosGeneralesE(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesE));
        btnEditarParametrosGeneralesE.click();
    }
    public void clickBotonEditarParametrosGeneralesF(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesF));
        btnEditarParametrosGeneralesF.click();
    }
    public void clickBotonEditarParametrosGeneralesG(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesG));
        btnEditarParametrosGeneralesG.click();
    }
    public void clickBotonEditarParametrosGeneralesH(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesH));
        btnEditarParametrosGeneralesH.click();
    }
    public void clickBotonEditarParametrosGeneralesI(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesI));
        btnEditarParametrosGeneralesI.click();
    }
    public void clickBotonEditarParametrosGeneralesJ(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesJ));
        btnEditarParametrosGeneralesJ.click();
    }
    public void clickBotonEditarParametrosGeneralesK(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarParametrosGeneralesK));
        btnEditarParametrosGeneralesK.click();
    }
    public void clickBotonVerCampos(){
        wait.until(ExpectedConditions.visibilityOf(btnVerCampos));
        btnVerCampos.click();
    }
}
