package web.crud.dao;


import web.crud.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleDao {
    List <Role> getAllRoles();
    Role getRoleByName(String name);
    HashSet<Role> getSetOfRoles(String[] roleNames);
}
