package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class comboboxPage extends util {
    @FindBy(xpath = "//div/app-input-select[@id='selectRolPadre']/span/p-dropdown//div[@role='button']") protected WebElement cmbRolPadre;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='rol']//div[@role='button']") protected WebElement cmbUsuarioRolPadre;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='estado']//div[@role='button']") protected WebElement cmbUsuarioEstado;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='group']//div[@role='button']") protected WebElement cmbPrivilegio;
    @FindBy(xpath = "(//div/div/span/p-dropdown[@id='group']//div[@role='button'])[1]") protected WebElement cmbEstadoEditar;
    @FindBy(xpath = "(//div/div/span/p-dropdown[@id='group']//div[@role='button'])[2]") protected WebElement cmbPrivilegioEditar;
    @FindBy(xpath = "//div/div/span/p-dropdown//div[@role='button']") protected WebElement cmbMotivoTicketMasivo;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='motivos']//div[@role='button']") protected WebElement cmbMotivosTicket;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='motivos']//div[@role='button']") protected WebElement cmbMotivoTicketVuelo;
    @FindBy(xpath = "//div/div/p-dropdown[@optionvalue='sCodCampo']//div[@role='button']") protected WebElement cmbMotivoTicketRango;
    @FindBy(xpath = "//div/app-input-select[@inputid='motivocmb']//div[@role='button']") protected WebElement cmbMotivoTicketFecha;
    @FindBy(xpath = "//app-representante-compania//p-dropdown//div[@role='button']") protected WebElement cmbReprCompania;
    @FindBy(xpath = "//div/div//span/p-dropdown//div[@role='button']") protected WebElement cmbMoneda;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='listaTipos']//div[@role='button']") protected WebElement cmbTipoCompania;
    @FindBy(xpath = "//div/app-input-select[@inputid='modalidadVenta']//div[@role='button']") protected WebElement cmbTipoModalidad;
    @FindBy(xpath = "//div/app-input-select[@inputid]//div[@role='button']") protected WebElement cmbTipoTicketModalidad;

    public comboboxPage() {
        PageFactory.initElements(driver, this);
    }
    public void abrirCombobox() {
        try {
            cmbRolPadre.click();
        } catch (NoSuchElementException a) {
            try {
                cmbUsuarioRolPadre.click();
            } catch (NoSuchElementException b) {
                try {
                    cmbUsuarioEstado.click();
                } catch (NoSuchElementException r) {
                    try {
                        cmbPrivilegio.click();
                    } catch (NoSuchElementException d) {
                        try {
                            cmbPrivilegioEditar.click();
                        } catch (NoSuchElementException f) {
                            try {
                                cmbEstadoEditar.click();
                            } catch (NoSuchElementException g) {
                                try {
                                    cmbMoneda.click();
                                } catch (NoSuchElementException h) {
                                    try {
                                        cmbTipoCompania.click();
                                    } catch (NoSuchElementException i) {
                                        try {
                                            cmbTipoModalidad.click();
                                        } catch (NoSuchElementException j) {
                                            try {
                                                cmbTipoTicketModalidad.click();
                                            } catch (NoSuchElementException k) {
                                                try {
                                                    cmbMotivoTicketMasivo.click();
                                                } catch (NoSuchElementException e) {
                                                    try {
                                                        cmbMotivosTicket.click();
                                                    } catch (NoSuchElementException ee) {
                                                        try {
                                                            cmbMotivoTicketVuelo.click();
                                                        } catch (NoSuchElementException eee) {
                                                            try {
                                                                cmbMotivoTicketRango.click();
                                                            } catch (NoSuchElementException eeee) {
                                                                try {
                                                                    cmbMotivoTicketFecha.click();
                                                                } catch (NoSuchElementException eeeee) {
                                                                    try {
                                                                        cmbReprCompania.click();
                                                                    } catch (NoSuchElementException eeeeee) {
                                                                        throw new NoSuchElementException("No se encontró el desplegable");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }
}
