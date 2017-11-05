package system.ui.specialist;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.data.Binder;
import com.vaadin.event.ShortcutAction;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.themes.ValoTheme;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import system.entities.Specialist;
import system.repositories.SpecialistRepository;

@SpringComponent
@UIScope
@DesignRoot
public class SpecialistEditor extends VerticalLayout implements View {

    @Getter
    @Setter
    //@Autowired
    private SpecialistRepository specialistRepository;

    private Specialist specialist;

    private TextField firstName;
    private TextField secondName;
    private TextField lastName;

    private Button save;
    private Button cancel;
    private Button delete;
    private CssLayout actions;
    private Binder<Specialist> binder = new Binder<>(Specialist.class);

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }

    public interface ChangeHandler {
        void onChange();
    }

    void editSpecialist(
            Specialist s
    ) {
        if (s == null) {
            setVisible(false);
            return;
        }
        final boolean persisted = s.getId() != null;

        if (persisted) {
            specialist = specialistRepository.findOne(s.getId());
        } else {
            specialist = s;
        }
        cancel.setVisible(persisted);

        binder.setBean(specialist);

        setVisible(true);

        save.focus();
        firstName.selectAll();
    }

    @Autowired
    public SpecialistEditor(
            SpecialistRepository specialistRepository
    ) {
        Design.read(this);
        this.specialistRepository = specialistRepository;
        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        save.addClickListener(e -> {
            specialistRepository.save(specialist);

        });
        delete.addClickListener(e -> specialistRepository.delete(specialist));
        cancel.addClickListener(e -> editSpecialist(specialist));
        binder.bindInstanceFields(this);
    }

    public void setChangeHandler(
            ChangeHandler handler
    ) {
        save.addClickListener(e -> handler.onChange());
        delete.addClickListener(e -> handler.onChange());
    }
}
