package system.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import system.repositories.SpecialistRepository;
import system.ui.specialist.SpecialistView;

@SpringUI(path = "navigator")
@Theme("valo")
@SpringComponent
public class MainNavigator extends UI {
    SpecialistView specialistView;
    SpecialistRepository specialistRepository;

    private Navigator navigator = new Navigator(this, this);

    private static final String MAIN_VIEW = "main";

    @Autowired
    public MainNavigator(
            SpecialistView specialistView,
            SpecialistRepository specialistRepository
    ) {
        this.specialistView = specialistView;
        this.specialistRepository = specialistRepository;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        getPage().setTitle("Navigation test");
        navigator.addView(
                "",
                new StartView(
                        navigator,
                        MAIN_VIEW
                )
        );
        navigator.addView(
                "main",
                specialistView
        );
    }
}
