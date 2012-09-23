package com.inlance.web.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ginan
 */
@RequestScoped
@ManagedBean
public class AppConfigBacking extends AbstractBacking {
	private final static Logger logger = LoggerFactory.getLogger(AppConfigBacking.class);
	
	public void setupPage() {
		getSession();
	}
}
