package system.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserForm {

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    private String secondName;

    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;

    public UserForm() {
    }
}
