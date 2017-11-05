package system.ui.specialist;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import system.entities.Specialist;
import system.repositories.SpecialistRepository;

import java.util.stream.StreamSupport;

@SpringComponent
@UIScope
@DesignRoot
public class SpecialistView extends VerticalLayout implements View {
    //    {
//        Design.read(this);
//    }
    private SpecialistRepository specialistRepository;

    private VerticalLayout mainLayout = new VerticalLayout();

    private HorizontalLayout actions = new HorizontalLayout();

    //@Autowired
    private SpecialistEditor specialistEditor;
    //
    private Button addNewButton = new Button("Add new specialist");
    //
    private Grid<Specialist> specialistGrid = new Grid<>(Specialist.class);
    private TextField filter = new TextField();

    private void initEditor() {
        specialistEditor.setVisible(false);
        specialistEditor.setChangeHandler(
                () -> {
                    specialistEditor.setVisible(false);
                    listSpecialists(filter.getValue());
                }
        );
    }

    private void initAddNewButton() {
        addNewButton.addClickListener(e -> specialistEditor.editSpecialist(
                new Specialist("", "", "")
        ));
    }

    private void initFilter() {
        filter.addValueChangeListener(e -> listSpecialists(e.getValue()));
        filter.setPlaceholder("Find by last name");
        filter.setValueChangeMode(ValueChangeMode.LAZY);
    }

    private void initMainLayout() {
        initActions();
        initGrid();
        mainLayout.addComponents(actions, specialistGrid, specialistEditor);
    }

    private void initActions() {
        initFilter();
        initAddNewButton();
        actions.addComponents(filter, addNewButton);
    }

    private void initGrid() {
        specialistGrid.setColumns("id", "firstName", "secondName", "lastName");
        specialistGrid.asSingleSelect().addValueChangeListener(
                e -> specialistEditor.editSpecialist(e.getValue())
        );
    }

    @Autowired
    public SpecialistView(
            SpecialistRepository specialistRepository,
            SpecialistEditor specialistEditor
    ) {
        this.specialistRepository = specialistRepository;
        this.specialistEditor = specialistEditor;
        initEditor();
        initMainLayout();
        addComponent(mainLayout);

        if (specialistEditor == null) {
            System.out.println("MAUS");
        }

        listSpecialists(null);
    }

    private void listSpecialists(
            String filterText
    ) {

        if (StringUtils.isEmpty(filterText)) {
            specialistGrid.setItems(
                    StreamSupport.stream(
                            specialistRepository.findAll().spliterator(),
                            false
                    )
            );
        } else {
            specialistGrid.setItems(
                    specialistRepository.findByLastNameStartsWithIgnoreCase(
                            filterText
                    )
            );
        }
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}