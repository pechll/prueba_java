package Models;
/**
 *
 * @author Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class clsClasificador {
    
    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getIdClasificador() {
        return IdClasificador;
    }

    public void setIdClasificador(int IdClasificador) {
        this.IdClasificador = IdClasificador;
    }
    
    public int getIdTributo() {
        return IdTributo;
    }

    public void setIdTributo(int IdTributo) {
        this.IdTributo = IdTributo;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getConceCorto() {
        return ConceCorto;
    }

    public void setConceCorto(String ConceCorto) {
        this.ConceCorto = ConceCorto;
    }

    public String getIdPresupuestal() {
        return IdPresupuestal;
    }

    public void setIdPresupuestal(String IdPresupuestal) {
        this.IdPresupuestal = IdPresupuestal;
    }

    public String getIdFinanciero() {
        return IdFinanciero;
    }

    public void setIdFinanciero(String IdFinanciero) {
        this.IdFinanciero = IdFinanciero;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getTasa() {
        return Tasa;
    }

    public void setTasa(double Tasa) {
        this.Tasa = Tasa;
    }

    public String getCodEp() {
        return CodEp;
    }

    public void setCodEp(String CodEp) {
        this.CodEp = CodEp;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }

    public clsTipoClasi getOb_clsTipo() {
        return obclsTipo;
    }

    public void setOb_clsTipo(clsTipoClasi ob_clsTipo) {
        this.obclsTipo = ob_clsTipo;
    }

    public clsSubTipoClasi getOb_clsSubTipoClasi() {
        return obclsSubTipoClasi;
    }

    public void setOb_clsSubTipoClasi(clsSubTipoClasi ob_clsSubTipoClasi) {
        this.obclsSubTipoClasi = ob_clsSubTipoClasi;
    }
    
    public int getInCodigo() {
        return inCodigo;
    }

    public void setInCodigo(int inCodigo) {
        this.inCodigo = inCodigo;
    }    
    
    
    public clsTipoClasi getObclsTipo() {
        return obclsTipo;
    }

    public void setObclsTipo(clsTipoClasi obclsTipo) {
        this.obclsTipo = obclsTipo;
    }

    public clsSubTipoClasi getObclsSubTipoClasi() {
        return obclsSubTipoClasi;
    }

    public void setObclsSubTipoClasi(clsSubTipoClasi obclsSubTipoClasi) {
        this.obclsSubTipoClasi = obclsSubTipoClasi;
    }
    
    //Atributos o Propiedades
    public int inCodigo;
    public int anos;
    public int IdClasificador;
    public int IdTributo;
    public String Concepto;
    public String ConceCorto;
    public String IdPresupuestal;
    public String IdFinanciero;
    public double importe;
    public double Tasa;
    public String CodEp;
    public String Login;
    public Calendar Fecha = new GregorianCalendar();
    public char Estado;
    public clsTipoClasi obclsTipo;
    public clsSubTipoClasi obclsSubTipoClasi;
    
    
}
