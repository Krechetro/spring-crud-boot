package web.crud.service;

import web.crud.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleByName(String name);
    HashSet<Role> getSetOfRoles(String[] roleNames);
}
