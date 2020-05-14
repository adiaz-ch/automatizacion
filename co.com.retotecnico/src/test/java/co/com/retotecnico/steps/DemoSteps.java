package co.com.retotecnico.steps;

import co.com.retotecnico.pages.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoSteps {
	DemoPage Demopage;

	@Step
	public void AbrirUrl() {
		Demopage.open();		
	}

}
