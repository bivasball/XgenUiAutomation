package com.xgen.automation.definations.CreatingTheConnections;

import io.cucumber.java.en.*;
import com.xgen.automation.actions.CreatingTheConnections.CreatingConnectionAction;
import com.xgen.automation.actions.CreatingTheConnections.DeletingConnectionAction;
import com.xgen.automation.base.CommonAction;

public class DeletingTheConnectionDefination extends CommonAction {
	DeletingConnectionAction deletingConnectionAction;

	public DeletingTheConnectionDefination() {
		deletingConnectionAction = new DeletingConnectionAction();
	}

	@Given("verify if {string} is present or not")
	public void verify_if_is_present_or_not(String string) {

	}

	@Given("if {string} is present the click on Delete icon from Actions section")
	public void if_is_present_the_click_on_delete_icon_from_actions_section(String string) {

		deletingConnectionAction.if_is_present_the_click_on_delete_icon_from_actions_section(string);
	}

	@Then("verify {string} is Deleted successfully")
	public void verify_is_deleted_successfully(String string) {

	}

}
