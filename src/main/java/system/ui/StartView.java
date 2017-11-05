package system.ui;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class StartView extends VerticalLayout implements View {
    private Navigator navigator;
    private Button goToMainViewButton;

    public StartView() {
    }

    public StartView(
            Navigator navigator,
            String navigateTo
    ) {
        Design.read(this);
        this.navigator = navigator;
        goToMainViewButton.addClickListener(event -> navigator.navigateTo(navigateTo));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Notification.show("Welcome to the Animal Farm");
    }
}
