package alternateburndown.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.gadgets.client.Gadget;
import com.google.gwt.gadgets.client.UserPreferences;
import com.google.gwt.gadgets.client.Gadget.ModulePrefs;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

@ModulePrefs(title = "SimpleGadget", author = "yournamehere", author_email = "yournamehere@gmail.com")
public class AlternateBurndownGadget extends Gadget<UserPreferences> {

	@Override
	protected void init(UserPreferences preferences) {
	    Button simpleButton = new Button("SimpleGadget");
	    simpleButton.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	        Window.alert("Hello World!");
	      }
	    });
	    RootPanel.get().add(simpleButton);
	}

}