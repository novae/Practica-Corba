
import CalculadoraApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

public class CalculadoraImpl extends CalculadoraPOA {

    private ORB orb;
    private float num1,num2,resultado;

    
    public CalculadoraImpl() {
        num1=0;
        num2=0;
        resultado=0;
    }
    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    public float resultado() {
        return resultado;
    }

    public void numeros(float x,float y) {
        num1 = x;
        num2 = y;
    }

    public float suma() {
        return num1+num1;
    }
    
    public float resta() {
        return num1-num1;
    }
    public float multiplicacion() {
        return num1*num1;
    }
    public float division() {
        return num1/num1;
    }
   
    public void shutdown() {
        orb.shutdown(false);   
    }
}
