
package com.inlance.web.backing;

import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ginan
 */
public abstract class AbstractBacking implements Serializable {
	protected Object getSession() {
		return FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}
}
