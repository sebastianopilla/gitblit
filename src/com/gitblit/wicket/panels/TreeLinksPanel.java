package com.gitblit.wicket.panels;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

import com.gitblit.wicket.LinkPanel;
import com.gitblit.wicket.models.PathModel;
import com.gitblit.wicket.pages.TreePage;


public class TreeLinksPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public TreeLinksPanel(String id, String repositoryName, PathModel path) {
		super(id);
		add(new LinkPanel("link", null, "tree", TreePage.class, new PageParameters("p=" + repositoryName + ",h=" + path.commitId + ",f=" + path.path)));
		add(new Label("history", "history"));
	}
}