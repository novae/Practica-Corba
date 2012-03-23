import ContadorApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

public class ServidorCalculadora {
    public static void main(String[] args) {
         try
       { // se crea e inicializa el ORB      
         ORB orb = ORB.init(args, null);      
         // se obtiene la referencia de rootpoa y  activacion del POAManager      
         POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));      
         rootpoa.the_POAManager().activate();      
        // se crea el  servant y se registra con el ORB      
        CalculadoraImpl calculadoraImpl = new CalculadoraImpl();      
        contadorImpl.setORB(orb);       
        // obtiene la referencia del objeto desde el servant      
        org.omg.CORBA.Object ref = rootpoa.servant_to_reference(calculadoraImpl);      
        Calculadora href = ContadorHelper.narrow(ref);  // convierte a una referencia CORBA    
        // obtiene el contexto del nombrado raiz, NameService invoca al servicio de nombres      
        org.omg.CORBA.Object objRef =orb.resolve_initial_references("NameService");     
        // usa NamingContextExt que es parte de la especificacion de servicio de nombrado interoperable 
        //(Interoperable Naming Service (INS)      
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);      
        // enlaza la referencia del objeto con el nombre
        String name = "Contador";      
        NameComponent path[] = ncRef.to_name( name );      
        ncRef.rebind(path, href);      
        System.out.println("Servicio de contador preparado y en espera de peticiones ...");    
        // el servidor esta en espera de invocaciones por parte de los clientes      
        orb.run();    
      }  
     catch (Exception e) 
      {        System.err.println("ERROR: " + e);        
               e.printStackTrace(System.out);      
      }          
     System.out.println("Servidor de contador desconectadose ...");    

    }
}
