/*
* generated by Xtext
*/
package org.etl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SparrowUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.etl.ui.internal.SparrowActivator.getInstance().getInjector("org.etl.Sparrow");
	}
	
}