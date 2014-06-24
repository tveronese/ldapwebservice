package com.example;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.naming.Context;

import org.jboss.ejb3.annotation.SecurityDomain;

@Stateless
@WebService
@SecurityDomain("my_ldap_security_domain")
@RolesAllowed({ "NONE", "none" })
public class LdapWS {
    
    public int sum(int a, int b) {

        return a + b;
    }

}
