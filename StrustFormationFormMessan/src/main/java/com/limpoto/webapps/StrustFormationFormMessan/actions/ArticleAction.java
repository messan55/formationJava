package com.limpoto.webapps.StrustFormationFormMessan.actions;

import com.limpoto.webapps.StrustFormationFormMessan.beans.Article;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ArticleAction extends ActionSupport implements ModelDriven<Article>{
	private Article model;
	
	public String edit(){
		model = new Article(1, "chaise longue", 85.2, 25);
		return SUCCESS;
	}

	@Override
	public Article getModel() {
		if (model == null) {
			model = new Article();
		}
		return null;
	}
	
}
