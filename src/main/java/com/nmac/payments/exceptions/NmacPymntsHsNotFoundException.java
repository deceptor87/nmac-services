/*
 * Created on 5 Sep 2017 ( Time 14:30:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.exceptions;

public class NmacPymntsHsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public NmacPymntsHsNotFoundException(Integer id) {
		super("NmacPymntsHs not found with id: " + id.toString());
	}

	public NmacPymntsHsNotFoundException(String nmacpymntshs) {
		super("NmacPymntsHs " + nmacpymntshs + " not found!");
	}
}
