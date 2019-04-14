package com.kcfinance.loans.app.nav;

import javax.servlet.http.HttpServletRequest;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kcfinance.loans.app.service.category.impl.CategoryService;
import com.kcfinance.loans.core.AbstractViewPreparer;

@Component
public class LeftNavPreparer extends AbstractViewPreparer {

	@Autowired
	private CategoryService categoryService; 

	public void execute(Request tilesRequest, AttributeContext attributeContext) throws PreparerException {

		try {
			
			System.out.println("Executing LeftNavPreparer");
			
			HttpServletRequest request = getServletRequest(tilesRequest);

			LeftNavModel leftNavModel = getModel(request);
			
			//List<Category> categories = categoryService.getAllCategories();
						
			//leftNavModel.setCategories(categories);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private LeftNavModel getModel(HttpServletRequest request) {

		LeftNavModel leftNavModel = null;

		if(request.getSession().getAttribute(LeftNavModel.name) != null) {
			leftNavModel = (LeftNavModel) request.getSession().getAttribute(LeftNavModel.name);
		} else {
			leftNavModel = new LeftNavModel();
			request.getSession().setAttribute(LeftNavModel.name, leftNavModel);
		}

		return leftNavModel;
	}
}
