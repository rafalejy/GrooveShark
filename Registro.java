
import com.company.sample.service.RegistrationService;
import com.haulmont.cuba.core.global.validation.MethodParametersValidationException;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.PasswordField;
import com.haulmont.cuba.gui.components.TextField;
import java.util.Scanner; 

import javax.inject.Inject;

/**
 * "Registrar nuevo usuario"*/
 
public class RegisrarNuevoUsuario extends AbstractWindow {

    @Inject
    private TextField loginField;

    @Inject
    private PasswordField passwordField;

    @Inject
    private RegistrationService registrationService;

    /**
     * "Cancel" button click handler.
     */
    public void onCancelBtnClick() {
        close(CLOSE_ACTION_ID);
    }

    /**
     * "OK" button click handler.
     */
    public void onOkBtnClick() {
        try {
            registrationService.registerUser(getLogin(), getPassword());
            showNotification("Created user " + getLogin(), NotificationType.TRAY);
            close(COMMIT_ACTION_ID);
        } catch (MethodParametersValidationException e) {
            showNotification(messages.getMessage("com.company.sample.validation", "UserExistsValidator.message"), NotificationType.TRAY);
        }
    }

    /**
     * @return entered login
     */
    public String getLogin() {
        return loginField.getValue();
    }

    /**
     * @return entered password
     */
    public String getPassword() {
        return passwordField.getValue();
    }
}





/**
 * "Login"*/

public class Login {
public void run() {
    Scanner scan = new Scanner (new File("the\\dir\\myFile.extension"));
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine();
    String pass = scan.nextLine(); // looks at selected file in scan

    String inpUser = keyboard.nextLine();
    String inpPass = keyboard.nextLine(); // gets input from user

    if (inpUser.equals(user) && inpPass.equals(pass)) {
        System.out.print("your login message");
    } else {
        System.out.print("your error message");
    }
}
} 


/**
 * "BuscarCancion"*/

public void BuscarCancion(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getParentFile());
            }
        }
    }



